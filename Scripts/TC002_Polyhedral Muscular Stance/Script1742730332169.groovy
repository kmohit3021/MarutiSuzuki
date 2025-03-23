import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.nexaexperience.com/e-vitara')

not_run: WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Polyhedral Muscular Stance'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Polyhedral Muscular Stance'), 
    'Polyhedral Muscular Stance')

List<WebElement> elm = WebUI.findWebElements(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/div_Polyhedral Muscular Stance_thumbnails'), 
    0)

KeywordUtil.logInfo('Polyhedral Muscular Stance_thumbnails Counts: ' + elm.size())

for (int index = 1; index <= 6; index++) {
    WebUI.enhancedClick(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Polyhedral Muscular Stance_thumbnails_click', 
            [('i') : index]))

    thumnailImg = WebUI.getAttribute(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Polyhedral Muscular Stance_thumbnails_click', 
            [('i') : index]), 'src')

    KeywordUtil.logInfo('Polyhedral Muscular Stance_thumbnails Counts SRC: ' + thumnailImg)
}

