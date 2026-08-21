import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        try {
            int first = in.nextInt();
            int second = in.nextInt();
            System.out.println(first/second);

        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
        in.close();
    }
}
