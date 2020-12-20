import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class QuanLyGiangVien {
    private List<GiangVien> ds;

    public List<GiangVien> getDs() {
        return ds;
    }

    public void setDs(List<GiangVien> ds) {
        this.ds = ds;
    }

    public QuanLyGiangVien() {
        this.ds = new ArrayList<>();
    }
    public void themGiangVien(GiangVien gv){
        this.ds.add(gv);
    }
    public void xoaGiangVien(GiangVien gv){
        for (GiangVien giangVien: ds) {
            if(gv.equals(giangVien)){
                this.ds.remove(gv);
                System.out.println("Giảng viên đã được xóa");
            }
        }
        System.out.println("Giang vien bạn cần xóa không có trong danh sách");
    }
    public QuanLyGiangVien traCuu(String kw){
        QuanLyGiangVien k = new QuanLyGiangVien();
        kw.toLowerCase();
        for (GiangVien gv: ds) {
            if(gv.getHoTen().toLowerCase().contains(kw)||gv.getHocHam().toLowerCase().contains(kw)
                    ||gv.getHocVi().toLowerCase().contains(kw))
                k.themGiangVien(gv);
            return k;
        }
        return k;
    }

    @Override
    public String toString() {
        String s ="";
        for (GiangVien gv: ds) {
            s += gv +"\n"+"------------------"+"\n";
        }
        return s;
    }
}
