
package BaiTap1;

import java.util.Date;

public class HoaDonHeader 
{
    String maHoaDon, tenKhachHang;
    Date ngayBan;
    
    public HoaDonHeader() 
    {
    }

    public HoaDonHeader(String maHoaDon, String tenKhachHang, Date ngayBan) 
    {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayBan = ngayBan;
    }

    public String getMaHoaDon() 
    {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) 
    {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() 
    {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) 
    {
        this.tenKhachHang = tenKhachHang;
    }

    public Date getNgayBan() 
    {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) 
    {
        this.ngayBan = ngayBan;
    }

}
