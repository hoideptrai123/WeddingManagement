package model;

/**
 * Created by Vu Khac Hoi on 3/7/2017.
 */

public class Dichvu {

   private String Tendichvu;
   private int Soluong;

    public Dichvu() {
    }

    public Dichvu(String tendichvu, int soluong, int dongia) {
        Tendichvu = tendichvu;

        Soluong = soluong;
        Dongia = dongia;
    }

    public String getTendichvu() {
        return Tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        Tendichvu = tendichvu;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int dongia) {
        Dongia = dongia;
    }

    private int Dongia;
}
