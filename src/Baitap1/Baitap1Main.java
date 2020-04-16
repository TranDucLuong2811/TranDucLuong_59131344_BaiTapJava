/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author DELL
 */
public class Baitap1Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Nhân viên thứ nhất: ");
        Nhanvien nv1 = new Nhanvien("Nguyễn Văn A", 10, "Nha Trang",1000000, 200);
        System.out.println(nv1.getThôngtin());
        System.out.println("Nhân viên thứ hai: ");
        Nhanvien nv2 = new Nhanvien("Nguyễn Văn B", 20, "Hồ Chí Minh",2000000, 400);
        System.out.println(nv2.getThôngtin());
    }
}
