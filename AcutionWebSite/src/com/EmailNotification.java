package com;

public class EmailNotification implements INotification {
	private static EmailNotification emailHandle;
	@Override
	public void sendNotification(String payload, User user) {
		
	}
	
	private EmailNotification() {
		
	}
	
	EmailNotification getInstance() {
		if(emailHandle == null) {
			emailHandle = new EmailNotification();
		}
		return emailHandle;
	}

}
