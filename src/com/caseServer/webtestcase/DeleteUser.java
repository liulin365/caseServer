package com.caseServer.webtestcase;

import com.caseServer.UI.KeywordOfWeb;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordOfWeb key = new KeywordOfWeb() ;
		key.openBrowser("chrome");
		key.login("admin", "admin");
		key.halt("5");
		key.click("//ul[@id='tree']/descendant::span[text()='系统管理']");
		key.halt("5");
		key.click("//ul[@id='tree']/descendant::span[text()='角色-权限分配管理']");
		key.halt("5");
		key.intoIframe("//iframe[@src='jsp/basicinfo/role/newrolesPermissions.jsp']");
		key.click("//div[text()='自动化测试']");
		key.click("//ul[@id='permiss']/li/div/span[3]");
		key.click("//span[text()='删除']");
		key.halt("3");
		key.outIframe();
		key.halt("3");
		key.click("//ul[@id='tree']/descendant::span[text()='用户-角色分配管理']");
		key.halt("3");
		key.intoIframe("//iframe[@src='jsp/basicinfo/users/UserRolesManager.jsp']");
		key.halt("3");
		key.click("//div[text()='aautotest']");
		key.click("//div[text()='自动化测试']");
		key.click("//span[text()='删除角色']");
		key.outIframe();
		key.halt("3");
		key.click("//ul[@id='tree']/descendant::span[text()='用户管理']");
		key.intoIframe("//iframe[@src='jsp/basicinfo/users/users_management.jsp']");
		key.halt("3");
		key.input("//*[@id='userName']", "aautotest");
		key.click("//span[text()='查询']");
		key.halt("3");
		key.assertContentIs("//td[@field='username']/child::div[text()='aautotest']", "aautotest");
		key.click("//a[text()='删除']");
		key.halt("3");
		key.assertPageNotContains("aautotest");
		key.outIframe();
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("3");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("3");
		key.click("//ul[@id='tree']/descendant::span[text()='角色管理']");
		key.halt("5");
		key.intoIframe("//iframe[@src='jsp/basicinfo/role/role_management.jsp']");
		key.halt("3");
		key.input("//*[@id='nameID']", "自动化测试");
		key.click("//span[text()='查询']");
		key.halt("3");
		key.click("//a[text()='删除']");
		key.outIframe();
		key.halt("5");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("5");
		key.runJs("document.getElementsByClassName(\"l-btn-text\")[5].click()");
		key.halt("5");
		key.assertPageNotContains("自动化测试");
		key.closeBrowser();
		
		
		

	}

}
