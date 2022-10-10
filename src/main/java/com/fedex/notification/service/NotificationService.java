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

	public String  sendWhtsAppNotification(String userId) {
		UserProfile userProfile = userPreferenceGateway.getUserProfile(userId);
		String whtsAppNo = String.valueOf(userProfile.getCountry_code()) + String.valueOf(userProfile.getPhone_no());
		long trackingId = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		return whtsAppNotificationGateway.sendNotification(whtsAppNo, userProfile.getName(),userProfile.getPreferred_lang(),trackingId);
	}
	
	

}
