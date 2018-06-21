class Vehicle2 {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }
}

class RetMeth {
    public static void main(String args[]) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров, на расстояние " + range1 + "миль.");

        System.out.print("Спортивный автомобиль может перевезти " + sportcar.passengers + " пассажиров, на расстояние " + range2 + "миль.");


    }
}
