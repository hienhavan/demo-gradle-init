import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String str = "  Hello Gradle!  ";
        System.out.println("Trimmed: " + StringUtils.trim(str));
    }
}
