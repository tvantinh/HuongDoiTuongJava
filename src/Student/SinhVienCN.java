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
public class SinhVienCN extends SinhVien{
    double Diem1;
    double Diem2;

    Scanner sc = new Scanner(System.in);
    
    public SinhVienCN(String hoten, String nghanh, double diem1, double diem2)
    {
        super(hoten, nghanh);
        this.Diem1 = diem1;
        this.Diem2 = diem2;
    }
    public SinhVienCN()
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
        System.out.println("Nhap Diem Maketting: ");
        this.Diem1 = sc.nextDouble();
        System.out.println("Nhap Diem Sales: ");
        this.Diem2 = sc.nextDouble();
    }
    @Override
    public double Diem() {
        return (2*Diem1+Diem2)/3;
    }
}
