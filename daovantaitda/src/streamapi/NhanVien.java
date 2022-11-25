package streamapi;

public class NhanVien {
    private String name;
    private double luong;
    private String maphong;

    public NhanVien() {
    }

    public NhanVien(String name, double luong, String maphong) {
        this.name = name;
        this.luong = luong;
        this.maphong = maphong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }
}
