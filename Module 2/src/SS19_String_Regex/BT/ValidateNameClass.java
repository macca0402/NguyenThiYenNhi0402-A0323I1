package SS19_String_Regex.BT;

import SS19_String_Regex.TH.ValidateAccount;
import SS19_String_Regex.TH.ValidateEmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static Pattern pattern;
    private static Matcher matcher;
    public static final String NAMECLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateNameClass() {
        pattern = Pattern.compile(NAMECLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateNameClass validateNameClass = new ValidateNameClass();
        String nameClass = "";
        boolean isFlag;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap ten lop: ");
            nameClass = scanner.nextLine();
            isFlag = validateNameClass.validate(nameClass);
        } while (!isFlag);
    }
}
