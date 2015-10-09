package lletres;

import java.util.Scanner;

public class ContarLletres {

private static Scanner llegir;

public static void main(String[] args) {
		
	String frase;
	
	System.out.println("Escriu una frase.");
	llegir = new Scanner(System.in);
	frase = llegir.nextLine();
		
		int[] caracters = new int[26];
        for (int i=0;i<frase.length();i++){
            char letra = frase.charAt(i);
            if(Character.isUpperCase(letra)){
                letra = Character.toLowerCase(letra);
            }
            if ((letra>='a' && letra <='z')){
                caracters[letra -'a']++;
            }if(letra>= '0' && letra<= '9'){
                System.out.println(letra+ " es un numero");
            }
        }
        for (int i=0;i<caracters.length;i++){
            if(caracters[i]>1){
                System.out.println((char) (i+'a')+ " surt: "+ caracters[i]+ " vegades");
            }if (caracters[i] == 1){
                System.out.println((char) (i+'a')+ " surt: "+ caracters[i]+ " vegada");
            }
        }
	}
}
//comentari copia de treball jaja
