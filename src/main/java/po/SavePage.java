package po;

import config.base.BaseMethods;
import org.openqa.selenium.By;

public class SavePage extends BaseMethods {

    private final By save = By.xpath("//android.widget.TextView[@content-desc='Save']");

    public void clickSaveButton() {
        click(save);
    }
}
