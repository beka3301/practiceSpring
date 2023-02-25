package peak.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peak.models.*;

@Configuration
@ComponentScan("peak")
public class AppConfig {

    @Bean
    public static Duck5 duck5(Egg6 egg) {
        return new Duck5(egg);
    }

    @Bean
    public static Egg6 egg6(Needle7 needle7) {
        return new Egg6(needle7);
    }

    @Bean
    public static Needle7 needle7(Death8 death8) {
        return new Needle7(death8);
    }

    @Bean
    public static Death8 death8() {
        return new Death8();
    }
}
