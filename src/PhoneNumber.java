public class PhoneNumber {
    String phoneNumber;
    PhoneNumber(String phoneNumberString) {
        if (phoneNumberString.startsWith("8")) {
            phoneNumberString = "+7" + phoneNumberString.substring(1);
        }
        phoneNumberString = phoneNumberString.substring(0, 5) + "-" + phoneNumberString.substring(4, 7) + "-" +
                phoneNumberString.substring(7, 11);

        this.phoneNumber = phoneNumberString;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
