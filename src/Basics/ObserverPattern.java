package Basics;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
	public interface Observer {
	    void update(String message);
	}
	public class EmailNotification implements Observer {
	    @Override
	    public void update(String message) {
	        System.out.println("Sending email notification: " + message);
	    }
	}

	public class SMSNotification implements Observer {
	    @Override
	    public void update(String message) {
	        System.out.println("Sending SMS notification: " + message);
	    }
	}
	public class Subject {
	    private List<Observer> observers = new ArrayList<>();
	    
	    public void registerObserver(Observer observer) {
	        observers.add(observer);
	    }
	    
	    public void unregisterObserver(Observer observer) {
	        observers.remove(observer);
	    }
	    
	    public void notifyObservers(String message) {
	        for (Observer observer : observers) {
	            observer.update(message);
	        }
	    }
	 }
	    public static void main(String[] args) {
	        Subject subject = new Subject();
	        
	        Observer emailObserver = new EmailNotification();
	        Observer smsObserver = new SMSNotification();
	        
	        subject.registerObserver(emailObserver);
	        subject.registerObserver(smsObserver);
	        
	        subject.notifyObservers("New update available!");
	        
	        subject.unregisterObserver(emailObserver);
	        
	        subject.notifyObservers("Another update available!");
	    }
	
}
