package pl.com.progrex88.homefinanceapp.model;

import lombok.Getter;
import lombok.Setter;

public class User extends Person {

    @Getter
    @Setter

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
