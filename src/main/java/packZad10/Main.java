package packZad10;
/*
10 Zadanie:
Stwórz klasę generyczną<T> zapisywacz, która posiada metodę "zapiszDoPliku", oraz finalne pole typu generycznego. Metoda zapiszDoPliku zamienia obiekt (pole klasy) na Json'a i zapisuje tego jsona do pliku o nazwie:

singleT.json

W tej samej klasie stwórz drugą metodę STATYCZNĄ GENERYCZNĄ która przyjmuje DOWOLNĄ ILOŚĆ PARAMETRÓW TYPU T i dodaje te elementy do listy. Następnie ta metoda zapisuje listę podanych obiektów do pliku o nazwie:

listOfT.json

 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Zapisywacz zapisywacz = new Zapisywacz();

        Auto opel = new Auto("Opel", 3);
//        zapisywacz.zapiszDoPliku(opel);

        String buba = "Buba";
        zapisywacz.zapiszDoPliku(buba);


        Auto volvo = new Auto("Volvo", 2);
        Auto fiat = new Auto("Fiat", 8);
        zapisywacz.utworzListeIZapiszDoPliku(opel, volvo, fiat);

//        zapisywacz.utworzListeIZapiszDoPliku(1, 2, 3, 4, 5);
    }
}
