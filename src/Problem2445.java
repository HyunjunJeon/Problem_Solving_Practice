import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2445 {
    public static void main(String[] args) {
        String value = "[RS, P]";
        Pattern pattern = Pattern.compile("[A-Z]*");
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
        String clean = value.replace("[", "")
                .replace("]", "")
                .replace(", ", ",");
        String[] a = clean.split(",");

        System.out.println(a[0] + " : " + a[1]);

    }
}

/*
 5

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */
