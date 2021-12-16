import Pages.FirstPage;
import Pages.RegistrationPage;
import Settings.ChromeSettings;
import org.junit.Test;

public class Tests extends ChromeSettings {
    /*
    Тест ниже я использовал для тренировки я с автоматизировал регистрации пользователя ,
    но он работает только один раз)
     */

//    @Test
//    public void Registration(){
//        FirstPage firstPage = new FirstPage(driver);
//        RegistrationPage registrationPage = new RegistrationPage(driver);
//        firstPage.CreateAcc();
//        registrationPage.TypeData();
//    }
    //---------------------------------------------------------------------------------------------------

    /*Steps
    1.Кликнуть в хэдере по "Myaccount"
    2.Кликнуть по кнопку "Login"
    3.Ввести валидные данные пользователя
    4.Кликнуть по кнопку "Login"
     */

    @Test
    public void LogIn() throws InterruptedException {
       FirstPage firstPage = new FirstPage(driver);
       firstPage.Login();
    }

    @Test
    public void ChooseBlackItem(){
        FirstPage firstPage = new FirstPage(driver);
        firstPage.ChooseBlack();
    }

}
