package com.fedex.notification.service.gateway;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DeliveryOptionsGateway 
{
	
	public List<String> getDeliveryOptions(long orderID)
	{
		List<String> optionsList = new ArrayList<String>();
		if(orderID%2==0)
		{
			optionsList.add("Date");
		}
		else
		{
			optionsList.add("Date");
			optionsList.add("Location");
		}
		return optionsList;
	}

}
