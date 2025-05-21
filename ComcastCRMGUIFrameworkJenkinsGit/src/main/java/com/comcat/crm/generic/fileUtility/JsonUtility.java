package com.comcat.crm.generic.fileUtility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility implements Path
{
	public String getDataFromJsonFile(String key) throws IOException, ParseException {
		FileReader fr = new FileReader("./ComcastCRMGUIFramework/ConfigApp_data/commondata.json");
		JSONParser parser = new JSONParser();
		Object p_o = parser.parse(fr);
		JSONObject map = (JSONObject) p_o;
		String data = (String) map.get(key);

		return data;
	}

}
