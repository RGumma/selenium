package com.learning.java;

public class Basetest {

	public static void main(String[] args) throws InterruptedException {
		
		
		Baseclass b = new Baseclass();
		b.Browsersetup("chrome");
		b.Openurl("http://www.mortgagecalculator.org/");
		b.maximizebrowser();
		b.Inputbox("param[homevalue]", new String[]{"20000"});
		b.Inputbox("param[principal]", new String[] {"350000"});
		b.Inputbox("param[interest_rate]", new String[]{"3"});
		b.Inputbox("param[term]", new String[] {"35"});
		b.checkbox("param[start_month]", 5);
		Thread.sleep(5000);
		b.close();
		System.exit(0);

	}

}
