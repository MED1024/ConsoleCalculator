public class Number {
    public static int a,b;
    public static int getNum(String str){
        if(ArabicNumbers.isValue(str)){
            return ArabicNumbers.getNum(str);
        } else if (RomanNumbers.isValue(str)) {
            return RomanNumbers.getNum(str);
        }
        return -1;
    }
    public static int Sub(String num1,String num2)throws Exception{
        setAB(num1,num2);
        return a-b;
    }

    public static int Add(String num1,String num2)throws Exception{
        setAB(num1,num2);
        return a+b;
    }

    public static int Mul(String num1,String num2)throws Exception{
        setAB(num1,num2);
        return a*b;
    }

    public static int Div(String num1,String num2) throws Exception,ArithmeticException{
        setAB(num1,num2);
        if (b!=0) {
            return (a/b);
        } else {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
    }

    private static void setAB(String num1,String num2) throws Exception {
        boolean alert=false;
        if (Number.getNum(num1) != -1) {

            a = Number.getNum(num1);
        } else alert=true;
        if (Number.getNum(num2) != -1) {
            b = Number.getNum(num2);
        } else alert=true;

        if (alert){
            throw new Exception("Произошла ошибка!Повторите ввод");
        }
    }
}
