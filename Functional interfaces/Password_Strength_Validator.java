interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        if (password == null) return false;
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
}

public class Password_Strength_Validator {
    public static void main(String[] args) {
        String[] passwords = {
            "Short7!",
            "strongPass1!",
            "NoSpecialChar123",
            "Valid@123"
        };

        for (String pwd : passwords) {
            if (SecurityUtils.isStrongPassword(pwd)) {
                System.out.println(pwd + " is STRONG");
            } else {
                System.out.println(pwd + " is WEAK");
            }
        }
    }
}
