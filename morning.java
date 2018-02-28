public class Morning
{
	public static void main(String[] args) {        //the main thing which greets the person
		System.out.println(greeting("Sasha"));
	}
	
    public static String greeting(String name) {    //the greeting method
        if (name.length() == 0) {                   //if there's no name then writes  "my friend"
            name = "my friend";
        } else {};
        String msgLine = "*Happy Easter, " + name + "!*";   //this is always the line in the middle
        String msgLinePlus = lotChars(" ", howMany(msgLine)) + msgLine + lotChars(" ", howMany(msgLine));
        String kiirando = lotChars("*", 80) + "\n" + msgLinePlus + "\n" + lotChars("*", 80);    //80 spaces before and 80 spaces after
        return kiirando;        //the method returns those from above
    }
    
    public static String lotChars(String chars, int number) {   //this makes lots of a given character
        String lotChar = "";        //declares the String which is gonna be the lots of chars together
        for(int i = 0; i < number; i++) {
            lotChar = lotChar + chars;      //always adds one till it's done
        };
        return lotChar;
    }

    public static int howMany(String current) {        //this 1 calculates the number of spaces we need before and after the msgLine
        int neededSpaces = (80 - current.length()) / 2;     //we need 80 chars so let's calculate
        return neededSpaces;
    }
}

//https://docs.google.com/forms/d/e/1FAIpQLSdpZGBl2SdMRaOEqNcdTVGROD9lWVwJmbcjL17tnqyij_z0xQ/formResponse
