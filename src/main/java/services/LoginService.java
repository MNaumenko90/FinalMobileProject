package services;
import config.builders.LoginCreds;
import config.base.BaseMethods;
import po.LoginPage;

public class LoginService extends BaseMethods {
    private final LoginPage loginPage = new LoginPage();

    public void clickLoginButtons() {
        loginPage.clickMoreButton()
                .clickLoginJoinButton()
                .clickLoginButton();
    }

    public void performLogin(LoginCreds credentials) {
        loginPage.userCredentials(credentials.getUsername(), credentials.getPassword());
        loginPage.clickMainLoginButton();

    }
    public String getWatchList(){
        return loginPage
                .clickMoreButton()
                .getWatchList();
    }
}
