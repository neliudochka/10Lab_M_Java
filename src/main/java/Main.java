import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        String string = "First input!";
        App app = new App(in, out, string);

        app.changeString("pavlov");
        app.run();

    }
}
