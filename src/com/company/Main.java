package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for(int i=0;i<testCase;i++){
            int currentRating = scan.nextInt();
            int atMostRating = scan.nextInt() ;

            int reqRating = currentRating + 200;
            if (atMostRating >= currentRating && atMostRating <= reqRating){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
