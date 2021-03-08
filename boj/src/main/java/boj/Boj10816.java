package boj;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10816 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] card = new int[n];

        for(int i = 0; i < card.length; i++) {
            card[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] num = new int[m];

        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(card);

        int[] cnt = new int[m];

        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < card.length; j++) {
                if(num[i] == card[j]) {
                    cnt[i] += 1;
                }
            }
        }

        for(int i = 0; i < cnt.length; i++) {
            System.out.print(cnt[i] + " ");
        }

    }

}
