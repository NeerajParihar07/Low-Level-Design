package ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, " exception occured ");
        logObject.log(LogProcessor.DEBUG, " debug occured ");
        logObject.log(LogProcessor.INFO, " info occured ");
    }
}   
