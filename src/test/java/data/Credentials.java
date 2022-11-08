package data;

public enum Credentials {
    CORRECT_CREDENTIALS("standard_user", "secret_sauce", "Correct credentials"),
    INCORRECT_CREDENTIALS("standard_user", "incorrect_password", "Incorrect credentials");

    private String username;
    private String password;
    private String description;

    Credentials(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
