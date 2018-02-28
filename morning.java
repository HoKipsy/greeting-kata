public class Morning
{
	public static void main(String[] args) {
		System.out.println(greeting("Sasha"));
	}
	
    public static String greeting(String name) {
        String kiirando = "";
        if (name.length() == 0){
            kiirando = csillag() + "\n" + "Happy Easter, my friend!" + "\n" + csillag();
        } else {
            kiirando = csillag() + "\n" + "Happy Easter, " + name + "!" + "\n" + csillag();
        }
        return kiirando;
    }
    
    public static String csillag() {
        String csillagok = "";
        for(int i = 0; i < 80; i++) {
            csillagok = csillagok + "*";
        };
        return csillagok;
    }
}
