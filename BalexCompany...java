/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package data.balexcompany;

/**
 *
 * @author LUBEGA
 */
// Define the balexCompany class
public class BalexCompany {

    // Define the method to calculate and print total pay or an error message
    public static void calculatePay(double basePay, int hoursWorked) {
        // Define the minimum wage and maximum hours constants
        final double MINIMUM_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;
        
        // Check if base pay is below the minimum wage
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay is below the minimum wage.");
            return;
        }
        
        // Check if hours worked is greater than the maximum allowed
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceeds the maximum allowed.");
            return;
        }
        
        // Calculate total pay
        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = basePay * hoursWorked;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (basePay * REGULAR_HOURS) + (basePay * OVERTIME_RATE * overtimeHours);
        }
        
        // Print the total pay
        System.out.printf("Total pay: $%.2f\n", totalPay);
    }
    
    // Define the main method to call the calculatePay method for each employee
    public static void main(String[] args) {
        // Employee data
        double[] basePays = {7.50, 8.20, 10.00};
        int[] hoursWorked = {35, 47, 73};
        
        // Loop through each employee and calculate their pay
        for (int i = 0; i < basePays.length; i++) {
            System.out.printf("Employee %d:\n", i + 1);
            calculatePay(basePays[i], hoursWorked[i]);
        }
    }
}
