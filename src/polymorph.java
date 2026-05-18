class Animal {
        void speak() {
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal {
        @Override
        void speak() {
            System.out.println("Woof!");
        }
    }

    class Cat extends Animal {
        @Override
        void speak() {
            System.out.println("Meow!");
        }
    }

    class Cow extends Animal {
        @Override
        void speak() {
            System.out.println("Moo!");
        }
    }

     class Polymorph {
        public static void main(String[] args) {

            Animal a1 = new Dog();
            Animal a2 = new Cat();
            Animal a3 = new Cow();

            a1.speak();
            a2.speak();
            a3.speak();
        }
    }

