package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class iphoneStockObservable implements StocksObservable {
	
	List<NotificationAlertObserver> l=new ArrayList<>();

	int stock =0;

	@Override
	public void add(NotificationAlertObserver obj) {
		// TODO Auto-generated method stub
		l.add(obj);
	}

	@Override
	public void remove(NotificationAlertObserver obj) {
		// TODO Auto-generated method stub
		l.remove(obj);
		
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver o:l) {
			o.update();
		}
		
		
	}

	@Override
	public void setData(int data) {
		// TODO Auto-generated method stub
		if(stock == 0) {
			Notify();
		}
		stock+=data;
		
		
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return this.stock;
		
	}}
