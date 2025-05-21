package com.comcat.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility implements Path
{
	public String getDataFromPropertiesfile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propertypath);
		Properties pro = new Properties();
		pro.load(fis);
		String data = pro.getProperty(key);

		return data;

	}
}
