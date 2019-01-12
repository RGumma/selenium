import com.thoughtworks.selenium.DefaultSelenium;


public class SeleniumRCSample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// Default Port no: 4444
		
		
		DefaultSelenium selenium =new DefaultSelenium("localhost",4444 ,"*firefox","http://www.mortgagecalculator.org");
		selenium.start();
		selenium.open("/");
		selenium.type("name=param[homevalue]","40000");
		Thread.sleep(6000);
		selenium.type("id=loanamt","4000");
		Thread.sleep(6000);
		selenium.click("name=cal");
		Thread.sleep(4000);
		selenium.close();
		selenium.stop();
		
		
		
		
		
		
		

	}

}
