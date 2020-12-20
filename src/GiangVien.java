import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GiangVien {
    static final double THU_LAO_GIO = 90000;
    public static final String DINH_DANG_NGAY_THANG = "dd/MM/yyyy";
    private  String hoTen;
    private  String hocHam;
    private  String hocVi;
    private Date ngaySinh;
    Date ngayBatDau;

    public GiangVien(String ht, String hh, String hv, String  ns, String nbd) throws ParseException {
        this.hoTen = ht;
        this.hocHam = hh;
        this.hocVi = hv;
        SimpleDateFormat f = new SimpleDateFormat(DINH_DANG_NGAY_THANG);
        this.ngaySinh =f.parse(ns);
        this.ngayBatDau =f.parse(nbd);
    }

    public abstract double tinhTienLuong(double soGioLam);

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat(DINH_DANG_NGAY_THANG);
        String s = String.format("Họ tên %s\nHọc Hàm: %s\nHọc vị: %s" +
                "\nNgày Sinh: %s\nNgay bắt đầu làm %s\n"
                ,this.hoTen, this.hocHam, this.hocVi,f.format(this.ngaySinh),f.format(this.ngayBatDau));
        return s;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
}
