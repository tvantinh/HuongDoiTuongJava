/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tjnk1
 */
public class main {
    Scanner sc = new Scanner(System.in);
            
    public boolean KiemTraTenTrung(ArrayList<SinhVien> sv, String hoten)
    {
    
        for(SinhVien i : sv)
        {
            if(i.getHoTen().equals(hoten))
                return true;
        }
        return false;
    }
    public ArrayList<SinhVien> ThemSinhVien(ArrayList<SinhVien> ListSV)
    {
        int i;
        do{
        System.out.println("ban muon nhap: \n(1. sinhvienCN) \n(2.sinhvienCT) \n(0.Ngung lai)");
        i = sc.nextInt();
        switch(i){
            case 1 -> {
                SinhVienCN sv = new SinhVienCN();
                sv.NhapThongTinSinhVien();
                if(KiemTraTenTrung(ListSV,sv.getHoTen()))
                {
                    System.out.println("ten da bi trung vui long nhap lai thi sinh khac");
                    continue;
                }else{
                ListSV.add(sv);
                i++;}
            }
            case 2 -> {
                SinhVienCT sv = new SinhVienCT();
                sv.NhapThongTinSinhVien();
                if(KiemTraTenTrung(ListSV,sv.getHoTen()))
                {
                    System.out.println("ten da bi trung vui long nhap lai thi sinh khac");
                    continue;
                }else{
                ListSV.add(sv);
                i++;}
            }
            case 0 -> {
                break;
            }
        } 
        }while(i != 0);
        return ListSV;
    }
    public void xuatListSV(ArrayList<SinhVien> ListSV)
    {
        for(SinhVien i : ListSV)
        {
            System.out.println("Sinh vien: ");
            i.xuat();
            System.out.println("\n");
        }
    }
    public SinhVien SearchSV(ArrayList<SinhVien> ListSV, String hoten)
    {
        for(SinhVien i : ListSV)
        {
            if(i.getHoTen().equals(hoten))
                return i;
        }
        return null;
    }
    public boolean XoaSVTheoTen(ArrayList<SinhVien> ListSV, String hoten)
    {
        return ListSV.remove(SearchSV(ListSV,hoten));
    }
    public SinhVien XoaSVTheoViTri(ArrayList<SinhVien> ListSV, int i)
    {
        return ListSV.remove(i);
    }
    public void ThemDauMang(ArrayList<SinhVien> ListSV, SinhVien a)
    {
         ListSV.add(0, a);
    }
    public boolean Suaten(ArrayList<SinhVien>ListSV, String a)
    {
        for(SinhVien sv : ListSV)
        {
            if(sv.getHoTen().equals(a))
            {
                System.out.println("nhap ten moi cho Sinh Vien: ");
                sv.setHoTen(sc.nextLine());
                return true;
            }
        }
        return false;
    }
    
    public void sapxep(ArrayList<SinhVien>ListSV, Comparator<SinhVien> cp)
    {
        Collections.sort(ListSV, cp);
    }
    
    public static void main(String[] args) {
        ArrayList<SinhVien> sv = new ArrayList<>();
        main m = new main();
        sv = m.ThemSinhVien(sv);
        m.xuatListSV(sv);
        m.XoaSVTheoViTri(sv, 0);
        System.out.println("sau khi: ");
        m.xuatListSV(sv);
        m.sapxep(sv,Comparator.comparing(SinhVien::getHoTen));
    }


}
