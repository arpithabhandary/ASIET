\\ Arpitha Bhandary
\\ Cs(AI)
\\ 16


package freq;
import java.util.*;
// to find the frequency of a letter

public class freq{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the letter to count: ");
        char letter = scanner.next().charAt(0);

       //converting it into lowercase
        inputString = inputString.toLowerCase();
        letter = Character.toLowerCase(letter);

        int frequency = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == letter) {
                frequency++;
            }
        }
        System.out.println("The letter '" + letter + "' appears " + frequency + " times in the string.");
    }
}


