package labtuan4;
import java.util.Scanner;

class Xe{
    private String soxe;
    private String loai;
    private String ngaydk;
    private boolean trthai;
    
    public Xe(){
        this.soxe = "";
        this.loai = "";
        this.ngaydk = "";
        this.trthai = true;
    }
    
    public Xe(String soxe, String loai, String ngaydk, boolean trthai) {
        this.soxe = soxe;
        this.loai = loai;
        this.ngaydk = ngaydk;
        this.trthai = trthai;
    }
    
    public Xe(Xe x){
        this.soxe = x.soxe;
        this.loai = x.loai;
        this.ngaydk = x.ngaydk;
        this.trthai = x.trthai;
    }
    
    public void setSoXe(String soXe){
        this.soxe = soXe;
    }
    
    public String getSoXe(){
        return soxe;
    }
    
    public void setLoai(String loai){
        this.loai = loai;
    }
    
    public String getLoai(){
        return loai;
    }
    public void setNgayDK(String ngaydk){
        this.ngaydk = ngaydk;
    }
    
    public String getNgayDK(){
        return ngaydk;
    }
    
    public void setTrThai(boolean trthai){
        this.trthai = trthai;
    }
    
    public boolean getTrThai(){
        return trthai;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so xe: ");
        soxe = sc.nextLine();
        System.out.println("Nhap loai xe: ");
        loai = sc.nextLine();
        System.out.println("Nhap ngay dang ky: ");
        ngaydk = sc.nextLine();
        System.out.println("Nhap trang thai: ");
        trthai = sc.nextBoolean();
    }
    
    public void in(){
        System.out.println("So xe: " + soxe);
        System.out.println("Loai xe: " + loai);
        System.out.println("Ngay dang ky: " + ngaydk);
        System.out.println("Trang thai: " + trthai);
    }
}

public class KiemTra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Xe x1 = new Xe("0001", "Ford", "01/01/2018", true);
        x1.nhap();
        x1.in();
        
        Xe x2 = new Xe(x1);
        System.out.println(x2);
    }
}
