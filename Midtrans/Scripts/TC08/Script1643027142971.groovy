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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('demo.midtrans.com')

WebUI.click(findTestObject('Home/button_buynow'))

WebUI.setText(findTestObject('ShoppingCart/input_amount'), '120000')

WebUI.setText(findTestObject('ShoppingCart/input_username'), 'Fanny')

WebUI.setText(findTestObject('ShoppingCart/input_email'), 'anindy99@gmail.com')

WebUI.setText(findTestObject('ShoppingCart/input_notlp'), '087875751882')

WebUI.setText(findTestObject('ShoppingCart/input_city'), 'Jakarta Selatan')

WebUI.setText(findTestObject('ShoppingCart/input_address'), 'Jl. Damai 1')

WebUI.setText(findTestObject('ShoppingCart/input_kodepos'), '12270')

WebUI.click(findTestObject('ShoppingCart/button_checkout'))

WebUI.click(findTestObject('Ordersummary/button_continue'))

WebUI.click(findTestObject('Ordersummary/select_payment'))

WebUI.setText(findTestObject('Ordersummary/input_cardnumber'), '4811 1111 1111 1114')

WebUI.setText(findTestObject('Ordersummary/input_expireddate'), '01/25')

WebUI.setText(findTestObject('Ordersummary/input_cvv'), '123')

WebUI.click(findTestObject('Ordersummary/pay_now'), FailureHandling.STOP_ON_FAILURE)

