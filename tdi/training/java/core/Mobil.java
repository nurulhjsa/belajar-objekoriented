package tdi.training.java.core;

public class Mobil extends Kendaraan
{
    public String nama;

    public void setNama(String nama){
        System.out.println(jumlahRoda);
        this.nama = nama;
    }

    public String getNamaPabrik(){
        return super.getNamaPabrik();
    }

    public void setNama(){
        System.out.println(jumlahRoda);
        this.nama = "Mitsubitsi" ;
    }

    public String nama(){
        return this.nama;
    }

    public static void main (String [] args){
        Mobil honda = new Mobil();
        honda.setNama ("Honda Mobilio");
        System.out.println(honda.nama());

        honda.setNamaPabrik("Astra Honda");
        System.out.println(
        String.format("nama pabrik %s", honda.getNamaPabrik())
        );
    }
}