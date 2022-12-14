package Content;

import Enums.STATUS;
import Interfaces.BeDefined;
import Interfaces.Exists;

public class Conture extends Substance implements Exists, BeDefined {
    public Conture() {
        super("контуры ");
    }

    public String contureOf(Substance substance, STATUS status){
        substance.setStatus(status);
        return (toBe(true, 1) + toBeDefined() + getName() + substance.getStatus() + " " + substance.getName());
    }

    @Override
    public String toBe(Boolean negative, int time) {
        return ("То есть");
    }

    @Override
    public String toBeDefined() {
        return " определяются ";
    }
}
