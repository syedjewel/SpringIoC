package disolution3;

import disolution.SMSServiceImpl;
import disolution2.Consumer;
import disolution2.MyDIApplication;

public class SMSServiceInjector implements MessageServiceInjector {

	//@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}