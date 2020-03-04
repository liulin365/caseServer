package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class zhenduantest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordOfWeb key = new KeywordOfWeb();
		key.openBrowser("chrome");
		key.login("a1wangping", "123456");
		key.halt("5");
//		点击首页管理
		key.click("//div[@node-id='CAS20140723000056502']");
		key.halt("3");
//		点击首页管理
		key.click("//div[@node-id='CAS20140826000057401']");
		key.halt("3");
		key.intoIframe("//iframe[@src='jsp/homeOfMedicalRecord/dataManager.jsp']");
		key.halt("3");
//		点击录入
		key.click("//span[text()='录入']");
		key.halt("5");
		key.outIframe();
		key.intoIframe("//iframe[@src='showZyFirstPageById.action']");
		key.halt("5");
        key.click("//li[@class='tabs-selected']/descendant::span[text()='诊断信息']");
        key.halt("3");
        key.runJs("document.getElementsByClassName(\"combo-arrow\")[40].click()");
        key.halt("3");
        key.click("//div[text()='O型']");
        key.halt("3");
        key.runJs("document.getElementsByClassName(\"combo-arrow\")[41].click()");
        key.halt("3");
        key.click("//div[text()='Rh阳性']");
        key.input("//input[@id='kzr']", "科主任");
        key.input("//input[@id='kzr']", "科主任");
        

	}

}
