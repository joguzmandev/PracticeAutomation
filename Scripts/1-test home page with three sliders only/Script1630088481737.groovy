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
import org.openqa.selenium.Keys
import org.testng.Assert as Assertions
import org.openqa.selenium.Keys as Keys

CustomKeywords.'Login.loginApplication'(GlobalVariable.username, GlobalVariable.password, GlobalVariable.urlApplication)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Home/linkShopMenu'), GlobalVariable.timeout)
WebUI.click(findTestObject('Object Repository/Page Home/linkShopMenu'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page Shop/linkHomeMenu'), GlobalVariable.timeout)
WebUI.click(findTestObject('Object Repository/Page Shop/linkHomeMenu'))

int resultSlidesFound = CustomKeywords.'CounterElements.counterWebElements'(findTestObject('Object Repository/Page Home/imgSlide'))

Assertions.assertEquals(resultSlidesFound, GlobalVariable.threeSlidersExpected,"Slides found not are 3")



