package inz.ciscospark;

import java.io.IOException;
import java.net.MalformedURLException;

public class Connection {
	 private String botToken = "MDM2ZGE4ZTktMThlNS00OWQ4LTk0NGYtYzY4M2NmZjM0NjFiYzg3MzZlZjktYTEw";
	 private String roomId = "Y2lzY29zcGFyazovL3VzL1JPT00vMTYxODNlYzAtZTI5ZC0xMWU3LWEzNjAtMzU1MjMxODgwNzBj";
	 
	public void connecetPost(){
		java.net.URL url = new java.net.URL("https://api.ciscospark.com/v1/messages");
		java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Authorization", "Bearer " + botToken);
		conn.setDoOutput(true);
		String body = "{\"roomId\": \"" + roomId + "\",\"text\": \"" + message + "\"}";

		java.io.OutputStream os = conn.getOutputStream();
		os.write(body.getBytes());
	 
		if (conn.getResponseCode() != 200) {
			System.out.println("Failed : HTTP error code : " + conn.getResponseCode()); 
		   }   
	}
			
	public void connecetGet() throws IOException{
		java.net.URL url1 = new java.net.URL("https://api.ciscospark.com/v1/messages");
		java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url1.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Authorization", "Bearer " + botToken);
		conn.setDoOutput(true);
	}
}
			
