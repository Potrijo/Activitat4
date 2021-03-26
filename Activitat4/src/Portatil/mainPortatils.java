package Portatil;

import java.util.ArrayList;						// Llibreria ArrayList
import java.util.Scanner;						// Llibreria Scanner
public class mainPortatils {					
	public static void main(String[] args) {
		/***Variables & Instances ***/
		ArrayList<PC> llistaPortatils = new ArrayList<PC>();	// Creació arrayList amb el tipus objecte Portatil
		Scanner key = new Scanner(System.in);				// Instància de Scanner
		boolean stateMenuInicial = false;					// Al passar a true el programa finalitzarà
		int escollirMenu;									// Variable per escollir menú
		String marca;										// Atributs per omplir al objecte Portartil: marca, nomPc, preu, ram i memDisk
		String nomPc;
		double preu;
		double ram;
		double memDisk;
		int escollirEquip;									// A la segona opció del menú podem escollir un dels equips introduïts
		int portatilMesCar = 0;								// Varaible on guardem l'índex del portàtil més car
		
		while(!stateMenuInicial) {
			/*** MENÚ DEL PROGRAMA ***/
			System.out.println("Menú del programa:");
			System.out.println("1. Afegir equip");
			System.out.println("2. Mostrar llista d'equips");
			System.out.println("3. Mostrar equip més car");
			System.out.println("4. Sortir del programa");
			
			/*** ESCOLLIR MENÚ ***/
			escollirMenu = key.nextInt();
			switch (escollirMenu) {
			  /*** AFEGIR PORTÀTIL ***/
			  case 1:
				  System.out.println("Introdueïx la marca del pc:");
				  key.nextLine();
				  marca = key.nextLine();
				  System.out.println("Nom del pc:");
				  nomPc = key.nextLine();
				  System.out.println("Preu:");
				  preu = key.nextDouble();
				  System.out.println("RAM:");
				  ram = key.nextDouble();
				  System.out.println("Disk memoxry");
				  memDisk = key.nextDouble();
				  llistaPortatils.add(new PC(marca, nomPc, preu, ram, memDisk));	// Crea l'objecte portàtil on afegim totes les característiques del portàtil anteriors
				  System.out.println(llistaPortatils.toString());	// Mostrem el contingut
				  break;
				  
			  /*** EQUIP EN CONCRET ***/
			  case 2:
				  if(llistaPortatils.size() == 0)	System.out.println("No hi ha cap equip a la llista");	// Si l'arrayList està buïda
				  else {
				  System.out.println("Escollir número equip introduït:");
				  escollirEquip = key.nextInt();
				  System.out.println(llistaPortatils.get(escollirEquip)); // Mostra tots els paràmetres de l'equip escollit
				  }
				  break;
				  
			  /*** PORTÀTIL MÉS CAR ***/  
			  case 3:
				  if(llistaPortatils.size() == 0)	System.out.println("No hi ha cap equip a la llista");	// Si l'arrayList està buïda
				  else {
				  System.out.println("L'equip més car:");
				  portatilMesCar = expensiveLaptop(llistaPortatils);		// Cridem el mètode que calcula el portatil més car
				  System.out.println("Equip número: " + portatilMesCar);	// Index portàrtil més car
				  System.out.println("Preu: " + llistaPortatils.get(portatilMesCar));	// Preu portàtil més car
				  }
				  break;
				  
			  /*** FI DEL PROGRAMA ***/
			  case 4:
				  System.out.println("Adeu");
				  stateMenuInicial = true;	// Canviem l'estat del while inicial i finalitzem el programa
				  break;
			  /*** CAP DE LES QUATRE NÚMEROS ESCOLLITS ***/
			  default:
				  System.out.println("Torna a provar un número entre 1-4");
				  break;
			}
			
			
		}
		
		key.close();
	}
	
	/*** METODES ***/
	/**
	 * Calcula l'índex del portàtil més car
	 * @param llistaPortatils
	 * @return índex portàtil més car
	 */
	public static int expensiveLaptop(ArrayList <PC> llistaPortatils) {
		int portatilMesCar = 0;	
		for (int i = 0; i < llistaPortatils.size(); i++) {
			  if(llistaPortatils.get(i).getPreu() > llistaPortatils.get(portatilMesCar).getPreu() )
				  portatilMesCar = i;
		  }
		return portatilMesCar;
	}
}
