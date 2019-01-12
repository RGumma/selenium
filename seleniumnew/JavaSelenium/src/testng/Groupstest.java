package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Groupstest extends Groups {

	@Test(groups = "checkbox")
	public void testCheckBoxes() throws InterruptedException {

		testCheckBoxes("REGISTERED_BY", 1);
		Thread.sleep(3000);
		testCheckBoxes("DOBDAY", 1);
		testCheckBoxes("DOBMONTH", 1);
		testCheckBoxes("DOBYEAR", 1);
		testCheckBoxes("RELIGION", 1);
		testCheckBoxes("MOTHERTONGUE", 2);
		testCheckBoxes("CASTE_NORMAL",1);
		testCheckBoxes("COUNTRY", 1);
		testCheckBoxes("M_COUNTRYCODE", 1);
	}

	@Test(groups = "inputbox")
	public void selectinputbox() throws InterruptedException {

		selectinputbox("NAME", "Rajani");
		selectinputbox("MOBILENO", "9290168267");
		selectinputbox("EMAIL", "rajinieee2006@yahoo.com");
		//selectinputbox("PASSWORD", "Krishna_12");
		Thread.sleep(5000);
	}

	@Test(groups = "radiobutton")
	public void radiobutton() throws InterruptedException {

		radiobutton("gendermale");
	}
}
