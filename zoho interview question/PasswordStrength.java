import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordStrength{

    public static int getPasswordStrength(String password){
        int strength = 0;

        if(password.length() >=8)
            strength++;

        if(containsUpperCase(password) && containsLowerCase(password))
            strength++;

        if(containsDigits(password))
            strength++;

        if(containsSpecialCharacter(password))
            strength++;

        return strength;
    }

    public static boolean containsUpperCase(String password){
        return !password.equals(password.toLowerCase());
    }

    public static boolean containsLowerCase(String passSword){
        return !passSword.equals(passSword.toUpperCase());
    }

    public static boolean containsDigits(String password){
        return password.matches(".*\\d*.");
    }

    public static boolean containsSpecialCharacter(String password){
        Pattern specialCharPattern = Pattern.compile("[!@#$%^&*()_+\\-=-\\[\\]{};':\"\\\\|,.<>/?]+"); // !@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?
        Matcher matcher = specialCharPattern.matcher(password);
        return matcher.find();
    }

    public static String getLevel(int strength){
        String level;

        switch(strength){
            case 1:
                level = "Week";
                break;
            case 2:
                level = "Medium";
                break;
            case 3:
                level = "Good";
                break;
            case 4:
                level = "Strong";
                break;
            default:
                level = "Week";
                break;
        }

        return level;
    }

    public static void main(String[] args) {
        String password = "Qwerty@123";
        int strength = getPasswordStrength(password);
        String strengthLevel = getLevel(strength);
        System.out.println("password:" + password + " level:" + strengthLevel);
    }
}