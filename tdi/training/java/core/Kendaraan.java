package tdi.training.java.core;

public class Kendaraan
{
    private Integer jumlahRoda = 4;
    private String pabrik ;

    public Integer getJumlahRoda(){
        return this.jumlahRoda;
    }

    public void setJumlahRoda(Integer x){
        this.jumlahRoda = x;
    }

    public String getNamaPabrik(){
        return this.pabrik;
    }

    public void setNamaPabrik(String pabrik){
        this.pabrik = pabrik;
    }
}