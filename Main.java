public class Main{

   public static boolean dateIsBefore(int month1, int day1, int month2, int day2){
      String monthWord1=month(month1);
      String monthWord2=month(month2);
      if((month1<=month2)&&(day1<day2)){
         System.out.println(monthWord1+" "+day1+" comes before "+monthWord2+" "+day2);
         return(true);
      }else{
         System.out.println(monthWord1+" "+day1+" does not come before "+monthWord2+" "+day2);
         return(false);
      }
   }     
     
  
   
   
   public static String month(int monthNumber){
      if(monthNumber==1){
         return("January");
         }else if(monthNumber==2){
         return("February");
         }else if(monthNumber==3){
         return("March");
         }else if(monthNumber==4){
         return("April");
         }else if(monthNumber==5){
         return("May");
         }else if(monthNumber==6){
         return("June");
         }else if(monthNumber==7){
         return("July");
         }else if(monthNumber==8){
         return("August");
         }else if(monthNumber==9){
         return("September");
         }else if(monthNumber==10){
         return("October");
         }else if(monthNumber==11){
         return("November");
         }else{
         return("December");
         }
   }
   
   
   
   public static void main(String[] args){
      System.out.println(dateIsBefore(6, 3, 9, 20));
      System.out.println(dateIsBefore(10, 1, 2, 25));
      System.out.println(dateIsBefore(8, 15, 8, 15));
      System.out.println(dateIsBefore(8, 15, 8, 16));
      }
}  
    
   
   