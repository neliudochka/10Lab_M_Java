import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Scanner;

public class App {
    static boolean active = true;
    private final Scanner in;
    private final PrintStream out;
    private String myString;

    public App(Scanner in, PrintStream out, String value) {
        this.in = in;
        this.out = out;
        this.myString = value;
    }

    public void run() throws NoSuchFieldException, IllegalAccessException {
        do {
            out.println("String is: " + myString);
            String newString = in.next();

            changeString(newString);
        } while (active);
    }

    public void changeString(String newString) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = String.class;
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        field.set(myString, newString.toCharArray());
    }
}
