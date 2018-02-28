public class Morning
{
	public static void main(String[] args) {        //the main thing which greets the person
		System.out.println(greeting("Sasha"));
	}
	
    public static String greeting(String name) {    //the greeting method
        if (name.length() == 0) {
            name = "my friend";
        } else {};
        String msgLine = "*Happy Easter, " + name + "!*";
        String kiirando = lotChars("*", 80) + "\n" + msgLine + "\n" + lotChars("*", 80);
        return kiirando;
    }
    
    public static String lotChars(String chars, int number) {
        String lotChar = "";
        for(int i = 0; i < number; i++) {
            lotChar = lotChar + chars;
        };
        return lotChar;
    }

    public static int howMany(String current) {        //this 1 calculates the number of spaces we need
        int neededSpaces = (80 - current.length()) / 2;
        return neededSpaces;
    }
}
