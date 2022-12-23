import java.io.*;
public class EvenNumber{
    public static void main(String[] args) throws IOException{
        int range;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        range = Integer.parseInt(br.readLine());
        System.out.println("The Even Numbers Are");
        for(int i=0; i<range; i++){

            if(i%2 == 0)
                System.out.println(i);
        }
    }
}