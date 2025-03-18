class Main {

    public static void main(String[] argv) {
        System.out.println(
            "Your input is:  " + Entrance.readByte("Please enter a byte(a value between -128 and 127)")
        );
        System.out.println(
            "Your input is:  " + Entrance.readChar("Please enter a char")
        );
        System.out.println(
            "Your input is:  " + Entrance.readInt("Enter an Integer")
        );
        System.out.println(
            "Your input is:  " + Entrance.readString("Enter a string")
        );
        System.out.println(
            "Your input is:  " + Entrance.readFloat("Enter a float")
        );
        System.out.println(
            "Your input is:  " + Entrance.readDouble("Enter a double")
        );
        System.out.println(
            "Your input is:  " + Entrance.readYesNo("is it raining?")
        );
    }
}
