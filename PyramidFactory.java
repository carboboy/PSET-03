package mario.factorydesign;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by carbo_000 on 3/11/2015.
 */
public class PyramidFactory {

    public PyramidFactory(int type, int value) {

        String sb = "";
        int blockCounter = 2;

        for(int i = 0; i < value; i++) {

            for(int j = value; j > blockCounter-1; j--) {
                sb = sb + " ";
            }
            for(int k = 0; k < blockCounter; k++) {
                sb = sb + "#";
            }
            blockCounter++;
            sb = sb + "\n";
        }

        Create c = BatonPass.Pass(sb);

        switch(type) {
            case 1:
                System.out.print(c.toString());
                break;
            case 2:
                try {
                    PrintWriter pw = new PrintWriter("mario.txt","UTF-8");
                    pw.write(c.toString());
                    pw.close();
                } catch(FileNotFoundException fnfe) {
                    fnfe.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
