package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Word !!!!");
		
		String ortaMetin ="�lginizi �ekebilir";
		String altMetin = "Vade S�resi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.45;
		double dolarBugun = 18.45;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);
			
		}
		else {
			okYonu ="equals.svg";
			System.out.println(okYonu);

		}
		
		String[] krediler = {"H�zl� Kredi","Maa��n� Halkbanktan","Mutlu Emekli"};
		
		
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		

	}

}
