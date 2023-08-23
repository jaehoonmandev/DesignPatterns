package creationPatterns.Singleton;

public class Bill_Pugh {

    private Bill_Pugh(){}

    private static class BillPughSingleton{
        private static final Bill_Pugh instance = new Bill_Pugh();
    }

    public static Bill_Pugh getInstance(){
        return BillPughSingleton.instance;
    }
}
