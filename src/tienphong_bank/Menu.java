package TIENPHONG_BANK;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a language:");
        System.out.println("1. English");
        System.out.println("2. Vietnamese");

        int languageChoice = scanner.nextInt();
        Locale locale = null;

        switch (languageChoice) {
            case 1:
                locale = Locale.ENGLISH;
                break;
            case 2:
                locale = new Locale("vi");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to English.");
                locale = Locale.ENGLISH;
                break;
        }

        Login login = new Login();

        int accountNumber = login.checkValidAccountNumber();
        String password = login.checkValidPassword();

        login.setLocale(locale);

        String captcha = login.generateCaptcha();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Password: " + password);
        System.out.println("Captcha: " + captcha);

        System.out.println("Enter the captcha: ");
        String inputCaptcha = scanner.next();

        boolean isValidCaptcha = login.checkValidCaptcha(inputCaptcha);

        if (isValidCaptcha) {
            System.out.println(login.getLocalizedString(locale, "captchaValid"));
        } else {
            System.out.println(login.getLocalizedString(locale, "captchaInvalid"));
        }
    }
}
