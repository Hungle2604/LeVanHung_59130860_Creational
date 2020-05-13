
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MainBT1 {

    public static void main(String[] args) throws ParseException 
    {
       HoaDonHeader hoadonHeader1 = new HoaDonHeader
        ("HD01","Le Van Hung",new SimpleDateFormat("dd/mm/yy").parse("26/04/1999"));
        CTHD hd1 = new CTHD("HD1", "Bot Giat OMO", 10, 15000, 0.05f);
        CTHD hd2 = new CTHD("HD2", "Tan Nhiet LapTop", 3, 260000, 0.1f);
        CTHD hd3 = new CTHD("HD2", "SSD 512 GB", 1, 700000, 0.2f);
       HoaDon hoaDon2 = new HoaDon.Builder()
               .addHoaDon(hoadonHeader1)
               .addChiTietHoaDon(hd1)
               .addChiTietHoaDon(hd2)
               .addChiTietHoaDon(hd3)
               .build();
        System.out.println(hoaDon2.hienThiHDH());
    }   
}
