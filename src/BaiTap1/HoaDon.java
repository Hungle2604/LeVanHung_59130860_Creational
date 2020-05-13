
package BaiTap1;
import java.util.ArrayList;

public class HoaDon 
{
    HoaDonHeader header = new HoaDonHeader();
    ArrayList<CTHD> chiTiet = new ArrayList<>();

    public HoaDon(Builder builder) 
    {
        this.header = builder.header;
        this.chiTiet = builder.chiTiet;
    }
   
    public static class Builder
    {
        HoaDonHeader header = new HoaDonHeader();
        ArrayList<CTHD> chiTiet = new ArrayList<>();

        public Builder() 
        {
        }
        
        public Builder addHoaDon(HoaDonHeader Header)
        {
            this.header = Header;
            return this;
        }
        
        public Builder addChiTietHoaDon(CTHD listHD)
        {
            this.chiTiet.add(listHD);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }

    }

    @Override
    public String toString() 
    {
       String inHD ="" ;
       for(int i = 0; i < chiTiet.size() ; i++)
       {
              inHD = "\n San Pham: "   +chiTiet.get(i).getSanPham()
                    +"\n So Luong: "  +chiTiet.get(i).getSoLuong()
                    +"\n Don Gia: "   +chiTiet.get(i).getDonGia()
                    +"\n Chiet Khau: "+chiTiet.get(i).getChietKhau();
       }
       return inHD;
    }
    
    public String hienThiHDH()
    {
        return "Thong tin hoa hoa don   :"
               +"\nMa Hoa Don: " + header.getMaHoaDon() +
                "\nTen Khach Hang: " + header.getTenKhachHang() +
                "\nNgay Ban: " + header.getNgayBan()
               +"\nDanh Sach Cac Loai San Pham: " + toString();
    }

}

