public class AlfredTest {

    public static void main(String[] args) {
        // Making an instance of AlfredQuotes to access all its methods:
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Importing and Creating Test Greetings:
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Master Wayne");
        String testGuestGreetingBonus = alfredBot.guestGreeting("evening", "Peter Parker");
        String date = alfredBot.dateAnnouncement();
        String audioConvoAlfred = alfredBot.respondBeforeAlexis("Did you hear that, Alfred?");
        String audioConvoAlexis = alfredBot.respondBeforeAlexis("Alexis, what time is it?");
        String audioConvoNeutral = alfredBot.respondBeforeAlexis("I wonder what's for dinner...");
        String tidyUp = alfredBot.tidyUp("     please clean this up!          ");
        // Tests:
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreetingBonus);
        System.out.println(date);
        System.out.println(audioConvoAlfred);
        System.out.println(audioConvoAlexis);
        System.out.println(audioConvoNeutral);
        System.out.println(tidyUp);
    }
}