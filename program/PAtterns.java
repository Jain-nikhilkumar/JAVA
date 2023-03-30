
// public class PAtterns {
//     /**
     
//      */
//     public static void main(String args[])
//     { // solid rectangle  
//         // for(int i=1;i<=9;i++)
//         // {
//         //     for(int j=1;j<=10;j++){
//         //         System.out.print(" * ");
//         //     }
//         //     System.out.println();
//         // }
//         // HOllow rect

//         // int maxrow=4;
//         // int maxcol=5;

//         // for(int i=1;i<=maxrow;i++){
//         //     for(int j=1;j<=maxcol;j++){
//         //         if(i == 1 || j == 1|| i== maxrow || j  == maxcol ){
//         //             System.out.print(" * ");
//         //         }
//         //         else{
//         //             System.out.print("   ");
//         //         }
//         //     }
//         //     System.out.println(" ");
           
//         // }

//         //half pryyamid

//         // for(int i=4;i>=1;i--)
//         // {
//         //     for(int j=1 ;j<=i;j++){
//         //         System.out.print(" * ");
//         //     }
//         //     System.out.println("  ");
//     //    // }
//       //half pyramid inverted 180
//       // for(int i=1;i<=4;i++)
//       // {
//       //   for(int j=1;j<=4-i;j++)
//       //   {  
//       //     System.out.print(" ");
//       //   }
//       //   for(int j=1;j<=i;j++){
//       //     System.out.print("*");
//       //   }
//       //   System.out.println("");
//       // }
//   //Flowind Traingale (numeric pyramid continue
// //   int num=1;
// //   for(int i=1;i<=5;i++){
// //     for(int j=1;j<=i;j++)
// //     {
// //       System.out.print(num+" ");
// //       num++;
// //     }
// // System.out.println("");
// //   }
    
//  //numeric with 123
// //  for(int i=1;i<=5;i++){
// //   for(int j=1;j<=i;j++){
// //     System.out.print(j+" ");
// //   }
// //   System.out.println("");
// // }   
// //0-1 Triangle
// // int  sum=0;
// // for(int i=1;i<=19;i++){
// //   for(int j=1;j<=i;j++){
// //     sum=i+ j;
// //     if(sum % 2 == 0){
// //       System.out.print(" 1 ");
// //     }
// //     else{
// //       System.out.print(" 0 ");
// //     }
// //   }
// //   System.out.println("");
// // }

// //SOLID  ROMMBUS chk 
// // for(int i=1;i<=5;i++){
// //   for(int j=1;j<=5-i;j++){
// //     System.out.print("   ");
// //     }
// //     for(int s=1;s<=5;s++){
// //       System.out.print(" * ");
// //   }
// //   for(int j=2;j<=i;j++){
// //     System.out.print("   ");
// //     }
  
// //   System.out.println("");
// // }
    
// //number duplicate pyamid   
//     // for(int i=1;i<=5;i++){
//     //   for(int j=1;j<=5-i;j++){
//     //     System.out.print(" ");
        
//     //   }
//     //   for(int s=1;s<=i;s++){
//     //   System.out.print(i + " ");
//     //   }
//     //   System.out.println("");
//     // }

//     //PALIDROME NUMBER PYRAMID
    
//     // for(int i=1;i<=5;i++){
//     //     for(int j=1;j<=5-i;j++){
//     //         System.out.print(" ");
//     //     }
//     //     for(int j=i;j>=1;j--){
//     //       System.out.print(j);
//     //     }
//     //     for(int j=2;j<=i;j++){
//     //       System.out.print(j);
//     //     }
//     //     System.out.println("");
//     // }
//   //BUttrrfflay pattern solid
 
// //   for(int i=1;i<=4;i++){
// //     for(int j=1;j<=i;j++){
// //       System.out.print(" * ");
// //     }

// //     int s=2*(4-i);

// //     for(int j=1;j<=s;j++){
// //       System.out.print("   ");
// //     }

// //     for(int j=1;j<=i;j++){
// //       System.out.print(" * ");
// //     }
// //     System.out.println("");
// //   }
// // for(int i=4;i>=1;i--){
// //   for(int j=1;j<=i;j++){
// //     System.out.print(" * ");
// //   }

