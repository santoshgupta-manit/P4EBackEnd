package com.fedex.notification.service.rest;

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
public class NotificationController {

	@Autowired
	NotificationService notificationService;

	@RequestMapping(value = "/v1/notification/delivery", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<String> sendMessage(
			@NotNull @Parameter(in = ParameterIn.QUERY, description = "", required = false, schema = @Schema()) @Valid @RequestParam(value = "userId", required = true) String userId) {
		return new ResponseEntity<String>(notificationService.sendWhtsAppNotification(userId), HttpStatus.OK);
	}

}
