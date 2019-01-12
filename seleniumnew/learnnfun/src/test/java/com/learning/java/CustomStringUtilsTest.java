package com.learning.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CustomStringUtilsTest{ 
    
	private CustomStringUtils customStringUtils = new CustomStringUtils();
	
    @Test
    public void testReverseVowel(){
    	
    	Assert.assertTrue("Invalid result", "eoo".equals(customStringUtils.reverseVowels("Google")));
    	Assert.assertTrue("Invalid result", "oa".equals(customStringUtils.reverseVowels("Mango")));
    	Assert.assertTrue("Invalid result", "OA".equals(customStringUtils.reverseVowels("MANGO")));
    	Assert.assertTrue("Invalid result", "oOa".equals(customStringUtils.reverseVowels("MaNGOo")));
    	Assert.assertNull("No vowels", customStringUtils.reverseVowels("bcdf"));
    }
}
