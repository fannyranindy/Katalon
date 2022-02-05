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

for (def index : (1..5)) {
    WebUI.openBrowser('https://www.saucedemo.com/')

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('LoginPage/input_username'), 'standard_user')

    WebUI.setText(findTestObject('LoginPage/input_password'), 'secret_sauce')

    WebUI.click(findTestObject('LoginPage/button_login'))

    WebUI.verifyElementPresent(findTestObject('ProductLink/product_link'), 0)

    WebUI.click(findTestObject('ProductLink/backpack'))

    WebUI.click(findTestObject('ProductLink/bikelight'))

    WebUI.click(findTestObject('ProductLink/bolt_tshirt'))

    WebUI.click(findTestObject('ProductLink/fleece_jacket'))

    WebUI.click(findTestObject('ProductLink/link_to_cart'))

    WebUI.verifyElementText(findTestObject('Cart/price_backpack'), '$29.99')

    WebUI.verifyElementText(findTestObject('Cart/price_bikelight'), '$9.99')

    WebUI.verifyElementText(findTestObject('Cart/price_boltshirt'), '$15.99')

    WebUI.verifyElementText(findTestObject('Cart/price_jacket'), '$49.99')

    WebUI.click(findTestObject('logout/button_menu'))

    WebUI.click(findTestObject('logout/logout_button'))
}

WebUI.closeBrowser()

