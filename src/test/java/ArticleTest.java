import config.base.BaseMethods;
import po.SkipPage;
import services.ArticleService;
import services.SearchService;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArticleTest extends BaseMethods {
    @Test
    void shouldBeArticleOpened() {
        new SkipPage().clickSkip();

        new SearchService().searchTest("Appium");

        var article = new ArticleService().getArticleName();

        assertThat(article).as("The article has wrong name").isEqualTo("Appium");
    }
}
