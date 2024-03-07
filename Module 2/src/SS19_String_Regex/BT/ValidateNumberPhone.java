package SS19_String_Regex.BT;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String NUMBERPHONE_REGEX = "^[(][0-9]{2}[)]-[(][0][0-9]{9}[)]$";

    public ValidateNumberPhone() {
        pattern = Pattern.compile(NUMBERPHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateNumberPhone validateNumberPhone = new ValidateNumberPhone();
        Scanner scanner = new Scanner(System.in);
        String numberPhone = "";
        do {
            System.out.println("Nhap so dien thoai: ");
            numberPhone = scanner.nextLine();
        } while (!validateNumberPhone.validate(numberPhone));
    }
}
