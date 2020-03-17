public class Waktu{
	public static void main(String[] args){
			int detik = 7200;
			int menit= detik();
			System.out.println("Hasil Konversi : " + detik + " Detik = " + konversiDetikKeJam(menit) + " Jam : " + konversiDetikKeMenit(detik) + " Menit : " + detik + " Detik");
	}

public static int konversiDetikKeMenit(int detik){
	int hasil = 0;
	int menit = detik / 60;
	hasil = hasil + menit;
	return hasil;
	
	
}
public static int konversiDetikKeJam(int menit){
	int hasil = 0;
int jam = menit / 60;
	hasil = hasil + jam;
	return hasil;
}

}