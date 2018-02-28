public class Morning {

    public static void main(String[] args) {
        System.out.println("Good morning!");
    }
    
    public static void greeting(String name) {
        System.out.println(csillag() + "Happy Easter, " + name + "!" + csillag());
    }
    
    public static String csillag() {
        String csillagok = "";
        for(int i = 0; i < 80; i++) {
            csillagok = csillagok + "*";
        };
        return csillagok;
    }
}
