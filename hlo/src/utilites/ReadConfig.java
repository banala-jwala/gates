package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
Properties pro;
public ReadConfig()
{
File src =new File ("./configurations/config.Properties");
try
{
	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
}

catch(Exception e)
{
	System.out.println("Exception is "+e.getMessage());
}
}
public String getApplicationURL()
{
	String url= pro.getProperty("baseURL");
	return url;

}
public String getApplicationusername()
{
	String username= pro.getProperty("username");
	return username;

}
public String getApplicationPassword()
{
	String password= pro.getProperty("password");
	return password;

}
public String getApplicationChromePath()
{
	String chromepath= pro.getProperty("chromepath");
	return chromepath;

}
public String getApplicationIEPath()
{
	String iepath= pro.getProperty("iepath");
	return iepath;

}
public String getApplicationFireFoxPath()
{
	String firefoxpath= pro.getProperty("firefoxpath");
	return firefoxpath;

}
}
