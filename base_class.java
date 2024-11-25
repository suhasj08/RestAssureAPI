package Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class base_class {

	public static Properties P;

	@BeforeSuite
	public void prop() throws IOException {

		FileInputStream file = new FileInputStream("config.properties");
		P = new Properties();
		P.load(file);
	}

	public String getStatus(String status) {
		if(status.equalsIgnoreCase("success")) {			
		}else if(status.equalsIgnoreCase("OTP")) {			
		}else if(status.equalsIgnoreCase("ESIGN")) {			
		}else {
			Assert.assertTrue(status.equalsIgnoreCase("status"));
		}
		return status;
	}
	
	
	public String getCommonStatus(String status) {
		if (status.equalsIgnoreCase("success")) {
		} else if (status.equalsIgnoreCase("Noservice")) {
		} else if (status.equalsIgnoreCase("reject")) {
		} else if (status.equalsIgnoreCase("MANUAL")) {
		} else {
			Assert.assertTrue(status.equalsIgnoreCase("status"));
		}
		
		return status;
		
	}
	
	
}
