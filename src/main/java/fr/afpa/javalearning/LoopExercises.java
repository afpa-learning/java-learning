package fr.afpa.javalearning;

import java.util.ArrayList;

public class LoopExercises {
    

    /**
     * Dessine en console un carré de '#' en fonction d'un taille passée en paramètre.
     * 
     * Par exemple, pour une taille de 3 la fonction devra afficher :
     * ###
     * ###
     * ###
     * 
     * @param size Longueur d'un coté du carré 
     */
    public static void drawSquare(int size) {
        // TODO à compléter
        System.out.println("A compléter");
    }

    /**
     * Dessine en console un triangle rectangle de '#' qui dépend d'une hauteur passée en paramètre.
     * 
     * Par exemple, pour une taille de 4 la fonction devra afficher :
     * #
     * ##
     * ###
     * ####
     * 
     * @param height
     */
    public static void drawTriangle(int height) {
        // TODO à compléter
        System.out.println("A compléter");
    }


    /**
     * Dessine en console un triangle isocèle de '#' qui dépend d'une hauteur passée en paramètre.
     * 
     * Par exemple, pour une taille de 4 la fonction devra afficher :
     *    #
     *   ###
     *  #####
     * #######
     * 
     * @param height
     */
    public static void drawIsosceleTriangle(int height) {
        // TODO à compléter
    }


    /**
     * Retrouve et retourne l'index de la plus longue chaîne de caractères d'une ArrayList
     * 
     * @param strings Une liste de chaînes de caractères
     * @return L'index de la plus longue chaîne de caractères.
     */
    public static int findLongestString(String[] strings) {
        // index de la chaîne de caractères la plus longue
        // initialisation à -1
        int indexLongestString = -1;

        // TODO implémenter un boucle sur le tableau de String pour retrouver la chaîne la plus longue
        // rappel : la taille d'une chaîne de caractères peut être retrouvée en utilisant la méthode "length"


        return indexLongestString;
    }

    /**
     * Crée une liste de tous les nombres impaires retrouvés dans un tableau d'entiers
     * 
     * @param array Le tableau à traiter
     * @return La nouvelle liste
     */
    public static ArrayList<Integer> getOddValues(int[] array) {
        // instanciation de la ArrayList qui contiendra les résultats
        ArrayList<Integer> oddValues = new ArrayList<Integer>();

        // TODO implémenter une boucle pour retrouver les nombres impaires

        // pour ajouter des élément à une ArrayList, consultez ce lien -> https://www.w3schools.com/java/java_arraylist.asp

        return oddValues;
    }


    /**
     * Affiche un ensemble de mots dans un encadrés par des caractères '#'.
     * L'ensemble de mots sera passé en paramètre dans un tableau 1D de chaînes de caractères
     * 
     * Affichage attendu pour le tableau ["Bonjour", "le", "monde"]:
     * ###########
     * # Bonjour #
     * # le      #
     * # monde ! #
     * ###########
     * 
     * @param textToFrame Une liste contenant les mots à encadrée
     */
    public static void frameText(String[] textToFrame) {
        // TODO à compléter
    }


}
