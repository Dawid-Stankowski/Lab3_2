public class KonwerterLiczb {
    public static void main(String[] args) {
        String tekst = "3532467";

        // Konwersja na int
        int liczbaInt = Integer.parseInt(tekst);
        System.out.println("Liczba int: " + liczbaInt);

        // Konwersja na long
        long liczbaLong = Long.parseLong(tekst);
        System.out.println("Liczba long: " + liczbaLong);

        // Konwersja na float
        float liczbaFloat = Float.parseFloat(tekst);
        System.out.println("Liczba float: " + liczbaFloat);

        // Konwersja na double
        double liczbaDouble = Double.parseDouble(tekst);
        System.out.println("Liczba double: " + liczbaDouble);
    }
}
