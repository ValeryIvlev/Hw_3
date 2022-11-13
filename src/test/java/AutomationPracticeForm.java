import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.devtools.v104.page.Page.close;



public class AutomationPracticeForm {

    @BeforeAll
    static void BeforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void TestFrom() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("Mail@mail.ru");
        // почему же простой клик не работает? загадка века блеать, надо разобрать.....
        $("#gender-radio-1").doubleClick();
        $("#userNumber").setValue("7999111123");
        // Календарь
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("July");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue("Economics").pressEnter();
        // Поиск родительского элемента и только после этого кликает? ептааааа куда я попал)))) надо разобрать .....
        $("#hobbies-checkbox-1").parent().click();
        // Узнать в чем разница с uploadFromClasspath ....
        $("#uploadPicture").uploadFile(new File("src/test/Data/File1.png"));
        $("#currentAddress").setValue("Subject one or no one:)");
        // Так ладно Enter мы умеем нажимать.....  а как же кликать по выпадающему списку!? Надо разобрать!
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Noida").pressEnter();
        $("#submit").click();
        $(".table-responsive").shouldHave(text("Ivan Ivanov"), text("Mail@mail.ru"), text("male"), text("7999111123"),
                text("04 July,1993"), text("Economics"), text("Sports"), text("File1.png"), text("Subject one or no one:)"),
                text("NCR Noida") );
        $("#closeLargeModal").click();

    }

}
