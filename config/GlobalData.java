package config;

public class GlobalData {
// jinzcart shop
	 public static final String BASE_URL = "https://jinzcart.shop";
	 public static final String HOME_URL = "https://jinzcart.shop/";
	 public static final String INVALID_URL = "https://jinzcart.shopee/";
	 public static final String PRODUCTDETAIL_URL= "https://jinzcart.shop/smiles-n-toys/pd/electric-stair-climbing-track-toy-for-kids";
	    // Auth URLs
	    public static final String LOGIN_URL = BASE_URL + "/auth/login";
	    public static final String REGISTER_URL = BASE_URL + "/auth/register";
	    public static final String ACCOUNT_URL = BASE_URL + "/account";
	    // Valid Login Credentials
	    public static final String VALID_MOBILE = "7598022921";
	    public static final String VALID_PASSWORD = "7598022921";

	    // Invalid Login Credentials
	    public static final String INVALID_MOBILE = "00";
	    public static final String INVALID_PASSWORD = "75980229210";

	    // Registration/Test Form Data
	    public static final String FIRST_NAME = "Mithran";
	    public static final String LAST_NAME = "G";
	    public static final String PHONE = "9865167147";
	    public static final String MOBILE = "7598022921";
	    public static final String MOBILE1 = "7598022922";
	    public static final String EMAIL = "manjubsc5@gmail.com";
	    public static final String INVALIDEMAIL = "manjubsc5";
	    public static final String PASSWORD = "StrongPass@123";
	    
	    public static final String FIRST_NAME1 = "Jeevan";
	    public static final String TEST_NAME = "Testing";
	    public static final String TEST1_NAME = "Jinzcart";
	    public static final String GSTIN_NAME = "12345";
	    public static final String ADDRESS = "Salem";
	    public static final String BEAT_NAME = "Chennai";
	    public static final String DESCRIPTION_NAME = "Description";
	    public static final String VEHICLENO = "102030";
	    public static final String INVALIDNAME = "00XX";  
	    //BANK DETAILS
	    public static final String BANK_NAME = "STATE BANK INDIA";
	    public static final String ACC_NO = "123456"; 
	    public static final String IFSC_NO = "123456123"; 
	    public static final String BRANCH_NAME = "Chennai"; 
	    
//NR Enterrprises
//	    public static final String NRENTERPRISES_URL = "http://localhost:6600/nr-enterprises/auth/signin";
	    public static final String NRENTERPRISES_URL = "http://localhost:6600/demo-store-ecomm/auth/signin";
	    public static final String NRENTERPRISES_HOMEURL = "http://localhost:6600/demo-store-ecomm/auth/signin";
	    
	    public static final String NRENTERPRISES_MOBILE = "8989898989";
	    public static final String NRENTERPRISES_PASSWORD = "Welcome@123";
	    public static final String NRENTERPRISESINVALID_PASSWORD = "Welcome@12345";
	    
// onboard vendor Login Credentials (Gift-Shop -- https://admin.jinzcart.shop/gift-shop)
	    
	    public static final String ONBOARDVENDOR1_URL = "https://admin.jinzcart.shop/gift-shop/auth/signin";
	    public static final String ONBOARDVENDORHOME_URL = " https://admin.jinzcart.shop/gift-shop";
	    public static final String ONBOARDNEWVENDOR_NAME = "Gift-Shop";
	    
	    // Valid Login Credentials
	    public static final String ONBOARDVENDORVALID_MOBILE = "9865167147";
	    public static final String ONBOARDVENDORVALID_PASSWORD = "9865167147";
	    public static final String ONBOARDVENDORVALID_NEWPASSWORD1 = "9865167147";
	    // Invalid Login Credentials
	    public static final String ONBOARDVENDORINVALID_MOBILE = "9865167147777";
	    public static final String ONBOARDVENDORINVALID_PASSWORD = "9865167";	    
	    
	//Jinz Admin Login
	    public static final String JINZLOGIN_URL = "http://localhost:6600/jinz/auth/signin";
	    public static final String JINZHOME_URL = "http://localhost:6600/jinz";
	    
	    //Ecomm
	    public static final String HEALTHCARELOGIN1_URL = "http://localhost:6600/demo-store-ecomm/auth/signin";
	    
  //Healthcare 
	    public static final String HEALTHCARELOGIN_URL = "http://localhost:6600/demo-healthcare/auth/signin";
	    public static final String HEALTHCAREHOME_URL = "http://localhost:6600/demo-healthcare/schedule/doctor";	
	    // Valid Login Credentials
	    public static final String HEALTHCAREVALID_MOBILE = "9789778678";
	    public static final String HEALTHCAREVALID_PASSWORD = "Welcome@123";
	    
	    public static final String HEALTHCARE_MOBILENUMBER = "9865167147";
	    public static final String HEALTHCARE_MOBILENUMBER1 = "7598022928";
	    public static final String HEALTHCARE_FIRSTNAME1 = "Kamali";
	    public static final String HEALTHCARE_LASTNAME = "S";
	    public static final String HEALTHCARE_REGISTERMOBILENUMBER = "9965847418";
	    public static final String MOBILENUMBER = "7598022925";
	    public static final String MYDEPENDANTS_MOBILENUMBER = "9789778678";
	  // details healthcare
	    public static final String HEALTHCARE_SCHEDULERNAME = "Automation";
	    public static final String HEALTHCARE_SCHEDUKERDESCRI = "This is a test description for the schedule.";
	    public static final String HEALTHCARE_SCHEDULERFEES = "500";
	    public static final String HEALTHCARE_GST = "18";
	    
	    
	    
