package co.com.automation.pages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import io.appium.java_client.MobileDriver;
import net.thucydides.core.pages.PageObject;

public class PageObjectMobile extends PageObject {

  protected MobileDriver mobileDriver;

  public PageObjectMobile() {
    mobileDriver = getProxiedDriver();
  }
}
