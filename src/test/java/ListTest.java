
import config.base.BaseMethods;
import po.ListSavedArticlePage;
import po.SavePage;
import po.SkipPage;
import services.ArticleService;
import services.ListSavedArticleService;

import org.testng.annotations.Test;

public class ListTest extends BaseMethods {

    @Test
    void shouldBeListDeleted(){
        new SkipPage().clickSkip();
        new ArticleService().goToArticle();
        new ArticleService().saveImage();
        new SavePage().clickSaveButton();
        new ListSavedArticleService()
                .addToListArticle("MyList");
        new ListSavedArticlePage()
                .swipeElementRight(130);
        new ArticleService().deleteList();
    }
}
