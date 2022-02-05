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

WebUI.navigateToUrl('https://www.cilsy.id/')

WebUI.click(findTestObject('Object Repository/Page_Kursus Online Server dan Jaringan  Cilsy.id/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Email_email'), 'anindy99@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Password_password'), 'wnTmbwC4w1uQbSUwGlmbKA==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Ingat Saya_remember'))

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Page_Kursus Online Server dan Jaringan  Cilsy.id/img_Lihat Semua Pemberitahuan_icon'))

WebUI.click(findTestObject('Object Repository/Page_Kursus Online Server dan Jaringan  Cilsy.id/a_Pengaturan Akun'))

WebUI.click(findTestObject('Object Repository/Page_Profil  Cilsy.id/a_Akun'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ubah Password  Cilsy.id/input_Password Lama_current_password'), 
    'wnTmbwC4w1uQbSUwGlmbKA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ubah Password  Cilsy.id/input_Password Baru_password'), 'wnTmbwC4w1v1RMA0/gGF0Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ubah Password  Cilsy.id/input_Konfirmasi Password_password_confirmation'), 
    'wnTmbwC4w1v1RMA0/gGF0Q==')

WebUI.click(findTestObject('Object Repository/Page_Ubah Password  Cilsy.id/button_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Email_email'), 'anindy99@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Cilsy.id/input_Password_password'), 'wnTmbwC4w1v1RMA0/gGF0Q==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/label_Ingat Saya'))

WebUI.click(findTestObject('Object Repository/Page_Masuk  Cilsy.id/button_MASUK'))

WebUI.closeBrowser()

