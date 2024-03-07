package SS19_String_Regex.TH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Một tài khoản hợp lệ cần đạt các yêu cầu sau:
 *
 * Không chứa các ký tự đặc biệt
 * Ít nhất là 6 ký tự
 * Không chứa các ký tự viết hoa
 * Cho phép dấu gạch dưới (_)
 */
public class ValidateAccount {
    private static Pattern pattern;
    private static Matcher matcher;
    public static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    public ValidateAccount(){
        pattern=Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
