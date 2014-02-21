package com.terry.packet;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(  
	    use = JsonTypeInfo.Id.NAME,  
	    include = JsonTypeInfo.As.PROPERTY,  
	    property = "command")  
	@JsonSubTypes({  
	    @Type(value = RegisterMessage.class, name = "REGISTER"),  
	    @Type(value = PingMessage.class, name = "PING") })  

 public class MessageBase {
	@JsonProperty("token")
	String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}





}
