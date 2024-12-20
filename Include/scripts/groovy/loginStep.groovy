import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginStep {
	@When ("I click button customer login")
	def I_click_button_customer_login() {
		WebUI.click(findTestObject('Object Repository/home/button_Customer Login'))
	}
	
	@When("I click button drop down")
	def I_click_button_drop_down() {
		WebUI.click(findTestObject('Cust Profile/DropDownName'))
	}

	@When("I input (.*)")
	def I_input_username(String username){
		if (username == "Hermoine Grager") {
			WebUI.click(findTestObject('CustLog/Hermoine Grager'), username)
		} else if (username == "Harry Potter") {
			WebUI.click(findTestObject('CustLog/Harry Potter'), username)}
//		} else if (true) {
//			WebUI.click(findTestObject('CustLog/Ron Weasly'))
//		} else if (true) {
//			WebUI.click(findTestObject('CustLog/Albus Dumbleoder'))
//		} else {
//			WebUI.click(findTestObject('CustLog/Neville Longbottom'))
//		}
	}

	@When("I click button login")
	def I_click_button_login() {
		WebUI.click(findTestObject('CustLog/button_Login'))
	}
	@Then("I see (.*)")
	def I_see_username(String account){
		if (account) {
    WebUI.verifyElementPresent(findTestObject('CustLog/span_Hermoine Granger'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (account) {
    WebUI.verifyElementText(findTestObject('CustLog/span_Harry Potter'), '')
}
	}
}
