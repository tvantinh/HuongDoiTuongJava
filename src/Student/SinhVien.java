/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Student;

/**
 *
 * @author tjnk1
 */
abstract class SinhVien {

    private String hoTen;
    private String Nganh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNghanh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    public SinhVien()
    {
        
    }
    public SinhVien(String hoten, String nghanh) {
        this.hoTen = hoten;
        this.Nganh = nghanh;
    }
    abstract double Diem();
    public String HocLuc(double a)
    {
        if(a > 8)
            return "hoc luc Gioi";
        else if(a > 7)
            return "hoc luc Kha";
        else if(a>5)
            return "hoc luc Trung binh";
        else if(a>3)
            return "hoc luc Yeu";
        else
            return "hoc luc Kem";
    }
    
    public void xuat()
    {
        System.out.println("ho va ten: " + hoTen);
        System.out.println("Nghanh: " + Nganh);
        System.out.println("diem: " + Diem());
        System.out.println("hoc luc " + HocLuc(Diem()));
    }
}
