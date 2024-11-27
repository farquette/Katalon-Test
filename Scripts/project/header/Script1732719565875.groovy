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

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/img'))

WebUI.rightClick(findTestObject('Object Repository/Page_A place to practice your automation skills/select_Main MenuSpecialsAccountLoginCheck Y_852d94'))

WebUI.setText(findTestObject('Object Repository/Page_Search/input_Checkout_filter_keyword'), 't-shirt')

WebUI.click(findTestObject('Object Repository/Page_Search/a_US Dollar'))

WebUI.click(findTestObject('Object Repository/Page_Search/a_Euro'))

WebUI.rightClick(findTestObject('Object Repository/Page_Search/span_Euro'))

WebUI.click(findTestObject('Object Repository/Page_Search/a_US Dollar_1'))

WebUI.click(findTestObject('Object Repository/Page_Search/a_US Dollar'))

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/a_Pound Sterling'))

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/span_0.00'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/a_Home'))

WebUI.mouseOver(findTestObject('Page_Shopping Cart/a_Home'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/span_Specials'))

WebUI.mouseOver(findTestObject('Page_Shopping Cart/a_Home'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/span_Account'))

WebUI.mouseOver(findTestObject('Page_Shopping Cart/a_Home'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/span_Account'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Login'))

WebUI.closeBrowser()

