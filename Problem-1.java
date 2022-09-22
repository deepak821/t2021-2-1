import java.util.*;
class Operation{
    public double add(double a, double b){
        return a+b;
    }
    public double substract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}
public class Calculator {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      double a = sc.nextDouble();
      String type = sc.next();
      double b = sc.nextDouble();
      Operation obj = new Operation();
      switch(type) {
          case "+" : 
              System.out.println(a+" + "+b+" = "+obj.add(a, b));
              break;
          case "-" :
              System.out.println(a+" - "+b+" = "+obj.substract(a, b));
              break;
          case "*" :
              System.out.println(a+" * "+b+" = "+obj.multiply(a, b));
              break;
          case "/" :
              System.out.println(a+" / "+b+" = "+obj.divide(a, b));
              break;
          default : 
             System.out.println("Please give a proper type of input");
      }
    }
}
