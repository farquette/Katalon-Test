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

WebUI.setViewPortSize(700, 700)

WebUI.navigateToUrl('https://automationteststore.com/')

WebUI.click(findTestObject('Object Repository/Top header/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_A place to practice your automation skills/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_A place to practice your automation skills/a_Login or register'))

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/span_Login or register_icon-bar'))

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/span_Login or register_icon-bar'))

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/span_Login or register_icon-bar'))

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/button_Login or register_navbar-toggle collapsed'))

WebUI.click(findTestObject('Object Repository/Page_A place to practice your automation skills/button_Login or register_navbar-toggle collapsed'))

WebUI.scrollToElement(findTestObject('Footer/Page_A place to practice your automation skills/section_About UsThis store has been created to enable students to practice their automation testing skills. This is not a real store, no orders are actually placed or payments taken. This store is to be used for educatio'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()

