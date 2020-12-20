import java.text.ParseException;

public class GiangVienCoHuu extends GiangVien{
    final double LUONG_CO_BAN = 1300000;
    private  double heSoLuong;
    public GiangVienCoHuu(String ht,String hh, String hv, String ns,
                          String nbd, double heSo) throws ParseException {
        super(ht,hh,hv,ns,nbd);
        this.heSoLuong = heSo;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhTienLuong(double soGioLam) {
        return soGioLam*THU_LAO_GIO+heSoLuong*LUONG_CO_BAN;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += String.format("Hệ số lương: %s.2f", this.heSoLuong);
        return s;
    }
}
