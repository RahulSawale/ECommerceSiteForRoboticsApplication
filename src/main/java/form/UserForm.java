package form;

import entity.Account;
import lombok.Data;

@Data
public class UserForm {

    private String firstName;
    private String lastName;
    private String userEmail;
    private String userName;
    private String password;
    private String userRole;

    private boolean newUser = false;

    public UserForm() {
        this.newUser = true;
        this.password = "$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu";
    }

    public UserForm(Account user) {
        this.userName = user.getUserName();
        this.password = user.getEncrytedPassword();
        this.userRole = user.getUserRole();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userEmail = user.getUserEmail();
    }

}
