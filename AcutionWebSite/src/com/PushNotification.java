package com;

public class PushNotification implements INotification {
	private static PushNotification pushNotificationHandle;
	@Override
	public void sendNotification(String payload, User user) {
		
	}
	private PushNotification() {
		
	}
	PushNotification getInstance() {
		if(pushNotificationHandle == null) {
			pushNotificationHandle = new PushNotification();
		}
		return pushNotificationHandle;
	}
}
