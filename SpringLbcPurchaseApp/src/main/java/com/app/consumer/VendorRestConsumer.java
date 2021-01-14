package com.app.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

public class VendorRestConsumer {

	@Autowired
	private LoadBalancerClient client;

}
