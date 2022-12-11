package chainOfResponsibilityDesign;

public class ErrorLogger extends Logger{

	public ErrorLogger(Logger nextLog) {
		// TODO Auto-generated constructor stub
		super(nextLog);
	}
	public void log(int loglevel,String Message) {
		if(loglevel==ERROR) {
			System.out.println("ERROR: "+Message);
			
		}
		else super.log(loglevel, Message);
	}

}
