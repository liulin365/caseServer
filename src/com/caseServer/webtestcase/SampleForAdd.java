package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class SampleForAdd {

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
		key.click("//span[text()='增加']");
		key.halt("3");
		key.input("//*[@id='EditUserDiv']//input[@id='username']", "wangping");
		key.input("//*[@id='EditUserDiv']//input[@id='password']", "123456");
		key.input("//*[@id='EditUserDiv']//input[@id='cnname']", "王平");
		key.click("//*[@id='EditUserDiv']//span[@class='combo-arrow']");
		key.click("//tr[@id='datagrid-row-r2-2-0']");
		key.halt("3");
		key.click("//span[text()='确定']");
		key.outIframe();
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("3");
		key.intoIframe("//iframe[@src='jsp/basicinfo/users/users_management.jsp']");
		key.input("//*[@id='userName']", "wangping");
		key.click("//span[text()='查询']");
		key.halt("3");
		key.assertContentIs("//td[@field='username']/child::div[text()='a1wangping']", "a1wangping");
		key.click("//a[text()='删除']");
		key.outIframe();
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		
		key.closeBrowser();
	}

}
