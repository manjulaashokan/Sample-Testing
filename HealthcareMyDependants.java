package demohealthcare;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.GlobalData;

public class HealthcareMyDependants {
	
	//1 My Dependants
	
			@Test
			public void MyDependantsPage() throws InterruptedException {
		 //step 1: login method
		        WebDriver driver = HealthcareLogin.HealthcareAdminLogin(); 
		        
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Wait until the PATIENTS section is visible
		        WebElement patientsSection = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//div[normalize-space(text())='PATIENTS']")));
		        js.executeScript("arguments[0].scrollIntoView(true);", patientsSection);

		        // Wait for "My Dependants" link
		        WebElement myDependantsLink = wait.until(ExpectedConditions.elementToBeClickable(
		                By.xpath("//span[normalize-space(text())='My Dependants']/ancestor::a")));
		        js.executeScript("arguments[0].click();", myDependantsLink);
		        Reporter.log("✅ Clicked on 'My Dependants' in sidebar", true);		        

		        // Step 5: Click "Add New" button
		        	WebElement addNewBtn = wait.until(ExpectedConditions.elementToBeClickable(
		        	        By.xpath("//a[contains(@class,'btn-success')]//i[contains(@class,'fa-plus')]/parent::a")
		        	));
		        	js.executeScript("arguments[0].click();", addNewBtn);		       	
		        Reporter.log("✅ Clicked 'Add New' button", true);

		        // Step 6: Fill modal form
		        WebElement firstNameInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName")));
		        firstNameInput.sendKeys(GlobalData.FIRST_NAME);
             
		         //Last name 		    
		        String originalLastName = GlobalData.LAST_NAME;
		        char[] letters = originalLastName.toCharArray();
		        Random rand = new Random();
		        int indexToChange = rand.nextInt(letters.length);
		        char newChar = (char) ('A' + rand.nextInt(26)); 
		        letters[indexToChange] = newChar;
		        String uniqueLastName = new String(letters);
		        WebElement lastNameInput = driver.findElement(By.name("lastName"));
		        lastNameInput.sendKeys(uniqueLastName);
		        Reporter.log("📝 Entered unique last name: " + uniqueLastName, true);
		        
		     // Calculate DOB dynamically, e.g., 20 years ago
		        String dobValue = LocalDate.now().minusYears(20).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		        WebElement dobInput = driver.findElement(By.name("dob"));
		       
		        dobInput.clear();
		        dobInput.sendKeys(dobValue);

		        // Optional: trigger Angular change detection
		        js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", dobInput);
		        Reporter.log("📅 Entered DOB: " + dobValue, true);

		        // Gender selection		    
		        WebElement genderDDL = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(By.id("gender"))
		        );
		        Select genderSelect = new Select(genderDDL);
		        List<WebElement> genderOptions = genderSelect.getOptions();	       
		        Assert.assertTrue(genderOptions.size() > 1, "❌ Gender dropdown has no selectable values!");
		        int randomIndex = new Random().nextInt(genderOptions.size() - 1) + 1;
		        String selectedGender = genderOptions.get(randomIndex).getText();
		        genderSelect.selectByIndex(randomIndex);
		        Reporter.log("✔ Random Gender Selected: " + selectedGender, true);


		         // Relationship
		        WebElement ddl = driver.findElement(By.name("relationType"));
		        Select select = new Select(ddl);
		        List<WebElement> options = select.getOptions();
		        int randomIndex1 = new Random().nextInt(options.size() - 1) + 1;
		        String selectedValue = options.get(randomIndex1).getText();
		        select.selectByIndex(randomIndex1);
		        Reporter.log("✔ Random Relationship Selected: " + selectedValue, true);
		        
		        
		        // Get  mobile number
		        WebElement mobileField = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.id("mobile")
		        ));
		        String mobileNumber = mobileField.getAttribute("value");
		        Reporter.log("📌 Mobile Number (readonly): " + mobileNumber, true);

		        //Email
		        WebElement emailInput = driver.findElement(By.name("email"));
		        emailInput.sendKeys(GlobalData.EMAIL);
		        
		        //Address
		        WebElement Address = wait.until(ExpectedConditions.elementToBeClickable(By.name("address")));
		        Address.sendKeys(GlobalData.ADDRESS);
		        Thread.sleep(500);
		        
		        // Enable Save button if disabled
		        WebElement saveBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		        js.executeScript("arguments[0].removeAttribute('disabled');", saveBtn);

		        // Click Save button
		        js.executeScript("arguments[0].click();", saveBtn);
		        Reporter.log("✅ Clicked 'Save' button to add new dependant", true);
		        
		        // Step 7: Wait for toast message and log	   
//		        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		                By.cssSelector(".toast-message, .toast, .toast-body"))); 
//
//		        String toastText = toastMessage.getText();
//		        Reporter.log("📢 Toast message displayed: " + toastText, true);
		        
		        
		        // step 4:click delete icon
		        WebElement deleteIcon = driver.findElement(By.cssSelector("table tbody tr:first-child i.fa-trash"));
			    deleteIcon.click();
			    Thread.sleep(2000); 
			 WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(
			     By.cssSelector("button.btn-danger")));
			 deleteButton.click();
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 //delete toast
			 WebElement toastContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(
					    By.cssSelector("#toast-container")));
					String toastText = toastContainer.getText().trim();
					Assert.assertTrue(toastText.toLowerCase().contains("deleted"), "Toast message not shown or incorrect.");
					Reporter.log("Toast message displayed: " + toastText, true);
			
			driver.quit();
		    
		}
		
}
