public class PhoneExampleTest {
    public static final String[] validAccount = new String[] {"(84)-(0941910692)", "(81)-(0803098868)"};
    public static final String[] invalidAccount = new String[] {"(a8)-(0941910692)", "(-9)-(0809898999)", "(84)-(2222222222)"};

    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        for (String phone:validAccount){
            boolean invalid = phoneExample.validate(phone);
            System.out.println("Phone number is" + phone + "is valid" + invalid);
        }
        for (String phone:invalidAccount){
            boolean invalid = phoneExample.validate(phone);
            System.out.println("phone number is" + phone + "is valid" + invalid);
        }
    }
}
