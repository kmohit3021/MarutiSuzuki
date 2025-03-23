import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
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

import java.nio.file.*
import java.util.stream.Collectors

String downloadFolder = RunConfiguration.getProjectDir() + '/DownloadFiles'
File folder = new File(downloadFolder)

// Ensure the folder exists
if (!folder.exists() || !folder.isDirectory()) {
	println("Download folder does not exist or is not a directory.")
	return
}

// Get all files in the folder
List<File> files = Arrays.asList(folder.listFiles())

// Sort files by last modified time in descending order (newest first)
files = files.stream()
	.filter { it.isFile() }
	.sorted { f1, f2 -> Long.compare(f2.lastModified(), f1.lastModified()) }
	.collect(Collectors.toList())

// Keep the most recent file and delete the rest
if (files.size() > 1) {
	for (int i = 1; i < files.size(); i++) { // Skip the first (most recent) file
		if (files[i].delete()) {
			println("Deleted older file: ${files[i].name}")
		} else {
			println("Failed to delete file: ${files[i].name}")
		}
	}
} else {
	println("No older files to delete. Only one file exists: ${files[0].name}")
}
