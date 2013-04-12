package com.bigfoot.stats;

public class Constants 
{
	// These are used to check values from build.prop
	public static final String ISITROM = "ro.bigfoot.isitrom";
	public static final String MODNAME = "ro.bigfoot.modname";
	public static final String MODVERSION = "ro.bigfoot.modversion";
	public static final String DEVICE = "ro.bigfoot.device";
	public static final String BUILTDATE = "ro.bigfoot.builtdate";
	public static final String SPLIT_EXPRESSION = "=";
	
	//These are used only for xml header fields
	public static final String ISITROM_HEAD = "deviceid";
	public static final String MODNAME_HEAD = "modname";
	public static final String MODVERSION_HEAD = "modversion";
	public static final String DEVICE_HEAD = "device";
	public static final String BUILTDATE_HEAD = "builtdate";
	public static final String COUNTRY_HEAD = "country";
	
	//Data will be send to .
	public static final String SERVER_URL = "http://www.drewgaren.com/stats/index.php";

	//For Reporting Service
	public static final String PREF_NAME = "stats_prefs";
	public static final String CHECKED_IN = "checkedin";
	public static final String OPT_IN = "optin";
	public static final String FIRST_BOOT = "firstboot";
    public static final String TAG = "BigfootStats";
    
}
