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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Web/Page_TouchPoint/button_New Quote'))

WebUI.click(findTestObject('Web/Page_TouchPoint/i_Select Products to Quote_far fa-shield-alt'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Start Quote'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Person Entering Risk_personEnteringRisk'), 'Test')

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Email of Person Entering Risk_personEnteringRiskEmail'), 
    'test@test.com')

WebUI.click(findTestObject('Web/Page_TouchPoint/i_Business Type_dropdown icon'))

WebUI.click(findTestObject('Web/Page_TouchPoint/span_CORPORATION'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Company Name_insuredNamecompany'), 'Floral shop')

WebUI.click(findTestObject('Web/Page_TouchPoint/b_Clinton Flower Shop'))

WebUI.waitForElementClickable(findTestObject('Web/Page_TouchPoint/button_Next'), 2)

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/div_Auto Service RiskContractorsMercantileOfficeServiceProcessingRestaurants  Not Fast FoodRestaurants  Fast FoodApartmentCondo - ApartmentCondo - Office'))

WebUI.click(findTestObject('Web/Page_TouchPoint/span_Contractors'))

WebUI.click(findTestObject('Web/Page_TouchPoint/div_ContractorsAuto Service RiskContractorsMercantileOfficeServiceProcessingRestaurants  Not Fast FoodRestaurants  Fast FoodApartmentCondo - ApartmentCondo - Office'))

WebUI.click(findTestObject('Web/Page_TouchPoint/div_Mercantile'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_New Location'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Address Same As Mailing'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_CLINTON FPSA (04)'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_1000'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Gross Sales_grossSales'), '100,000')

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Class Code_search'), 'flor')

WebUI.click(findTestObject('Web/Page_TouchPoint/span_59685 -- FLORISTS - RETAIL'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Number Of MortgageesLoss Payees_numberOfMortgageesLossPayees'), 
    '0')

WebUI.click(findTestObject('Web/Page_TouchPoint/label_No'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_Owner and leasing the building to others'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Original Construction Year_constructionYear'), '2018')

WebUI.click(findTestObject('Web/Page_TouchPoint/label_Frame'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_Other'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Number Of Stories_numberOfStories'), '1')

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Square Footage_squareFootage'), '500')

WebUI.click(findTestObject('Web/Page_TouchPoint/label_Yes'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Building Limit_buildingLimit'), '100,000')

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Business Personal Property Limit_bppLimit'), '50,000')

WebUI.click(findTestObject('Web/Page_TouchPoint/label_Replacement Cost'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_No'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_I Agree'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/i_Add New Coverage_dropdown icon'))

WebUI.click(findTestObject('Web/Page_TouchPoint/span_Accounts Receivable Coverage'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Add Coverage'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Limit_coveragesARlimit'), '30,000')

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Add'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Done'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_Mercantile'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_Number of Employees_sfgcoveragesCDEPnumEmployees'), 
    '5')

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_Yes'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_No'))

WebUI.setText(findTestObject('Web/Page_TouchPoint/input_What is the prior carrier name_sfgcarrierName'), 'Test Carrier')

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/label_1001'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

WebUI.click(findTestObject('Web/Page_TouchPoint/button_Next'))

