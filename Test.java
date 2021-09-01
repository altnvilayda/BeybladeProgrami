
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        
        System.out.println("Beyblade Programına hoşgeldiniz..");
        System.out.println("Çıkış için q a basın..");
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi beyblade i üretmek istiyorsunuz? ");
            String islem = scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else{
                beybladeFabrikasi fabrika = new beybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if(beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.KutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
