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

WebUI.navigateToUrl('https://automationteststore.com/')

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_A place to practice your automation skills/a_Login or register'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Account Login/div_Register Account'))

WebUI.setText(findTestObject('Object Repository/Test demo 1/Page_Account Login/input_Login Name_loginname'), 'guestaccount_420_69')

WebUI.rightClick(findTestObject('Object Repository/Test demo 1/Page_Account Login/label_Password'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Account Login/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test demo 1/Page_Account Login/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Account Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Account Login/a_Apparel  accessories'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Apparel  accessories/li_T-shirts'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Apparel  accessories/a_T-shirts'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_T-shirts/i_Write Review_fa fa-cart-plus fa-fw'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Designer Men Casual Formal Double Cuff_e8b5c1/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Shopping Cart/a_1Items-32.00'))

WebUI.click(findTestObject('Object Repository/Test demo 1/Page_Shopping Cart/a_Checkout'))

