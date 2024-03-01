
import config.base.BaseMethods;
import config.builders.LoginCreds;
import config.builders.LoginCredsBuilder;
import po.SkipPage;
import services.LoginService;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class LogInTest extends BaseMethods {

    @Test
    void shouldBeLoggedIn(){

        new SkipPage().clickSkip();
        new LoginService().clickLoginButtons();
        LoginCreds credentials = LoginCredsBuilder.fromSystemProperties().build();
        new LoginService().performLogin(credentials);

        var watchList = new LoginService().getWatchList();

        assertThat(watchList).as("Watchlist is visible for logged account").isEqualTo("Watchlist");
    }
}
