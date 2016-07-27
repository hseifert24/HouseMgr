import com.eandh.*;

/**
 * Created by localadmin on 7/27/16.
 */
public class Main {
    public static void main(String[] args) {
        Room r1 = new Room("Room1", Floor.Hardwood, Paint.Eggshell, 12, 10, 9);
        double fc = r1.floorCost();
        double pc = r1.paintCost();

        Room r2 = new Room("Room2", Floor.Hardwood, Paint.Eggshell, 12, 10, 9);
        Room r3 = new Room("Room3", Floor.Hardwood, Paint.Eggshell, 12, 10, 9);

        House h1 = new House("House1");
        h1.AddRoom(r1);
        h1.AddRoom(r2);
        h1.AddRoom(r3);

        double totalFC1 = h1.floorCost();
        double totalPC1 = h1.paintCost();

        h1.RemoveRoom(r1.getName());

        double totalFC2 = h1.floorCost();
        double totalPC2 = h1.paintCost();


    }
}