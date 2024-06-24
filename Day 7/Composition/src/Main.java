public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        System.out.println(wall1.getDirection());
        System.out.println(wall2.getDirection());
        System.out.println(wall3.getDirection());
        System.out.println(wall4.getDirection());

        Ceiling ceiling = new Ceiling(5,4);
        System.out.println((ceiling.getHeight())+ (ceiling.getPaintedColor()));

        Lamp lamp = new Lamp("Nais", true, 4);
        System.out.println((lamp.getStyle())+(lamp.isBattery()));

        Bed bed = new Bed("Good", 5, 4,8,4);
        System.out.println((bed.getPillows())+(bed.getHeight())+(bed.getSheets())+(bed.getQuit()));

//        Bedroom bedroom = new Bedroom("mongolia", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
//        System.out.println((bedroom.makeBed())+(bedroom.getLamp()));


        }

    }
