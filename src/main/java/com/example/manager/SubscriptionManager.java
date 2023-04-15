/**
 * 
 */
package com.example.manager;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.modal.Subscription;

/**
 * @author vartika.gupta
 *
 */

@Service
public class SubscriptionManager {

	/**
	 * This method contains sample code to generate subscription id and 
	 * return the updated subscription object
	 * 
	 * @param subscription
	 * @return
	 */
	public Subscription create(Subscription subscription) {
		// code to generate random subscription id
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 8;
		Random random = new Random();
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    subscription.setId(generatedString);
	    return subscription;
	}
}
