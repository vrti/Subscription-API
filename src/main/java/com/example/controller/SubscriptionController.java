/**
 * 
 */
package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manager.SubscriptionManager;
import com.example.modal.Subscription;

/**
 * @author vartika.gupta
 *
 */
@RestController
@RequestMapping(value="/")
public class SubscriptionController {

	@Autowired
	private SubscriptionManager subscriptionManager;
	
	@PostMapping(value = "/subscription")
	public ResponseEntity<Subscription> createSubscription(@Valid @RequestBody Subscription subscription) {
		subscription = subscriptionManager.create(subscription);
		return ResponseEntity.ok().body(subscription);
	}
}
