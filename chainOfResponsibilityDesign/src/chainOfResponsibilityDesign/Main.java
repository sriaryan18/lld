package chainOfResponsibilityDesign;

public class Main {

	public static void main(String []args) {
		Logger logger=new InfoLogger(new ErrorLogger(new DebugLogger(null)));
		logger.log(1, "INFO LOGGING");
		logger.log(2,"ERROR Happens");
		logger.log(3, "DEBUGGING");
	}

}
