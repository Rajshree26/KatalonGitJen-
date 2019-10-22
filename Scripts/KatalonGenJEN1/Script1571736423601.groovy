import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.flipkart.com')

WebUI.click(findTestObject('Object Repository/script_03/Page_Online Shopping Site for Mobiles Electronics Furniture Grocery Lifestyle Books  More Best Offers/button_'))

WebUI.setText(findTestObject('Object Repository/script_03/Page_Online Shopping Site for Mobiles Electronics Furniture Grocery Lifestyle Books  More Best Offers/input_Plus_q'), 
    'mobile')

WebUI.click(findTestObject('Object Repository/script_03/Page_Online Shopping Site for Mobiles Electronics Furniture Grocery Lifestyle Books  More Best Offers/button_Plus_vh79eN'))

WebUI.click(findTestObject('Object Repository/script_03/Page_Mobiles - Buy Products Online at Best Price in India - All Categories  Flipkartcom/div_Price -- High to Low'))

WebUI.click(findTestObject('Object Repository/script_03/Page_Mobiles - Buy Products Online at Best Price in India - All Categories  Flipkartcom/div_Redmi Note 7 Pro (Neptune Blue 64 GB)'))

WebUI.closeBrowser()

