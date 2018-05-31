package client;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

public class Client {

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/rest/";
		WebClient client = WebClient.create(url);
		
		System.out.println(client.path("/test/hello").accept(MediaType.TEXT_PLAIN).get(String.class));
		System.out.println(client.path("/test/send/{input}","aaaa").accept(MediaType.TEXT_PLAIN).get(String.class));
	}
	
	
}
