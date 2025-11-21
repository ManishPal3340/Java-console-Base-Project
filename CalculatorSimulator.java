package com.example.Anudip_4LabQuestion;

import java.util.Scanner;

// **************** CUSTOM EXCEPTIONS ****************

class CountryNotValidException extends Exception {
    public CountryNotValidException(String msg) {
        super(msg);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String msg) {
        super(msg);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String msg) {
        super(msg);
    }
}

// **************** TAX CALCULATOR CLASS ****************

class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        // Check Indian
        if (!isIndian) {
            throw new CountryNotValidException(
                    "The employee should be an Indian citizen for calculating tax");
        }

        // Check Name
        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException(
                    "The employee name cannot be empty");
        }

        double taxAmount;

        // Salary conditions
        if (empSal > 100000 && isIndian) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000 && isIndian) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000 && isIndian) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException(
                    "The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

// **************** MAIN CLASS ****************

public class CalculatorSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Is employee Indian? (true/false): ");
        boolean isIndian = sc.nextBoolean();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        TaxCalculator tc = new TaxCalculator();

        try {
            double tax = tc.calculateTax(name, isIndian, salary);
            System.out.println("Tax amount is " + tax);

        } catch (CountryNotValidException e) {
            e.printStackTrace();
            System.out.println("The employee should be an Indian citizen for calculating tax");

        } catch (EmployeeNameInvalidException e) {
            e.printStackTrace();
            System.out.println("The employee name cannot be empty");

        } catch (TaxNotEligibleException e) {
            e.printStackTrace();
            System.out.println("The employee does not need to pay tax");
        }

        sc.close();
    }
}
