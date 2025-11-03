public class Main{
   public static boolean dateIsBefore(int month1, int day1, int month2, int day2){
      if((month1<=month2)&&(day1<day2)){
         return(true);
      }else{
         return(false);
      }
   }     
 
   public static void main(String[] args){
      System.out.println(dateIsBefore(6, 3, 9, 20));
      System.out.println(dateIsBefore(10, 1, 2, 25));
      System.out.println(dateIsBefore(8, 15, 8, 15));
      System.out.println(dateIsBefore(8, 15, 8, 16));
      }
}  
    
   
   