
package BaiTap1;

public class CTHD 
{
     String sanPham;
     int soLuong;
     float donGia, chietKhau;

    public CTHD() 
    {
    }

    public CTHD(String sanPham, int soLuong, float donGia, float chietKhau) 
    {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getSanPham() 
    {
        return sanPham;
    }

    public void setSanPham(String sanPham) 
    {
        this.sanPham = sanPham;
    }

    public int getSoLuong() 
    {
        return soLuong;
    }

    public void setSoLuong(int soLuong) 
    {
        this.soLuong = soLuong;
    }

    public float getDonGia() 
    {
        return donGia;
    }

    public void setDonGia(float donGia) 
    {
        this.donGia = donGia;
    }

    public float getChietKhau() 
    {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) 
    {
        this.chietKhau = chietKhau;
    }
         
}
