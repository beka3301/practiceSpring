package peak;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peak.models.Ocean1;

@Data
@Component("koschey")
public class KoscheyTheDeathless {

    private Ocean1 ocean1;

    @Autowired
    public KoscheyTheDeathless(Ocean1 ocean1) {
        this.ocean1 = ocean1;
    }

    public String getRulesByDeath() {
        return "На свете есть океан \uD83C\uDF0A , " + ocean1.toString();
    }
}
