public class MyApplication {
    public void start(){
        PingConnection pingConnection = new PingConnection();
        theThing(pingConnection);

        MessageSender messageSender = new MessageSender();
        theThing(messageSender);
    }

    // Without touching PingConnection and MessageSender.
    // How would you remove code duplication?
    // And don't forget, the Method names are no longer the same!
    private void theThing(PingConnection thisClass){
        System.out.println("Some code before");
        thisClass.pingOtherSystem();
        System.out.println("Some code after");
    }

    private void theThing(MessageSender thatClass){
        System.out.println("Some code before");
        thatClass.sendMessageToOtherSystem();
        System.out.println("Some code after");
    }
}
