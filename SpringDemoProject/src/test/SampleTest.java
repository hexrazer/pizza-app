package test;

class SampleTest
{
	public static void main(String[] args)
	{
		String in = "wwwbbbwwwbbbwww";
		String res = (gameWinner(in));
		System.out.println(res);
	}
	
	
	 public static String gameWinner(String colors) {
		 
		 if(colors.length()<=2) {
			return colors.charAt(0)=='w' ? "bob" : "wendy";
		 }
		 
		  
		 for(int i=0;i<colors.length()-1;i++) {
			
			 String wen = wendyTurn(colors);
			 if(!wen.equals(colors)) {
				 colors=wen;
				 String bob = bobTurn(colors);
				 if(bob.equals(colors)) {
					 return "wendy";
				 }
				 else {
					 colors = bob;
					 continue;
				 }
			 }return "bob";
		 
     
	
    }
		return colors;
	 }
	 
	 public static String wendyTurn(String colors) {
		 
		 for(int i=1;i<colors.length()-1;i++) {
			String res="";
			 if(colors.charAt(i)=='w') {
				 if(colors.charAt(i-1)=='w' && colors.charAt(i+1)=='w') {
					 res=colors.substring(0,i);
					 res+=colors.substring(i+1,colors.length());
					 colors=res;
					 break;
					
				 }
			 }
			
		 }
		return colors;
	 }
	 
 public static String bobTurn(String colors) {
		 
		 for(int i=1;i<colors.length()-1;i++) {
			String res="";
			 if(colors.charAt(i)=='b') {
				 if(colors.charAt(i-1)=='b' && colors.charAt(i+1)=='b') {
					 res=colors.substring(0,i);
					 res+=colors.substring(i+1,colors.length());
					 colors=res;
					 break;
					
				 }
			 }
			
		 }
		return colors;
	 }
	 
	 
}
