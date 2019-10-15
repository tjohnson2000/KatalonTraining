import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

additionResult = WS.sendRequest(findTestObject('API/SOAP/Add'))

String responseBody = additionResult.getResponseBodyContent()
println responseBody

def valueFetched = new XmlSlurper().parseText(responseBody)
//def finalValue = valueFetched.AddResponse.AddResult	// This is how you would get a single value out of a nested object
println valueFetched

GlobalVariable.NUM1 = valueFetched

println ' Global Variable updated to ' + valueFetched

multiplicationResult = WS.sendRequestAndVerify(findTestObject('API/SOAP/Multiply', [('num1') : GlobalVariable.NUM1]))

String multResBody = multiplicationResult.getResponseBodyContent()
println multResBody

def multValueFetched = new XmlSlurper().parseText(multResBody)
println multValueFetched


