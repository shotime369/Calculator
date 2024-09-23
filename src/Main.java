public class Main {
    public static void main(String[] args) {
        System.out.println("1+1= " + new Calculator(1,1,"+").operate());
        System.out.println("1-2= " + new Calculator(1,2,"-").operate());
        System.out.println("1x3= " + new Calculator(1,3,"*").operate());
        System.out.println("1/4= " + new Calculator(1,4,"/").operate());
        System.out.println("1%5= " + new Calculator(1,5,"%").operate());

    }
}
