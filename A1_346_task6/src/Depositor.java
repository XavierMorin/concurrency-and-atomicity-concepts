

/**
 * Class Depositor
 * Implements Depositor thread class.
 *
 * @author Malek Barhoush, mbarhoush@hotmail.com;
 *
 *
 * $Revision: 1.0 $
 * $Last Revision Date: 2019/07/03
 */

public class Depositor extends Thread {
	private Account account ;
	private int TID;
	 static int sum1;
	 private final static Object lock=new Object();
	public Depositor(Account account, int TID){
		this.account = account;
		this.TID=TID;
	}
	
	public void run(){
		for (int i=0;i<10000000;i++)
		{
			account.deposit(10);

		}
		synchronized(lock) {
		sum1+=TID;}
	  }
		
  }

