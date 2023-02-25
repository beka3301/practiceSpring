package peak.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ocean1 {

    private Island2 island2;

    @Autowired
    public Ocean1(Island2 island2) {
        this.island2 = island2;
    }

    @Override
    public String toString() {
        return "на океане остров 🏝️" + island2.toString();
    }
}
