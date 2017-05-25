package pers.ted.hung.hws;

import javax.jws.*;

import org.apache.tools.ant.taskdefs.Sleep;

@WebService
public class HelloWebService {

	@WebMethod
	public String sayHello(String client, String userName) {
		String message = "Hello World! " + client + "." + userName;
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
	}
}
