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

        roznica = roznica/10; // ponieważ operacja jest wykonywana na liczbach całkowitych wynik tez jest calkowity
        System.out.println("Róznica modulo 10 = "+roznica);
        //instrukcja switch
        switch (roznica){
            case 0:
                System.out.println("Bardzo blisko");
                break;
            case 1:
                System.out.println("Całkiem nieźle");
                break;
            case 2:
                System.out.println("Trochę brakowało");
                break;
            default:
                System.out.println("Może następnym razem będzie lepiej");
        }
        //wyrażenie switch - zwraca wartość
        System.out.println(
                switch (roznica){
                    case 0 -> "Było blisko";
                    case 1 -> "Całkiem nieźle";
                    case 2 -> "Trochę brakowało";
                    default -> "Może innym razem";
                }
        );
        System.out.println("Zgadywanie 10 razy");
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            liczbaWpisana = scanner.nextInt();
            if(liczbaWpisana == liczbaDoZgadywania){
                System.out.println("Brawo zgadłeś za "+(i+1)+"razem");
                break;
            }
            else if(liczbaWpisana>liczbaDoZgadywania){
                System.out.println("Wpisałeś za dużo");
            }
            else {
                System.out.println("Wpisałeś za mało");
            }
        }
        System.out.println("Uwaga losowanie nowej liczby");
        Random random = new Random();
        int liczbDoZgadywania2 = random.nextInt(1,101);
        System.out.println("Podaj liczbę");
        liczbaWpisana = scanner.nextInt();
        while (liczbaWpisana!= liczbDoZgadywania2){
            System.out.println("Podaj liczbę");
            liczbaWpisana = scanner.nextInt();
            if(liczbaWpisana>liczbDoZgadywania2){
                System.out.println("Wpisałeś za dużo");
            }
            else {
                System.out.println("Wpisałeś za mało");
            }
        }
        //wypisz na ekranie wszystkie liczby dwucyfrowe parzyste
        //10, 12, 14, ..... 98
        System.out.println("Liczby dwucyfrowe parzyste");
        for (int i = 10; i <100 ; i = i+2) {
            System.out.print(i+", ");
        }


        //wczytaj dwie liczby z klawiatury
        //wypisz wszystkie od pierwsze do drugiej
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int pierwszaLiczba = klawiatura.nextInt();
        System.out.println("Podaj drugą liczbę");
        int drugaLiczba = klawiatura.nextInt();
        if(pierwszaLiczba<drugaLiczba){
            for (int i = pierwszaLiczba; i <=drugaLiczba ; i++) {
                System.out.println(i+", ");
            }
        }
        else {
            for (int i = pierwszaLiczba;i>=drugaLiczba ; i++) {
                System.out.println(i+", ");
            }
        }
        //wczytuj liczby z klawiatury tak długo aż wczytasz 0
        int liczbaWczytywana =-1;
        while (liczbaWczytywana!=0){
            System.out.println("Podaj liczbe 0");
            liczbaWczytywana = klawiatura.nextInt();
        }
        System.out.println("To samo drugim sposobem");

        do{
            System.out.println("Podaj liczbe 0");
            liczbaWczytywana = klawiatura.nextInt();
        }while (liczbaWczytywana!=0);

        //wczytaj 10 liczb i oblicz ich sumę
        Random random1 = new Random();
        int liczbaWylosowana;
        int sumaLosowych = 0;
        System.out.println("Wylosowane liczby");
        for (int i = 0; i < 10; i++) {
            liczbaWylosowana = random.nextInt(1,101);
            System.out.println(liczbaWylosowana);
            sumaLosowych = sumaLosowych +liczbaWylosowana;
        }
        System.out.println("Suma wylosowanych liczb wynosi:"+sumaLosowych);

        //losuj liczbę z zakresu 1,100 tak długo aż wylosuj większą od 50
        System.out.println("Losujemy liczby do wylosowania większej od 50");

        do {
            liczbaWylosowana = random1.nextInt(1,101);
            System.out.println(liczbaWylosowana);
        }while (liczbaWylosowana<50);

    }
}