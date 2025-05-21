package com.comcat.crm.DocumentTest;

import java.io.IOException;
import org.testng.annotations.Test;
import com.comcast.crm.basetest.BaseClass;
public class createDocumentTest extends BaseClass {
	@Test
	public void createLead() throws IOException {
		int randomInt = java.getRandomNumber();
		String Title = excel.getDataFromExcel("Documents", 1, 2)+randomInt;
		String Description = excel.getDataFromExcel("Documents", 1, 3);
		homePage.getDocuments_link().click();
		documentPage.getCreatenew_doc().click();
		createDocumentPage.createDocument(Title, Description, 0);
		String Act_Document =   documentInfoPage.getAct_Document().getText();
		web.verification(Act_Document, Title);
		String createdTitle = documentInfoPage.getCreatedTitle().getText();
		web.verification(createdTitle, Title);
		String act_des = documentInfoPage.getAct_des().getText();
		web.verification(act_des, Description);
	}
}
