package peopleFront.rule_engine.stage2;

import org.testng.annotations.Test;

import Baseclass.base_class;
import Request_controller.request_controller;
import junit.framework.Assert;

public class Bureau extends base_class {

	@Test
	public void crif() throws Exception  {
		
		String type ="%27CRIF%27";
		String App_Type="App";
		request_controller g=new request_controller();		
		String url_endpoint=P.getProperty("URL")+""+P.getProperty("bureau");
	//	System.out.println("urlendpoint"+url_endpoint);
		String status=g.getRequest_bureau(P.getProperty("user_id"), url_endpoint,type,App_Type );
		System.out.println(status);
		getCommonStatus(status);
		
	}

}


