package jbatch.model;

public class Person {

    private String name;

    private String hiredate;

    public Person(String name, String hiredate) {
        this.name = name;
        this.hiredate = hiredate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return name + hiredate;
    }

}
