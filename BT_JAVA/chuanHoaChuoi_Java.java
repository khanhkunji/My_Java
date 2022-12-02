package SinhVien_1;

public class chuanHoaChuoi_Java {
	public String chuanHoaChuoi(String ht) {
		String kq ="";
		ht = ht.toLowerCase();
		String[] arr = ht.split(" ");
		for(String s : arr) {
			if(!(s.equals(" ")) && !s.equals(null)) {
				kq += String.valueOf(s.charAt(0)).toUpperCase()+s.substring(1)+ " ";
			}
		}
		if(!kq.equals("") && kq.equals(null)) {
			kq = kq.substring(0,kq.length()-1);
		}
		
		return kq;
		
	}
}
