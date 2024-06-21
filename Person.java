class Person {
    private static String[] args;
        private final String name;
        private final int age;

        // Constructor with default age
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

        // Constructor with both name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

        // Method to display name and age
        public void displayInfo () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

        public static void main (String[]args){
        Person.args = args;
        // Create a person with default age
        Person person1 = new Person("Tizen");
        person1.displayInfo();

        // Create a person with specified name and age
        Person person2 = new Person("Krish", 20);
        person2.displayInfo();
    }
    }
