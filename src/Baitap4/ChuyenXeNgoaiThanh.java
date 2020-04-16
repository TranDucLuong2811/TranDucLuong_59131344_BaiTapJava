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
public class ChuyenXeNgoaiThanh extends ChuyenXe
{
    private String NoiDen;
    private int SoNgayDiDuoc;
    
    public ChuyenXeNgoaiThanh(String NoiDen, int SoNgayDiDuoc, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu)
    {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public int getSoNgayDiDuoc() {
        return SoNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int SoNgayDiDuoc) {
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }
    
    @Override
    public String inCX()
    {
        return super.inCX() +
                "\nNơi đến: " + NoiDen +
                "\nSố ngày đi được: " + SoNgayDiDuoc;
    }
}

