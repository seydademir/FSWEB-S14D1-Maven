package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts working");
        setSalary(getSalary() + 3000);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = developer;
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (midDevelopers[index] == null) {
            midDevelopers[index] = developer;
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = developer;
        } else {
            System.out.println("Index " + index + " is already occupied!");
        }
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}