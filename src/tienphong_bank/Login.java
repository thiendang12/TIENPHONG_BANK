package TIENPHONG_BANK;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Login {

    private User user;

    public Login() {
        int accountNumber = checkValidAccountNumber();
        String password = checkValidPassword();
        String captcha = generateCaptcha();
        user = new User(accountNumber, password, captcha);
    }

    public int checkValidAccountNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        return accountNumber;
    }

    public String checkValidPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        return password;
    }

    public String generateCaptcha() {

        String captcha = "ABC123";
        return captcha;
    }

    public boolean checkValidCaptcha(String inputCaptcha) {
        String expectedCaptcha = user.getCaptcha();

        return expectedCaptcha.equals(inputCaptcha);
    }

    public String getLocalizedString(Locale curLocale, String key) {
        ResourceBundle bundle = ResourceBundle.getBundle("language", curLocale);
        return bundle.getString(key);
    }

    public static void main(String[] args) {
        Login login = new Login();

        int accountNumber = login.checkValidAccountNumber();
        String password = login.checkValidPassword();
        String captcha = login.generateCaptcha();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Password: " + password);
        System.out.println("Captcha: " + captcha);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the captcha: ");
        String inputCaptcha = scanner.nextLine();
        boolean isValidCaptcha = login.checkValidCaptcha(inputCaptcha);
        if (isValidCaptcha) {
            System.out.println("Captcha is valid.");
        } else {
            System.out.println("Captcha is invalid.");
        }
    }

    void setLocale(Locale locale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
