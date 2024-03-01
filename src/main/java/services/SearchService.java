package services;


import po.SearchPage;

public class SearchService {
    private final SearchPage searchPage = new SearchPage();

    public void searchTest(String text) {
        searchPage.clickOnSearchField()
                .fillInput(text);
    }
}
