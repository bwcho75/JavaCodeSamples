package com.terry.packet;

public class PingMessage extends MessageBase {
	
	public class Body{
		String hash;
	
		public String getHash() {
			return hash;
		}
	
		public void setHash(String hash) {
			this.hash = hash;
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
