package ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nlp) {
        super(nlp);
    }
    
    public void log(int logLevel, String message){
        if(logLevel == ERROR)System.out.println("ERROR "+ message);
        else super.log(logLevel, message);
    }
}
