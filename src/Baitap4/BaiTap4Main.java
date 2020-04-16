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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ChuyenXeNgoaiThanh CXNgoaiT1 = new ChuyenXeNgoaiThanh("Bắc",1 , "Ngoai1", "Nguyễn Văn A", "1", 300000);
        ChuyenXeNgoaiThanh CXNgoaiT2 = new ChuyenXeNgoaiThanh("Trung", 2, "Ngoai2", "Nguyễn Văn B", "2", 400000);
        ChuyenXeNgoaiThanh CXNgoaiT3 = new ChuyenXeNgoaiThanh("Nam",3 , "Ngoai3", "Nguyễn Văn C", "3", 500000);
        
        ChuyenXeNoiThanh CXNoiT1 = new ChuyenXeNoiThanh(1, 2, "Noi1", "Nguyễn Văn D", "11", 190);
        ChuyenXeNoiThanh CXNoiT2 = new ChuyenXeNoiThanh(2, 3, "Noi2", "Nguyễn Văn E", "22", 390);
        ChuyenXeNoiThanh CXNoiT3 = new ChuyenXeNoiThanh(3, 1, "Noi3", "Nguyễn Văn F", "33", 120);
       
        //Tạo quản lý chuyến xe
        QuanLyChuyenXe ql1 = new QuanLyChuyenXe();
        
        ql1.ThemChuyenXe(CXNgoaiT1);
        ql1.ThemChuyenXe(CXNgoaiT2);
        ql1.ThemChuyenXe(CXNgoaiT3);   
        
        ql1.ThemChuyenXe(CXNoiT1);
        ql1.ThemChuyenXe(CXNoiT2);
        ql1.ThemChuyenXe(CXNoiT3);
        
        //In thông tin từng chuyến xe
        ql1.InDSChuyenXe();
        
        //Tổng doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: " + ql1.TinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: " + ql1.TinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu các chuyến xe: " + ql1.TinhTongDT());
    }
    
}
