import java.util.*;
public class Count_multiple {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i<n; i++){
          arr[i] = sc.nextInt();
      }
      int[] ans = new int[9];
      for(int i = 1; i<=9; i++){
          int c = 0;
          for(int j : arr){
              if(j%i == 0){
                  c++;
              }
          }
          ans[i-1] = c;
      }
      System.out.print("{");
      for(int i = 0; i<7; i++){
          System.out.print((i+1)+": "+ans[i]+", ");
      }
      System.out.print("9: "+ans[8]+"}");
    }
}
