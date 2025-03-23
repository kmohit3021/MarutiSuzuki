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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.nexaexperience.com/e-vitara')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Comfort Like Never Before'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Comfort Like Never Before'), 
    'Comfort Like Never Before')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Like A Beast'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Like A Beast'), 
    'Like A Beast')

WebUI.mouseOver(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Beyond Imagination'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Beyond Imagination'), 
    'Beyond Imagination')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Suzuki Connect'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Suzuki Connect'), 
    'Suzuki Connect')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Imagine It. Customise It'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Imagine It. Customise It'), 
    'Imagine It. Customise It.')

List<WebElement> elm = WebUI.findWebElements(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/div_Build Your Own_view360_list'), 
    0)

KeywordUtil.logInfo('Build Your Own_view360 Counts: ' + elm.size())

for (int index = 1; index <= elm.size(); index++) {
    WebUI.enhancedClick(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Build Your Own_view360_list - click', 
            [('i') : index]))

    WebUI.delay(2)

    WebUI.takeScreenshot()

    dataContent = WebUI.getAttribute(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Build Your Own_view360_list - click', 
            [('i') : index]), 'data-content')

    KeywordUtil.logInfo('Build Your Own_view360 thumbnail Data-Content: ' + dataContent)

    style = WebUI.getAttribute(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Build Your Own_view360_list - click', 
            [('i') : index]), 'style')

    KeywordUtil.logInfo('Build Your Own_view360 thumbnail Data-Content: ' + style)
}

