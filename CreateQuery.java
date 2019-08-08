// DO NOT EDIT: This file is automatically generated each time the script is modified.
// To modify this file either use 'Insert Java Code Snippet'or 'Insert Java Method' 
// option from simplified script.

import resources.CreateQueryHelper;
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
public class CreateQuery extends CreateQueryHelper
{
	/**
	 * Script Name   : <b>CreateQuery</b>
	 * Generated     : <b>Jul 25, 2011 1:22:51 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.1  Build 2600 (S)
	 * 
	 * @since  2011/07/25
	 * @author swatjain
	 */
	public void testMain(Object[] args) 
	{
		

		setSimplifiedScriptLine(1); //// This is a test script to create a new query in Rational Team Concert and to test various HTML controls of the test application
		// This is a test script to create a new query in Rational Team Concert and to test various HTML controls of the test application
							
		setSimplifiedScriptLine(2); //Start  Application  RTC Server  
		startApp("RTC Server");
							
		// Group: Login to RTC
		setSimplifiedScriptLine(3); //Login to RTC							
		timerStart("LogintoRTC_3");							
		setSimplifiedScriptLine(4); //Set  Value  of  j_username  from  Datapool  Column  j_username
		text_j_username().setText(dpString("j_username"));
							
		setSimplifiedScriptLine(5); //Set  Value  of  j_password  from  Datapool  Column  j_password
		text_j_password().setText(dpString("j_password"));
							
		setSimplifiedScriptLine(6); //Click  Log Insubmit  
		button_logInsubmit().click();
							
		timerStop("LogintoRTC_3");				
		// Group: Project Areas -Select the project area
		setSimplifiedScriptLine(7); //Project Areas -Select the project area							
		timerStart("ProjectAreasSelecttheprojectarea_7");							
		setSimplifiedScriptLine(8); //Click  jazz_ui_ResourceLink_0  
		link_jazz_ui_ResourceLink_0().click();
							
		timerStop("ProjectAreasSelecttheprojectarea_7");				
		// Group: Create a new query
		setSimplifiedScriptLine(9); //Create a new query							
		timerStart("Createanewquery_9");							
		setSimplifiedScriptLine(10); //Click  jazz_ui_MenuPopup_2  
		link_jazz_ui_MenuPopup_2().click();
							
		setSimplifiedScriptLine(11); //Click  jazz_ui_internal_ImgMenuItem_8_text  
		html_jazz_ui_internal_ImgMenuI().click(atPoint(14,10));
							
		timerStop("Createanewquery_9");				
		// Group: Specify the query details
		setSimplifiedScriptLine(12); //Specify the query details							
		timerStart("Specifythequerydetails_12");							
		setSimplifiedScriptLine(13); //// Specify the query name in te datapool
		// Specify the query name in te datapool
							
		setSimplifiedScriptLine(14); //Set  Value  of  Html.INPUT.text  from  Datapool  Column  HtmlINPUTText
		text_htmlINPUTText().setText(dpString("HtmlINPUTText"));
							
		setSimplifiedScriptLine(15); //Click  Add Condition  
		link_addCondition().click();
							
		setSimplifiedScriptLine(16); //Drag  com_ibm_team_workitem_web_ui_internal_view_queryeditor_Attribute  
		html_com_ibm_team_workitem_web().drag(atPoint(189,53),atPoint(188,61));
							
		setSimplifiedScriptLine(17); //N-Click  on    com_ibm_team_workitem_web_ui_internal_view_queryeditor_Attribute  4LEFT  
		html_com_ibm_team_workitem_web().nClick(4,LEFT,atPoint(189,217));
							
		setSimplifiedScriptLine(18); //Click  com_ibm_team_workitem_web_ui_internal_view_queryeditor_IconItem_  
		html_com_ibm_team_workitem_web2().click(atPoint(57,8));
							
		setSimplifiedScriptLine(19); //Click  Add attribute condition  
		button_addAttributeCondition().click();
							
		setSimplifiedScriptLine(20); //Click  currentUseron  
		checkBox_currentUseron().click();
							
		setSimplifiedScriptLine(21); //Click  com_ibm_team_workitem_web_ui_internal_view_queryeditor_IconItem_  
		html_com_ibm_team_workitem_web3().click(atPoint(83,7));
							
		setSimplifiedScriptLine(22); //Click  Add attribute condition  
		button_addAttributeCondition2().click();
							
		setSimplifiedScriptLine(23); //// Specify the creation date
		// Specify the creation date
							
		setSimplifiedScriptLine(24); //Click  nowabsolute  
		radioButton_nowabsolute().click();
							
		setSimplifiedScriptLine(25); //// Specify the date in the datapool. The dojo calendar field is tested
		// Specify the date in the datapool. The dojo calendar field is tested
							
		setSimplifiedScriptLine(26); //Set  Value  of  widget_dijit_form_DateTextBox_0  from  Datapool  Column  widget_dijit_form_DateTextBox_0
		text_widget_dijit_form_DateTex().setText(dpString("widget_dijit_form_DateTextBox_0"));
							
		setSimplifiedScriptLine(27); //Click  is  
		link_is().click();
							
		setSimplifiedScriptLine(28); //// Select the condition from the dojo list
		// Select the condition from the dojo list
							
		setSimplifiedScriptLine(29); //Click  dijit_Menu_2  at  after (including)  
		menu_dijit_Menu_2().click(atPath("after (including)"));
							
		setSimplifiedScriptLine(30); //Drag  com_ibm_team_workitem_web_ui_internal_view_queryeditor_Attribute  
		html_com_ibm_team_workitem_web4().drag(atPoint(186,65),atPoint(186,91));
							
		setSimplifiedScriptLine(31); //Click  com_ibm_team_workitem_web_ui_internal_view_queryeditor_IconItem_  
		html_com_ibm_team_workitem_web5().click(atPoint(57,9));
							
		setSimplifiedScriptLine(32); //Click  Add attribute condition  
		button_addAttributeCondition3().click();
							
		setSimplifiedScriptLine(33); //// Select the Found In value from the list. Values can be added in the datapool
		// Select the Found In value from the list. Values can be added in the datapool
							
		setSimplifiedScriptLine(34); //Select  8.1 8.1.0.1 8.1.0.2 8.1.0.3 8.1.1 8.1.1.1 8.1.1.2 8.1.1.3 8.2 8  from  Datapool  Column  _81810181028103811811181128113828
		list__818101810281038118111811().select(dpString("_81810181028103811811181128113828"));
							
		setSimplifiedScriptLine(35); //Drag  Query: New Query - Change and Configuration Management  
		document_queryNewQueryChangeAn().drag(atPoint(1013,220),atPoint(1013,301));
							
		setSimplifiedScriptLine(36); //Drag  com_ibm_team_workitem_web_ui_internal_view_queryeditor_Attribute  
		html_com_ibm_team_workitem_web6().drag(atPoint(185,89),atPoint(185,129));
							
		setSimplifiedScriptLine(37); //Drag  com_ibm_team_workitem_web_ui_internal_view_queryeditor_Attribute  
		html_com_ibm_team_workitem_web6().drag(atPoint(185,135),atPoint(185,153));
							
		setSimplifiedScriptLine(38); //Drag  com_ibm_team_workitem_web_ui_internal_view_queryeditor_Attribute  
		html_com_ibm_team_workitem_web6().drag(atPoint(185,153),atPoint(185,166));
							
		setSimplifiedScriptLine(39); //Drag  com_ibm_team_workitem_web_ui_internal_view_queryeditor_Attribute  
		html_com_ibm_team_workitem_web6().drag(atPoint(185,166),atPoint(185,179));
							
		setSimplifiedScriptLine(40); //Click  com_ibm_team_workitem_web_ui_internal_view_queryeditor_IconItem_  
		html_com_ibm_team_workitem_web7().click(atPoint(61,4));
							
		setSimplifiedScriptLine(41); //Click  Add attribute condition  
		button_addAttributeCondition4().click();
							
		setSimplifiedScriptLine(42); //Select  Unclassified S4-Minor S3-Normal S2-Major S1-Critical S1-Blocker  from  Datapool  Column  UnclassifiedS4MinorS3NormalS2MajorS1CriticalS1Blocker
		list_unclassifiedS4MinorS3Norm().select(dpString("UnclassifiedS4MinorS3NormalS2MajorS1CriticalS1Blocker"));
							
		setSimplifiedScriptLine(43); //Click  com_ibm_team_workitem_web_ui_internal_view_queryeditor_IconItem_  
		html_com_ibm_team_workitem_web8().click(atPoint(28,9));
							
		setSimplifiedScriptLine(44); //Click  Add attribute condition  
		button_addAttributeCondition5().click();
							
		setSimplifiedScriptLine(45); //Click  is  
		link_is2().click();
							
		setSimplifiedScriptLine(46); //Click  dijit_Menu_5  at  is not  
		menu_dijit_Menu_5().click(atPath("is not"));
							
		setSimplifiedScriptLine(47); //Click  stateon  
		checkBox_stateon().click();
							
		setSimplifiedScriptLine(48); //Click  Savesubmit  
		button_savesubmit().click();
							
		timerStop("Specifythequerydetails_12");				
		// Group: Run the query
		setSimplifiedScriptLine(49); //Run the query							
		timerStart("Runthequery_49");							
		setSimplifiedScriptLine(50); //Click  Runsubmit  
		button_runsubmit().click();
							
		setSimplifiedScriptLine(51); //Wait  for  Display  of  TypeIdSummaryOwned ByStatusPrioritySeverityModified DateActions  
		table_typeIdSummaryOwnedByStat().waitForExistence();
							
		timerStop("Runthequery_49");				
	}
}
		