package sifrekilit;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	int kazanansayi=0;
	int yercounter=0; int matchcounter=0;
	System.out.println("Kilit sifresi belirleyiniz:");
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int girilensayi= scan.nextInt();
	int girilenyuz,girilenon,girilenbir,varlikbir,varlikon,varlikyuz;
	varlikon=0; varlikbir=0; varlikyuz=0;
	girilenyuz = girilensayi/100;
	girilenon = (girilensayi%100)/10;
	girilenbir =(girilensayi%100)%10;
	//System.out.println(girilenyuz+" "+girilenon+ " "+ girilenbir +" ");
	
	while(yercounter!=3)
	{
		matchcounter=0; yercounter=0;
		varlikon=0; varlikbir=0; varlikyuz=0;
		System.out.println("Lutfen 3 basamakli bir sifre deneyiniz:");
		
		int denenensayi=scan.nextInt();
		kazanansayi=denenensayi;
		
		int denenenyuz,denenenon,denenenbir;
		denenenyuz = denenensayi/100;
		denenenon = (denenensayi%100)/10;
		denenenbir =(denenensayi%100)%10;
		//System.out.println(denenenyuz+" "+ denenenon+" "+denenenbir);
		if(girilenbir==denenenbir) {
			yercounter++;
		}
		if(girilenon==denenenon) {
			yercounter++;
		}
		if(girilenyuz==denenenyuz) {
			yercounter++;
		}
		
		if(denenenbir==girilenyuz && varlikyuz==0) {
			varlikyuz++;
			matchcounter++;
		}
		else if(denenenbir==girilenon && varlikon==0) {
			varlikon++;
			matchcounter++;
		}
		else if(denenenbir==girilenbir && varlikbir==0) {
			varlikbir++;
			matchcounter++;
		}
		
		if(denenenon==girilenyuz && varlikyuz==0) {
			varlikyuz++;
			matchcounter++;
		}
		else if(denenenon==girilenon && varlikon==0) {
			varlikon++;
			matchcounter++;
		}
		else if(denenenon==girilenbir && varlikbir==0) {
			varlikbir++;
			matchcounter++;
		}
		
		if(denenenyuz==girilenyuz && varlikyuz==0) {
			varlikyuz++;
			matchcounter++;
		}
		else if(denenenyuz==girilenon && varlikon==0) {
			varlikon++;
			matchcounter++;
		}
		else if(denenenyuz==girilenbir && varlikbir==0) {
			varlikbir++;
			matchcounter++;
		}
		System.out.println("Denemenizdeki "+matchcounter+" sayi sifrede bulunuyor.");
		System.out.println("Denemenizdeki "+yercounter+" sayi gercek yerinde bulunuyor.");
	}
	System.out.println("TEBRIKLER SIFREYI BULDUNUZ: "+ kazanansayi);
}
}
