package clean_code.patterns.homework.task_2;

public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.saveLog(Log.CRITICAL, "Internal Server Error");
        logger1.saveLog(Log.INFO, "Authorisation");
        logger1.saveLog(Log.ERROR, "Bad Request");
        logger2.saveLog(Log.CRITICAL, "Crush");
        logger2.saveLog(Log.INFO, "Create user");
        logger1.saveLog(Log.INFO, "Create order");

        logger2.printInfo();
    }
}
