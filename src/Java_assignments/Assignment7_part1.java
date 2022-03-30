package Java_assignments;
    class Rodent {
        Rodent() {
            System.out.println("Rodent class Constructor");
        }

        public void printMessage() {
            System.out.println("This is Rodent class");
        }
    }

    class Mouse extends Rodent {
        Mouse() {
            System.out.println("Mouse class Initialized");
        }

        public void printMessage() {
            System.out.println("This is Mouse Class");
        }
    }

    class Gerbil extends Rodent {
        Gerbil() {
            System.out.println("Gerbil class Initialized");
        }

        public void printMessage() {
            System.out.println("This is Mouse Class");
        }
    }

    class Hamster extends Rodent {
        Hamster() {
            System.out.println("Hamster class Initialized");
        }

        public void printMessage() {
            System.out.println("This is Hamster Class");
        }
    }

public class Assignment7_part1 {
        public static void main(String[] args) {
            Rodent[] rodents = {new Rodent(), new Mouse(), new Gerbil(), new Hamster()};
            for (Rodent rodent : rodents)
                rodent.printMessage();
        }
    }

