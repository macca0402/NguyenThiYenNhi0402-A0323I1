package SS19_String_Regex.TH;

public class AccountExampleTest {
    private static ValidateAccount validateAccount;
    public static final String[] validAccount=new String[]{"123abc ","_abc123","__________","123456","abcdfedgs"};
    public static final String[] invalidAccount=new String[]{".@","123456","1234_","abcde"};

    public static void main(String[] args) {
        validateAccount =new ValidateAccount();
        for (String account :validAccount) {
            boolean isvalid=validateAccount.validate(account);
            System.out.println("Account is "+account+"is valid: "+isvalid);
        }
        for(String account:invalidAccount){
            boolean isvalid=validateAccount.validate(account);
            System.out.println("Account is "+account+"is valid: "+isvalid);
        }
    }
}
