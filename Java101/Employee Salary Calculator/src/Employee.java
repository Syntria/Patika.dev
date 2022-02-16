public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        printEmployee();
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 3 / 100;
        }

        else {
            return 0;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }

        else {
            return 0;
        }
    }

    public double raiseSalary () {
        if (2021 - this.hireYear < 10) {
            return this.salary * 5 / 100;
        }

        else if (2021 - this.hireYear >= 10 && this.hireYear < 20) {
            return this.salary * 10 / 100;
        }

        else {
            return this.salary * 15 / 100;
        }
    }

    public void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Raise: " + raiseSalary());
        System.out.println("Salary With Taxes And Bonuses: " + (this.salary + bonus() - tax()));
        System.out.println("New Salary: " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
