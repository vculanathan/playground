package hello;

import javax.persistence.*;

@Entity
@Table(name = "accounts", schema = "public")
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String email;
    private long createdOn;
    private long lastLogin;

    public Account() {
    }
    public Account(String username, String email, String password, long createdOn, long lastLogin) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdOn = createdOn;
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return String.format(
                "Account[userId=%d, username='%s', email='%s, createdOn=%s, lastLogin=%s']",
                userId, getUsername(), getEmail(), createdOn, lastLogin);
    }

    public Long getUserId() {
        return userId;
    }



    public long getCreatedOn() {
        return createdOn;
    }

    public long getLastLogin() {
        return lastLogin;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
