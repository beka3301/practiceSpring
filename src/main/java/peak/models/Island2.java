package peak.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Island2 {

    private Wood3 wood3;

    @Autowired
    public Island2(Wood3 wood3) {
        this.wood3 = wood3;
    }

    @Override
    public String toString() {
        return ", на острове дерево 🌴" + wood3.toString();
    }
}
