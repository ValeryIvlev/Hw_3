import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ExpDemoqa {
    @BeforeAll
    static void BeforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void TestFrom() {
        open("https://demoqa.com/automation-practice-form");
        $("#state").click();
        $("#state").$(new ByText("NCR")).click();
        $("#genterWrapper").$(new ByText("Male")).click();

    }
}