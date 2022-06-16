package dockerSample.dockerSample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class edgeStandalone {

	@Test
	public void edge() throws MalformedURLException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		EdgeOptions options = new EdgeOptions();
        driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		driver.get("https://www.google.com");
		System.out.println("Edge instance");
		System.out.println(driver.getTitle());
	}

}
