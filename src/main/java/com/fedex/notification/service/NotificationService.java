package com.fedex.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedex.notification.service.gateway.DeliveryOptionsGateway;
import com.fedex.notification.service.gateway.UserPreferenceGateway;
import com.fedex.notification.service.gateway.WhtsAppNotificationGateway;
import com.fedex.notification.service.model.UserProfile;

@Service
public class NotificationService {
	@Autowired
	WhtsAppNotificationGateway whtsAppNotificationGateway;
	@Autowired
	DeliveryOptionsGateway deliveryOptionsGateway;
	@Autowired
	UserPreferenceGateway userPreferenceGateway;

	public void senWhtsAppNotification(long OrderId) {
		UserProfile userProfile = userPreferenceGateway.getUserProfile(OrderId);

		String whtsAppNo = String.valueOf(userProfile.getCountry_code()) + String.valueOf(userProfile.getPhone_no());

		whtsAppNotificationGateway.sendNotification(whtsAppNo, userProfile.getPreferred_lang(),
				deliveryOptionsGateway.getDeliveryOptions(OrderId));
	}

}
