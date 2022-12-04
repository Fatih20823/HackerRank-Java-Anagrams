package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );		
	}
	
	static boolean isAnagram(String a, String b) {
		boolean bool = false;
	       String[] C = new String[a.length()];
	       String[] D = new String[b.length()];
	       for(int i=0;i<a.length();i++) {
	           C[i]=a.substring(i,i+1).toLowerCase();
	       }
	       for (int i=0;i<b.length();i++){   
	           D[i]=b.substring(i,i+1).toLowerCase();
	       }
	       java.util.Arrays.sort(C);
	       java.util.Arrays.sort(D);
	       if (java.util.Arrays.deepEquals(C, D)) {
	          bool = true;
	       }
        return bool;
    }


}
