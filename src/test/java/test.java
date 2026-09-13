import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class test {

	@Test
	public void launchBrowser() {
		//WebDriver driver =new ChromeDriver();	
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/?zx=1787579456868");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;

		// 2. Capture screenshot as a temporary file
		File source = ts.getScreenshotAs(OutputType.FILE);

		// 3. Define destination path and copy the file
		File destination = new File("C:/WorkSpace/Demo_Ver_1.0.1/screenShot/test_failure.png");
		try {
		    Files.copy(source, destination);
		    System.out.println("Screenshot saved successfully!");
		} catch (IOException e) {
		    System.out.println("Failed to save screenshot: " + e.getMessage());
		}
		driver.close();
	}
	
	
}
