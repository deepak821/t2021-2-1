import java.util.*;
public class Series_one {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a%2 == 0) a -= 1;
      int ele = 1;
      while(a>0){
          if(a==1){
            System.out.print(ele);  
            break;
          }
          System.out.print(ele+", ");
          ele += 2;
          a--;
      }
    }
}
