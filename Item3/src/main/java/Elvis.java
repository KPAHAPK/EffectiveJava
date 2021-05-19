//public class Elvis {
//    private static final Elvis INSTANCE = new Elvis();
//    //public static final Elvis INSTANCE = new Elvis();
    public enum Elvis {
        INSTANCE;
        public void leaveBuilding(){
            System.out.println(this);
        }
    }

//    private Elvis(){
//
//    }
//
//    private Object readResolve(){
//        return INSTANCE;
//    }
//
//    public static Elvis getInstance(){
//        return INSTANCE;
//    }
//
//    public void leaveBuilding(){
//        System.out.println(this);
//    }
//
//}
