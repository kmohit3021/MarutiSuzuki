import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Paths as Paths
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.nexaexperience.com/e-vitara')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h3_Download Brochure'), 
    20)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h3_Download Brochure'), 
    'Download Brochure')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/p_Explore cutting edge Design, Technology'), 
    'Explore cutting edge Design, Technology and Comfort of e VITARA - download now!')

WebUI.click(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/a_Download Brochure'))

