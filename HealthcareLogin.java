package demohealthcare;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.GlobalData;
import config.GlobalData_Healthcare;
import config.GlobalData_DoctorLogin;
import utilities.OtpUtils;

public class HealthcareLogin {
	
	// 1. login
    //@Test
		public static WebDriver HealthcareAdminLogin()  {
			 ChromeDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		        driver.get(GlobalData.HEALTHCARELOGIN_URL);
	     // Log current URL before login
	     String beforeLoginUrl = driver.getCurrentUrl();
	     Reporter.log("Before login URL: " + beforeLoginUrl, true);
	     driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
	     driver.findElement(By.id("password")).sendKeys(GlobalData.HEALTHCAREVALID_PASSWORD);
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
	   	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	 // Log URL after login
	     String afterLoginUrl = driver.getCurrentUrl();
	     Reporter.log("After login URL: " + afterLoginUrl, true);
	     return driver;
		}
		
		//Patient Login
		 //@Test
		public static WebDriver HealthcarePatientLogin()  {
			 ChromeDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		        driver.get(GlobalData.HEALTHCARELOGIN_URL);
	     // Log current URL before login
	     String beforeLoginUrl = driver.getCurrentUrl();
	     Reporter.log("Before login URL: " + beforeLoginUrl, true);
	     driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData_Healthcare.HEALTHCAREPATIENTLOGIN_MOBILENUMBER);
	     driver.findElement(By.id("password")).sendKeys(GlobalData_Healthcare.HEALTHCAREPATIENTLOGIN_PASSWORD);
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
	   	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	 // Log URL after login
	     String afterLoginUrl = driver.getCurrentUrl();
	     Reporter.log("After login URL: " + afterLoginUrl, true);
	     return driver;
		}
		
		
		// 3. Doctor Login
		
		 //@Test
		public static WebDriver HealthcareDoctorLogin()  {
			 ChromeDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		        driver.get(GlobalData.HEALTHCARELOGIN_URL);
	     // Log current URL before login
	     String beforeLoginUrl = driver.getCurrentUrl();
	     Reporter.log("Before login URL: " + beforeLoginUrl, true);
	     driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData_DoctorLogin.DOCTORLOGINVALID_MOBILE);
	     driver.findElement(By.id("password")).sendKeys(GlobalData_DoctorLogin.DOCTORLOGINVALID_PASSWORD);
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
	   	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	 // Log URL after login
	     String afterLoginUrl = driver.getCurrentUrl();
	     Reporter.log("After login URL: " + afterLoginUrl, true);
	     return driver;
		}
		
		
//TC-01 -  correct login
				@Test
				public void TC1_01_HealthcareLoginPage()  {
					 ChromeDriver driver = new ChromeDriver();
				     driver.manage().window().maximize();
				        driver.get(GlobalData.HEALTHCARELOGIN_URL);
			     // Log current URL before login
			     String beforeLoginUrl = driver.getCurrentUrl();
			     Reporter.log("Before login URL: " + beforeLoginUrl, true);
			     driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
			     driver.findElement(By.id("password")).sendKeys(GlobalData.HEALTHCAREVALID_PASSWORD);
			     try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
			   	 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   	 // Log URL after login
			     String afterLoginUrl = driver.getCurrentUrl();
			     Reporter.log("After login URL: " + afterLoginUrl, true);
			    
				}
				
	// 1.1 Healthcare invalid login
				@Test 
				public void TC1_02_HealthcareInvalidLogin() throws InterruptedException {
					 ChromeDriver driver = new ChromeDriver();
				     driver.manage().window().maximize();
				        driver.get(GlobalData.HEALTHCARELOGIN_URL);
			     // Log current URL before login
			     String beforeLoginUrl = driver.getCurrentUrl();
			     Reporter.log("Before login URL: " + beforeLoginUrl, true);
			     driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
			     driver.findElement(By.id("password")).sendKeys(GlobalData.ADMININVALID_PASSWORD);
			     driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
			   	 Thread.sleep(2000);
			   	 // Wait for toast message
			     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			     WebElement toastMessageElement = wait.until(
			             ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message"))
			     );

			     String actualMessage = toastMessageElement.getText();
			     String expectedMessage = "User invalid credentials";
			     Reporter.log("Toast message received: " + actualMessage, true);
			     Assert.assertEquals(actualMessage, expectedMessage, "Incorrect toast message displayed!");
		 }
				
