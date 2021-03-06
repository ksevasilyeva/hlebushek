package web;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MainPageWebTest extends TestBase {

    @Features("Web")
    @Stories("MainPage")
    @Test
    public void testTitleMainPage(){
        driver.get(BS_URL);
        assertThat(driver.getTitle(), equalTo("Hlebushek blog"));
    }


}
