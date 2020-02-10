import Operations.*;

public class Calculate {
    public static double getValue(double numb1,double numb2,String op) {
        Methods calc[] = {new Add(), new Sub(), new Mul(), new Div()};
        String oper[] = {"+", "-", "*", "/"};
        try{
            int res = 0;
            for (int i = 0; i < 4; i++) {
                if (op.equals(oper[i])) {
                    res = i;
                    break;
                }
            }
            return calc[res].cal(numb1, numb2);
        }catch (ArithmeticException e){
            System.out.println("Infinity");
            return 0;
        }
    }
}