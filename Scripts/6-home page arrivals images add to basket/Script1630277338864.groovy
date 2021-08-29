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

WebUI.callTestCase(findTestCase('2-test home page with three arrivals only'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page Home/linkFirstArrival'), GlobalVariable.timeout)
WebUI.click(findTestObject('Object Repository/Page Home/linkFirstArrival'))

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page Product/btnAddToBasket'), GlobalVariable.timeout)
WebUI.click(findTestObject('Object Repository/Page Product/btnAddToBasket'))

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Product/span_cart_item_added'), GlobalVariable.timeout)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page Product/span_cart_amount'), GlobalVariable.timeout)

String actualResult1 = WebUI.getText(findTestObject('Page Product/span_cart_amount'))
String actualResult2 = WebUI.getText(findTestObject('Page Product/span_cart_item_added'))

println "Result expected $actualResult1 and $actualResult2"
