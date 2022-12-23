import java.io.*;
public class ArmstrongNumber{
 static int make_armstrong(int r){
 return (r*r*r);
 }
 public static void main(String[] args) throws IOException{
 BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
 int num, result = 0, remainder = 0;
 System.out.println("Enter a number: ");
 num = Integer.parseInt(b.readLine());
 int num_holder = num;
 while(num % 10 != 0){
 remainder = num % 10;
 num = num/10;
 result += make_armstrong(remainder);
 }
 if(num_holder == result)
 System.out.println(num_holder + " is an Armstrong number");
 else
 System.out.println(num_holder + " is not an Armstrong number");
 }
}
