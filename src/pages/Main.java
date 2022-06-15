package pages;

import browser.browser;

public class Main {
	public static void main(String[] args) throws Exception {
		browser.setDriver();
		browser.getUrl();
		System.out.println(browser.getTitle());
		
	}
}
