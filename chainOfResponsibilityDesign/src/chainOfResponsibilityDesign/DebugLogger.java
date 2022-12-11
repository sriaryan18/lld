package chainOfResponsibilityDesign;

public class DebugLogger extends Logger{

	public DebugLogger(Logger nextLogger) {
		// TODO Auto-generated constructor stub
		super(nextLogger);
	}
	public void log(int loglevel,String Message) {
		if(loglevel==DEBUG) {
			System.out.println("DEBUG: "+Message);
		}
		else super.log(loglevel, Message);
	}

}
