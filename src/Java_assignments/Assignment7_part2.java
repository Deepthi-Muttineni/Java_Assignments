package Java_assignments;

class Cycle {
    public void printType() {
        System.out.println("Just Cycle");
    }

    public void balance() {
        System.out.println("Balance Simple  cycle");
    }
}

class UniCycle extends Cycle {
    public void printType() {
        System.out.println("Uni Cycle");
    }

    public void balance() {
        System.out.println("Unicycle Balance");
    }
}

class Bicycle extends Cycle {
    public void printType() {
        System.out.println("Bi Cycle");
    }

    public void balance() {
        System.out.println("Bicycle Balance");
    }

}

class Tricycle extends Cycle {
    public void printType() {
        System.out.println("Tri Cycle");
    }
}



public class Assignment7_part2 {
    public static void main(String[] args) {
        Cycle[] cycles = {new Cycle(), new UniCycle(), new Bicycle(), new Tricycle()};
        for (Cycle cycle : cycles) {
            cycle.balance();
//            cannot cast one class with another
            ((UniCycle) cycle).balance();
            cycle.printType();
        }
    }
}