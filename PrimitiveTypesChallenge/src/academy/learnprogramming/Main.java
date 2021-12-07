package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteChallenge = 10;
        short myShortChallenge = 20;
        int myIntChallenge = 50;
        long myLongChallenge = 50000L + 10L * (myByteChallenge + myShortChallenge + myIntChallenge);
        System.out.println(myLongChallenge);

        short shortTotal = (short) (1000 + 10 *
                (myByteChallenge + myShortChallenge + myIntChallenge));
    }
}
