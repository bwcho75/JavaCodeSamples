package com.terry.json;
import java.io.IOException;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.terry.packet.MessageBase;
import com.terry.packet.PingMessage;
import com.terry.packet.RegisterMessage;

/**
 * Simple example to support json polymorphic type
 *
 */
public class App 
{
	static Logger log = Logger.getAnonymousLogger();
	
	public String runDecode(String json) throws JsonParseException, JsonMappingException, IOException{
    	ObjectMapper mapper = new ObjectMapper();
    	MessageBase m = mapper.readValue(json, MessageBase.class);
    	
    	log.info(m.getClass().toString());
		

		return null;
	}
	public String runEncodePing(){
    	ObjectMapper mapper = new ObjectMapper();
    	PingMessage p = new PingMessage();
    	
    	p.setToken("token");
    	p.getBody().setHash("hashvalue");
    	
    	String json_string = null;
    	try {
			json_string=mapper.writeValueAsString(p);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return json_string;
	}
	
	public String runEncodeRegister(){
    	ObjectMapper mapper = new ObjectMapper();
    	RegisterMessage p = new RegisterMessage();
    	
    	p.setToken("token");
    	p.getBody().setDeviceId("deviceId");
    	p.getBody().setUserId("terry");
    	
    	String json_string = null;
    	try {
			json_string=mapper.writeValueAsString(p);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return json_string;
	}

    public static void main( String[] args ) throws Exception, JsonMappingException, IOException
    {
    	App ap = new App();
    	String s = ap.runEncodePing();
    	log.info(s);
    	ap.runDecode(s);

    	s= ap.runEncodeRegister();
    	log.info(s);
    	ap.runDecode(s);
    	
    }
}
