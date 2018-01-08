package tdi.training.java.core.model;

import tdi.training.java.core.Kendaraan;

public class Motor extends Kendaraan
{
    public String getNamaPabrik(){
        return "Yamaha";
    }

    public void setNamaPabrik(String pabrik){
        super.setNamaPabrik("Kendaraan belum di isi!");
        System.out.println(
            String.format("dari kelas motor : %s", this.getNamaPabrik())
        );
        System.out.println(
            String.format("dari kelas kendaraan : %s", super.getNamaPabrik())
        );
    }

    public static void main (String [] args){
        Motor yamaha = new Motor();
        yamaha.setNamaPabrik(yamaha.getNamaPabrik());
    }
}