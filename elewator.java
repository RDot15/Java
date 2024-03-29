public class elewator {
    private Integer minFloor;
    private Integer maxFloor;

    public elewator(int minFloor, int maxFloor) throws IllegalAccessException {
        if (minFloor >= maxFloor) {
            throw new IllegalAccessException("Невозможно задать такой диапозон");
        }
            this.minFloor = minFloor;
            this.maxFloor = maxFloor;
    }

    public void move(int floorNumber) throws IllegalAccessException {
        if(floorNumber >= getMinFloor() && floorNumber <= getMaxFloor()){
            System.out.println("Лифт переместился на " + floorNumber + " этаж.");
        } else {
            throw new IllegalAccessException("Невозможно выбрать такой этаж.");
        }
    }

    public elewator(int maxFloor) throws IllegalAccessException {
        if (1 >= maxFloor ) {
            throw new IllegalAccessException("Нельзя создать такой диапазон.");
        } else {
            this.maxFloor = maxFloor;
            this.minFloor = 1;
        }
    }

    public void setMinMaxFloor(int minNumber, int maxNumber) throws IllegalAccessException {
        if(minNumber >= maxNumber) {
            throw new IllegalAccessException("Нельзя создать заданный диапазон этажей.");
        }
        this.minFloor = minNumber;
        this.maxFloor = maxNumber;
    }

    public int getMinFloor(){

        return minFloor;
    }

    public int getMaxFloor(){

        return maxFloor;
    }

    @Override
    public String toString() {
        return String.format("%d, %d", getMinFloor(), getMaxFloor());
    }

}