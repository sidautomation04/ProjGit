package development;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewClass {

	@Test
	public void testgooglesearch(){
	 
		WebDriver driver = new FirefoxDriver();
		//it will open the google page
		driver.get("http://google.in"); 
		//we expect the title “Google “ should be present 
		String Expectedtitle = "Google";
		//it will fetch the actual title 
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		driver.close();
	 }
//    public static void main(String[] args) throws InterruptedException {
//        // declaration and instantiation of objects/variables
//    	
//    	System.setProperty("webdriver.gecko.driver","C:\\selenium drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//	
//    	
//        String baseUrl = "https://www.codeproject.com/";
//        String expectedTitle = "CodeProject - For those who code";
//        String actualTitle = "";
//
//        // launch Fire fox and direct it to the Base URL
//        driver.get(baseUrl);
//
//        // get the actual value of the title
//        actualTitle = driver.getTitle();
//
//        /*
//         * compare the actual title of the page with the expected one and print
//         * the result as "Passed" or "Failed"
//         */
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
//       
//        //close Fire fox
//        driver.close();
//       
//    }

}


