package com.karthik.demo.problems;

/*
    There are N people, numbered from 0 to N-1, playing a game.
    The K-th person is assigned the letter S[K].
    At the beginning the 0th person sends a message, consisting of a single letter S[0], to the A[0]-th person.
    When the K-th person receives the message, they append their letter S[K] to the message and forward it to A[K].
    The game ends when the 0th person receives the message. Find the final message.
 */
/*
    1. Given S = "cdeo" and A = [3, 2, 0, 1], your function should return "code".
    At the beginning, the 0th person sends a message "c" to the 3rd person.
    Next, the 3rd person forwards the message "co" to the 1st person.
    After that the 1st person forwards the message "cod" to the 2nd person.
    After appending the letter 'e' to it, the 2nd person forward it to the 0th person.
    The final message, received by 0th person, is "code".
 */
/*
    2. Given S = "cdeenetpi" and A = [5, 2, 0, 1, 6, 4, 8, 3, 7], your function should return "centipede".
 */
/*
    3. Given S = "bytdag" and A = [4, 3, 0, 1, 2, 5], your function should return "bat".
       Notice, that not all letters from S have to be used.
 */
public class GameMessage {
    public static String findFinalMessage(String S, int[] A) {
        StringBuilder message = new StringBuilder();
        int current = A[0];

        while (current != 0) {
            message.append(S.charAt(current));
            current = A[current];
        }

        return S.charAt(0)+message.toString();
    }

    public static void main(String[] args) {
        String S = "cdeo";
        int[] A = {3,2,0,1};

        //String S = "cdeenetpi";
        System.out.println(S.charAt(3));
        System.out.println(S.charAt(2));
        System.out.println(S.charAt(0));
        //int[] A = {5, 2, 0, 1, 6, 4, 8, 3, 7};

        String finalMessage = findFinalMessage(S, A);
        System.out.println("Final Message: " + finalMessage);
    }
}
