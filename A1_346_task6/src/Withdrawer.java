
/**
 * Class Withdrawer
 * Implements Withdrawer thread class.
 *
 * @author Malek Barhoush, mbarhoush@hotmail.com;
 * 
 *
 * $Revision: 1.0 $
 * $Last Revision Date: 2019/07/03
 */

public class Withdrawer extends Thread {
	private Account account ;
	private int TID;
	 static int sum2;
	 private final static Object lock=new Object();
	public Withdrawer(Account account, int TID){
		this.account = account;
		this.TID=TID;
	}
	
	public void run(){
	
		// Withdraw 10 CAD into instance variable account
		for (int i=0;i<10000000;i++)
		{
			account.withdraw(10);
			
		}
		synchronized(lock) {
		sum2+=TID;}
	}

}
