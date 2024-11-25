package peopleFront.rule_engine.stage2;

import org.testng.annotations.Test;

import Baseclass.base_class;
import Request_controller.request_controller;
import junit.framework.Assert;

public class Otp_Ref_Borrower extends base_class {

	@Test
	public void otp_reference() throws Exception {

		String Api_type = "app";
		request_controller g = new request_controller();
		String url_endpoint = P.getProperty("URL") +""+ P.getProperty("otp_reff");
	//	System.out.println("URL ENDPOINT" + url_endpoint);
		String otp_ref = g.getRequest_otp_ref(P.getProperty("user_id"), url_endpoint, Api_type);
		System.out.println(otp_ref);
		if (otp_ref.equalsIgnoreCase("FAMILY_FRIEND")) {
		} else if (otp_ref.equalsIgnoreCase("no_otp_ref")) {
		} else if (otp_ref.equalsIgnoreCase("OTP_REF")) {
		} else if (otp_ref.equalsIgnoreCase("1,2,3,4")) {
		} else {
			Assert.assertTrue(otp_ref.equalsIgnoreCase("otp_ref"));
		}

	}

}
