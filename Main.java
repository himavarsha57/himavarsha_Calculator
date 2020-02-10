import Operations.*;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        double numb1, numb2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations Available");
        System.out.println("Add\nSub\nMul\nDiv");
        while (true) {
            System.out.println("Enter two numbers and an operator with spaces (numb1,numb2 and op)");
            numb1 = sc.nextDouble();
            numb2 = sc.nextDouble();
            op = sc.next();
            double c=Calculate.getValue(numb1,numb2,op);
            System.out.println(numb1+" "+op+" "+numb2+" = "+c);
            System.out.println("Do you want to continue (yes/no)");
            if(sc.next().equals("no")){
                break;
            }
        }
    }
}