package com.terry.packet;

public class RegisterMessage extends MessageBase {
	
	public class Body{
		String userId;
		String deviceId;
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getDeviceId() {
			return deviceId;
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
	}
	Body body = new Body();
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
}
