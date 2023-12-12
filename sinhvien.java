package qlsv;
public class sinhvien {
    private String sinhvien_Ten;
    private String sinhvien_NgaySinh;
    private String sinhvien_GioiTinh;
    private String sinhvien_DiaChi;
    private float sinhvien_DiemToan;
    private float sinhvien_DiemVan;
    private float sinhvien_DiemAnh;
    private String sinhvien_tenlop;

    public sinhvien(String sinhvien_Ten,String sinhvien_tenlop, String sinhvien_NgaySinh, String sinhvien_GioiTinh ,String sinhvien_DiaChi,float sinhvien_DiemToan,float sinhvien_DiemVan,float sinhvien_DiemAnh) {

        this.sinhvien_Ten = sinhvien_Ten;
        this.sinhvien_NgaySinh = sinhvien_NgaySinh;
        this.sinhvien_GioiTinh = sinhvien_GioiTinh;
        this.sinhvien_DiaChi = sinhvien_DiaChi;
        this.sinhvien_DiemToan = sinhvien_DiemToan;                 
        this.sinhvien_DiemVan = sinhvien_DiemVan;
        this.sinhvien_DiemAnh = sinhvien_DiemAnh;
        this.sinhvien_tenlop = sinhvien_tenlop;
    }


    public String getSinhvien_Ten() {
        return sinhvien_Ten;
    }

    public void setSinhvien_Ten(String sinhvien_Ten) {
        this.sinhvien_Ten = sinhvien_Ten;
    }

    public String getSinhvien_NgaySinh() {
        return sinhvien_NgaySinh;
    }

    public void setSinhvien_NgaySinh(String sinhvien_NgaySinh) {
        this.sinhvien_NgaySinh = sinhvien_NgaySinh;
    }

    public String getSinhvien_GioiTinh() {
        return sinhvien_GioiTinh;
    }

    public void setSinhvien_GioiTinh(String sinhvien_GioiTinh) {
        this.sinhvien_GioiTinh = sinhvien_GioiTinh;
    }

    public String getSinhvien_DiaChi() {
        return sinhvien_DiaChi;
    }

    public void setSinhvien_DiaChi(String sinhvien_DiaChi) {
        this.sinhvien_DiaChi = sinhvien_DiaChi;
    }

    public float getSinhvien_DiemToan() {
        return sinhvien_DiemToan;
    }

    public void setSinhvien_DiemToan(float sinhvien_DiemToan) {
        this.sinhvien_DiemToan = sinhvien_DiemToan;
    }

    public float getSinhvien_DiemVan() {
        return sinhvien_DiemVan;
    }

    public void setSinhvien_DiemVan(float sinhvien_DiemVan) {
        this.sinhvien_DiemVan = sinhvien_DiemVan;
    }

    public float getSinhvien_DiemAnh() {
        return sinhvien_DiemAnh;
    }

    public void setSinhvien_DiemAnh(float sinhvien_DiemAnh) {
        this.sinhvien_DiemAnh = sinhvien_DiemAnh;
    }

    public String getSinhvien_tenlop() {
        return sinhvien_tenlop;
    }

    public void setSinhvien_tenlop(String sinhvien_tenlop) {
        this.sinhvien_tenlop = sinhvien_tenlop;
    }

public double tongdiem(){
    return sinhvien_DiemAnh+sinhvien_DiemToan+sinhvien_DiemVan;
}
public void   kiemtraxephang(){
    if(sinhvien_tenlop=="Toan" && tongdiem()>24 && sinhvien_DiemToan >=9){
        System.out.println("Sinh vien dat loai gioi");
    }
    else if(sinhvien_tenlop=="Van" && tongdiem()>24 && sinhvien_DiemAnh >=9){
        System.out.println("Sinh vien dat loai gioi");
    }
    else if(sinhvien_tenlop=="Anh" && tongdiem()>24 && sinhvien_DiemVan>=9){
        System.out.println("Sinh vien dat loai gioi");
    }
    else{
                System.out.println("Sinh vien khong dat loai gioi");
    }
  //  return tongdiem()>24 && (sinhvien_DiemToan >=9 || sinhvien_DiemAnh >=9 || sinhvien_DiemVan>=9);
}
}

