package com.edatasource.aws.http;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.HttpClient;

public class AmazonHttpClient {
	/**
	 * Logger used to provide debug logging information.
	 */
	private static final Log log = LogFactory.getLog(AmazonHttpClient.class.getName());
	
	/**
	 * The http client used to interact with the Amazon Web Services.
	 */
	private HttpClient httpclient;
}
