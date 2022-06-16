package dockerSample.dockerSample;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromeStandalone {
	@BeforeTest
	public void startDockerScale() throws IOException, InterruptedException
	{
		File fi =new File("output.txt");
		if(fi.delete())
		{
			System.out.println("file deleted successfully");
		}
		startDocker s=new startDocker();
		s.startFile();
	}
	
	@AfterTest
	public void stopDockerDeleteFile() throws IOException, InterruptedException
	{
		stopDocker d=new stopDocker();
		d.stopFile();
		
		
	}
	@Test
	public void chrome() throws MalformedURLException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		ChromeOptions options = new ChromeOptions();
        driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		driver.get("https://www.lambdatest.com/blog/desired-capabilities-in-selenium-testing/");
		System.out.println("Chrome instance");
		System.out.println(driver.getTitle());
	}

}
