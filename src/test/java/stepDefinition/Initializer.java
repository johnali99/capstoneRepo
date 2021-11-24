package stepDefinition;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base{

	@Before
	public void beforeHooks(Scenario scenario) {
		
		browser();
		openBrowser();
	}
	
	@After
	public void afterHook(Scenario scenario) throws InterruptedException {
		tearDown();
	}
}
	

