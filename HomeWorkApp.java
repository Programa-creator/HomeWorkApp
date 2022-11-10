public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println("2:");
        printThreeWords();
        System.out.println("3:");
        checkSumSign();
        System.out.println("4:");
        printColor();
        System.out.println("5:");
        voidcompareNumbers();
        System.out.println("6:");
        int a=11,b=10;
        System.out.print( " " + checkSum(a,b) + "\n");
        System.out.println("7:");
        int num = 1;
        checknum(num);
        System.out.println("8:");
        int number = 1;
        System.out.print(" " + checkNum(number)+ "\n");
        System.out.println("9:");
        String word= "this";
        int times = 3;
        repeat(word, times);
        System.out.println("10:");
        int year = 400;
        System.out.print(" " + isLeapYear(year));
    }
    public static void printThreeWords(){
        System.out.println(" Orange\n Banana\n Apple");
    }

    public static void checkSumSign(){

        int a = 10,b=1;

        if ( a+b >= 0 ){
            System.out.println(" The amount is positive");
        }
        else {
            System.out.println(" The amount is negative");
        }
    }

    public static void printColor(){

        int value = -110;

        if(value <= 0){
            System.out.println(" red");
        }
        else if(value > 0 && value < 100){
            System.out.println(" yellow");
        }
        else {
            System.out.println(" green");
        }
    }

    public static void voidcompareNumbers(){

        int a = 3,b =2;

        if(a >= b){
            System.out.println(" a >= b");
        }
        else {
            System.out.println(" a < b");
        }
    }

    public static boolean checkSum(int a, int b){
        int sum = a+b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        else {
            return false;
        }

    }

    public static void checknum(int num){

        if (num >= 0){
            System.out.println(" The amount is positive");
        }
        else{
            System.out.println(" The amount is negative");
        }
    }

    public static boolean checkNum(int num){

        if (num >= 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void repeat(String a, int b){

        for (int i = 0; i < b; i++){
            System.out.print(" " + a);
        }
        System.out.println("");
    }
    
    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
