import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String EMAIL_PATTERN = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

    public static final Pattern EmailRegex = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public boolean Email(String email) {
        Matcher matcher = EmailRegex.matcher(email);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }
}