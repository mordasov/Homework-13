public class Main {
    public static void main(String[] args) {

        Author frankHerbert = new Author("Frank", "Herbert");
        Book dune = new Book("Dune", frankHerbert, 1965);

        Author fyodorDostoevsky = new Author("Fyodor", "Dostoevsky");
        Book crimeAndPunishment = new Book("Crime and punishment", fyodorDostoevsky, 1866);

        dune.setYear(1966);
        crimeAndPunishment.setYear(1867);

        System.out.println(dune);
        System.out.println(crimeAndPunishment);

    }
}