import java.util.*;
public class Series {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
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
