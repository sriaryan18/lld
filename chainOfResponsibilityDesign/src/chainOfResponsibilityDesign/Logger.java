/**
 * 
 */
package chainOfResponsibilityDesign;

/**
 * @author Aryan Shrivastava
 *
 */

public abstract class  Logger {
	public static int INFO=1;
	public static int ERROR=2;
	public static int DEBUG=3;
	Logger next;
	public Logger(Logger nextLogger) {
		this.next=nextLogger;
	}
	public void log(int loglevel,String msg) {
		if(next!=null) {
			next.log(loglevel, msg);
		}
	}
}
