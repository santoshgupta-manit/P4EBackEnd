package com.fedex.notification.service.gateway;

import org.springframework.stereotype.Component;

import com.fedex.notification.service.model.UserProfile;

@Component
public class UserPreferenceGateway {

	public UserProfile getUserProfile(String userId) {
		
		UserProfile userProfile;
		
		switch(userId) {
			case "saroj" : 			
				userProfile = new UserProfile("Saroj", Long.valueOf("626662987"), 31, "en");
				break;
			
			
			case "pepe" : 			
				userProfile = new UserProfile("Pepe", Long.valueOf("626662987"), 31, "nl");
				break;
			
			
			case "amit" : 			
				userProfile = new UserProfile("Amit", Long.valueOf("9588403341"), 31, "en");
				break;
			
			
			case "anup" : 			
				userProfile = new UserProfile("Anup", Long.valueOf("650235394"), 31, "nl");
				break;
			
			
			case "santosh" : 			
				userProfile = new UserProfile("Santosh", Long.valueOf("626662987"), 31, "en");
				break;
			
			
			case "kanchan" : 			
				userProfile = new UserProfile("Santosh", Long.valueOf("626662987"), 31, "en");
				break;
			
			
			default : 			
				userProfile = new UserProfile("Saroj", Long.valueOf("626662987"), 31, "en");
				break;
			

		}
		return userProfile;

	}

}
