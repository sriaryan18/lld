package chainOfResponsibilityDesign;

public class InfoLogger extends Logger{

	public InfoLogger(Logger nextLog) {
		// TODO Auto-generated constructor stub
		super(nextLog);
		
	}

	@Override
	public void log(int loglevel,String Message) {
		if(loglevel==INFO) {
			System.out.println("INFO: "+Message);
		}
		else {
			super.log(loglevel, Message);
		}
		
	}

}
