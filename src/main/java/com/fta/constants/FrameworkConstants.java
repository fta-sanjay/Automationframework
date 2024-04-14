package com.fta.constants;

public final class FrameworkConstants {
	private FrameworkConstants() {}
	private static final String RESOURCESPATH=System.getProperty("user.dir")+"/src/test/resources/";
	private static final String CHROMEDRIVERPATH=RESOURCESPATH+"/Drivers/chromedriver.exe";
	private static final String CONFIGPROPERTIESPATH=RESOURCESPATH+"config/config.properties";
	private static final int EXPLICITWAIT=10;
	public static String getConfigpropertiespath() {
		return CONFIGPROPERTIESPATH;
	}
	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}
	public static int getexplicitwait() {
		return EXPLICITWAIT;
	}

}
