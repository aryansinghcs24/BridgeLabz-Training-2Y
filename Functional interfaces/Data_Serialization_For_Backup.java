interface BackupSerializable {}

class UserData implements BackupSerializable {
    @SuppressWarnings("unused")
    String username;
    @SuppressWarnings("unused")
    String email;

    UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }
}

class ConfigSettings {
    @SuppressWarnings("unused")
    String key;
    @SuppressWarnings("unused")
    String value;

    ConfigSettings(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class Data_Serialization_For_Backup {
    public static void backupIfSerializable(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up: " + obj.getClass().getSimpleName());
           
        } else {
            System.out.println("Not eligible for backup: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        UserData user = new UserData("alice", "alice@email.com");
        ConfigSettings config = new ConfigSettings("theme", "dark");

        backupIfSerializable(user);  
        backupIfSerializable(config); 
    }
}
