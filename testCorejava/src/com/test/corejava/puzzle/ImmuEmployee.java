package com.test.corejava.puzzle;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class ImmuEmployee {

    private final long id;

    private final String name;

    private final Date dateOfBirth;

    private final BigDecimal salary;

    public ImmuEmployee(ImmuEmployeeBuilder ImmuEmployeeBuilder) {

        this.id = ImmuEmployeeBuilder.id;

        this.name = ImmuEmployeeBuilder.name;

        this.dateOfBirth = ImmuEmployeeBuilder.dateOfBirth;

        this.salary = ImmuEmployeeBuilder.salary;

    }

    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ImmuEmployee ImmuEmployee = (ImmuEmployee) o;

        if (id != ImmuEmployee.id) return false;

        if (name != null ? !name.equals(ImmuEmployee.name) : ImmuEmployee.name != null) return false;

        if (dateOfBirth != null ? !dateOfBirth.equals(ImmuEmployee.dateOfBirth) : ImmuEmployee.dateOfBirth != null)

            return false;

        return salary != null ? salary.equals(ImmuEmployee.salary) : ImmuEmployee.salary == null;

    }

    @Override

    public int hashCode() {

        int result = (int) (id ^ (id >>> 32));

        result = 31 * result + (name != null ? name.hashCode() : 0);

        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);

        result = 31 * result + (salary != null ? salary.hashCode() : 0);

        return result;

    }

    @Override

    public String toString() {

        return "ImmuEmployee{" +

                "id=" + id +

                ", name='" + name + '\'' +

                ", dateOfBirth=" + dateOfBirth +

                ", salary=" + salary +

                '}';

    }

    public long getId() {

        return id;

    }

    public String getName() {

        return name;

    }

    public Date getDateOfBirth() {

        return (Date) dateOfBirth.clone();

    }

    public BigDecimal getSalary() {

        return salary;

    }

    public static final class ImmuEmployeeBuilder {

        private long id;

        private String name;

        private Date dateOfBirth;

        private BigDecimal salary;

        private ImmuEmployeeBuilder() {

        }

        public static ImmuEmployeeBuilder anImmuEmployee() {

            return new ImmuEmployeeBuilder();

        }

        public static ImmuEmployeeBuilder anImmuEmployee(ImmuEmployee ImmuEmployee) {

            return anImmuEmployee().withId(ImmuEmployee.getId()).withName(ImmuEmployee.getName()).withDateOfBirth(ImmuEmployee.getDateOfBirth()).withSalary(ImmuEmployee.getSalary());

        }

        public ImmuEmployeeBuilder withId(long id) {

            this.id = id;

            return this;

        }

        public ImmuEmployeeBuilder withName(String name) {

            this.name = name;

            return this;

        }

        public ImmuEmployeeBuilder withDateOfBirth(Date dateOfBirth) {

            this.dateOfBirth = dateOfBirth;

            return this;

        }

        public ImmuEmployeeBuilder withSalary(BigDecimal salary) {

            this.salary = salary;

            return this;

        }

        public ImmuEmployee build() {

            return new ImmuEmployee(this);

        }

    }
    
    
    public static void main(String[] args) {

        HashMap<ImmuEmployee,String> employeeMap = new HashMap<ImmuEmployee,String>();

        ImmuEmployee employee1 = ImmuEmployee.ImmuEmployeeBuilder.anImmuEmployee().withId(1)

                                    .withName("Sachin")

                                    .withDateOfBirth(new Date(1987, 2, 1))

                                    .withSalary(new BigDecimal(100000))

                                    .build();

        employeeMap.put(employee1,"India");

        for (Map.Entry<ImmuEmployee, String> employeeStringEntry : employeeMap.entrySet()) {

            System.out.println(employeeStringEntry.getKey().hashCode());

        }

        ImmuEmployee immutableUpdatedEmployee1 = ImmuEmployee.ImmuEmployeeBuilder.anImmuEmployee(employee1).withName("Rahul").build();
        employeeMap.put(immutableUpdatedEmployee1, "india1");

        for (Map.Entry<ImmuEmployee, String> employeeStringEntry : employeeMap.entrySet()) {

            System.out.println("->"+employeeStringEntry.getKey().hashCode());

        }

        System.out.println("->->"+employeeMap.get(immutableUpdatedEmployee1));

        // Returns null

        ImmuEmployee employee2 = ImmuEmployee.ImmuEmployeeBuilder.anImmuEmployee().withId(1)

                .withName("Sachin")

                .withDateOfBirth(new Date(1987, 2, 1))

                .withSalary(new BigDecimal(100000))

                .build();

        System.out.println(employee2.hashCode());

        System.out.println(employeeMap.get(employee2));

        // Now this works fine and it shall return  the correct object from the HashMap

    }

}