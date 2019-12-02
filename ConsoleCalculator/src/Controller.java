import java.util.Scanner;

public class Controller {

    private static String num1,num2,oper;


    private static void parseStr(String str) throws Exception,ArithmeticException{
        if (ArabicNumbers.checkStr(str)||RomanNumbers.checkStr(str)) {


            String n = str.replaceAll(" ", "");
            num1 = "";
            num2 = "";
            oper = "";
            for (int i = 0; i < n.length(); i++) {
                if (ArabicNumbers.isDigit(str.charAt(i)) || RomanNumbers.isDigit(str.charAt(i))) {
                    if(oper==""){
                        num1=num1+str.charAt(i);
                    } else {
                        num2=num2+str.charAt(i);
                    }
                } else {
                    oper=oper+str.charAt(i);
                }
            }

            if (oper.equalsIgnoreCase("+")){
                System.out.print(Number.Add(num1,num2));
            } else if (oper.equalsIgnoreCase("-")){
                System.out.print(Number.Sub(num1,num2));
            } else if (oper.equalsIgnoreCase("*")){
                System.out.print(Number.Mul(num1,num2));
            } else if (oper.equalsIgnoreCase("/")){
                System.out.print(Number.Div(num1,num2));
            }


        } else {
            throw new Exception("Произошла ошибка!Повторите ввод");
        }
    }


    public static void start() throws Exception{
        Scanner input=new Scanner(System.in);
        String example=input.nextLine();
        parseStr(example);
    }
}
