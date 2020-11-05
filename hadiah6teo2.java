import java.util.Scanner;
class identitas
{
	public String nama;
	public String jurusan;
	public int nim;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama)
	{
		this.nama=nama;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan)
	{
		this.jurusan=jurusan;
	}
	public int getNim() {
		return nim;
	}
	public void setNim(int nim)
	{
		this.nim=nim;
	}
}

public class hadiah6teo2{
public static void main (String [] args) {
	Scanner masukan= new Scanner (System.in);
	identitas a = new identitas();
	System.out.print("Masukkan Nama = ");
	a.nama= masukan.nextLine();
	System.out.print("Masukkan Jurusan = ");
	a.jurusan= masukan.nextLine();
	System.out.print("Masukkan Nim = ");
	a.nim = masukan.nextInt();
	System.out.println(" Nama saya adalah "+a.getNama()+" Jurusan saya adalah "+a.getJurusan()+
	" dan Nim saya adalah "+a.getNim());
}
}