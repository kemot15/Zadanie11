package Zad1;

import java.util.Scanner;

public class Array {
    private int number;
    private String text;
    private static int id = 0;

    public Array() {
        id++;
    }

    public Array(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Array{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Array)) return false;

        Array array = (Array) o;

        if (number != array.number) return false;
        return text.equals(array.text);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + text.hashCode();
        return result;
    }

    public void setArray (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + id + " element (liczba, opis)");
        number = scanner.nextInt();
        scanner.nextLine();
        text = scanner.nextLine();
    }


}
