package Zad1;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Array[] arrays = new Array[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrays.length; i++){
            boolean check = false;
            arrays[i] = new Array();
            do{
                System.out.println("Podaj " + (i+1) + " element (liczba, opis)");
                arrays[i].setNumber(scanner.nextInt());
                scanner.nextLine();
                arrays[i].setText(scanner.nextLine());
                for (int j = 0; j < arrays.length; j++){
                    if (i!=j){
                        if (arrays[i].equals(arrays[j])){
                            check = true;
                            System.out.println("Podany element istnieje juz w tablicy " + (j+1) + ", prosze wprowadzic inne dane");
                            break;
                        }
                        else check = false;
                    }
                }
            }while (check==true);
        }
        scanner.close();
        for (Array tab : arrays){
            System.out.println(tab.toString());
        }
    }
}
