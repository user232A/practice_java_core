package clean_code.patterns.homework.task_1;

public class ConfigurationManager {

    private static ConfigurationManager configurationManager;
    private String db_url = "jdbc:postgresql://localhost:5432/testdb";
    private String userName = "test_user";
    private String password = "test_password_123";
    private String pathLogs = "/home/user/logs";

    private ConfigurationManager() {

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ConfigurationManager getInstance(){
        if (configurationManager == null){
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void printInfo(){
        System.out.println("db url: " + db_url);
        System.out.println("user name: " + userName);
        System.out.println("password: " + password);
        System.out.println("path logs: " + pathLogs);
    }
}
