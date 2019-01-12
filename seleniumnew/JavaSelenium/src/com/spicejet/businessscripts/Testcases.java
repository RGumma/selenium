package com.spicejet.businessscripts;

import com.spicejet.resuable.Resuable;

public class Testcases extends Resuable {

	

	public void spicejet(){
	
		launchbrowser("Chrome");
	
		maximizebrowser();
		
		invokeapplication("http://www.bharatmatrimony.com/");
		
		dropdown("selecttheprofilefor", 2);
		 
		sendtext("nameoftheperson", "name");
		
		checkbox("checktheboxforfemale");
		 dropdown("selectthedate", 5);
		 dropdown(" selectthemonth", 4);
		 dropdown(" selecttheyear", 6);
		 dropdown(" selectthereligion",4);
		 dropdown(" selectthemothertongue", 3);
		 dropdown("selectthecaste", 6);
		 dropdown("selectthecountrycode", 3);
		 sendtext("number", " sendmobilenumber");
		 sendtext(" emailoftheperson", "sendemail");
		 sendtext(" logintopassword", "sendpassword");
		 click("clickthebutton");

	}

	
		
	}

	
		
	
	



