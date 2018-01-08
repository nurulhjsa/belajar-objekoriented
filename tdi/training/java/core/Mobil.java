package tdi.training.java.core;

public class Mobil extends Kendaraan
{
    public String nama;

    public void setNama(String nama){
        System.out.println(jumlahRoda);
        this.nama = nama;
    }

    public String nama(){
        return this.nama;
    }

    public static void main (String [] args){
        Mobil honda = new Mobil();
        honda.setNama ("Honda Mobilio");

        System.out.println(honda.nama());
    }
}