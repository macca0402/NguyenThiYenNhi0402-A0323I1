package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static Pattern pattern;
    private static Matcher matcher;
    public static final String NUMBERPHONE_REGEX = "^\\d+$";

    public ValidateNumberPhone() {
        pattern = Pattern.compile(NUMBERPHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
