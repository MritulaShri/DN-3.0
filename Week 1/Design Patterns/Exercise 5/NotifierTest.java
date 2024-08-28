public class NotifierTest {
    public static void main(String[] args) {
        // Creating an Email Notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorating Email Notifier with SMS Notifier
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorating SMS Notifier with Slack Notifier
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Sending notification through Email, SMS, and Slack
        slackNotifier.send("This is a test notification.");
    }
}
