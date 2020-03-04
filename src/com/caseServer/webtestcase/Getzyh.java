package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class Getzyh {

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
		key.click("//span[text()='录入']");
		key.halt("5");
		key.outIframe();
		key.intoIframe("//iframe[@src='showZyFirstPageById.action']");
//        病案号
		key.halt("5");
		// 输入户口地址
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[19].click()");
		key.halt("5");
		key.click("//div[text()='四川省']");
		key.halt("5");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[20].click()");
		key.halt("5");
		key.click("//div[text()='成都市']");
		key.halt("5");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[21].click()");
		key.halt("5");
		key.click("//div[text()='锦江区']");
		key.halt("5");
//    输入现住址
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[16].click()");
		key.halt("5");
		key.click("//div[text()='四川省']");
		key.halt("5");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[17].click()");
		key.halt("5");
		key.click("//div[text()='德阳市']");
		key.halt("5");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[18].click()");
		key.halt("5");
		key.click("//div[text()='罗江县']");
		key.halt("3");
		key.input("//input[@id='zyh']", "1787852");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[1].click()");
		key.halt("3");
		key.click("//div[text()='城镇职工基本医疗保险']");
		key.input("//input[@id='jkkh']", "73287389");
		key.input("//input[@id='zycs']", "1");
		key.input("//input[@id='bah']", "776644364");
		key.input("//input[@id='xm']", "张三");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[3].click()");
		key.halt("3");
		key.click("//div[text()='女性']");
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[4].click()");
		key.halt("3");
		key.input("//table[@id='tab1']/tbody/tr[1]/td/span[2]/input[1]", "1980-04-30");
		key.halt("3");
//      输入籍贯
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[10].click()");
		key.halt("3");
		key.click("//div[text()='四川省']");
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[11].click()");
		key.halt("3");
		key.click("//div[text()='成都市']");
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[12].click()");
		key.halt("3");
		key.click("//div[text()='武侯区']");
		key.halt("3");
//    输入出生地
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[7].click()");
		key.halt("3");
		key.click("//div[text()='云南省']");
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[8].click()");
		key.halt("3");
		key.click("//div[text()='曲靖市']");
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[9].click()");
		key.halt("3");
		key.click("//div[text()='沾益区']");
		key.halt("3");
//        输入民族
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[13].click()");
		key.halt("3");
		key.click("//div[text()='汉族']");
//        输入身份证号
		key.input("//input[@id='sfzjHm']", "123456198812140464");
//        输入职业
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[14].click()");
		key.halt("3");
		key.click("//div[text()='国家公务员']");
		key.halt("3");
//        选择婚姻状况
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[15].click()");
		key.halt("3");
		key.click("//div[text()='已婚']");
		key.halt("3");

//      入院途径
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[29].click()");
		key.halt("3");
		key.click("//div[text()='门诊']");
		key.halt("3");
//        填写入院时间
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[30].click()");
		key.halt("3");
		key.input("//table[@id='tab1']/tbody/tr[15]/td/span[1]/input[1]", "2019-04-25 13:45:29");
		key.halt("3");
//        选择入院科别
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[31].click()");
		key.halt("3");
		key.click("//div[text()='急诊科']");
		key.halt("3");
//        选择出院时间
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[32].click()");
		key.halt("3");
		key.input("//table[@id='tab1']/tbody/tr[17]/td/span[1]/input[1]", "2019-04-29 13:47:23");
		key.halt("3");
		key.input("//input[@id='sjzyts']", "5");
		key.halt("3");
//        选择出院科别
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[33].click()");
		key.halt("3");
		key.click("/html/body/div[85]/div/div[2]");
		key.halt("3");
		key.input("//input[@id='rybf']", "5-001");
		key.input("//input[@id='cybf']", "5-001");
		key.halt("3");
//      选择中医诊断
		key.click("//input[@id='bm_991']");
		key.halt("3");
//      搜索疾病
		key.input("//input[@id='zybmName']", "上胞下垂病");
//      点击搜索
		key.click("//input[@id='zyjbBm']/following-sibling::input");
		key.halt("3");
//      选中疾病
		key.click("//div[text()='BYB090']");
//      点击确定
		key.click("//a[@id='btnzyJbbmEnter']/descendant::span[text()='确定']");
//      选择西医诊断
		key.click("//input[@id='bm_990']");
		key.halt("3");
		key.click("//div[text()='1xtnb']");
		key.click("//a[@id='btnJbbmEnter']/descendant::span[text()='确定']");
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[35].click()");
		key.halt("3");
		key.click("//div[text()='急']");
		key.halt("3");
//        入院诊断
		key.doubleClick("//input[@id='bm_998']");
		key.halt("3");
		key.click("//div[text()='1xtnb']");
		key.click("//a[@id='btnJbbmEnter']/descendant::span[text()='确定']");
		key.halt("3");
//		主要诊断确诊日期
		key.runJs("document.getElementsByClassName(\"combo-arrow\")[36].click()");
		key.halt("3");
		key.input("//table[@id='tab1']/tbody/tr[24]/td/span/input[1]", "2019-04-28");
		key.halt("3");
		key.click("//input[@value='保存']");
		key.halt("13");
		
	}

}
