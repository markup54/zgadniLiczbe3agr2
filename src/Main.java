public class Main {
    public static void main(String[] args) {
        int wynik = sumaLiczba(2,3);
        System.out.println("Test metody "+wynik);
        wypiszLiczbyDwucyfroweParzyste();
    }

    private static int sumaLiczba(int a, int b){
        return a+b;
    }

    private static void wypiszLiczbyDwucyfroweParzyste(){
        System.out.println("Liczby dwucyfrowe parzyste");
        for (int i = 10; i <100 ; i = i+2) {
            System.out.print(i+", ");
        }
    }


}
