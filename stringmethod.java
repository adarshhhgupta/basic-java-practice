public class stringmethod {
    public static void main()
    {
        String name = "Bro Code";
        
        int len = name.length(); //length of string
        char letter = name.charAt(1); //return character position
        int index = name.indexOf("r"); //return index postion no. of string
        int lastIndex = name.lastIndexOf("o");

        System.out.println(len);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        if(name.isEmpty()){     //checking the input string is empty or not
            System.out.println("Your name is Empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        

        String nameone = "Code Bro";

        String nameoneU = nameone.toUpperCase(); //converting to Uppercase
        String nameoneL = nameone.toLowerCase(); //converting to Lowercase
        String nameonerepl = nameone.replace("o", "a"); //replacing one string character to another

        System.out.println(nameoneU);
        System.out.println(nameoneL);
        System.out.println(nameonerepl);

        String nametwo = "    Bro Code   ";
        nametwo = nametwo.trim(); //triming extra spaces from input string

        System.out.println(nametwo);


    }
    
}
