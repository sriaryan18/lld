package Observer;

import Observable.StocksObservable;

public class MsgAlertObserver implements NotificationAlertObserver {

	String name;
	StocksObservable obj;
	public MsgAlertObserver(StocksObservable o,String name){
		this.obj=o;
		this.name=name;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendSms(obj.getData());

	}
	void sendSms(int data) {
		System.out.println("Sms sent to : "+name);
	}

}
