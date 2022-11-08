package data;

public enum LoginErrorMessage {
    USERNAME_MISSING("Epic sadface: Username is required"),
    PASSWORD_MISSING("Epic sadface: Password is required"),
    INCORRECT_CREDENTIALS("Epic sadface: Username and password do not match any user in this service");

    private String message;

    LoginErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
