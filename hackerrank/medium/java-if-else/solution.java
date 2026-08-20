import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String q = "Weird";
        String w = "Not Weird";
        if(n%2==0)
        {
            if(n>=2 && n<=5)
            {System.out.println(w);}
            else if(n>=6 && n<=20)
            {System.out.println(q);}
            else if(n>20)
            {System.out.println(w);}
            else
            {System.out.println("it is zero");}
        } 
        else
        {
            System.out.println(q);
        }

        scanner.close();
    }
}
