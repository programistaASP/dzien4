import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadanie1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(Hello|World!)");
        Matcher matcher = pattern.matcher("Hey hop Hello World! World! Hello");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
