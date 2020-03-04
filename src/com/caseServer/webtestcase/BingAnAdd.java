package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class BingAnAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordOfWeb key = new KeywordOfWeb() ;
		key.openBrowser("chrome");
		key.visitWeb("http://10.158.5.246:8090/adviceAnalysis/views/login/login.jsp");
		key.halt("5");
		key.input("//*[@id='username']", "admin");
		key.input("//*[@id='password']", "admin");
		key.click("//*[@id='loginBtn']");
		key.halt("5");
		key.click("//div[@node-id='CAS20140723000056502']");
		key.click("//div[@class='tree-node']/child::span[text()='首页管理']");
		key.halt("3");
		key.intoIframe("//iframe[@src='jsp/homeOfMedicalRecord/dataManager.jsp']");
		key.click("//span[@class='l-btn-text icon-add l-btn-icon-left']");
		key.outIframe();
		key.intoIframe("//iframe[@src='showZyFirstPageById.action']");
		key.halt("3");
		key.input("//div[@id='toolb']/span[1]/input[1]", "急诊科");
		key.input("//div[@id='toolb']/span[2]/input[1]", "新建");
	}

}
