import java.text.ParseException;

public class GiangVienThinhGiang extends GiangVien{
    private String noiCongTac;
    public GiangVienThinhGiang(String ht,String hh, String hv, String ns, String nbd, String noiCT) throws ParseException {
        super(ht,hh,hv,ns,nbd);
        this.noiCongTac = noiCT;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    @Override
    public double tinhTienLuong(double soGioLam) {
        return 0;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += String.format("Nơi công tác: %s\n", this.noiCongTac);
        return s;
    }
}
