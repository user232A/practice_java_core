package clean_code.patterns.homework.task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Logger {

    private static Logger logger;
    private Log log;
    private List<String> eventList;
    private Map<Log, List<String>> storage;

    private Logger() {
        storage = new HashMap<>();
    }

    public static Logger getInstance(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void saveLog(Log log, String event){
        storage.computeIfAbsent(log, k -> new ArrayList<>()).add(event);
    }

    public void printInfo(){
        storage.forEach((log, records) -> System.out.println("Log: " + log + " " + records));
    }
}
