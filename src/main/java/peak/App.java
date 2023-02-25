package peak;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peak.configuration.AppConfig;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        KoscheyTheDeathless koscheyTheDeathless = (KoscheyTheDeathless) applicationContext.getBean("koschey");

        System.out.println(koscheyTheDeathless.getRulesByDeath());
    }
}
