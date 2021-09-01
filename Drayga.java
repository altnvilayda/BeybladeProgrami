
public class Drayga extends  Beyblade{
    private String kutsalCanavar;
    
    public Drayga(String beybladeci, int donusHizi, int saldiriGücü, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGücü);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {
       System.out.println(getBeybladeci() + " " + kutsalCanavar + " 'ı ortaya çıkarıyor.");
       System.out.println(getBeybladeci() + " 'ın Saldırısı: Kaplan Pençesi");
    }
    
}
