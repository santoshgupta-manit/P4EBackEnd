package com.fedex.notification.service.rest;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

public class NotificationController {

	@RequestMapping(value = "/v1/notification/delivery", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<String> sendMessage(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "trackingId", required = true) String trackingId) {
		
		return new ResponseEntity<String>("Messge sent successfully", HttpStatus.OK);
	}

}
