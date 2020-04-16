/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

/**
 *
 * @author DELL
 */
public class ChuyenXeNoiThanh extends ChuyenXe
{
    private int SoTuyen;
    private double SoKm;
    
    public ChuyenXeNoiThanh(int SoTuyen, double SoKm, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu)
    {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.SoTuyen = SoTuyen;
        this.SoKm = SoKm;
    }

    public int getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(int SoTuyen) {
        this.SoTuyen = SoTuyen;
    }

    public double getSoKm() {
        return SoKm;
    }

    public void setSoKm(double SoKm) {
        this.SoKm = SoKm;
    }
    
    @Override
    public String inCX()
    {
        return super.inCX() +
                "\nSố tuyến: " + SoTuyen +
                "\nSố Km đi được: " + SoKm;
    }
}
