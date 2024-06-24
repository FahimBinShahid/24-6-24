public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","HP","650");
    Monitor theMonitor = new Monitor("27 inch", "Gygabyte",27, "2k");
    Motherboard theMotherboard = new Motherboard("x570","Asus",5,6,"2nd gen");
    PersonalComputer thePC = new PersonalComputer("2208","Philips",theCase,theMonitor,theMotherboard);

//    thePC.getMonitor().drawPixelAt(10,10,"Purple");
//    thePC.getMotherboard().loadProgram("Windows OS,");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
        System.out.println(thePC.equals("2208"));

    }
}