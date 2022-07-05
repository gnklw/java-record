package record;

public record Parent(int age, int height) implements Mammal {

    //nested types
    public static class Child {
        private int age;
        private int height;

        public Child(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public int getAge() {
            return age;
        }

        public Child setAge(int age) {
            this.age = age;
            return this;
        }

        public int getHeight() {
            return height;
        }

        public Child setHeight(int height) {
            this.height = height;
            return this;
        }
    }

    //static field
    public static int increaseAge;

    //static method
    public static int increaseAge() {
        return increaseAge++;
    }

    //canonical constructor
    /*
    public Person(int age, int height) {
        if (age < 18) {
            throw new IllegalArgumentException("");
        }

        this.age = age;
        this.height = height;
    }

    //canonical constructor -> compact constructor
    public Person {
        if (age < 18) {
            throw new IllegalArgumentException("");
        }
    }
      */
    //constructor
    public Parent(int age) {
        this(age, 172);
    }

    //instance method
    public void printAge() {
        System.out.println(age());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Parent.class != o.getClass()) {
            return false;
        }
        Parent parent = (Parent) o;
        return age == parent.age && height == parent.height;
    }
}