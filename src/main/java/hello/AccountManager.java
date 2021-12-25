package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.Instant;

@Service("AccountManager")
public class AccountManager {
    @Autowired
    AccountRepository accountRepository;

    public long createAccount(AccountRequest accountRequest) {
        long time = Instant.now().toEpochMilli();
        return accountRepository.save(
                new Account(accountRequest.getUsername(), accountRequest.getEmail(), accountRequest.getPassword(), time,time)
        ).getUserId();
    }

    public void deleteAccount(long id) {
        accountRepository.deleteById(id);
    }
}
