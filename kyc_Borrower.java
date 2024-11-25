package peopleFront.rule_engine.stage2;

import org.testng.Assert;
import org.testng.annotations.Test;

import Baseclass.base_class;
import Request_controller.request_controller;

public class kyc_Borrower extends base_class {

	@Test	
	public void Stage2_kyc() throws Exception {
		
		request_controller g = new request_controller();
		String url_endpoint =P.getProperty("URL")+""+P.getProperty("kyc");
		String status=g.getRequest(P.getProperty("user_id"), url_endpoint, 0);
		System.out.println(status);
		getCommonStatus(status);
			
	}

}
