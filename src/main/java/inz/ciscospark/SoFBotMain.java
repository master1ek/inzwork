package inz.ciscospark;

import java.net.URISyntaxException;
import java.util.Scanner;



public class SoFBotMain {

	public static void main(String[] args) throws URISyntaxException{
		Connection conn = new Connection();
		conn.connecet();
		GetInformation gI = new GetInformation();
		gI.getInfrmation();
		
	}

}
