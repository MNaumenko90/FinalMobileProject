package services;

import po.ListSavedArticlePage;

public class ListSavedArticleService {

    private final ListSavedArticlePage list = new ListSavedArticlePage();

    public void addToListArticle(String text) {
        list.clickAddToListButton()
                .fillNameList(text)
                .clickOkButton()
                .viewList();
    }
}
