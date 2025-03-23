import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.nexaexperience.com/e-vitara')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Futuristic  Spacious Cabin'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Web/Page_e VITARA 2025 - Performance, Features _070800/h2_Futuristic  Spacious Cabin'), 
    'Futuristic & Spacious Cabin')

List<WebElement> elm = WebUI.findWebElements(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Futuristic Spacious Cabin thumbnails'), 
    0)

KeywordUtil.logInfo('Futuristic  Spacious Cabin Counts: ' + elm.size())

for (int index = 1; index <= 6; index++) {
    WebUI.enhancedClick(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Futuristic Spacious Cabin_thumbnails_click', 
            [('i') : index]))

    thumnailImg = WebUI.getAttribute(findTestObject('Web/Page_e VITARA 2025 - Performance, Features _070800/div_Futuristic Spacious Cabin_thumbnails_click', 
            [('i') : index]), 'src')

    KeywordUtil.logInfo('Futuristic  Spacious Cabin thumbnail SRC: ' + thumnailImg)
}