// 1.2 negative login test cases - fail
				@Test
				    public void TC1_03_HealthcareInvalidLoginPassword() throws InterruptedException {
				        ChromeDriver driver = new ChromeDriver();
				        driver.manage().window().maximize();
				        driver.get(GlobalData.HEALTHCARELOGIN_URL);
				        try {
				        	 driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
				    	     driver.findElement(By.id("password")).sendKeys(GlobalData.ADMININVALID_PASSWORD);
				    	     driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
				            Thread.sleep(2000);
				            String currentUrl = driver.getCurrentUrl();
				            Reporter.log("URL after failed login: " + currentUrl, true);
				            boolean isErrorDisplayed = driver.getPageSource().contains("Invalid mobile number or password");
				            if (!isErrorDisplayed) {
				                takeScreenshot(driver, "Login_Failure");
				            }
				            Assert.assertTrue(isErrorDisplayed, "Error message should be displayed for invalid login");
				        } catch (Exception e) {
				            takeScreenshot(driver, "Exception_Login_Test");
				            e.printStackTrace();
				            Assert.fail("Test failed due to an exception: " + e.getMessage());
				        } finally {
				            driver.quit();
				        }
				    }
				
				// 3.Healthcare forgot password
				 @Test
				    public void TC1_04_HealthcareForgotPasswordNavigation() throws Exception {
				        ChromeDriver driver = new ChromeDriver();
				        driver.manage().window().maximize();
				        driver.get(GlobalData.HEALTHCARELOGIN_URL);

				        // Step 1: Login with invalid details
				        driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
				        driver.findElement(By.id("password")).sendKeys(GlobalData.ADMININVALID_PASSWORD);
				        Thread.sleep(1000);
				        driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
				        Thread.sleep(2000);
				        
				        // Step 2: Wait for toast to appear
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				        wait.until(ExpectedConditions.visibilityOfElementLocated(
				            By.cssSelector("div#toast-container.toast-bottom-right.toast-container")
				        ));
				        Reporter.log("✅ Toast message displayed after invalid login", true);
				        
				        // Step 3: Click "Lost your password?"
				        WebElement forgotPasswordLink = wait.until(ExpectedConditions.elementToBeClickable(
				            By.cssSelector("a[href='/demo-healthcare/auth/forget-password']")
				        ));
				        forgotPasswordLink.click();
				        Reporter.log("✅ Navigated to Forgot Password page", true);

				        // Step 3: Enter mobile number and click Generate OTP
				        String mobile = "9865167147";
				        String customerId = "65f64cd42c4822ce6daa2467"; 

				        WebElement mobileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mobileNumber")));
				        mobileInput.sendKeys(mobile);

				        WebElement generateOtpBtn = wait.until(ExpectedConditions.elementToBeClickable(
				            By.cssSelector("button.btn.btn-primary.w-100")
				        ));
				        generateOtpBtn.click();
				        Reporter.log("✅ Clicked Generate OTP", true);
				        Thread.sleep(1000);

				        // Step 4: Fetch OTP from API
				        String otp = OtpUtils.fetchOtpFromApi(mobile, customerId);
				        Reporter.log("✅ Fetched OTP: " + otp, true);

				        // Step 5: Enter OTP
				        WebElement otpInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("otp")));
				        otpInput.sendKeys(otp);
				        Reporter.log("✅ Entered OTP", true);

				        // Step 6: Click Verify OTP
				        WebElement verifyBtn = wait.until(ExpectedConditions.elementToBeClickable(
				            By.cssSelector("button.btn.btn-primary.w-100")
				        ));
				        verifyBtn.click();
				        Reporter.log("✅ Clicked Verify OTP", true);

				        // Step 7: Validate navigation to reset password
				        Thread.sleep(1000);
				        String currentUrl = driver.getCurrentUrl();
				        Reporter.log("Current URL after OTP verify: " + currentUrl, true);
				        
				     // Step 8: Enter new password and confirm password
				        WebElement newPasswordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
				        newPasswordInput.sendKeys(GlobalData.HEALTHCAREVALID_PASSWORD);

				        WebElement confirmPasswordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmPassword")));
				        confirmPasswordInput.sendKeys(GlobalData.HEALTHCAREVALID_PASSWORD);
				        Reporter.log("✅ Entered new and confirm password", true);

				        // Step 9: Wait for the Reset Password button to become enabled
				        WebElement resetPasswordBtn = wait.until(ExpectedConditions.elementToBeClickable(
				            By.cssSelector("button.btn.btn-primary.w-100:not([disabled])")
				        ));
				        resetPasswordBtn.click();
				        Reporter.log("✅ Clicked Reset Password button", true);

				        // Step 10: Optional – validate navigation or toast/message
				        Thread.sleep(1000);
				        String postResetUrl = driver.getCurrentUrl();
				        Reporter.log("Current URL after resetting password: " + postResetUrl, true);

				     // Step 11: Validate success message on the page after password reset
				        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
				            By.xpath("//div[contains(text(),'Password changed successfully')]")
				        ));
				        Assert.assertTrue(successMsg.isDisplayed(), "❌ Password success message not found on the page.");
				        Reporter.log("✅ Password changed success message displayed on page", true);

				     // Step 12: Click "Login Now" link
				        WebElement loginNowLink = wait.until(ExpectedConditions.elementToBeClickable(
				            By.xpath("//a[contains(text(),'Login Now')]")
				        ));
				        loginNowLink.click();
				        Reporter.log("✅ Clicked on 'Login Now' link", true);

				        // Step 13: Assert redirection to login page
				        wait.until(ExpectedConditions.urlContains("/demo-healthcare/auth/signin"));
				        String finalUrl = driver.getCurrentUrl();
				        Assert.assertTrue(finalUrl.contains("/auth/signin"), 
				            "❌ Did not navigate to login page after clicking 'Login Now'.");
				        Reporter.log("✅ Navigated to Login page: " + finalUrl, true);
				        // Step 14: login user
				        driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
				        driver.findElement(By.id("password")).sendKeys(GlobalData.HEALTHCAREVALID_PASSWORD);
				        Thread.sleep(1000);
				        driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
					   	 try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					   	String afterLoginUrl = driver.getCurrentUrl();
					     Reporter.log("After login URL: " + afterLoginUrl, true);

				        // driver.quit();
				    }			
				
