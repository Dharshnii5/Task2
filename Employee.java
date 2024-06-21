public static void main(String agrs[]) {


    class Person {
        private String name;
        private int age;

        public Person(String name,int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge( int age) {
            this.age = age;
        }
    }

    class Employee extends Person {
        private String employeeID;
        private double salary;

        public Employee(String name,  int age, String employeeID, double salary) {
            super(name, age); // Use super keyword to initialize person attributes in Employee constructor
            this.employeeID = employeeID;
            this.salary = salary;
        }

        public String getEmployeeID() {

            return employeeID;
        }

        public void setEmployeeID(String employeeID) {

            this.employeeID = employeeID;
        }

        public double getSalary() {

            return salary;
        }

        public void setSalary(double salary) {

            this.salary = salary;
        }
    }
    Person person = new Person("Hari", 35);
    Employee employee=new Employee("winson",28,"EMP120", 35000);

    System.out.println("Person Name:"+ person.getName());
    System.out.println("Person Age:"+ person .getAge());


    System.out.println("Employee Name:"+ employee.getName());
    System.out.println("Employee Age:"+ employee.getAge());
    System.out.println(" Employee Id:"+ employee.getEmployeeID());
    System.out.println("Employee Salary:"+ employee.getSalary());
}
