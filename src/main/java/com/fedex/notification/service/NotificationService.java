package com.fedex.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedex.notification.service.gateway.UserPreferenceGateway;
import com.fedex.notification.service.gateway.WhtsAppNotificationGateway;
import com.fedex.notification.service.model.UserProfile;

@Service
public class NotificationService {
	@Autowired
	WhtsAppNotificationGateway whtsAppNotificationGateway;
	@Autowired
	UserPreferenceGateway userPreferenceGateway;

	public String  sendWhtsAppNotification(long trackingId) {
		UserProfile userProfile = userPreferenceGateway.getUserProfile(trackingId);
		String whtsAppNo = String.valueOf(userProfile.getCountry_code()) + String.valueOf(userProfile.getPhone_no());
		return whtsAppNotificationGateway.sendNotification(whtsAppNo, userProfile.getName(),userProfile.getPreferred_lang(),trackingId);
	}

}
