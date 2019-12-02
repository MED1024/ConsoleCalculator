

public class ArabicNumbers extends Number{


    public static int getNum(String num){
        int num1 = Integer.parseInt(num);
        return num1;
    }


    public static boolean checkStr(String num1){
        String num=num1.replaceAll(" ", "");
        boolean f=false;
        int n=0;
        int k;
        boolean f1=false;
        for (int i = 0; i < num.length(); i++) {
            n=0;
            k=0;
            f1=isDigit(num.charAt(i));
            if (num.charAt(i)=='+' || num.charAt(i)=='-' || num.charAt(i)=='*' || num.charAt(i)=='/') {
                n++;
                if (f) return false;
                f=true;

            } else if (f1) k++;

            if (k==0 && n==0) return false;

        }
        if (!f){
            return false;
        } else return true;
    }

    public static boolean isDigit(char c){
        return Character.isDigit(c);
    }

    public static boolean isValue(String c){
        for (int i = 0; i <c.length() ; i++) {
            boolean k= isDigit(c.charAt(i));
            if (!k) {
                return false;
            }
        }
        return true;
    }
}
