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

WebUI.click(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/span_Featured'))

WebUI.click(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/span_Latest Products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/span_Latest Products'))

WebUI.click(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/div_BestsellersSee Best Selling ProductsBen_49135b'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/div_BestsellersSee Best Selling ProductsBen_49135b'))

WebUI.click(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/span_Specials'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/span_Specials'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Home/Page_SewRiveting - Custom Apparel/a_Specials'))

WebUI.click(findTestObject('Object Repository/Home/Page_Special Offers/button_Sort By_list'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Home/Page_Special Offers/a_Account'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.mouseOver(findTestObject('Home/Page_Special Offers/a_Account'))

WebUI.click(findTestObject('Object Repository/Home/Page_Account Login/a_Login'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.mouseOver(findTestObject('Home/Page_Special Offers/a_Account'))

WebUI.click(findTestObject('Object Repository/Home/Page_Account Login/a_Check Your Order'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Home/Page_Order Details/a_Cart'))

WebUI.mouseOver(findTestObject('Object Repository/Home/Page_SewRiveting - Custom Apparel/a_Home'))

WebUI.click(findTestObject('Object Repository/Home/Page_Shopping Cart/a_Checkout'))

WebUI.closeBrowser()

