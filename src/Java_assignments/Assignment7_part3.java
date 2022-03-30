package Java_assignments;


    interface One {
        void firstMethodOfOne();

        void secondMethodOfOne();
    }

    interface Two {
        void firstMethodOfTwo();

        void secondMethodOfTwo();
    }

    interface Three {
        void firstMethodOfThree();

        void secondMethodOfThree();
    }

    interface Number extends One, Two, Three {
        void numberInterfaceMethod();
    }

    class BaseClass {
        private int baseValue = 0;

        public void printBaseClassName() {
            System.out.println("This is Base Class");
        }
    }

    class SubClass extends BaseClass implements Number {

        private int subValue = 0;

        @Override
        public void firstMethodOfOne() {

        }

        @Override
        public void secondMethodOfOne() {

        }

        @Override
        public void firstMethodOfTwo() {

        }

        @Override
        public void secondMethodOfTwo() {

        }

        @Override
        public void firstMethodOfThree() {

        }

        @Override
        public void secondMethodOfThree() {

        }

        @Override
        public void numberInterfaceMethod() {

        }
    }


public class Assignment7_part3 {
        public static void executeInterfaceOne(One object) {
            object.firstMethodOfOne();
        }

        public static void executeInterfaceTwo(Two object) {
            object.firstMethodOfTwo();
        }

        public static void executeInterfaceThree(Three object) {
            object.firstMethodOfThree();
        }

        public static void executeInterfaceNumber(Number object) {
            object.numberInterfaceMethod();
        }

        public static void main(String[] args) {
            SubClass subClassObject = new SubClass();
            executeInterfaceOne(subClassObject);
            executeInterfaceTwo(subClassObject);
            executeInterfaceThree(subClassObject);
            executeInterfaceNumber(subClassObject);
        }

    }
