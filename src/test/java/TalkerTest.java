import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;

public class TalkerTest {

    public static void main(String[] args) {
        System.out.println("suck my main");
    }

    @BeforeClass
    public static void setup() {
        Configuration.browser = "firefox";
        Configuration.headless = Boolean.valueOf(System.getProperty("h", "false"));
    }

    @Test
    public void saysomethink() {
        System.out.println("i love music");
    }

    @Test
    public void findSomeTextInYndex() {
        Selenide.open("https://ya.ru");
        $x("//input[@id='text']").val("docker");
        $x("//button[@type='submit']").click();
        System.out.println($x("//li[@class='serp-item' and @data-cid='1']//div[@class='OrganicTitle-LinkText organic__url-text']").getText());
    }


}
