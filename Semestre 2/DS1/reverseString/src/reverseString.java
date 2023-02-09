import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um texto ou palavra: ");
		
		String text = scanner.nextLine();
		
		char[] arr = text.toCharArray();
		
		//your code goes here
		for(int i = arr.length - 1; i >= 0; i--){

        System.out.print(arr[i]);
    	}
		
		/*
		if () {
			System.out.println(text + "é palindromo");
			
		} else {
			
			System.out.println(text + "não é palindromo");

		}
		
		*/
	}
}