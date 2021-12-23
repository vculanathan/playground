package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findByUsername(String username);

//    Account findById(long userId);
}
