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

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/a_Home'))

WebUI.mouseOver(findTestObject('Page_Shopping Cart/a_Home'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/span_Specials'))

WebUI.mouseOver(findTestObject('Page_Shopping Cart/a_Home'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/span_Account'))

WebUI.mouseOver(findTestObject('Page_Shopping Cart/a_Home'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/span_Account'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Login'))

WebUI.mouseOver(findTestObject('Page_Shopping Cart/a_Home'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/span_Account'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Check Your Order'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Apparel  accessories'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Apparel  accessories'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Shoes'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Apparel  accessories'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_T-shirts'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Makeup'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Makeup'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Cheeks'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Makeup'))

WebUI.click(findTestObject('Makeup/a_Eyes'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Makeup'))

WebUI.click(findTestObject('Makeup/a_Face'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Makeup'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Lips'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Makeup'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Nails'))

WebUI.mouseOver(findTestObject('Page_A place to practice your automation skills/a_Makeup'))

WebUI.click(findTestObject('Page_A place to practice your automation skills/a_Value Sets'))

WebUI.click(findTestObject('Skincare/a_Skincare'))

WebUI.mouseOver(findTestObject('Skincare/a_Skincare'))

WebUI.click(findTestObject('Skincare/a_Eyes'))

WebUI.mouseOver(findTestObject('Skincare/a_Skincare'))

WebUI.click(findTestObject('Skincare/a_Face'))

WebUI.closeBrowser()

