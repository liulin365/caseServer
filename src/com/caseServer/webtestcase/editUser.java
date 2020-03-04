package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class editUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordOfWeb key = new KeywordOfWeb() ;
		key.openBrowser("chrome");
		key.login("awangping", "123456");
		key.halt("5");
		key.click("//ul[@id='tree']/descendant::span[text()='系统管理']");
		key.halt("5");
		key.click("//ul[@id='tree']/descendant::span[text()='用户管理']");
		key.intoIframe("//iframe[@src='jsp/basicinfo/users/users_management.jsp']");
		key.halt("3");
		key.input("//*[@id='userName']", "aautotest");
		key.click("//span[text()='查询']");
		key.halt("3");
		key.click("//div[text()='aautotest']");
		key.click("//span[text()='编辑']");
		key.halt("3");
		key.input("//*[@id='EditUserDiv']//input[@id='username']", "autotest1");
		key.halt("3");
		key.click("//span[text()='确定']");
		key.outIframe();
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("3");
		key.click("//span[@class='l-btn-text icon-computer_key l-btn-icon-left']");
		key.click("//*[@id='logout']");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("3");
		key.input("//*[@id='username']", "aautotest1");
		key.input("//*[@id='password']", "123456");
		key.click("//*[@id='loginBtn']");
		key.halt("5");
		key.click("//ul[@id='tree']/descendant::span[text()='数据导出']");
		key.halt("3");
		key.closeBrowser();
	}

}
