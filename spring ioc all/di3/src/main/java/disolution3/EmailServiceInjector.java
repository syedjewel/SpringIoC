package disolution3;

import disolution.EmailServiceImpl;
import disolution2.Consumer;
import disolution2.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector {

	//@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}
                                                               
}                                    