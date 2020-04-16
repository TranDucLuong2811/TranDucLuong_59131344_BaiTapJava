/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class QuanLyChuyenXe 
{
    List<ChuyenXe> DsChuyenXe;
    
    public QuanLyChuyenXe()
    {
        DsChuyenXe = new ArrayList<>();
    }
    
    public void ThemChuyenXe(ChuyenXe cx)
    {
        DsChuyenXe.add(cx);
    }
    
    public double TinhDoanhThuNoiThanh()
    {
        double t = 0;
        for (int i = 0; i < DsChuyenXe.size(); i++)
        {
            if (DsChuyenXe.get(i) instanceof ChuyenXeNoiThanh)
                t += DsChuyenXe.get(i).getDoanhThu();
        }
        return t;
    }
    
    public double TinhDoanhThuNgoaiThanh()
    {
        double t = 0;
        for (int i = 0; i < DsChuyenXe.size(); i++)
        {
            if (DsChuyenXe.get(i) instanceof ChuyenXeNgoaiThanh)
                t += DsChuyenXe.get(i).getDoanhThu();
        }
        return t; 
    }
    
    public double TinhTongDT()
    {
        double t = 0;
        for (int i = 0; i < DsChuyenXe.size(); i++)
        {
            t += DsChuyenXe.get(i).getDoanhThu();
        }
        return t;
    }
    
    public void InDSChuyenXe()
    {
        for (int i = 0; i < DsChuyenXe.size(); i++)
        {
            System.out.println("Chuyến xe thứ " + (i + 1)+ ": \n" + DsChuyenXe.get(i).inCX());
        }
    }
}
