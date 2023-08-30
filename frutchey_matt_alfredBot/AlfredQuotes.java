import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // Code will go here
        return String.format("Hello there %s, I hope you're having the most pleasant of days.", name);
    }

    public String guestGreeting(String timeOfDay, String name) {
        return String.format("Good %s, %s, I hope you're having the most pleasant of days.", timeOfDay, name);
    }

    public String dateAnnouncement() {
        // Code will go here
        Date date = new Date();
        return "Today's date and time right now are: " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // Code will go here if alexis index > -1 (what it returns if it doesn't exist) {...} else if indexOf alfred > -1 {...} else return statement
        if (conversation.indexOf("Alexis") > -1) {
            return "Oh? Are you asking for the piece of spyware instead of me? Sorry, I couldn't help myself. How may I be of assistance?";
        }
        else if (conversation.indexOf("Alfred") > -1) {
            return "I'm here to serve, what may I assist you with?";
        }
        else {
            return "Righty-o, I shall just continue with my usual tasks, then.";
        }
    }

    public String tidyUp(String sentence) {
        return sentence.trim();
    }

    // Sensei Bonus:
    // Write your own AlfredQuote method using any of the String methods you have learned!
}