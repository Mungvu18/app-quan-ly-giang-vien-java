import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.ParseException;

public class Test {
    public static void main(String[] args) {
        try {
            GiangVien gv2 = new GiangVienThinhGiang("Nguyễn Thị Bình","PGS","tiến sĩ","2/2/1980","12/2/2020","VTSS");
            GiangVien gv1 = new GiangVienCoHuu("Nguyễn Văn Duyệt","","tiến sĩ","2/2/1980","1/1/202",2.67);
            QuanLyGiangVien ql = new QuanLyGiangVien();
            ql.themGiangVien(gv1);
            ql.themGiangVien(gv2);
            System.out.println("== DANH SACH GIANG VIEN ");
            System.out.println(ql);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }

    }
}
