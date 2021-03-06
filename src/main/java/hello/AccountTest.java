package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("hello");
        appContext.refresh();
        AccountService accountService = appContext.getBean("accountService", AccountService.class);
        accountService.test();

        appContext.close();
    }

}
