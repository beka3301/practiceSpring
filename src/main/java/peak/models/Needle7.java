package peak.models;

import lombok.Data;

@Data
public class Needle7 {

    private Death8 death8;

    public Needle7(Death8 death8) {
        this.death8 = death8;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( 😈" + death8.toString();
    }
}
