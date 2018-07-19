package client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

public class Client {

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/rest/";
		WebClient client = WebClient.create(url);
		String fackXML = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		
		
		//System.out.println(client.path("/test/hello").accept(MediaType.TEXT_PLAIN).get(String.class));
		System.out.println(client.path("/test/send/{input}","aaaa").accept(MediaType.TEXT_PLAIN).get(String.class));
		client.replacePath(url);
		System.out.println(client.path("/test/postxml/{input}",fackXML).post(fackXML).toString());
	}
	
	
}
