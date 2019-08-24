import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LoopI {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int i,res;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(i=1;i<=10;i++)
        {
                res=N*i;
                System.out.printf("%d x %d = %d\n",N,i,res);
         
        }

        scanner.close();
    }
}
