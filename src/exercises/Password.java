package exercises;

public class Password {

    private String password;
    private int length;

    public Password() {
        this.length = 8;
        this.password = generatePassword(length);
    }

    public Password(int length) {
        this.length = length;
        this.password = generatePassword(length);
    }

    private static String generatePassword(int length) {
        String password = "";
        for(int i = 0; i < length; i++){
            password = password + generateRandomChar();
        }
        return password;
    }

    private static char generateRandomChar() {
        int randomNumber = 32 + (int) (Math.random() * 92);
        return (char) randomNumber;
    }

    private boolean isStrong() {
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            int code = (int) password.charAt(i);
            if (code >= 65 && code <= 90) {
                upperCase++;
            } else if (code >= 97 && code <= 122) {
                lowerCase++;
            } else if (code >= 48 && code <= 57) {
                digits++;
            }
        }
        return upperCase >= 2 && lowerCase >= 1 && digits >= 5;
    }
}
