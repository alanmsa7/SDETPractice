package dockerSample.dockerSample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firefoxStandalone {

	@Test
	public void firefox() throws MalformedURLException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		FirefoxOptions options = new FirefoxOptions();
        driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		driver.get("https://www.google.com");
		System.out.println("Firefox instance");
		System.out.println(driver.getTitle());
	}

}
