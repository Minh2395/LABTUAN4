package labtuan4;
import java.util.Scanner;

class HangHoa{
    private String maHang;
    private String tenHang;
    private long donGia;
    
    public HangHoa(){
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
    }
    
    public HangHoa(String maHang, String tenHang, long donGia){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    
    public void setMaHang(String maHang1){
        this.maHang = maHang1;
    }
    
    public String getMaHang(){
        return maHang;
    }
    
    public void setTenHang(String tenHang1){
        this.tenHang = tenHang1;
    }
    
    public String getTenHang(){
        return tenHang;
    }
    
    public void setDonGia(long donGia1){
        this.donGia = donGia1;
    }
    
    public long getDonGia(){
        return donGia;
    }
}

class HangDienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;
    
    public HangDienMay(){
        super();
    }
    
    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGiaBaoHanh, int dienAp, int congSuat){
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGiaBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    
    public void setThoiGianBaoHanh(int thoiGianBaoHanh1){
        this.thoiGianBaoHanh = thoiGianBaoHanh1;
    }
    
    public int getThoiGianBaoHanh(){
        return thoiGianBaoHanh;
    }
    
    public void setDienAp(int dienAp1){
        this.dienAp = dienAp1;
    }
    
    public int getDienAp(){
        return dienAp;
    }
    
    public void setCongSuat(int congSuat1){
        this.congSuat = congSuat1;
    }
    
    public int getCongSuat(){
        return congSuat;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thoi gian bao hanh cua san pham: ");
        thoiGianBaoHanh = sc.nextInt();
        System.out.println("Nhap dien ap cua san pham: ");
        dienAp = sc.nextInt();
        System.out.println("Nhap cong suat cua san pham: ");
        congSuat = sc.nextInt();
    }
    
    public void xuat(){
        System.out.println("Ma hang: " + getMaHang());
        System.out.println("Ten hang: " + getTenHang());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Thoi gia bao hanh: " + thoiGianBaoHanh);
        System.out.println("Dien ap: " + dienAp);
        System.out.println("Cong suat: " + congSuat);
    }
}

class HangThucPham extends HangHoa{
    private String ngaySanXuat;
    private String ngayHetHan;
    
    public HangThucPham(){
        super();
    }
    
    public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan){
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    
    public void setNgaySanXuat(String ngaySanXuat1){
        this.ngaySanXuat = ngaySanXuat1;
    }
    
    public String getNgaySanXuat(){
        return ngaySanXuat;
    }
    
    public void setNgayHetHan(String ngayHetHan1){
        this.ngayHetHan = ngayHetHan1;
    }
    
    public String getNgayHetHan(){
        return ngayHetHan;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay san xuat cua san pham: ");
        ngaySanXuat = sc.nextLine();
        System.out.println("Nhap ngay het han cua san pham: ");
        ngayHetHan = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("Ma hang: " + getMaHang());
        System.out.println("Ten hang: " + getTenHang());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Ngay het han: " + ngayHetHan);
    }
}
public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HangDienMay dienmay = new HangDienMay("DM001", "Tivi", 5000000, 12, 220, 100);
        
        dienmay.nhap();
        
        dienmay.xuat();
        
        HangThucPham thucpham = new HangThucPham("TP001", "Gao", 20000, "01/03/2025", "01/09/2025");
        
        thucpham.nhap();
        
        thucpham.xuat();
    }
}
