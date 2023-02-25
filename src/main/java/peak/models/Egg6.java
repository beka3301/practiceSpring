package peak.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Egg6 {

    private Needle7 needle7;

    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка 🪡" + needle7.toString();
    }
}
