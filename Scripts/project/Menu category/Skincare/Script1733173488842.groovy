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

WebUI.click(findTestObject('Object Repository/skincare/Page_SewRiveting - Custom Apparel/a_Skincare'))

WebUI.verifyElementVisible(findTestObject('Object Repository/skincare/Page_Skincare/a_Skincare'))

WebUI.scrollToElement(findTestObject('Object Repository/skincare/Page_Skincare/div_Per Page10203040501 - 5 of 5             1'), 
    0)

WebUI.click(findTestObject('Object Repository/skincare/Page_Skincare/i_Sort By_fa fa-th-list'))

WebUI.mouseOver(findTestObject('Object Repository/skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Skincare/a_Eyes'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Eyes/i_Sort By_fa fa-th-list'))

WebUI.scrollToElement(findTestObject('Object Repository/skincare/Page_Eyes/div_Per Page10203040501 - 3 of 3             1'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/skincare/Page_Eyes/div_Sort ByDate New  OldName A - ZName Z - _5c0796'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Eyes/a_Face'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Face/i_Sort By_fa fa-th-list'))

WebUI.scrollToElement(findTestObject('Object Repository/skincare/Page_Face/div_Per Page10203040501 - 5 of 5             1'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/skincare/Page_Face/div_Sort ByDate New  OldName A - ZName Z - _5c0796'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Face/a_Gift Ideas  Sets'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Gift Ideas  Sets/div_Sort ByDate New  OldName A - ZName Z - _5c0796'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Gift Ideas  Sets/div_Per Page10203040501 - 4 of 4             1'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Gift Ideas  Sets/button_Sort By_list'))

WebUI.mouseOver(findTestObject('Object Repository/skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Gift Ideas  Sets/a_Hands  Nails'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Hands  Nails/button_Sort By_list'))

WebUI.mouseOver(findTestObject('Object Repository/skincare/Page_Skincare/a_Skincare'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Hands  Nails/a_Sun'))

WebUI.click(findTestObject('Object Repository/skincare/Page_Sun/button_Sort By_list'))

WebUI.verifyElementVisible(findTestObject('Object Repository/skincare/Page_Sun/div_Per Page10203040501 - 1 of 1             1'))

WebUI.closeBrowser()

