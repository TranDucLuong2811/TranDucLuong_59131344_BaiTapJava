/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

import Baitap1.Nhanvien;
/**
 *
 * @author Admin
 */
public class Baitap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Nhanvien nv1 = new Nhanvien("Nguyễn Văn C", 30, "Ninh Thuận", 3000000, 100);
        Nhanvien nv2 = new Nhanvien("Nguyễn Văn D", 40, "Phú Quốc", 2500000, 500);
        Nhanvien nv3 = new Nhanvien("Nguyễn Văn E", 50, "Hà Nội", 1500000, 400);
        Nhanvien nv4 = new Nhanvien("Nguyễn Văn F", 60, "Hải Phòng", 3500000, 600);
        Nhanvien nv5 = new Nhanvien("Nguyễn Văn G", 70, "Đà Nẵng", 4000000, 50);
        
        QuanLyNhanVien Ql = new QuanLyNhanVien();
        Ql.them(nv1);
        Ql.them(nv2);
        Ql.them(nv3);
        Ql.them(nv4);
        Ql.them(nv5);
        Ql.inDS();
    }
    
}