package qlsv;
import java.util.Scanner;

public class main{
    public static  void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Nhập thông tin sinh viên:");
        System.out.println("Nhập Tên:");
                String Ten= scanner.nextLine();
        System.out.println("Nhập tên lớp:");
                String TenLop= scanner.nextLine();
        System.out.println("Nhập Ngày Sinh:");
                String NgaySinh= scanner.nextLine();

        System.out.println("Nhập Giới Tính:");
                String GioiTinh= scanner.nextLine();

        System.out.println("Nhập Địa Chỉ:");
                String DiaChi= scanner.nextLine();

        System.out.println("Nhập Điểm Toán:");
                float DiemToan= scanner.nextFloat();

        System.out.println("Nhập Điểm Văn:");
                float DiemVan= scanner.nextFloat();

        System.out.println("Nhập Điểm Anh:");
                float DiemAnh= scanner.nextFloat();        


        sinhvien sinhVien= new sinhvien(Ten, TenLop, NgaySinh, GioiTinh, DiaChi, DiemToan, DiemVan, DiemAnh);
        
        sinhVien.kiemtraxephang();
                // if(sinhVien.kiemtraxephang()){
                //         System.out.println("Sinh vien dat loai gioi");
                // }
                // else{
                //         System.out.println("sinh vien khong dat loai gioi");
                // }
    }

}