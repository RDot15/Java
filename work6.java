

public class work6 {
    public static void main(String[] args) throws IllegalAccessException {

        elewator elevator = new elewator(3, 9);
        System.out.println(elevator);

        elewator elevator1 = new elewator(7);
        System.out.println(elevator1.getMinFloor());

        elevator.setMinMaxFloor(5, 5);

        System.out.println(elevator);

        elevator1.move(6);

    }
}