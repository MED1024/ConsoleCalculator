import javax.print.DocFlavor;

public class RomanNumbers extends Number {


    public static int getNum(String num){
        int num1=0;
        switch (num){
            case "I":
                num1=1;
                break;
            case "II":
                num1=2;
                break;
            case "III":
                num1=3;
                break;
            case "IV":
                num1=4;
                break;
            case "V":
                num1=5;
                break;
            case "VI":
                num1=6;
                break;
            case "VII":
                num1=7;
                break;
            case "VIII":
                num1=8;
                break;
            case "IX":
                num1=9;
                break;
            case "X":
                num1=10;
                break;
            default:
                return -1;
        }
        return num1;
    }


    public static boolean checkStr(String num1){
        String num=num1.replaceAll(" ", "");
        boolean f=false;
        int n=0;
        int k;
        for (int i = 0; i < num.length(); i++) {
            n=0;
            k=0;
                if (num.charAt(i)=='+' || num.charAt(i)=='-' || num.charAt(i)=='*' || num.charAt(i)=='/') {
                    n++;
                    if (f) return false;
                    f=true;

                } else if (num.charAt(i)=='I' || num.charAt(i)=='V' || num.charAt(i)=='X') k++;
            if (k==0 && n==0) return false;

        }
        if (!f){
            return false;
        } else return true;
    }

    public static boolean isDigit(char c){
        if (c=='I' || c=='V' || c=='X') return true;
        else return false;
    }

    public static boolean isValue(String num){
        switch (num){
            case "I":
                return true;
            case "II":
                return true;
            case "III":
                return true;
            case "IV":
                return true;
            case "V":
                return true;
            case "VI":
                return true;
            case "VII":
                return true;
            case "VIII":
                return true;
            case "IX":
                return true;
            case "X":
                return true;
            default:
                return false;
        }
    }

}
