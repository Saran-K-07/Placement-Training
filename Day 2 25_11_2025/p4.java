import java.util.*;
public class p4 {
    public static void main(String args[]){
        System.out.println("computer has choosen a random number from 1 to 100, can you guess it");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int computerGuess = random.nextInt(100) + 1;
        while(true){
            System.out.println("please guess a number");
            int userGuess = sc.nextInt();
            if(userGuess >100 || userGuess <0){
                System.out.println("number should be in between 0 to 100");
                continue;
            }else if(userGuess == computerGuess){
                System.out.println("congrats you guessed the right number");
                break;
            }else if(userGuess < computerGuess){
                System.out.println("number is greater than "+userGuess);
            }else{
                System.out.println("number is less than "+userGuess);
            }
        }
    }
}
