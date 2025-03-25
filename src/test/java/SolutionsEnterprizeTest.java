import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsEnterprizeTest {

    @BeforeAll
    static void beforeall() {
        Configuration.browserSize = "1450x700";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void SearchSolutionsMain() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $("[href ='https://github.com/enterprise']").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
        }
}
