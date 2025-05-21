package com.comcat.crm.TroubleTicketsTest;

import java.io.IOException;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;

public class createTroubleTicketsTest extends BaseClass
{
	@Test
	public void createLead() throws IOException {
		int randomInt = java.getRandomNumber();
		String Title = excel.getDataFromExcel("tt", 1, 2)+ randomInt;
		String Description =excel.getDataFromExcel("tt", 1, 3);
		String status=excel.getDataFromExcel("tt", 1, 4);
		homePage.getTroubleTickets_link().click();
		troubleTicketsPage.getCreatetroubletickets().click();
		createTicketPage.createTroubleTickets(Title, Description, status);
		String act_header = troubleTicketsInfoPage.getCreatedheaderinfo__tt().getText();
		web.verification(act_header, Title);
		String act_Tt = troubleTicketsInfoPage.getAct_title().getText();
		web.verification(act_Tt, Title);
		String act_des = troubleTicketsInfoPage.getAct_des().getText();
		web.verification(act_des, Description);
		String act_status = troubleTicketsInfoPage.getAct_status().getText();
		web.verification(act_status, status);
}
}