package oop;

import java.util.ArrayList;

public class BadArray {
    public static void main(String[] args) {
        ArrayList<String> employees = getEmployees();
//        String[] employees = getEmployees();
//        String[] newArray = new String[employees.length + 1];
//        for (int i = 0; i < employees.length; i++) {
//            newArray[i] = employees[i];
//        }
//        newArray[newArray.length - 1] = "james";
//        employees = newArray;
//        employees[0] = null;
//        String[] newestArray = new String[employees.length - 1];
//        for (int i = 0, j = 0;i < employees.length; i++) {
//            String employee = employees[i];
//            if (employee != null) {
//                newestArray[j] = employee;
//                j++;
//            }
//        }
//        employees = newestArray;
        employees.add("james");
        employees.remove("emma");
        employees.remove(2);

//        for (String employee : employees) {
        for (String employee : employees) {
            System.out.println(employee);
        }


    }

    //    private static String[] getEmployees() {
//        String[] employees = new String[5];
//        employees[0] = "john";
//        employees[1] = "nick";
//        employees[2] = "max";
//        employees[3] = "olivia";
//        employees[4] = "emma";
//        return employees;
//    }
//    private static MyArrayList getEmployees() {
//        MyArrayList employees = new MyArrayList();
//        employees.add("john");
//        employees.add("nick");
//        employees.add("max");
//        employees.add("olivia");
//        employees.add("emma");
//        return employees;
//    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("john");
        employees.add("nick");
        employees.add("max");
        employees.add("olivia");
        employees.add("emma");
        return employees;
    }
}
