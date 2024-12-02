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

WebUI.click(findTestObject('Object Repository/Order by Apparel/Page_SewRiveting - Custom Apparel/a_Apparel  accessories'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'pd.name-ASC', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'pd.name-DESC', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'p.price-ASC', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'p.price-DESC', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'rating-DESC', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'rating-ASC', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'date_modified-ASC', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Order by Apparel/Page_Apparel  accessories/select_Date New  OldName A - ZName Z - APri_caf541'), 
    'date_modified-DESC', false)

WebUI.closeBrowser()

