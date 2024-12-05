import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sewriveting.ca/store/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/span_Featured'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/i_Write Review_fa fa-cart-plus fa-fw'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/span_Latest Products'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/span_Bestsellers'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/i_Write Review_fa fa-cart-plus fa-fw_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/span_Specials'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/i_Write Review_fa fa-cart-plus fa-fw_1_2'), 
    0)

WebUI.scrollToElement(findTestObject('Menu_category-home/Page_SewRiveting - Custom Apparel/section_Contact Us123 456 7890, 123 456 7890123 456 7890, 123 456 78900help at abantecart.comhelp at abantecart.comTestimonials Love the cart. I installed it a while back and use it since when. Some features a hidden, bu'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/a_Back to top'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/a_Specials'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Special Offers/button_Sort By_grid'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Special Offers/i_Sort By_fa fa-th-list'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Special Offers/i_View_fa fa-cart-plus fa-fw'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Special Offers/img'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_category-home/Page_Special Offers/div_Per Page10203040501 - 8 of 8             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Back to top'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_Special Offers/a_Home'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Special Offers/a_Account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Menu_category-home/Page_Account Login/div_Register Account'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Account Login/button_Continue'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Menu_category-home/Page_Account Login/input_Login Name_loginname'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Menu_category-home/Page_Account Login/input_Password_password'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Account Login/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Forgot your login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Forgot your password'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Back to top'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Account'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Login'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Back to top'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Home'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Account'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Check Your Order'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Order Details/input_Order ID_order_id'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Menu_category-home/Page_Order Details/input_Order ID_order_id'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Order Details/input_E-Mail_email'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Menu_category-home/Page_Order Details/input_E-Mail_email'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Order Details/button_Continue'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Menu_category-home/Page_Order Details/a_Back'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Order Details/button_Continue'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Order Details/a_Back'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Home'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_SewRiveting - Custom Apparel/a_Cart'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/section_About UsPrivacy PolicyReturn Policy_0e7483'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/a_Continue'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_category-home/Page_Account Login/a_Home'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/a_Checkout'))

WebUI.scrollToElement(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/section_About UsPrivacy PolicyReturn Policy_0e7483'), 
    0)

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Menu_category-home/Page_Shopping Cart/a_Continue'))

WebUI.closeBrowser()

