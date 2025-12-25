package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    @Autowired
    private Deth8 deth8;

    public Needle7() {
    }

    public String toString() {
        return ", смерть Кощея на игле :(" + this.deth8.toString();
    }
}
