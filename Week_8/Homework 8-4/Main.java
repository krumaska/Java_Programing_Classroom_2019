import java.lang.*;

import javax.management.RuntimeErrorException;
class Main {
  
	public static String len_check(String str){
	  // fill here! 
	  if(str.length() > 20) {
		  throw new Exception("More than 20 words");
	  } else return str;
	}
	public static void main(String[] args) throws Exception {

		System.out.println(len_check("abcdefghijklmnopqrs"));//abcdefghijklmnopqrs
		System.out.println(len_check("abcdefghijklmnopqrsuvw"));
		System.out.println(len_check(null));
	}
}