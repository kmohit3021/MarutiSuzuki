import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.nexaexperience.com/e-vitara')

WebUI.maximizeWindow()

getHD = WebUI.getAttribute(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/label_HD'), 'class')

KeywordUtil.logInfo('Status of HD Button: ' + getHD)

WebUI.verifyElementClickable(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/span_HD_click'))

WebUI.enhancedClick(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/span_HD_click'))

getHDON = WebUI.getAttribute(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/label_HD'), 
    'class')

KeywordUtil.logInfo('Status of HD Button: ' + getHDON)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Design'), 
    'Design')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Comfort'), 
    'Comfort')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Performance'), 
    'Performance')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Safety'), 
    'Safety')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Suzuki Connect'), 
    'Suzuki Connect')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Configure'), 
    'Configure')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Eco-Solutions'), 
    'Eco-Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Register Your Interest'), 
    'Register Your Interest')

