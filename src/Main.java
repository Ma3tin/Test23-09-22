public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        /*
        for (int i = 0; i < service.atleast200mil().size(); i++) {
            System.out.println(service.atleast200mil().get(i).getName() + " - " + service.atleast200mil().get(i).getHdp());
        }
         */

        /*
        for (int i = 0; i < service.morePeopleThanRussia().size(); i++) {
            System.out.println(service.morePeopleThanRussia().get(i).getName());
        }
         */

        for (int i = 0; i < service.getRatio().size(); i++) {
            System.out.println(service.getRatio().get(i).getName() + " - " + service.getRatio().get(i).getRatio() + "%");
        }

    }
}