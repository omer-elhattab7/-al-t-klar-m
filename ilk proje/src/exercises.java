
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/*
import java.util.Scanner;
 

//kulancıdan boy ve kilo  alarak kutle hisablamak 



public class exercises {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("lütfen kilonuzu giriniz:");
        int kilo=scanner.nextInt();
     
    
        System.out.println("lütfen boyunuzu giriniz : ");
        double boy=scanner.nextDouble();
        
        double sonuç= kilo /(boy*boy);
        System.out.println("sonucunuz:"+sonuç);
}
}
*/





//bir atm  programı kulancu yaptırmak istedi şeyler göre


/*
import java.util.Scanner;
public class exercises{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bakiye=1000;
        String işlemler ="1)işlem bakiyeniz\n"+
               "2)para yatır\n"+
                "3)işlem para çek\n"+
                "4)işlem c basarak cıkış yap\n";
        System.out.println("*******************************");
        System.out.println(işlemler);
        System.out.println("*******************************");
        
        while(true){
            System.out.println("lütfen işlem seçiniz: ");
            String işlem=scanner.nextLine();
            if (işlem.equals("4")){
                
                System.out.print("cıkış yapılyor...");
                break;
                
            }
            else if(işlem.equals("1")){
                System.out.println("bakiyeniz: "+ bakiye);
   
            }else if(işlem.equals("2")){
                System.out.println("şu anki bakiyeniz:  "+bakiye);
            System.out.println("yatırmak istediniz miktar");
            int yat=scanner.nextInt();
            bakiye+=yat;
 
             }else if(işlem.equals("3")){
                     System.out.println("lütfen çekmek istediniz miltarı giriniz:  ");
                     int cek=scanner.nextInt();
                     if(bakiye-cek<0)
                     System.out.println("lüfen bakiyenize eşit veya az miktar seçiniz");
                     else {
                         bakiye-=cek;
                        
                     }
                     
                     }
        
         
}    
   
}
 */





//
   
/*  {{ AMASTRPNG SAYI}}
başla 
kulancıdan (sayı,sayı basmağı)
toplam =0
bırler basmağındaki bulunan sayı  değeri icin %10 dedik
sayıyı /10 lerek azalt,
toplama bolumunden cıkan sayı basmak sayısı usu ekliyerek toplAMA AL
SAY>0 OLANA KADAR İŞLE
EGER SAYI =TOPLAM ARMASTRONG SAYI OLARAK YAZDIR 
DEĞİLSE EĞİL OLARA YAZDIR 
BİTİR 
*/
/*
import java.util.Scanner;
public class exercises{
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen sayı giriniz:  ");
       int sayı=scanner.nextInt();
        System.out.print("ltfen pasmak giriniz:  ");
       int basmaks=scanner.nextInt();
       int toplam =0;
       int gecicisayı=sayı;
       do{
           int basmakd=gecicisayı%10;
         gecicisayı/=10;
         toplam+=Math.pow(basmakd, basmaks);
   
       }while(gecicisayı>0);
       if(sayı==toplam){
           System.out.println("giriniz sayı armstrong sayıdır ");
 
       }
       else {
           System.out.println("giriniz sayı armstrong değildir");
       }


    }
}

*/






//veri tabanında kayıtlı kulancı giriş haktı 
/*
public  class exercises{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int giris_hakı=3;
       String sys_kulancı_adı="omer" ;
       String sys_parola ="12345";
        System.out.println("************************");
        System.out.println("hoş geldiniz");
        System.out.println("************************");
        while(true){
            System.out.print("lütfen kulancı adı giriniz: ") ;          
             String kulancı=scanner.nextLine();
              System.out.print("lütfen parola giriniz: ") ;          
             String parola=scanner.nextLine();
              
             if(kulancı.equals(sys_kulancı_adı) && parola.equals(sys_parola)){
                 System.out.println(kulancı+"hoş geldiniz");
                break;}
             
             else if(kulancı.equals(sys_kulancı_adı) && !parola.equals(sys_parola)) {
                        System.out.print("  girdiniz parola yanlıştır");
                        giris_hakı-=1;
                        System.out.println( "kalan giriş hakı: " +  giris_hakı);}
             
               else if(!kulancı.equals(sys_kulancı_adı) && parola.equals(sys_parola)) {
                        System.out.println(" girdiniz kulancı adı yanlıştır");
                        giris_hakı-=1;   
                System.out.println("kalan giriş hakı: " + giris_hakı);}
               
               else  {
                        System.out.println("girdiniz parola ve kulancı adı  yanlıştır");
                        giris_hakı-=1;
                         System.out.println( "kalan giriş hakı: " + giris_hakı); } 
             
            if (giris_hakı==0) {
                System.out.println("giriş hakınız kalmadı");
                break;
            }
     
  
        
    }
   
}
    
}*/


/*

başla 
kulancıdan sayı al
ı sayı pozitif veya negatif oldunu ayır 
sonuç yazdır


public class NewClass2 {
    public static void cd (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
      int gir=scanner.nextInt();
      if(gir>0){
          System.out.println("girdiniz sayı pozitiftir");
      }
      else {
          System.out.println("girdiniz sayı negatif");
      }
    }
    }
   */





// kmde yakılan kuş

/*

public class exercises{
        
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("hoş geldiniz..ltfen sayı giriniz:");
    
    double km= scanner.nextDouble();
    System.out.println("kuruş");
     int kuruş= scanner.nextInt();
      System.out.println( km*kuruş);
}
   }  


*/