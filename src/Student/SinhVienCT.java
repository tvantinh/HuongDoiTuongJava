/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.Scanner;

/**
 *
 * @author tjnk1
 */
public class SinhVienCT extends SinhVien {

    double diemJava;
    double Diemhtml;
    double DiemCSS;

    Scanner sc = new Scanner(System.in);
    
    public SinhVienCT(String hoten, String nganh, double diem1, double diem2, double diem3) {
        super(hoten, nganh);
        this.DiemCSS = diem1;
        this.Diemhtml= diem2;
        this.diemJava = diem3;
    }
    public SinhVienCT()
    {
        
    }
    public void NhapThongTinSinhVien()
    {
        String ht,ng;
        System.out.println("Nhap ho ten: ");
        ht = sc.nextLine();
        this.setHoTen(ht);
        System.out.println("Nhap Nganh: ");
        ng = sc.nextLine();
        this.setNganh(ng);
        System.out.println("Nhap Diem CSS: ");
        this.DiemCSS = sc.nextDouble();
        System.out.println("Nhap Diem Html: ");
        this.Diemhtml = sc.nextDouble();
        System.out.println("Nhap Diem Java: ");
        this.diemJava = sc.nextDouble();
    }
    @Override
    public double Diem() {
        return (2*diemJava+Diemhtml+DiemCSS)/4;
    }
    

    
}
