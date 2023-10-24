package TIENPHONG_BANK;

public class User {

    private int accountNumber;
    private String password;
    private String captcha;

    public User(int accountNumber, String password, String captcha) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.captcha = captcha;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
