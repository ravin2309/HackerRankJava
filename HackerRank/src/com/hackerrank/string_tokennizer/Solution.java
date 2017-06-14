package com.hackerrank.string_tokennizer;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Write your code here.
		String s = scan.nextLine().trim();
		if(s.length()==0)
		{
			System.out.println(0);
			scan.close();
			return ;
		}
		String delims = "[_\\@ !,?.'\"]+";
        String[] string = s.split(delims);
        int lens = string.length;
        
       if (lens>=1 && lens <=400000)
		{
			System.out.println(lens);
			for(int i=0;i<=lens;i++)
			{
				System.out.println(string[i]);
			}
		}
        else
            System.out.println(lens);
        scan.close();
	}

}
