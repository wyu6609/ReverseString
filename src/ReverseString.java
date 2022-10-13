import java.util.Scanner;


public class ReverseString {
    public static void main(String[] args){
        //create scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string you'd like to reverse:");

        String userInput = myObj.nextLine();
        System.out.println("You have inputted: " + userInput);

        String r = reverse(userInput);
        System.out.println("Reversed String is: "+ r);
    }

    public static String reverse(String s){
        char[] letters = new char[s.length()];

        int letterIndex = 0;


        for(int i = s.length() - 1; i >=0 ; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse = reverse + letters[i];
        }


        return reverse;


    }
}
