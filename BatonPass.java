package mario.factorydesign;

/**
 * Created by carbo_000 on 3/11/2015.
 */
public class BatonPass {

    public static Create Pass(String s) {
        return new Printer(s);
    }
}
