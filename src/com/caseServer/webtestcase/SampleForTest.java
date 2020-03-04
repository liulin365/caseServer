package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class SampleForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordOfWeb key = new KeywordOfWeb() ;
		key.openBrowser("chrome");
		key.visitWeb("http://192.168.12.241:8080/caseServer/login.action");
		key.halt("5");
		key.input("//*[@id='username']", "admin");
		key.input("//*[@id='password']", "admin");
		key.click("//*[@id='loginBtn']");
		key.halt("5");
		key.click("//ul[@id='tree']/descendant::span[text()='系统管理']");
		key.click("//ul[@id='tree']/descendant::span[text()='用户管理']");
		key.halt("3");
		key.intoIframe("//iframe[@src='jsp/basicinfo/users/users_management.jsp']");
		key.input("//*[@id='userName']", "admin");
		key.click("//span[text()='查询']");
		key.halt("3");
		key.assertContentIs("//td[@field='username']/child::div[text()='admin']", "admin");
		key.halt("5");
		key.closeBrowser();
		
	}

}
