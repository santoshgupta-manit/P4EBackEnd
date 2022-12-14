package com.fedex.notification.service.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WhtsAppNotificationGateway {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${notification.service.url}")
	private String notification_api_url;

	@SuppressWarnings("unlikely-arg-type")
	public String sendNotification(String whtsAppNo, String custName, String lang, long trackingId) {

		/*
		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext;
		try {
			sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy)
					.build();
			SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
			CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();

			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
			requestFactory.setHttpClient(httpClient);
			restTemplate.setRequestFactory(requestFactory);
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		*/
		// To be implemented
		String url = notification_api_url + "?whtsappno=" + whtsAppNo + "&name=" + custName + "&trackingId="
				+ trackingId + "&lang=" + lang;
		System.out.println("url :" + url);
		RequestEntity<Void> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<String> response = restTemplate.exchange(request, String.class);
		if (response.getStatusCode().is2xxSuccessful()) {
			return "Message sent successfully.";
		}
		return "Could not sent message.";

	}
}
