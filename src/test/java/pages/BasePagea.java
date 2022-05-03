package pages;

import com.microsoft.playwright.Page;

import javax.xml.xpath.XPath;

public class BasePagea {
  Page page;
  String baseUrl = "http://localhost/";
  public BasePagea(Page page) {
    this.page = page;
  }

  public void navigate(String path) {
    this.page.navigate(baseUrl + path);
  }

}
