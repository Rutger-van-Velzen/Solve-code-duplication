public class MyApplication {
    public void start(){
        ThisClass thisClass = new ThisClass();
        theThing(thisClass);

        ThatClass thatClass = new ThatClass();
        theThing(thatClass);
    }

    private void theThing(ThisClass thisClass){
        System.out.println("Some code before");
        thisClass.printName();
        System.out.println("Some code after");
    }

    private void theThing(ThatClass thatClass){
        System.out.println("Some code before");
        thatClass.printName();
        System.out.println("Some code after");
    }
}
