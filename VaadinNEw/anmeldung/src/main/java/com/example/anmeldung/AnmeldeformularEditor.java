package com.example.anmeldung;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import controller.handler.KitaRegistrationHandler;
import model.Child;
import model.KitaRegistration;




public class AnmeldeformularEditor extends Anmeldeformular {
	  private KitaRegistrationHandler mKitaRegistrationHandler;
	  private HashMap<String,String> mRequest;
	  
	  public void receiveDataFromForm(){
		  mKitaRegistrationHandler = new KitaRegistrationHandler();
		  mRequest = new HashMap();
		  
		  mRequest.put("kidname", kidname.getValue());
		  mRequest.put("kidsurname", kidsurname.getValue());
		  mRequest.put("gender", (String)gender.getValue());
		  mRequest.put("weekdays", (String)weeksdays.getValue());
		  mRequest.put("location", (String)location.getValue());
		  mRequest.put("name", name.getValue());
		  mRequest.put("surname", surname.getValue());
		  mRequest.put("mail", mail.getValue());
		  
		  mRequest.put("month", (String)month.getValue());
		  mRequest.put("year", (String)year.getValue());
		  mRequest.put("postcode", postcode.getValue());
		  mRequest.put("housenumber", housenumber.getValue());
		  mRequest.put("street", street.getValue());
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
		  Date bDay = (Date)birthday.getConvertedValue();
		  dateFormat.format(bDay);
		  mRequest.put("birthday", dateFormat.format(bDay));
		  
		  mRequest.put("hours", (String)hours.getValue());
		  
		  
		  KitaRegistration kitaRegistration = mKitaRegistrationHandler.initRegistrationFromForm(mRequest);
		  mKitaRegistrationHandler.saveKitaRegistration(kitaRegistration);
		  Child child = kitaRegistration.getChild();
		  System.out.println(child.getName());
	  }
	
}
