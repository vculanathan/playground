package hello;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;
    private String username;
    private String password;
    private String email;
    private Date createdOn;
    private Date lastLogin;

    public Account() {}

    public Account(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Account[userId=%d, username='%s', email='%s, createdOn=%s, lastLogin=%s']",
                userId, username, email, createdOn.toString(), lastLogin.toString());
    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public Date getLastLogin() {
        return lastLogin;
    }
}
