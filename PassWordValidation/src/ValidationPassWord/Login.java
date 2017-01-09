package ValidationPassWord;

public class Login {
	public static boolean validation(String user, String passWord, String confirmation)
	{
		//throws EmptyException
		if(user.length()==0){ return false; }
		
		if (passWord.equals("")||confirmation.equals("")) { 
			return false;
					//new EmptyPassowrdException(); 
			}
	 
		if (user.length()<3) { return false; }
		
		if (passWord!=confirmation) { return false; } 

		
		return true;
	}

}
