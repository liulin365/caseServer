package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class fuquanxian {

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
		key.click("//ul[@id='tree']/descendant::span[text()='角色管理']");
		key.halt("5");
		key.intoIframe("//iframe[@src='jsp/basicinfo/role/role_management.jsp']");
		key.halt("3");
		key.click("//span[text()='增加']");
		key.input("//input[@id='cName']", "自动化测试");
		key.click("//span[@class='l-btn-text icon-ok l-btn-icon-left']");
		key.outIframe();
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("3");
		key.click("//ul[@id='tree']/descendant::span[text()='角色-权限分配管理']");
		key.halt("3");
		key.intoIframe("//iframe[@src='jsp/basicinfo/role/newrolesPermissions.jsp']");
		key.click("//div[text()='自动化测试']");
		key.click("//div[@node-id='CAS20190102000063201']/child::span[@class='tree-hit tree-collapsed']");
		key.halt("3");
		key.click("//div[@node-id='CAS20190422000000001']/span[4]");
		key.click("//span[text()='添加']");
		key.outIframe();
		key.click("//ul[@id='tree']/descendant::span[text()='用户-角色分配管理']");
		key.halt("3");
		key.intoIframe("//iframe[@src='jsp/basicinfo/users/UserRolesManager.jsp']");
		key.click("//div[text()='aautotest']");
		key.click("//div[text()='自动化测试']");
		key.click("//span[text()='添加角色']");
		key.outIframe();
		key.halt("3");
		key.click("//span[@class='l-btn-text icon-computer_key l-btn-icon-left']");
		key.click("//*[@id='logout']");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("3");
		key.input("//*[@id='username']", "aautotest");
		key.input("//*[@id='password']", "123456");
		key.click("//*[@id='loginBtn']");
		key.halt("5");
		key.click("//ul[@id='tree']/descendant::span[text()='数据导出']");
		key.halt("3");
		key.assertContentIs("//ul[@id='tree']/descendant::span[text()='对码导出']", "对码导出");
		key.assertPageNotContains("视图导出");
		key.closeBrowser();
		
		
		
		
	}

}
