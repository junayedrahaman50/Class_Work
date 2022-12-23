import java.io.*;
class Calculator{
public static void add(int a, int b){
    System.out.println(a+b);
}
public static void sub(int a, int b){
    System.out.println(a-b);
}
public static void mul(int a, int b){
    System.out.println(a*b);
}
public static void div(int a, int b){
    System.out.println(a/b);
}

public static void main(String[] args) throws IOException{
    int userInput, a, b;
    System.out.println("Enter 1 to add");
    System.out.println("Enter 2 to substract");
    System.out.println("Enter 3 to multiply");
    System.out.println("Enter 4 to division");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    userInput  = Integer.parseInt(br.readLine());
    System.out.println("Enter two values: ");
    a =  Integer.parseInt(br.readLine());
    b =  Integer.parseInt(br.readLine());
 switch(userInput) {
  case 1:
        add(a, b);
        break;
  case 2:
        sub(a, b);
        break;
  case 3:
        mul(a, b);
        break;
  case 4:
        div(a, b);
        break;
  default:
        System.out.println("Wrong Input");

        }
    

    }
}