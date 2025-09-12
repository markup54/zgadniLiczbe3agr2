import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //typy proste
        //z malej litery, tylko zmienne a nie obiekty
        //nie mają metod
        //typy calkowite
        int liczba = 23;
        long liczba2 = 12345;
        short liczba5 = 123;
        byte liczba6 = 8;
        System.out.println(liczba2);
        //typy zmiennoprzecinkowe, liczby rzeczywiste z ułamkiem
        float liczba3 = 12.45f; //musi byc z litera f
        double liczba4 =3.12345678965;
        //typ znakowy
        char znak = 'a'; //znaki w apostrofach
        //typ logiczny
        boolean czyTak = true;

        //Napisz program w którym zgadniesz liczbę
        int liczbaDoZgadywania = (int)(Math.random()*100+1);//rzutowanie na calkowite

        //Wpisywanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu od 1 do 100");
        int liczbaWpisana = scanner.nextInt();
        //instrukcja warunkowa
        if(liczbaWpisana == liczbaDoZgadywania){
            System.out.println("Brawo wygrana");
        }
        else {
            System.out.println("Niestety się nie udalo");
        }

        if(liczbaWpisana>liczbaDoZgadywania) {
            int roznica = liczbaWpisana - liczbaDoZgadywania;
        }else {
            int roznica = liczbaDoZgadywania - liczbaWpisana;
        }
        //wyrażenie warunkowe
        //wyrażenie warunkowe zwraca wartosc
        int roznica = liczbaWpisana>liczbaDoZgadywania ? liczbaWpisana - liczbaDoZgadywania : liczbaDoZgadywania - liczbaWpisana;
        System.out.println(roznica);
    }
}