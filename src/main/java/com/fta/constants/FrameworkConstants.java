package com.fta.constants;

public final class FrameworkConstants {
	private FrameworkConstants() {}
	private static final String CHROMEDRIVERPATH=System.getProperty("user.dir")+"//src//test//resources//Drivers//chromedriver.exe";

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

}
