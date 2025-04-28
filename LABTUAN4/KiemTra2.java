package labtuan4;

import java.util.Scanner;

class ChuyenXe extends Xe{
    private int msc;
    private String ten;
    private String noiden;
    private double doanhthu;
    
    public ChuyenXe(){
        super();
        this.msc = 0;
        this.ten = "";
        this.noiden = "";
        this.doanhthu = 1.0;
    }
    
    public ChuyenXe(String soxe, String loai, String ngaydk, boolean trthai, int msc, String ten, String noiden, double doanhthu){
        super(soxe, loai, ngaydk, trthai);
        this.msc = msc;
        this.ten = ten;
        this.noiden = noiden;
        this.doanhthu = doanhthu;
    }
    
    public void setMsc(int msc){
        this.msc = msc;
    }
    
    public int getMsc(){
        return msc;
    }
    public void setten(String Ten){
        this.ten = Ten;
    }
    
    public String getTen(){
        return ten;
    }
    public void setNoiDen(String noiden){
        this.noiden = noiden;
    }
    
    public String getNoiDen(){
        return noiden;
    }
    public void setDoanhThu(double doanhthu){
        this.doanhthu = doanhthu;
    }
    
    public double getDoanhThu(){
        return doanhthu;
    }
    
    @Override
    public void nhap(){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so chuyen: ");
        msc = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhap ten tai xe: ");
        ten = sc.nextLine();
        System.out.print("Nhap noi den: ");
        noiden = sc.nextLine();
        System.out.print("Nhap doanh thu: ");
        doanhthu = sc.nextDouble();
    }
    
    @Override
    public void in(){ 
        System.out.println("Ma so chuyen: " + msc);
        System.out.println("Ten tai xe: " + ten);
        System.out.println("Noi den: " + noiden);
        System.out.println("Doanh thu: " + doanhthu);
    }
}
public class KiemTra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong chuyen xe: ");
        int m = sc.nextInt();
        sc.nextLine(); 

        ChuyenXe[] ds = new ChuyenXe[m];

        for (int i = 0; i < m; i++) {
            System.out.println("\nNhap thong tin chuyen xe thu: " + (i + 1));
            ds[i] = new ChuyenXe();
            ds[i].nhap();
        }

        for (int i = 0; i < m; i++) {
            System.out.println("\nChuyen xe thu: " + (i + 1));
            ds[i].in();
        }

        for (int i = 0; i < m; i++) {
            if (!ds[i].getTrThai() || ds[i].getDoanhThu() < 100000) {
                System.out.println("Ma so chuyen bi huy: " + ds[i].getMsc());
            }
        }
    }
}
