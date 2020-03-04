//Cole Constantino | Indiviually reverse each word in a string 
import java.util.*;
public class SplitTesting{
  
  public static String solve(String s){
    String[] subs = s.split(" ");
    StringBuilder main = new StringBuilder();
    
    for(int i = 0; i < subs.length; i++){
      StringBuilder sb = new StringBuilder();
      String str = sb.append(subs[i]).reverse().toString();
      main.append(str).append(" ");
    }
    return main.toString().trim();
  }
  
  public static void main(String[] args){
    String s = "on my way there";
    System.out.println(solve(s));
  }
}