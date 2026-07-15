package OOP.DIARYAPP.JAVA;

public class MainApplication {
    private static Diaries ultimate = new Diaries();
    
    private static java.util.Scanner inputCollector = new java.util.Scanner(System.in);
    private static Diary activeDiary = null;

    public static void main(String[] args) {
        mainMenuLoop();
    }

    private static void mainMenuLoop() {
        
        while (true) {
            String menu = """
1. Register Account.
2. Login To Diary.
3. Delete Account.
4. Exit Application.
                    """;
            System.out.println(menu);

            String option = inputCollector("Enter An Option(1-4): ");
            switch (option) {
                case "1" -> registerAccount();
                case "2" -> loginToDiary();
                case "3" -> deleteAccount();
                case "4" -> {
                    System.out.println("Thanks For Using Our Diary App.");
                    break;
                }
                default -> System.out.println("Invalid Input. Enter options(1-4).");
            }
        }
    }

    private static String inputCollector(String prompt) {
        System.out.print(prompt); 
        return inputCollector.nextLine();  
    }

    private static void registerAccount() {
        System.out.println("====  REGISTRATION  =====");

        String userName = inputCollector("Enter UserName: ");
        String password = inputCollector("Enter Password: ");
    }

    private static void loginToDiary() {

    }
    private static void deleteAccount() {

    }

}
