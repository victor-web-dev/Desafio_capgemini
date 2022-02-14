package main;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

class questions {
	
	questions() {}
	
	public void question1(int n) {
		String asterisk = "";
		
		for (int i = 0; i < n; i++) {
			String emptySpace = "";
			asterisk += "*";
			
			for (int j = n - i; j > 0; j--) {
				emptySpace += " ";
			}
			System.out.println(emptySpace + asterisk);
		}
	}
	
	public void question2(String password) {
		String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$%^&*()-+]).{6,}$";
		
		final int MIN_SIZE = 6;
		boolean validation = Pattern.matches(regex, password);
		
		if (!validation && password.length() < MIN_SIZE) {
			System.out.println(MIN_SIZE - password.length());
			return;
		}
		
//		 imprime 0 se a senha estiver no padrao correto
//	     imprime -1 se a senha for maior que 6 mas nao corresponder ao padrao correto
		System.out.println(validation ? 0 : -1);
		return;
	}

	
	public void question3(String text) {
		List<String[]> anagram = new ArrayList<String[]>(); 
		
		for(int i = 0; i < text.length(); i++) {
		    for( int j = i+1; j < text.length(); j++) {
		      if(text.charAt(i) == text.charAt(j)) {
		    	  String[] string = {String.valueOf(text.charAt(i)), String.valueOf(text.charAt(j))};
		    	  anagram.add(string);
		      }
		    }
		  }
		
		for(String i[] : anagram) {
			System.out.println(Arrays.toString(i));
		}
	}
	
}

public class main {

	public static void main(String[] args) {
		
		questions q = new questions();
		String pwd = "Ya3afasda";
		String text = "ifailuhkqq";
		
//		q.question1(6);
//		q.question2(pwd);
//		q.question3(text);
	}

}
