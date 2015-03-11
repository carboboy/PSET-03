package mario.factorydesign;

import java.util.Scanner;

/**
 * Created by carbo_000 on 3/11/2015.
 */
public class Mario {

    public Mario() {

        Scanner scan = new Scanner(System.in);
        PyramidFactory pf;
        int option;
        int value;

        System.out.print("Which output do you want?\nEnter '1' for Console\nEnter '2' for File\nOption: ");
        option = scan.nextInt();
        System.out.print("Height: ");
        value = scan.nextInt();

        if(option == 1 && value > 0 && value < 25) {
            pf = new PyramidFactory(1, value);
        } else if(option == 2 && value > 0 && value < 25) {
            pf = new PyramidFactory(2, value);
        } else {
            System.out.println("Please run again with proper values and the height can be only between 1 and 24");
        }
    }

    public static void main(String[] varArgs) {
        new Mario();
    }
}
