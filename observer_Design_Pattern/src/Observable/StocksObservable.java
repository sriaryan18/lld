package Observable;

import Observer.NotificationAlertObserver;

public interface StocksObservable {
	
	public void add(NotificationAlertObserver obj);
	public void remove(NotificationAlertObserver obj);
	public void Notify();
	public void setData(int data);
	public int getData();

}
