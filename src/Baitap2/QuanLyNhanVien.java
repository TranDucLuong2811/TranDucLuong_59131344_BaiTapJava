/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

import Baitap1.Nhanvien;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class QuanLyNhanVien implements IQuanLy
{
    private final List<Nhanvien> QL;

    public QuanLyNhanVien() 
    {
        QL = new ArrayList<>();
    }
    @Override
    public void them(Nhanvien nv) {
        QL.add(nv);
        //System.out.println("BaiTap2.QuanLy.them()" + nv.getThongTin());
    }

    @Override
    public void inDS() {
        for (int i = 0 ; i < QL.size(); i++){
            System.out.println("Nhan Vien " + (i + 1) + " : " + "\n" + QL.get(i).getThôngtin());
        }
    }
}


