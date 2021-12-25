package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    AccountManager accountManager;

    @PostMapping("/account")
    public long makeAccount(@RequestBody AccountRequest account) {
        return accountManager.createAccount(account);
    }

    @DeleteMapping("/account/{id}")
    public void deleteAccount(@PathVariable("id") long id) {
        accountManager.deleteAccount(id);
    }


}
