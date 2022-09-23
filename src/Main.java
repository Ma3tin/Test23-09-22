public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println("Země s populací alespoň 200 milionů");
        for (Country country : service.atleast200mil()) System.out.println(country.getName() + " - " + country.getHdp());
        System.out.println();
        System.out.println("Lidnatější země než Rusko");
        for (Country country : service.morePeopleThanRussia()) System.out.println(country.getName());
        System.out.println();
        System.out.println("Země v Evropě v poměru s nejlidnatější populací");
        for (Country country : service.getRatio()) System.out.println(country.getName() + " - " + country.getRatio() + " %");
        System.out.println();
    }
}