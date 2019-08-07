package Zad1;

public class ArrayTest {
    public static void main(String[] args) {
        Array[] arrays = new Array[3];
        for (int i = 0; i < arrays.length; i++){
            do{
                arrays[i] = new Array();
            }while (arrays[i].arrayCheck(arrays, arrays[i]));
        }

        for (Array tab : arrays){
            System.out.println(tab.toString());
        }
    }
}
