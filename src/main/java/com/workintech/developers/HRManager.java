package com.workintech.developers;

public class HRManager extends Employee {
    // HRManager için her developer türünden bir array.
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employee resources.");

        setSalary(getSalary() * 1.10);
    }



    public void addEmployee(JuniorDeveloper emp) {
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = emp;
                added = true;
                System.out.println("JuniorDeveloper added at index " + i);
                break;
            }
        }
        if (!added) {
            System.out.println("Warning: No available slot to add JuniorDeveloper.");
        }
    }

    public void addEmployee(MidDeveloper emp) {
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = emp;
                added = true;
                System.out.println("MidDeveloper added at index " + i);
                break;
            }
        }
        if (!added) {
            System.out.println("Warning: No available slot to add MidDeveloper.");
        }
    }

    public void addEmployee(SeniorDeveloper emp) {
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = emp;
                added = true;
                System.out.println("SeniorDeveloper added at index " + i);
                break;
            }
        }
        if (!added) {
            System.out.println("Warning: No available slot to add SeniorDeveloper.");
        }
    }
}
