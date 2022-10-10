package com.fedex.notification.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fedex.notification.service.NotificationService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-01T22:33:25.097Z[GMT]")
@RestController
public class P4EBackendController {

	@Autowired
	NotificationService notificationService;

	@RequestMapping(value = "/v1/notification/delivery", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<String> sendMessage(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "userId", required = true) String userId) {
		return new ResponseEntity<String>(notificationService.sendWhtsAppNotification(userId), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/v1/deliverydates", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<String>> getAlternateDeliveryDates(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "trackingId", required = true) String trackingId,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "language", required = true) String language) {
		
		List<String> alternateDeliveryDates = new ArrayList<String>();
		if (language.equals("en")) {
			alternateDeliveryDates.add("24-Oct-2022");
			alternateDeliveryDates.add("25-Oct-2022");
			alternateDeliveryDates.add("26-Oct-2022");
		}else if (language.equals("nl")) {
			alternateDeliveryDates.add("24-Okt-2022");
			alternateDeliveryDates.add("25-Okt-2022");
			alternateDeliveryDates.add("26-Okt-2022");
		}
		
		return new ResponseEntity<List<String>>(alternateDeliveryDates, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/v1/pickuppoints", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<String>> getPickupPoints(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "trackingId", required = true) String trackingId,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "language", required = true) String language) {
		
		List<String> pickupPoints = new ArrayList<String>();
		if (language.equals("en")) {
			pickupPoints.add("Jumbo");
			pickupPoints.add("Albert Heijn");
			pickupPoints.add("Van Haaren");
		}else if (language.equals("nl")) {
			pickupPoints.add("Jumbo");
			pickupPoints.add("Albert Heijn");
			pickupPoints.add("Van Haaren");
		}
		
		return new ResponseEntity<List<String>>(pickupPoints, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/v1/alternateDeliveryAddresses", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<String>> getAlternateDeliveryAddresses(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "trackingId", required = true) String trackingId,
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "language", required = true) String language) {
		
		List<String> deliveryAddresses = new ArrayList<String>();
		if (language.equals("en")) {
			deliveryAddresses.add("Amsterdam");
			deliveryAddresses.add("Hoofdoorp");
			deliveryAddresses.add("Rotterdam");
		}else if (language.equals("nl")) {
			deliveryAddresses.add("Amsterdam");
			deliveryAddresses.add("Hoofdoorp");
			deliveryAddresses.add("Rotterdam");
		}
		
		return new ResponseEntity<List<String>>(deliveryAddresses, HttpStatus.OK);
	}

}
