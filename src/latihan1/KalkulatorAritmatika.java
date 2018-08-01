/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 package latihan1;
 import java.util.Scanner;

public class KalkulatorAritmatika {
   


  public static void main(String[] args){
   Scanner input = new Scanner (System.in);
  String ulangi ="y";
  int angka1,angka2,hasil;
  int pem2,pem1,pembagian;
  int pil;
 System.out.println("SELAMAT DATANG DI KALKULATOR ");
  System.out.println("MASUKAN PILIHAN  ");
   System.out.println("Plihan 1 : PERKALIAN ");
   System.out.println("Plihan 2 : PEMBAGIAN ");
   System.out.println("Plihan 3 : PENJUMLAHAN ");
   System.out.println("Plihan 4 : PENGURANGAN ");
   System.out.println("Pilihan : ");
    pil = input.nextInt();
  switch(pil){
  
 
      case 1 :{
          System.out.println("MASUKAN ANGKA");
          angka1 = input.nextInt();
          System.out.println("MASUKAN ANGKA");
           angka2 = input.nextInt();
          hasil = angka1*angka2;
       String perkalian;
          System.out.println("HASILNYA ADALAH " + hasil);
  
  }
      break;
              case 2 :{
                  
            System.out.println("MASUKAN ANGKA");
          pem1 = input.nextInt();
          System.out.println("MASUKAN ANGKA");
          pem2 = input.nextInt();
          pembagian= pem1/pem2;
          System.out.println("HASILNYA ADLAH " +pembagian);
          break;
          
          }
          
              case 3 :{
              System.out.println("MASUKAN ANGKA");
          pem1 = input.nextInt();
          System.out.println("MASUKAN ANGKA");
          pem2 = input.nextInt();
          pembagian= pem1/pem2;
          System.out.println("HASILNYA ADALAH " + penjumlahan);
          break;
              }
              
              case 4:{
                System.out.println("MASUKAN ANGKA");
          pem1 = input.nextInt();
          System.out.println("MASUKAN ANGKA");
          pem2 = input.nextInt();
          pembagian= pem1-pem2;
          System.out.println("HASILNYA ADALAH " + pengurangan);
          break;  
              }
}
}
}