//5.Healthcare  Logout
				 @Test
				 public void TC1_05_HealthcareLogout() throws InterruptedException {
				     ChromeDriver driver = new ChromeDriver();
				     driver.manage().window().maximize();
				     driver.get(GlobalData.HEALTHCARELOGIN_URL);

				     // Log current URL before login 
				     String beforeLoginUrl = driver.getCurrentUrl();
				     Reporter.log("Before login URL: " + beforeLoginUrl, true);

				     // Login
				     driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
				     driver.findElement(By.id("password")).sendKeys(GlobalData.HEALTHCAREVALID_PASSWORD);
				     driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();

				     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				     wait.until(ExpectedConditions.urlToBe(GlobalData.HEALTHCAREHOME_URL));

				     String afterLoginLandingUrl = driver.getCurrentUrl();
				     Reporter.log("After login landed on URL: " + afterLoginLandingUrl, true);
				     Assert.assertEquals(afterLoginLandingUrl, GlobalData.HEALTHCAREHOME_URL, "Did not land on homepage after login.");

				     // Click profile image to open dropdown
				     WebElement profileImage = wait.until(ExpectedConditions.elementToBeClickable(
				         By.cssSelector("img.user-avatar")
				     ));
				     profileImage.click();

				     // Click "Sign Out"
				     WebElement signOutBtn = wait.until(ExpectedConditions.elementToBeClickable(
				         By.xpath("//span[contains(@class,'menu-text') and normalize-space()='Sign Out']")
				     ));
				     signOutBtn.click();
				     
				     Reporter.log("Sign Out button clicked successfully.", true);

				     // Wait until redirected to login URL
				     wait.until(ExpectedConditions.urlToBe(GlobalData.HEALTHCARELOGIN_URL));
				     Reporter.log("Redirected to login after logout: " + driver.getCurrentUrl(), true);

				     //driver.quit();
				 }

	//6. Healthcare negative test Logout
				 @Test
				 public void TC1_06_HealthcareLogoutNegativeTest() throws Throwable {
				     ChromeDriver driver = null;
				     try {
				         driver = new ChromeDriver();
				         driver.manage().window().maximize();
				         driver.get(GlobalData.HEALTHCARELOGIN_URL);

				         // Log current URL before login 
				         String beforeLoginUrl = driver.getCurrentUrl();
				         Reporter.log("Before login URL: " + beforeLoginUrl, true);

				         // Login
				         driver.findElement(By.id("mobileNumber")).sendKeys(GlobalData.HEALTHCAREVALID_MOBILE);
				         driver.findElement(By.id("password")).sendKeys(GlobalData.HEALTHCAREVALID_PASSWORD);
				         driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();

				         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				         wait.until(ExpectedConditions.urlToBe(GlobalData.HEALTHCAREHOME_URL));

				         String afterLoginLandingUrl = driver.getCurrentUrl();
				         Reporter.log("After login landed on URL: " + afterLoginLandingUrl, true);
				         Assert.assertEquals(afterLoginLandingUrl, GlobalData.HEALTHCAREHOME_URL,
				                 "Did not land on homepage after login.");

				         // Click profile image to open dropdown
				         WebElement profileImage = wait.until(ExpectedConditions.elementToBeClickable(
				             By.cssSelector("img.user-avatar")
				         ));
				         profileImage.click();

				         // ❌ Wrong XPath (will not find Sign Out, intentional fail)
				         WebElement signOutBtn = wait.until(ExpectedConditions.elementToBeClickable(
				             By.xpath("//span[@class='wrong-class' and text()='Sign Out']")
				         ));
				         signOutBtn.click();
				         Reporter.log("Sign Out button clicked (but shouldn't).", true);

				         // ❌ Expecting wrong URL on purpose
				         wait.until(ExpectedConditions.urlToBe(GlobalData.HEALTHCARELOGIN_URL));
				         String actualUrl = driver.getCurrentUrl();
				         String expectedWrongUrl = "https://jinzcart.in/wrong-login"; // intentional failure
				         Assert.assertEquals(actualUrl, expectedWrongUrl, "Intentional failure: URL mismatch");

				     } catch (Exception | AssertionError e) {
				         Reporter.log("❌ Negative Test Failed as expected: " + e.getMessage(), true);
				         if (driver != null) {
				             takeScreenshot(driver, "HealthcareLogoutNegativeTest_Failure");
				         }
				         throw e; // rethrow so TestNG marks it failed
				     } finally {
				         if (driver != null) {
				             driver.quit();
				         }
				     }
				 }
				
				
				
				//Reuse screenshot utility method
				public void takeScreenshot(WebDriver driver, String fileName) {
				    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
				    String filePath = "./admin snaps/" + fileName + "_" + timestamp + ".png";
				    File dest = new File(filePath);
				    try {
				        dest.getParentFile().mkdirs(); // Ensure directory exists
				        org.openqa.selenium.io.FileHandler.copy(src, dest);
				        Reporter.log("Screenshot saved: " + dest.getAbsolutePath(), true);
				    } catch (IOException e) {
				        Reporter.log("Screenshot failed: " + e.getMessage(), true);
				    }
				}				
}
