package Observer;

import Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

	String email;
	StocksObservable obj;
	public EmailAlertObserver(StocksObservable o,String email){
		this.obj=o;
		this.email=email;
	}
	@Override
	public void update() {
		
		sendEmail(obj.getData());

	}
	private void sendEmail(int data) {
		System.out.println("Email sent to : "+email);
	}

}
