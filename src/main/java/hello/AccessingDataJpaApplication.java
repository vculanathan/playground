//package hello;
//
//import hello.Account;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class AccessingDataJpaApplication {
//
//    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
//
//    @Autowired
//    private AccountRepository repository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(AccessingDataJpaApplication.class);
//    }
//
//    @Bean
//    public CommandLineRunner demo() {
//        return (args) -> {
//            // save a few customers
//            repository.save(new Account("jack", "jack@gmail.com"));
//            repository.save(new Account("chloe", "chloe@gmail.com"));
//            repository.save(new Account("kim", "kim@gmail.com"));
//
//
//            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (Account account : repository.findAll()) {
//                log.info(account.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Account account1 = repository.findById(1L);
//            log.info("Customer found with findById(1L):");
//            log.info("--------------------------------");
//            log.info(account1.toString());
//            log.info("");
//
//            // fetch customers by last name
//            log.info("Customer found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            repository.findByUsername("chloe").forEach(chloe -> {
//                log.info(chloe.toString());
//            });
//            // for (Customer bauer : repository.findByLastName("Bauer")) {
//            // 	log.info(bauer.toString());
//            // }
//            log.info("");
//        };
//    }
//
//}