 //jinzcart admin
	    public static final String ADMINLOGIN_URL = "http://localhost:6600/jinzcart/auth/signin";
	    public static final String ADMINHOME_URL = "http://localhost:6600/jinzcart";	    
	    
	 // Valid Login Credentials
	    public static final String ADMINVALID_MOBILE = "8431754303";
	    public static final String ADMINVALID_PASSWORD = "Fan.bgl2014";

	    // Invalid Login Credentials
	    public static final String ADMININVALID_MOBILE = "84317543030";
	    public static final String ADMININVALID_PASSWORD = "Fan.bgl2014000";
	    
	//deals of the day
	    public static final String DEALSOFDAY_SOLD = "10"; 
	    public static final String DEALSOFDAY_QUANTITY = "20"; 
	    public static final String DEALSOFDAY_PRODUCTNAME1 = "Mini Evaporative Portable Air Conditioner Fan"; 
	    public static final String DEALSOFDAY_PRODUCTNAME2 = "300ml Aroma Diffuser & Ultrasonic Humid"; 
	 
	    //invoice 
	    public static final String INVOICE_VALIDMOBILENUMBER = "9677062904"; 
	    public static final String INVOICE_INVALIDMOBILENUMBER = "967706290"; 
	    public static final String INVOICE_PRODUCTNAME = "Mini Evaporative Portable Air Conditioner";
	    public static final String INVOICE1_VENDORPRODUCTNAME1 = "Gift shop";
	    public static final String INVOICE1_VENDORPRODUCTNAME2 = "New test";
	    public static final String INVOICE_MAXQUANTITY = "2"; 
	    public static final String INVOICE_DISCOUNT = "10"; 
	    public static final String INVOICE_ADD = "10"; 
	    public static final String INVOICE_INVALIDORDERNO = "X0"; 
	    
	    //deals/coupons
	    public static final String DISCOUNT_NAME = "Diwali";
	    public static final String DISCOUNT_NAME1 = "Christmas";
	    public static final String DISCOUNT_VALUE = "150";
	    public static final String DISCOUNT_CODE = "SS100";
	   
	    //Products
	    public static final String MRP = "200";
	    public static final String LANDING = "100";
	   
        
	    
 //vendor verification
	    public static final String ADMVALID_MOBILE = "9865167147";
	    
// Register New Jinzcart vendor 
	    public static final String VENDOR_BRANDNAME = "Jinzcart Test";
	    public static final String VENDOR_FIRSTNAME = "Manjula";
	    public static final String VENDOR_LASTNAME = "A";
	    public static final String VENDOR_MOBILENUMBER = "9865167147";
	    public static final String VENDOR_EMAIL = "manjubsc5@gmail.com";
	    public static final String VENDOR_DATE = "2025";
	    public static final String PASSWORD_1 = "00000";
	    
	    public static final String VENDOR_ACCOUNTNAME = "Manjula";
	    public static final String VENDOR_BANKNAME = "SBI";
	    public static final String VENDOR_ACCOUNTNUMBER = "123456789";
	    public static final String VENDOR_IFSCCODE = "SBINO01064";
	    public static final String VENDOR_BRANCH = "MEDAVAKKAM";
	    //ADDRESS
	    public static final String VENDOR_FULLNAME = "Manjula";
	    public static final String VENDOR_PHONE = "9865167147";
	    public static final String VENDOR_APARTMENT = "Plotno:3E, Akshayam Avenue";
	    public static final String VENDOR_STREET = "Vengaivasal";
	    public static final String VENDOR_POSTELCODE = "600126";
	    public static final String VENDOR_STATE = "Tamil Nadu";
	    public static final String VENDOR_CITY = "Chennai";
	    public static final String VENDOR_COUNTRY = "India	";
	    public static final String DOE = "2025";
	    public static final String HOUSE_NO = "3E";
	    public static final String HOUSE_NO1 = "3C";
	    public static final String BLOCK_NAME = "Akshayam Avenue";
	    
	    public static final String GATEGORY_NAME = "Shop By Brand";
	    public static final String GATEGORY_NAME1 = "Toys & Games";
	    public static final String PRODUCT_NAME =  "TOYARTSY";
	    public static final String PRODUCT_NAME1 = "Cartoon Design Vibrant Gel";
	    public static final String PRODUCT_NAME2 = "Testing";
	    public static final String SUBGATEGORY_NAME = "Sub category";
	    public static final String SUBGATEGORYSHORT_NAME = "Sub-category";
	    
	    //add video  Video URL
	    
	    public static final String VIDEOPRODUCT_NAME= "Gift shop";
	    public static final String VIDEOURL_NAME= "https://www.youtube.com/watch?v=WyyBhPgh_Cg";
	    public static final String VIDEO_NAME1= "Demo Video";
	     
	   // Jinzhub URL
	   public static final String JINZHUB_URL = "https://jinzhub.com/#features";	    
	   public static final String COMPANY_NAME = "Jeeva-Mithran Store";
	    public static final String CONTACT_PERSON = "Manjula";
	    public static final String MOBILE_NUMBER = "9865167147";
	    public static final String EMAIL_ADDRESS = "testing@jinzcart.com"; 
}
