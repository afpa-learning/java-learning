package fr.afpa.javalearning;

import java.util.ArrayList;
import java.util.Arrays;
public class App {


	public static void main(String[] args) throws Exception {

		System.out.println("----- Série d'exercices sur les boucles ----");

		startDrawSquareTest(); // à commenter ou décommenter en fonction de ce que vous voulez tester 
		// startDrawIsosceleTriangleTest();
		// startFindLongestStringTest();
		// startGetOddValuesTest();
		// startFrameTextTest();
	}

	/**
	 * Fonction qui teste "drawSquare"
	 */
	public static void startDrawSquareTest() {
		System.out.println("-- Dessin de carré");
		System.out.println("- Taille 4 :");
		LoopExercises.drawSquare(4);

		System.out.println("- Taille 6 :");
		LoopExercises.drawSquare(6);
	}

	
	/**
	 * Fonction qui teste "drawRectangleTriangle"
	 */
	public static void startDrawRectangleTriangleTest() {
		System.out.println("\n-- Dessin de triangle rectangle");
		System.out.println("- Hauteur 3 :");
		LoopExercises.drawTriangle(3);

		System.out.println("- Hauteur 5 :");
		LoopExercises.drawTriangle(5);
	}

	/**
	 * Fonction qui teste "drawIsosceleTriangle"
	 */
	public static void startDrawIsosceleTriangleTest() {
		System.out.println("\n-- Dessin de triangle isocèle");
		System.out.println("- Hauteur 3 :");
		LoopExercises.drawIsosceleTriangle(3);

		System.out.println("- Hauteur 5 :");
		LoopExercises.drawIsosceleTriangle(5);

	}

	/**
	 * Fonction qui teste "findLongestString"
	 */
	public static void startFindLongestStringTest() {
		System.out.println("\n-- Recherche de l'index de la plus grande chaîne de caractères");
		// premier jeu de test
		String[] testArray1 = {"Vive", "les", "boucles"};

		// appel de la fonction à tester
		int indexLongestFound = LoopExercises.findLongestString(testArray1);
		if (indexLongestFound == 2) {
			System.out.println("Index correctement retrouvé");
		} else {
			System.out.println("Mauvais index");
		}


		String[] testArray2 = {"FOR", "DO..WHILE", "WHILE", "FOREACH"};
		// appel de la fonction à tester
		indexLongestFound = LoopExercises.findLongestString(testArray2);
		if (indexLongestFound == 1) {
			System.out.println("Index correctement retrouvé");
		} else {
			System.out.println("Mauvais index");
		}

	}

	/**
	 * Fonction qui teste "findLongestString"
	 */
	public static void startGetOddValuesTest() {
		System.out.println("\n-- Recherche des valeurs impaires");
		int[] arrayTest = {1, 2, 3, 4, 5, 6, 7};
		int[] expectedResult = {1, 3, 5, 7};

		// appel de la fonction et récupération du résultat
		ArrayList<Integer> oddValuesFound = LoopExercises.getOddValues(arrayTest);

		// transformation de l'objet de ArrayList en un tableau 1D de type primitifs
		// permet de faciliter la comparaison grâce à la métode "Arrays.equals"
		int[] oddValuesFoundArray = oddValuesFound.stream().mapToInt(Integer::intValue).toArray();

		if (Arrays.equals(oddValuesFoundArray, expectedResult)) {
			System.out.println("Valeurs impaires correctement retrouvées");
		} else {
			System.out.println("Problème lors de la recherches de valeurs impaires");
		}
	}

	/**
	 * Fonction qui teste "frameText"
	 */
	public static void startFrameTextTest() {
		System.out.println("\n-- Encadrement de texte");

		String[] strings = {"Bonjour", "le", "monde"};

		LoopExercises.frameText(strings);
	}
}
