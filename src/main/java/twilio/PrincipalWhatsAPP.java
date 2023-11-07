package twilio;


import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import Front.frontend;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.URL;

import org.hibernate.mapping.List;

import java.math.BigDecimal;

public class PrincipalWhatsAPP {
	//String contrasena="ffcae4694baad5461943b647164634ab";
	//@Value("${whatsapp.twilio.secret}")
	String contrasena;
  // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "ACb006d55ac1f55157b1d806c2eb1cbc3e";
  public static final String AUTH_TOKEN = "ffcae4694baad5461943b647164634ab";
  

  /*public static void main(String[] args) {
	  
	 
	 String si=   System.getenv("whatsapp_secret");
	 Scanner texto = new Scanner(System.in);
	  System.out.println("Ingrese mensaje que quiera enviar a WhatsApp:\n "+ si);
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    for(int i=0; i<=6;i++) {
    Message message = Message.creator(
      new PhoneNumber("whatsapp:+573102068070"),
      new PhoneNumber("whatsapp:+14155238886"),
    	    texto.nextLine())
    		.create();

    System.out.println(message.getSid());
    }}*/
  
   public void twilioConect(String menssage) {
	    
	   Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	  
	    Message message = Message.creator(
	      new PhoneNumber("whatsapp:+573102068070"),
	      new PhoneNumber("whatsapp:+14155238886"),
	    	    menssage)
	    		.create();
	     System.out.println(message.getSid());
	    
   } 
}
