import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double k1,k2,k3,u,a;
		try (Scanner giris = new Scanner(System.in)) {
			System.out.print("Lütfen 1.Kenar Uzunlğunu Giriniz : ");
			k1=giris.nextDouble();
			
			System.out.print("Lütfen 2.Kenar Uzunlğunu Giriniz : ");
			k2=giris.nextDouble();
			
			System.out.print("Lütfen 3.Kenar Uzunlğunu Giriniz : ");
			k3=giris.nextDouble();
			
			u=(k1+k2+k3)/2;
			
			System.out.println("Kenar Uzunluklarını Girdiğiniz Üçgenin Çevresi = "+2*u);
			
			a=u*(u-k1)*(u-k2)*(u-k3);
			System.out.print("Kenar Uzunluklarını Girdiğiniz Üçgenin Alanı = "+Math.sqrt(a));
		}
		

	}

}
