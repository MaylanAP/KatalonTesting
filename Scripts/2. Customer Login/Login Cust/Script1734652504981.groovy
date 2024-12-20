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

WebUI.navigateToUrl('https://globalsqa.com/angularJs-protractor/BankingProject/#/login')

WebUI.click(findTestObject('home/button_Customer Login'))

WebUI.click(findTestObject('Cust Profile/DropDownName'))

if (username1) {
    WebUI.click(findTestObject('CustLog/Hermoine Grager'))
} else if (username2) {
    WebUI.click(findTestObject('CustLog/Harry Potter'))
} else if (true) {
    WebUI.click(findTestObject('CustLog/Ron Weasly'))
} else if (true) {
    WebUI.click(findTestObject('CustLog/Albus Dumbleoder'))
} else {
    WebUI.click(findTestObject('CustLog/Neville Longbottom'))
}

WebUI.click(findTestObject('CustLog/button_Login'))

if (account1) {
    WebUI.verifyElementPresent(findTestObject('CustLog/span_Hermoine Granger'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (account2) {
    WebUI.verifyElementText(findTestObject('CustLog/span_Harry Potter'), '')
} else if (true) {
    WebUI.verifyElementText(findTestObject('CustLog/span_Ron Weasly'), '')
} else if (true) {
    WebUI.verifyElementText(findTestObject('CustLog/span_Albus Dumbledore'), '')
} else {
    WebUI.verifyElementText(findTestObject('CustLog/span_Neville Longbottom'), '')
}

WebUI.closeBrowser()

