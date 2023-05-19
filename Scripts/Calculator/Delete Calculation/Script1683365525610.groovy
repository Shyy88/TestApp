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

Mobile.startApplication('C:\\Users\\Aishy\\Katalon Studio\\EduApp\\AndriodApp\\Calculator_v8.1.apk', true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/CalculatorApp/Brackets.Button - ()'), 0)

Mobile.tap(findTestObject('Object Repository/CalculatorApp/Num.Button - 5'), 0)

Mobile.tap(findTestObject('Object Repository/CalculatorApp/Minus.Button -'), 0)

Mobile.tap(findTestObject('Object Repository/CalculatorApp/Num.Button - 2'), 0)

Mobile.tap(findTestObject('CalculatorApp/Brackets.Button - ()'), 0)

Mobile.tap(findTestObject('CalculatorApp/Multiple.Button -'), 0)

Mobile.tap(findTestObject('CalculatorApp/Number.Button - 9'), 0)

Mobile.tap(findTestObject('CalculatorApp/ac.Button - AC (1)'), 0)

WebUI.delay(3)

Mobile.closeApplication()

