package hello;

import java.util.List;
import java.util.Optional;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService {
    @Autowired
    private AccountRepository repository;

    public void test() {
        // Save a new customer
        Account newAccount = new Account("john", "john@gmail.com");
        repository.save(newAccount);

        // Find a customer by ID
        Optional<Account> result = repository.findById(1L);
        result.ifPresent(account -> System.out.println(account));

        // Find customers by last name
        List<Account> accounts = repository.findByUsername("john");
        accounts.forEach(customer -> System.out.println(customer));

        // List all customers
        Iterable<Account> iterator = repository.findAll();
        iterator.forEach(account -> System.out.println(account));

        // Count number of customer
        long count = repository.count();
        System.out.println("Number of customers: " + count);
    }
}
