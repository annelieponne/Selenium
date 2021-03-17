package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	private WebDriver driver;

	@Before
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
		driver.manage().window().maximize();
	}

		@Given("I have entered {int} into the calculator")
		public void i_have_entered_into_the_calculator(Integer int1) {
		WebElement addFirst = driver.findElement(By.name("n01"));
		addFirst.sendKeys("123");

	}

	@Given("I have also entered {int} into the calculator")
	public void i_have_also_entered_into_the_calculator(Integer int1) {
		WebElement addSecond = driver.findElement(By.name("n02"));
		addSecond.sendKeys("456");
	}

	@When("I press add")
	public void i_press_add() {
		WebElement findButton = driver.findElement(By.name(""));
		findButton.click();
	}

	@Then("the result should be {int} on the screen")
	public void the_result_should_be_on_the_screen(Integer int1) {

		assertEquals("579", result.getText());

		driver.quit();

	}

}
