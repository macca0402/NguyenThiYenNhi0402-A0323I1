package Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDateOfBirth {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String DATE_BIRTH = "^[0-9]{1,2}[/][0-9]{1,2}[/][0-9]{4}$";

    public ValidateDateOfBirth() {
        pattern = Pattern.compile(DATE_BIRTH);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
