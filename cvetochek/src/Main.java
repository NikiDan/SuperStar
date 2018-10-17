public class Main {
    public static void main(String[] args) {

        double total = 0;

        Rouse ros1 = new Rouse(45.9,"Розочка первая",Colors.Red);
        Rouse ros2 = new Rouse(43.5,"Розочка вторая" ,Colors.Green);

        Camomile cam1= new Camomile(25.6,"Ромашка первая", Colors.Yellow);

        Tulip tul1 = new Tulip (12.4,"Тюльпаничк первый", Colors.Black);
        Tulip tul2 = new Tulip (13,"Тюльпаничк первый", Colors.Blue);

        Flavor flavor = new Flavor ();
        flavor.addFlower(ros1).addFlower(ros2).addFlower(cam1).addFlower(tul1).addFlower(tul2);
        System.out.println(flavor.getPrice());
    }
}
