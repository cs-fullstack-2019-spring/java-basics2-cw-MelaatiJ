import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//        ex1();
//        ex2();
//        ex3();
//        ex4();
        ex5();
    }

//    ### Exercise 1:
//    Print 0 through 100 using a while loop.
    private static void ex1() {
        int count = 0;

        while(count <= 100){
            System.out.println(count);
            count++;
        }
    }


//    ### Exercise 2:
//    Print only the even numbers between 0 and 100 using a for loop
    private static void ex2() {
        for(int y=0; y<=100; y++)
            if(y % 2 == 0 ){
                System.out.println(y);
            }
    }

//    ### Exercise 3:
//    Prompt the User for a number.
//    Create a function in your program that counts from 0 to [NUMBER]

    private static void ex3() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = reader.nextInt();
        for (int x = 0; x <= number; x++) {
            System.out.println(x);
        }


    }

//    ### Exercise 4:
//    Prompt the User for secret word. Create a while loop that will continually ask the Player to guess
//    the secret word until it’s correct, or 5 wrong guesses have been made. Once it’s correct print ```THAT’S CORRECT!!!
//    ``` and also how many guesses it took to get it right.
//    If the Player doesn't get the secret word after 5 tries, end the program and print ```Sorry! Out of guesses :-(```

//    private static void ex4() {
//        System.out.println("Enter a secret word");
//    }
//
////### Exercise 5:
////    Create a program that sends a different function a number, and that function prints out that many “*”.
//
    private static void ex5() {
        printStar(21);
    }

    private static void printStar(int starKount){
        for(int z=1; z<=starKount; z++){
            System.out.println("*");
        }

    }



}
