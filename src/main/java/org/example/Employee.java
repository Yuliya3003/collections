package org.example;
//каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
public class Employee {
    private String personnelNumber;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(String personnelNumber, String phoneNumber, String name, int experience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber='" + personnelNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
