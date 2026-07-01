public class MapClass {
    public static void main(String[] args) {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.println("Enter A State: ");
        String userInput = inputCollector.nextLine();

        switch(userInput.toLowerCase()) {
            case "Benue", "Kogi", "Kwara", "Nassarawa", "Niger", "Plateau", "FCT(ABUJA)":
                System.out.println(MapEnum.NORTH_CENTRAL);
                break;
            case "Jigawa", "Kaduna", "Kano", "Katisna", "Kebbi", "Sokoto", "Zamfara":
                System.out.println(MapEnum.NORTH_WEST);
                break;
            case "Abia", "Anambra", "Ebonyi", "Enugu", "Imo":
                System.out.println(MapEnum.SOUTH_EAST);
                break;
            case "Akwa_ibom", "Bayelsa", "Cross_river", "Delta", "Edo", "":
                System.out.println(MapEnum.SOUTH_SOUTH);
                break;
            case "Ekiti", "Lagos_state", "Ogun_state", "Ondo_state", "Osun_state", "Oyo_state":
                System.out.println(MapEnum.SOUTH_WEST);
                break;
        }
    }
}
