// DO NOT EDIT: This file is automatically generated each time the script is modified.
// To modify this file either use 'Insert Java Code Snippet'or 'Insert Java Method' 
// option from simplified script.

import resources.CreateDefectHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;

// BEGIN custom imports 		
//TODO: Add custom imports here.
// END custom imports

/**
 * Description   : Functional Test Script
 * @author swatjain
 */
public class CreateDefect extends CreateDefectHelper
{
	/**
	 * Script Name   : <b>CreateDefect</b>
	 * Generated     : <b>Jul 25, 2011 12:58:19 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2011/07/25
	 * @author swatjain
	 */
	public void testMain(Object[] args) 
	{
		

		setSimplifiedScriptLine(1); //// This is a test script to create a defect in Rational Team Concert and test various HTML controls including the dojo controls in the test application.
		// This is a test script to create a defect in Rational Team Concert and test various HTML controls including the dojo controls in the test application.
							
		setSimplifiedScriptLine(2); //Start  Application  RTC Server  
		startApp("RTC Server");
							
		// Group: Login - Jazz Team Server
		setSimplifiedScriptLine(3); //Login - Jazz Team Server							
		timerStart("LoginJazzTeamServer_3");							
		setSimplifiedScriptLine(4); //Set  Value  of  j_username  from  Datapool  Column  j_username
		text_j_username().setText(dpString("j_username"));
							
		setSimplifiedScriptLine(5); //Set  Value  of  j_password  from  Datapool  Column  j_password
		text_j_password().setText(dpString("j_password"));
							
		setSimplifiedScriptLine(6); //Click  Log Insubmit  
		button_logInsubmit().click();
							
		timerStop("LoginJazzTeamServer_3");				
		// Group: Project Areas - Change and Configuration Management: Select the project area
		setSimplifiedScriptLine(7); //Project Areas - Change and Configuration Management: Select the project area							
		timerStart("ProjectAreasChangeandConfiguration_7");							
		setSimplifiedScriptLine(8); //Click  jazz_ui_ResourceLink_0  
		link_jazz_ui_ResourceLink_0().click();
							
		timerStop("ProjectAreasChangeandConfiguration_7");				
		// Group: Project Dashboard: Rational Functional Tester:Create a new defect
		setSimplifiedScriptLine(9); //Project Dashboard: Rational Functional Tester:Create a new defect							
		timerStart("ProjectDashboardRationalFunctionalT_9");							
		setSimplifiedScriptLine(10); //Click  jazz_ui_MenuPopup_2  
		link_jazz_ui_MenuPopup_2().click();
							
		setSimplifiedScriptLine(11); //Click  jazz_ui_internal_ImgMenuItem_9_text  
		html_jazz_ui_internal_ImgMenuI().click(atPoint(10,11));
							
		timerStop("ProjectDashboardRationalFunctionalT_9");				
		// Group: Specify the defect details. The field values are taken from the datapool.
		setSimplifiedScriptLine(12); //Specify the defect details. The field values are taken from the datapool.							
		timerStart("SpecifythedefectdetailsThefieldva_12");							
		setSimplifiedScriptLine(13); //// Sepcify the defect summary
		// Sepcify the defect summary
							
		setSimplifiedScriptLine(14); //Set  Value  of  Html.INPUT.text  from  Datapool  Column  HtmlINPUTText
		text_htmlINPUTText().setText(dpString("HtmlINPUTText"));
							
		setSimplifiedScriptLine(15); //// Select the severity of the defect from the list
		// Select the severity of the defect from the list
							
		setSimplifiedScriptLine(16); //Select  Unclassified S4-Minor S3-Normal S2-Major S1-Critical S1-Blocker  from  Datapool  Column  UnclassifiedS4MinorS3NormalS2MajorS1CriticalS1Blocker
		list_unclassifiedS4MinorS3Norm().select(dpString("UnclassifiedS4MinorS3NormalS2MajorS1CriticalS1Blocker"));
							
		setSimplifiedScriptLine(17); //// Select the owner from the list
		// Select the owner from the list
							
		setSimplifiedScriptLine(18); //Select  owner  from  Datapool  Column  owner
		list_owner().select(dpString("owner"));
							
		setSimplifiedScriptLine(19); ////Select the priority of the defect from the list
		//Select the priority of the defect from the list
							
		setSimplifiedScriptLine(20); //Select  Unassigned P3-Low P2-Medium P1-High  from  Datapool  Column  UnassignedP3LowP2MediumP1High
		list_unassignedP3LowP2MediumP1().select(dpString("UnassignedP3LowP2MediumP1High"));
							
		setSimplifiedScriptLine(21); //// Select the due date from the calendar field. This is a dojo calendar
		// Select the due date from the calendar field. This is a dojo calendar
							
		setSimplifiedScriptLine(22); //Set  Value  of  widget_dijit_form_DateTextBox_0  from  Datapool  Column  widget_dijit_form_DateTextBox_0
		text_widget_dijit_form_DateTex().setText(dpString("widget_dijit_form_DateTextBox_0"));
							
		setSimplifiedScriptLine(23); ////Select the value for the Found In field from the list
		//Select the value for the Found In field from the list
							
		setSimplifiedScriptLine(24); //Select  Unassigned Customer Use (Internal) Customer Use (External) Devel  from  Datapool  Column  UnassignedCustomerUseInternalCustomerUseExternalDevel
		list_unassignedCustomerUseInte().select(dpString("UnassignedCustomerUseInternalCustomerUseExternalDevel"));
							
		setSimplifiedScriptLine(25); //Drag  New Work Item - Change and Configuration Management  
		document_newWorkItemChangeAndC().drag(atPoint(1014,213),atPoint(1011,378));
							
		setSimplifiedScriptLine(26); //// Add the description for the defect
		// Add the description for the defect
							
		setSimplifiedScriptLine(27); //Type  Value  Test case description here...
		browser_htmlBrowser(document_newWorkItemChangeAndC(),DEFAULT_FLAGS).inputKeys("Test case description here...");
							
		setSimplifiedScriptLine(28); //Drag  New Work Item - Change and Configuration Management  
		document_newWorkItemChangeAndC().drag(atPoint(1013,396),atPoint(1014,68));
							
		setSimplifiedScriptLine(29); ////Attach a file for reference to the defect in the Links tab
		//Attach a file for reference to the defect in the Links tab
							
		setSimplifiedScriptLine(30); //Click  Links  
		link_links().click();
							
		timerStop("SpecifythedefectdetailsThefieldva_12");				
		// Group: Upload a file for the defect
		setSimplifiedScriptLine(31); //Upload a file for the defect							
		timerStart("Uploadafileforthedefect_31");							
		setSimplifiedScriptLine(32); //Set  Property  uploadFileInput  .valuefrom  Datapool  Column  uploadFileInput
		html_uploadFileInput().setProperty(".value",dpString("uploadFileInput"));
							
		setSimplifiedScriptLine(33); //Click  uploadFileInput  
		html_uploadFileInput().click(atPoint(208,12));
							
		timerStop("Uploadafileforthedefect_31");				
		// Group: iexplore.exe: Choose File to Upload
		setSimplifiedScriptLine(34); //iexplore.exe: Choose File to Upload							
		timerStart("iexploreexeChooseFiletoUpload_34");							
		setSimplifiedScriptLine(35); //Click  FolderView  at  Defect_Log  
		folderViewtable().click(atText("Defect_Log"),atPoint(44,9));
							
		setSimplifiedScriptLine(36); //Click  Open  
		openbutton().click(atPoint(26,5));
							
		timerStop("iexploreexeChooseFiletoUpload_34");				
		// Group: Add a subscriber to the work item
		setSimplifiedScriptLine(37); //Add a subscriber to the work item							
		timerStart("Addasubscribertotheworkitem_37");							
		setSimplifiedScriptLine(38); //Wait  for  Display  of  IDNameSizeCreated byDate  
		table_idNameSizeCreatedByDate().waitForExistence();
							
		setSimplifiedScriptLine(39); //Click  Add to Subscribed By List  
		link_addToSubscribedByList().click();
							
		setSimplifiedScriptLine(40); //Click  Html.INPUT.text  
		text_htmlINPUTText2().click(atPoint(172,13));
							
		setSimplifiedScriptLine(41); //Type  Value  prashanth
		browser_htmlBrowser(document_newWorkItemChangeAndC2(),DEFAULT_FLAGS).inputChars("prashanth");
							
		timerStop("Addasubscribertotheworkitem_37");				
		// Group: htmlBrowser
		setSimplifiedScriptLine(42); //htmlBrowser							
		timerStart("htmlBrowser_42");							
		setSimplifiedScriptLine(43); //Type  Value  s.
		browser_htmlBrowser().inputChars("s.");
							
		timerStop("htmlBrowser_42");				
		// Group: Search for a name from the list to add as a subscriber to the work item
		setSimplifiedScriptLine(44); //Search for a name from the list to add as a subscriber to the work item							
		timerStart("Searchforanamefromthelisttoadda_44");							
		setSimplifiedScriptLine(45); //Type  Value  {TAB}
		browser_htmlBrowser(document_newWorkItemChangeAndC2(),DEFAULT_FLAGS).inputKeys("{TAB}");
							
		setSimplifiedScriptLine(46); //Type  Value  
		browser_htmlBrowser(document_newWorkItemChangeAndC2(),DEFAULT_FLAGS).inputChars("");
							
		setSimplifiedScriptLine(47); //Click  Add and Closesubmit  
		button_addAndClosesubmit().click();
							
		setSimplifiedScriptLine(48); //Verify  Properties  of  com_ibm_team_workitem_web_ui_internal_view_layout_SectionLayout_
		html_com_ibm_team_workitem_web().performTest(com_ibm_team_workitem_web_ui_i_standardVP());
							
		setSimplifiedScriptLine(49); //Wait  for  Display  of  HtmlTable_0  
		table_htmlTable_0().waitForExistence();
							
		setSimplifiedScriptLine(50); //Click  Savesubmit  
		button_savesubmit().click();
							
		timerStop("Searchforanamefromthelisttoadda_44");				
	}
}
		