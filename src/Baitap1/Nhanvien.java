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
public class Nhanvien
{
    private String Tên;
    private int Tuổi;
    private String Địachỉ;
    private double Tiềnlương;
    private int Tổngsốgiờlàm;
    
    public Nhanvien()  //Constructor không tham số
    {
    }
    
    public Nhanvien(String Tên, int Tuổi, String Địachỉ, double Tiềnlương, int Tổngsốgiờlàm) //Constructor có tham số
    {
        this.Tên= Tên;
        this.Tuổi= Tuổi;
        this.Địachỉ= Địachỉ;
        this.Tiềnlương= Tiềnlương;
        this.Tổngsốgiờlàm = Tổngsốgiờlàm;
    }
    
    //Hàm get/set
    public String getTên()
    {
        return Tên;
    }
    public void setTên(String Tên)
    {
        this.Tên= Tên;
    }
    
    public int getTuổi()
    {
        return Tuổi;
    }
    public void setTuổi(int Tuổi)
    {
        this.Tuổi= Tuổi;
    }
    
    public String getĐịachỉ()
    {
        return Địachỉ;
    }
    public void setĐịachỉ (String Địachỉ)
    {
        this.Địachỉ= Địachỉ;
    }
    
    public double setTiềnlương()
    {
        return Tiềnlương;
    }
    public void setTiềnlương(double Tiềnlương)
    {
        this.Tiềnlương= Tiềnlương;
    }
    
    public int setTổngsốgiờlàm()
    {
        return Tổngsốgiờlàm;
    }
    public void setTổngsốgiờlàm(int Tổngsốgiờlàm)
    {
        this.Tổngsốgiờlàm= Tổngsốgiờlàm;
    }
    
    //Các phương thức
    public String getThôngtin()
    {
        return "Tên: " + Tên + "\n" 
                + "Tuổi: " + Tuổi + "\n"
                + "Địachỉ: " + Địachỉ + "\n"
                + "Tiềnlương: " + Tiềnlương + "\n"
                + "Tổngsốgiờlàm: " + Tổngsốgiờlàm + "\n"
                + "Thưởng: " + Tínhthưởng();
    }
    public double Tínhthưởng()
    {
        if (Tổngsốgiờlàm >= 200) return Tiềnlương *20/100;
        else if (Tổngsốgiờlàm < 100) return 0;
        else return Tiềnlương*10/100;
    }
}
