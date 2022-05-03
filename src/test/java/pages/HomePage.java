package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.List;

public class HomePage extends  BasePagea {
  private Locator searchTermInput;
  private final String searchField = "input[id='searchPerson']";
  private final String searchButton = "input[id='searchButton']";
  private final String image = "img";
  private Locator allImages;
  private final String path = "";

  public HomePage(Page page) {
    super(page);
    navigate();
  }

  public void navigate() {
    super.navigate(path);
  }

  public void searchByName(String personName) {
    this.page.fill(searchField, personName);
    this.page.click(searchButton);
    allImages = this.page.locator(image);
  }

  public MovieDetails clickToGetMovieDetailsFor(String personName) {
        allImages.locator(":nth-match(:text('"+personName+"'), 1)").click();
        MovieDetails movieDetails = new MovieDetails(page);
        return movieDetails;
  }


}
