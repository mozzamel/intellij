package common;

import org.openqa.selenium.WebDriver;

public class CommonApi {
    public static WebDriver driver = null;
    private String saucelabs_username = "mhossain";
    private String browserstack_username = "mdmhossain1";
    private String Saucelabs_accesskey = "mo855";
    private String browserstack_accesskey = "pS2NT6eb2HqKz5xPd56v";
    public void setUp(Boolean useCloudEnv,String cloudEnvName, String os , String os_version,String browserName, String browserVersion, String url ){
        if(useCloudEnv==true){
            if (cloudEnvName.equalsIgnoreCase("browserStack")){
                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,os, os_version,browserName,browserVersion);
            }else if (cloudEnvName.equalsIgnoreCase("sauceLab")){
                getCloudDriver(cloudEnvName,saucelabs_username,)
            }
        }
    }


    public void closeUp(){

    }

}