// //   int ss=2*(4-i);
// //   for(int j=1;j<=ss;j++){
// //     System.out.print("   ");
// //   }

// //   for(int j=1;j<=i;j++){
// //     System.out.print(" * ");
// //   }
// // System.out.println("");
// // }

// //Solid rombbus same

// // for(int i=1;i<=5;i++){
// //   for(int j=1;j<=5-i;j++){
// //     System.out.print("+");
// //   }
// //   for(int j=1;j<=5;j++){
// //     System.out.print("*");
// //   }
// //   for(int j=1;j<i;j++){ optionnal
// //     System.out.print("+");
// //   }
// //   System.out.println("");
// // }


// //numeric pyramid spacee between 
// // for(int i=1;i<=5;i++){
// //   for(int j=1;j<=5-i;j++){
// //     System.out.print(" ");
// //   }
// //   for(int j=1;j<=i;j++){
// //     System.out.print(i+" ");
// //   }
// //   System.out.println("");
// // }


// //plidrome pyramid

// // for(int i=1;i<=5;i++){
// //   for(int j=1;j<=5-i;j++){
// //     System.out.print("  ");
// //   }
// //   for(int j=i;j>=1;j--){
// //     System.out.print(j+" ");
// //   }
// //   for(int j=2;j<=i;j++){
// //     System.out.print(j+" ");
// //   }
// //   System.out.println("");
// //   }

// // //DIAMOND PATTERN

// // for(int i =1;i<=4;i++){
// //   for(int j=1;j<=4-i;j++){
// //     System.out.print("   ");
// //   }

// //   for(int s=1;s<=2*i-1;s++){
// //     System.out.print(" * ");
// //   }
// //   System.out.println("");
// //   System.out.println("");
// // }
// // for(int i =4;i>=1;i--){
// //   for(int j=1;j<=4-i;j++){
// //     System.out.print("   ");
// //   }

// //   for(int s=1;s<=2*i-1;s++){
// //     System.out.print(" * ");
// //   }
// //   System.out.println("");
// //   System.out.println("");
// // }
// //Hollow butterfly

// // for(int i=1;i<=5;i++){
// //   for(int j=1;j<=i;j++){
// //     if(j==1 || j==i){
// //       System.out.print("*");
// //     }
// //     else{
// //       System.out.print(" ");
// //     }    
// // }
// // for(int k=1;k<=2*(5-i);k++){
// // System.out.print(" ");
// // }
// // for(int j=1;j<=i;j++){
// //   if(j==1 || j==i){
// //     System.out.print("*");
// //   }
// //   else{
// //     System.out.print(" ");
// //   }  
  
// // }
// //  System.out.println("");
// // }
// // for(int i=5;i>=1;i--){
// //   for(int j=1;j<=i;j++){
// //     if(j==1 || j==i){
// //       System.out.print("*");
// //     }
// //     else{
// //       System.out.print(" ");
// //     }    
// // }
// // for(int k=1;k<=2*(5-i);k++){
// // System.out.print(" ");
// // }
// // for(int j=1;j<=i;j++){
// //   if(j==1 || j==i){
// //     System.out.print("*");
// //   }
// //   else{
// //     System.out.print(" ");
// //   }  
  
// // }
// // System.out.println("");
// // }
// // }
// // }
// //Hollow rombus
// // for(int i=1;i<=5;i++){
// //   for(int j=1;j<=5-i;j++){
// //     System.out.print(" ");
// //   }
// //   for(int j=1;j<=5;j++){
// //     if(j==1 || j==5 || i==1 || i==5 ){
// //     System.out.print("*");

// //     }
// //     else{
// //       System.out.print(" ");
// //     }
// //   }
// //   System.out.println("");
// // }
// //     }
// //   }

// //HAlf pyramid numeric
// // for(int i=1;i<=5;i++){
// //   for(int j=1;j<=i;j++){
// //     System.out.print(j+ " ");
// //   }
// //   System.out.println("");
// // }
// //     }
// //   }

// //half invertted numeric pyramid
// // for(int i=1;i<=5;i++){
// //    for(int j=1;j<=5-i;j++){
// //      System.out.print(i +" ");
// //    }
// //    System.out.println("");
// //  }
// //      }
    
// // }

