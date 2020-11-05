import java.util.Scanner;
class lingkaran
{
	public int r;
	public double phi;
	
	public int getR() {
		return r;
	}
	public void setR(int r) 
	{
		this.r=r;
	}
	public double getPhi() {
		return phi;
	}
	public void setPhi(double phi)
	{
		this.phi=phi;
	}
}

class kubus
{
	public int s;
	public int getS() {
		return s;
	}
	public void setS(int s)
	{
		this.s=s;
	}
}

public class hadiah6teo1 {
	public static void main (String [] args) {
		Scanner masukan = new Scanner (System.in);
		lingkaran l = new lingkaran();
		kubus k= new kubus();
		double luas;
		int volume;
		System.out.println("Luas Lingkaran");
		System.out.print("Jari-jari Lingkaran = ");
		l.r= masukan.nextInt();
		l.setPhi(3.14);
		luas = l.getPhi() * l.r *l.r;
		System.out.println("Luas Lingkaran = "+luas);
		System.out.println();
		System.out.println("Volume Kubus");
		System.out.print("Panjang Sisi Kubus = ");
		k.s= masukan.nextInt();
		volume= k.s * k.s * k.s;
		System.out.println("Volume Kubus= "+volume);
	}
}