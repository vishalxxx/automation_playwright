package automation_playwright;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Flipkart_automation {

	@Test
	public void signin() {
		
		Playwright playwright = Playwright.create();
		Browser browser =  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.google.com");
		
	}
}
