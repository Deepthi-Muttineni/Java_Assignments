package Java_assignments; /**
package Java_assignments;


    interface Cycle{
        void ride();
    }
    class Unicycle implements Cycle{

        @Override
        public void ride() {
            System.out.println("I am Riding UniCycle");
        }
    }
    class Bicycle implements Cycle{

        @Override
        public void ride() {
            System.out.println("I am Riding Bicycle");
        }
    }
    class Tricycle implements Cycle{
        @Override
        public void ride() {
            System.out.println("I am riding TriCycle");
        }
    }

    // Factories
    interface CycleFactory{
        Cycle getCycle();
    }
    class UnicycleFactory implements CycleFactory{
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    }
    class BiCycleFactory implements CycleFactory{

        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    }
    class TriCycleFactory implements CycleFactory{
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    }

public class Assignment7_part4 {
        public static void ridingCycle(CycleFactory factory){
            Cycle cycle = factory.getCycle();
            cycle.ride();
        }

        public static void main(String[] args) {
            ridingCycle(new UnicycleFactory());
            ridingCycle(new BiCycleFactory());
            ridingCycle(new TriCycleFactory());
        }
    }
    */
