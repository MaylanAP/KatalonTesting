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



class home {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open the website XYZ Bank")
	def I_open_the_website_XYZ_Bank() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://globalsqa.com/angularJs-protractor/BankingProject/#/login')
		WebUI.delay(1)
	}

//	@When("I click button customer login")
//	def I_click_button_customer_login() {
//		WebUI.click(findTestObject('home/button_Customer Login'))
//	}

	@Then("I see login page customer")
	def I_see_login_page_customer() {
		WebUI.getText(findTestObject('Object Repository/home/label_Your Name'))
		WebUI.closeBrowser()
	}

	@When("I click button bank manager login")
	def I_click_button_bank_manager_login() {
		WebUI.click(findTestObject('Object Repository/home/button_Bank Manager Login'))
	}

	@Then("I see login page manager")
	def I_see_login_page_manager() {
		WebUI.verifyElementPresent(findTestObject('home/FiturManager'), 0)
		WebUI.closeBrowser()
	}
}