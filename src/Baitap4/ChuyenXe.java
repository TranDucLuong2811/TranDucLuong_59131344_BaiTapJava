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
public class ChuyenXe 
{
    private String MaSoChuyen;
    private String HoTenTaiXe;
    private String SoXe;
    private double DoanhThu;
    
    public ChuyenXe(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu)
    {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTaiXe = HoTenTaiXe;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public String getHoTenTaiXe() {
        return HoTenTaiXe;
    }

    public void setHoTenTaiXe(String HoTenTaiXe) {
        this.HoTenTaiXe = HoTenTaiXe;
    }

    public String getSoXe() {
        return SoXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    
    public String inCX()
    {
        return ("Mã số chuyến: " + MaSoChuyen +
                "\nHọ tên tài xế: " + HoTenTaiXe +
                "\nSố xe: " + SoXe +
                "\nDoanh thu" + DoanhThu);
    }
}
