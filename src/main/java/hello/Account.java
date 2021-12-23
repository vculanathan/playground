package hello;

import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;

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
    public Account(String username, String email) {
        this.username = username;
        this.email = email;
        this.createdOn = Instant.now().toEpochMilli();
        this.lastLogin = Instant.now().toEpochMilli();
        this.password = "password";
    }

    @Override
    public String toString() {
        return String.format(
                "Account[userId=%d, username='%s', email='%s, createdOn=%s, lastLogin=%s']",
                userId, username, email, createdOn, lastLogin);
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

    public long getCreatedOn() {
        return createdOn;
    }

    public long getLastLogin() {
        return lastLogin;
    }
}
