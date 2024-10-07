package Frm9_3;

import java.io.Serializable;

public class LienHe implements Serializable{
	String hoTen;
	 String dtdd;
	 String hinh; 
	 public LienHe(String hoTen, String dtdd, String hinh) {
	 this.hoTen = hoTen;
	 this.dtdd = dtdd;
	 this.hinh = hinh;
	 }

	 public LienHe() {
	 }
	 public String getHoTen() {
	 return hoTen;
	 }
	 public void setHoTen(String hoTen) {
	 this.hoTen = hoTen;
	 }
	 public String getDtdd() {
	 return dtdd;
	 }
	 public void setDtdd(String dtdd) {
	 this.dtdd = dtdd;
	 }
	 public String getHinh() {
	 return hinh;
	 }
	 public void setHinh(String hinh) {
	 this.hinh = hinh;
	 } 
}
