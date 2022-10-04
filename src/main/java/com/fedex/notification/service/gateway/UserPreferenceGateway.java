package com.fedex.notification.service.gateway;

import org.springframework.stereotype.Component;

import com.fedex.notification.service.model.UserProfile;

@Component
public class UserPreferenceGateway {

	public UserProfile getUserProfile(long orderID) {
		UserProfile userProfile;
		if (orderID % 2 == 0) {
			userProfile = new UserProfile("Santosh", Long.valueOf("9167202105"), 91, "en");
		} else {
			userProfile = new UserProfile("Gupta", Long.valueOf("644707444"), 31, "de");
		}

		return userProfile;

	}

}
