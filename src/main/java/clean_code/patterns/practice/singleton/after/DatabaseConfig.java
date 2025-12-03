package clean_code.patterns.practice.singleton.after;

public class DatabaseConfig {

    public String config = "Default Config";
    private static DatabaseConfig databaseConfig;

    private DatabaseConfig() {

    }

    public static DatabaseConfig getInstance() {
        if (databaseConfig == null) {
            databaseConfig = new DatabaseConfig();
        }
        return databaseConfig;
    }

    public void displayConfig() {
        System.out.println(config);
    }
}
