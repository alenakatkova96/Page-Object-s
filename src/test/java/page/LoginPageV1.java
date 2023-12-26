package page;

import data.DataHelper;
import org.jetbrains.annotations.NotNull;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageV1 {
    public VerificationPage validLogin(DataHelper.@NotNull AuthInfo info) {
        $("[data-test-id= login] input ").setValue(info.getLogin());
        $("[data-test-id= password] input ").setValue(info.getPassword());
        $("button.button").click();
        return new VerificationPage();

    }
}