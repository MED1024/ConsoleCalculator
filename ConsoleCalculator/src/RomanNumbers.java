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

    public static String getRomNum(int num){
        switch (num){
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }


    public static String generateNum(int num){
        String romNum="";
        int r1=100;
        int r2=50;

        if (num==r1) return "C";
        else if (num>=90) {
            romNum = romNum + "XC";
            romNum = romNum + getRomNum(num % 10);
            return romNum;
        } else if (num>=50) {
            romNum=romNum+"L";
            num=num-50;
            while (num>=10){
                num=num-10;
                romNum=romNum+"X";
            }
            romNum = romNum + getRomNum(num % 10);
            return romNum;
        } else if (num>=40){
            romNum = romNum + "XL";
            romNum = romNum + getRomNum(num % 10);
            return romNum;
        } else {
            while (num>=10){
                num=num-10;
                romNum=romNum+"X";
            }
            romNum = romNum + getRomNum(num % 10);
            return romNum;
        }


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

