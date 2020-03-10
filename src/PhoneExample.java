import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static final String ACCOUNT_REGEX = "^\\(\\d{2}\\)-\\(\\d{10}\\)$";

    public PhoneExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
