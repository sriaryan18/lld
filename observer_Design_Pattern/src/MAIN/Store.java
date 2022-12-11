package MAIN;

import Observable.*;
import Observer.*;

public class Store {
	public static void main(String[] args) {
		StocksObservable iphone = new iphoneStockObservable();
		
		NotificationAlertObserver user1 = new EmailAlertObserver(iphone,"xyz1@gmail");
		NotificationAlertObserver user2 = new EmailAlertObserver(iphone,"xyz2@gmail");
		NotificationAlertObserver user3 = new MsgAlertObserver(iphone,"xyz3");
		
		iphone.add(user2);
		iphone.add(user1);
		iphone.add(user3);
		
		iphone.setData(100);
//		System.out.println("hello");
			
		
	}
}
