import java.io.*;
class PalindromeNumber{
 static void check_palindrome(int x, int y){
 if(x == y)
 System.out.println(x + " is a palindrome number");
 else
 System.out.println(x + " is not a palindrome number");
 }
 public static void main(String[] args) throws IOException{
 BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
 int n = Integer.parseInt(b.readLine());
 int r, checker, reversed = 0;
 checker = n;
 while(n % 10 != 0){
 r = n % 10;
 reversed = reversed * 10 + r;
 n = n/10;
 }
 check_palindrome(checker, reversed);
 }
}