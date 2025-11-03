interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username;
    String password;

    UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class PublicProfile {
    String name;
    String city;

    PublicProfile(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

public class Sensitive_Data_Tagging {
    public static void encryptIfSensitive(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj.getClass().getSimpleName());
 
        } else {
            System.out.println("No encryption needed for: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        UserCredentials creds = new UserCredentials("alice", "secret123");
        PublicProfile profile = new PublicProfile("Alice", "London");

        encryptIfSensitive(creds);   
        encryptIfSensitive(profile);  
    }
}
