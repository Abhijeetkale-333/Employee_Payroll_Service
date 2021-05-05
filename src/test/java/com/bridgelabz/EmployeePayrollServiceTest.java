package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEnteries() {
        EmployeePayrollData[] arrayOfEmps= {
                new EmployeePayrollData(1,"Sippora Toppo", 350000.0),
                new EmployeePayrollData(2,"Asher David", 400000.0),
                new EmployeePayrollData(3,"Akshay Nikam", 500000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService=new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData();
    }
}
