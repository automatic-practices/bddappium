package co.com.automation.pages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.pages.PageObject;

public class PageObjectMobile extends PageObject {

  protected MobileDriver mobileDriver;
  protected AndroidDriver androidDriver;
  protected AppiumDriver appiumDriver;
  protected TouchAction touchAction;

  public PageObjectMobile() {
    mobileDriver = getProxiedDriver();
    androidDriver = getProxiedDriver();
    appiumDriver = getProxiedDriver();
    touchAction = new TouchAction(mobileDriver);
  }
}
