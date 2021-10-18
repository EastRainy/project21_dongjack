package Hello;

import Hello.MyException.RUN_MODE;

public class hello {

	public static void main(String[] args) {
		
		
		try {
			
			MyException.InitErrorInfo(RUN_MODE.RELEASE);
			
			
		}
		catch(Exception ex){
			
			MyException.DisplayErrMsg(ex);
			
		}
		
		
	}
	

	
}
