package recapInterf;

public class PP {

    public static void main(String[] args) {

        PP pp= new PP();
        pp.demo();


        pp.demoInterfaces(new DailyOperationsMariaImpl());

    }

    private void demo() {
        DailyOperations dd= new DailyOperationsMariaImpl();

        dd.operations();
        DailyOperations.ds();
    }

    private void demoInterfaces(DailyOperations pDailyOper) {
        pDailyOper.operations();
        pDailyOper.doSmth();

        if(pDailyOper instanceof DailyOperationsMariaImpl) {
            System.out.println("run acel cod specific ");
        }
        else {
            System.out.println("altceva");
        }

    }
}
