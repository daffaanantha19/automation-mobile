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

Mobile.startApplication('D:\\Loker\\Loker 2024\\MITech\\Hari Senin (Minggu 2)\\Blibli_Belanja_Online_Mall_v10.9.1_www.9apps.com_.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/login/android.widget.TextView - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText - Emailnomor HP'), 'username', 0)

Mobile.setText(findTestObject('Object Repository/login/android.widget.EditText - Kata sandi'), '@Puloharapan_42', 0)

Mobile.tap(findTestObject('Object Repository/login/android.widget.Button - Masuk'), 0)

Mobile.closeApplication()

