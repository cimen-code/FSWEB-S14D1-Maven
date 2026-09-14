package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    public HRManager(int id, String name, double salary,
                     int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[juniorSize];
        midDevelopers = new MidDeveloper[midSize];
        seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() + 500);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Index not found: " + index);
            return;
        }

        if (juniorDevelopers[index] != null) {
            System.out.println("Index is full!");
            return;
        }

        juniorDevelopers[index] = developer;
    }

    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Index not found: " + index);
            return;
        }

        if (midDevelopers[index] != null) {
            System.out.println("Index is full!");
            return;
        }

        midDevelopers[index] = developer;
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Index not found: " + index);
            return;
        }

        if (seniorDevelopers[index] != null) {
            System.out.println("Index is full!");
            return;
        }

        seniorDevelopers[index] = developer;
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
