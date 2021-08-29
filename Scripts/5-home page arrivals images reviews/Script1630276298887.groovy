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
import org.testng.Assert 

WebUI.callTestCase(findTestCase('3-home page images in arrivals should navigate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Product/linkProductReviews'), GlobalVariable.timeout)
WebUI.click(findTestObject('Object Repository/Page Product/linkProductReviews'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Product/liProductReviews'), GlobalVariable.timeout)
String classes = WebUI.getAttribute(findTestObject('Object Repository/Page Product/liProductReviews'), "class")

if(classes.toString().contains("active")) {
	String message =WebUI.getText(findTestObject('Object Repository/Page Product/h2TitleProductReviews'))
	Assert.assertEquals("Reviews", message,"Product does not click in product reviews tag")
}else {
	throw new Exception("No class found!")
}


