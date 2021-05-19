public class Main {
    public static void main(String[] args) {
//        Elvis elvis = Elvis.getInstance();
        //Elvis elvis1 = Elvis.INSTANCE;

        //Elvis elvis2 = new Elvis();

//        elvis.leaveBuilding();
        //elvis1.leaveBuilding();
        //elvis2.leaveBuilding();

        Elvis elvis = Elvis.INSTANCE;
        Elvis elvis1 = Elvis.INSTANCE;
        elvis.leaveBuilding();
        elvis1.leaveBuilding();
    }
}
