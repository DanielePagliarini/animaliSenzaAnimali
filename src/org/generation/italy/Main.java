package org.generation.italy;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 ArrayList<String> mammiferi = new ArrayList<>();
	        ArrayList<String> pesci = new ArrayList<>();
	        ArrayList<String> rettili = new ArrayList<>();
	        ArrayList<String> anfibi = new ArrayList<>();
	        ArrayList<String> uccelli = new ArrayList<>();
	        String animale, risposta1, risposta2, risposta3, risposta4, risposta5, ripetere;
	        do {
	            System.out.print("Inserisci il nome dell'animale: ");
	            animale = sc.nextLine();

	            System.out.print("1. Ha il pelo e allatta? (rispondi si o no): ");
	            risposta1 = sc.nextLine();
	            if (risposta1.equals("si")) {
	                mammiferi.add(animale);
	            }

	            System.out.print("2. Ha le penne e depone le uova? (rispondi si o no): ");
	            risposta2 = sc.nextLine();
	            if (risposta2.equals("si")) {
	                uccelli.add(animale);
	            }

	            System.out.print("3. Ha le scaglie e può strisciare o camminare? (rispondi si o no): ");
	            risposta3 = sc.nextLine();
	            if (risposta3.equals("si")) {
	                rettili.add(animale);
	            }

	            System.out.print("4. Può vivere sia in acqua che sulla terra? (rispondi si o no): ");
	            risposta4 = sc.nextLine();
	            if (risposta4.equals("si")) {
	                anfibi.add(animale);
	            }

	            System.out.print("5. Ha le scaglie e vive in acqua? (rispondi si o no): ");
	            risposta5 = sc.nextLine();
	            if (risposta5.equals("si")) {
	                pesci.add(animale);
	            }

	            System.out.print("Vuoi inserire un altro animale? (rispondi si o no): ");
	            ripetere=sc.nextLine();
	        } while (ripetere.equals("si"));

	   
	        System.out.print("mammiferi: ");
			for(int i=0;i<mammiferi.size();i++)
				System.out.println(mammiferi.get(i)+ " ");
			System.out.print("pesci: ");
			for(int i=0;i<pesci.size();i++)
				System.out.println(pesci.get(i)+ " ");
			System.out.print("rettili: ");
			for(int i=0;i<rettili.size();i++)
				System.out.println(rettili.get(i)+ " ");
			System.out.print("anfibi: ");
			for(int i=0;i<anfibi.size();i++)
				System.out.println(anfibi.get(i)+ " ");
			System.out.print("uccelli: ");
			for(int i=0;i<uccelli.size();i++)
				System.out.println(uccelli.get(i)+ " ");
			
	        

	        sc.close();
		
	}

}
