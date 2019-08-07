package Zad1;

public class ArrayTest {
    public static void main(String[] args) {
        Array[] arrays = new Array[3];
        for (int i = 0; i < arrays.length; i++){
            Array tempArray = new Array();
//            do{
                tempArray.setArray();
//            }while (arrayCheck(arrays, tempArray));
            if (arrayCheck(arrays, tempArray))
                i--;
            else
            arrays[i] = tempArray;
        }
        for (Array tab : arrays){
            System.out.println(tab.toString());
        }
    }

    public static boolean arrayCheck (Array[] arrays, Array arr){
        for (Array tab :
                arrays){
            if (tab!=null && tab.hashCode()== arr.hashCode()){
                System.out.println("Podany element juz istnieje w tablicy");
                return true;
            }
        }
        return false;
    }
}
