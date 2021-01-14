package com.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VendorRestController {
	@Value("${server.port")
	private String port;

	@RequestMapping("/show")
	private String show() {
		return "From Vendor:" + port;
	}
}
