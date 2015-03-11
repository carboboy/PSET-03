package mario.factorydesign;

import mario.factorydesign.Create;

/**
 * Created by carbo_000 on 3/11/2015.
 */
public class Printer implements Create {

    private String s;
    public Printer(String s) {
        this.s = s;
    }

    @Override
    public java.lang.String toString() {
        return String.format("%s", s);
    }
}
