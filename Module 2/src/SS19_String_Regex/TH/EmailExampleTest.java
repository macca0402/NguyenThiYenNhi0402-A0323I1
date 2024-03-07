package SS19_String_Regex.TH;

public class EmailExampleTest {
    private static ValidateEmail validateEmail;
    public  static final String[] validEmail=new String[]{"a@gmail.com","ab@yahoo","abc@hotmail.com"};
    public static final String[] invalidEmail=new String[]{"@gmail.com","ab@gmail.","@#abc@gmail.com"};


    public static void main(String[] args) {
        validateEmail=new ValidateEmail();
        for(String email:validEmail){
            boolean isvalid=validateEmail.validate(email);
            System.out.println("Email is: "+email+" is valid:"+isvalid);
        }
        for(String email:invalidEmail){
            boolean isvalid=validateEmail.validate(email);
            System.out.println("Email is "+email+" is valid: "+isvalid);

        }
    }
}
