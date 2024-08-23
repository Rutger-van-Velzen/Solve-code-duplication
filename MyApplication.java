public class MyApplication {
    public void start(){
        ThisClass thisClass = new ThisClass();
        theThing(thisClass);

        ThatClass thatClass = new ThatClass();
        theThing(thatClass);
    }

    private void theThing(ThisClass thisClass){
        System.out.println("Some code Before");
        thisClass.printName();
        System.out.println("Some code after");
    }

    private void theThing(ThatClass thatClass){
        System.out.println("Some code Before");
        thatClass.printName();
        System.out.println("Some code after");
    }
}
