package client.ap;

import disolution2.Consumer;
import disolution3.EmailServiceInjector;
import disolution3.MessageServiceInjector;
import disolution3.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi masum";
		String email = "samdani@abc.com";
		String phone = "01728279819";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}