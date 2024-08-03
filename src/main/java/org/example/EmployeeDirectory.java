package org.example;

//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри
//        коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавления нового сотрудника в справочник

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> findByExperience(int experience){
        List<Employee> res = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                res.add(employee);
            }
        }
        return res;
    }

    public List<String> findNumberByName(String name){
        List<String> res = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                res.add(employee.getPhoneNumber());
            }
        }
        return res;
    }

    public Employee findEmployeeByPersonnelNumber(String personnelNumber){
        for (Employee employee : employees) {
            if (employee.getPersonnelNumber().equals(personnelNumber)) {
                return employee;
            }
        }
        return null;
    }

    public void addToDirectory(Employee employee){
        for (Employee e : employees) {
            if (e.getPersonnelNumber().equals(employee.getPersonnelNumber())) {
                System.out.println("Employee with personnel number " + employee.getPersonnelNumber() + " already exists.");
                return;
            }
        }
        employees.add(employee);
    }
}

