public class Ex1{
    public static void main(String[] args) {
        division(7, 0);
    }

    public static void division(double num1, double num2){
        if(num2 ==  0) throw new ArithmeticException("Нельзя делить на 0");
        double result = num1/num2;
        System.out.printf("Результат деления заданных чисел = " + result);
    }
}
