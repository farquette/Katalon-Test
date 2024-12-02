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

WebUI.click(findTestObject('Object Repository/Hair Care/Page_SewRiveting - Custom Apparel/a_Hair Care'))

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Hair Care/button_Sort By_list'))

WebUI.scrollToElement(findTestObject('Object Repository/Hair Care/Page_Hair Care/div_Per Page10203040501 - 4 of 4             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Hair Care/a_Back to top'))

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Hair Care/a_Conditioner'))

WebUI.mouseOver(findTestObject('Object Repository/Hair Care/Page_Conditioner/a_Hair Care'))

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Conditioner/a_Conditioner'))

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Conditioner/i_Sort By_fa fa-th-list'))

WebUI.scrollToElement(findTestObject('Object Repository/Hair Care/Page_Conditioner/div_Per Page10203040501 - 5 of 5             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Conditioner/a_Back to top'))

WebUI.mouseOver(findTestObject('Object Repository/Hair Care/Page_Conditioner/a_Hair Care'))

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Conditioner/a_Shampoo'))

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Shampoo/i_Sort By_fa fa-th-list'))

WebUI.scrollToElement(findTestObject('Object Repository/Hair Care/Page_Shampoo/div_Per Page10203040501 - 2 of 2             1'), 
    0)

WebUI.click(findTestObject('Object Repository/Hair Care/Page_Shampoo/a_Back to top'))

WebUI.closeBrowser()

