public class TestDecoratorPattern {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        
        // Email and SMS notification
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        emailAndSMSNotifier.send("Hello via Email and SMS!");

        System.out.println("------------");

        // Email, SMS, and Slack notification
        Notifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);
        emailSMSAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}
