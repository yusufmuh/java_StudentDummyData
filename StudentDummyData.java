
package com.mycompany.studentdummydata;

import java.util.Scanner;  
public class StudentDummyData {  

    // Deklarasi variabel untuk menyimpan data siswa  
    private String name;  
    private int age;  
    private double gpa;  

    // Konstruktor untuk inisialisasi data siswa  
    public StudentDummyData(String name, int age, double gpa) {  
        this.name = name;  
        this.age = age;  
        this.gpa = gpa;  
    }  

    // Method untuk menampilkan data siswa  
    public void displayData() {  
        System.out.println("\nStudent Data:");  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);  
        System.out.println("GPA: " + gpa);  
    }  

    // Method untuk memperbarui GPA  
    public void updateGPA(double newGPA) {  
        if (newGPA >= 0.0 && newGPA <= 4.0) {  
            this.gpa = newGPA;  
            System.out.println("GPA updated successfully!");  
        } else {  
            System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0.");  
        }  
    }  

    // Main method untuk interaksi dengan pengguna  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Meminta input nama dan validasi  
        String name = "";  
        while (true) {  
            System.out.print("Enter student name (3-15 characters): ");  
            name = scanner.nextLine();  
            if (name.length() >= 3 && name.length() <= 15) {  
                break;  
            } else {  
                System.out.println("Invalid name. Please enter a name between 3 and 15 characters.");  
            }  
        }  

        // Meminta input usia dan validasi  
        int age = 0;  
        while (true) {  
            System.out.print("Enter age (minimum 16): ");  
            try {  
                age = Integer.parseInt(scanner.nextLine());  
                if (age >= 16) {  
                    break;  
                } else {  
                    System.out.println("Age must be at least 16.");  
                }  
            } catch (NumberFormatException e) {  
                System.out.println("Invalid input. Please enter a valid age.");  
            }  
        }  

        // Meminta input GPA dan validasi  
        double gpa = 0.0;  
        while (true) {  
            System.out.print("Enter GPA (0.0 - 4.0): ");  
            try {  
                gpa = Double.parseDouble(scanner.nextLine());  
                if (gpa >= 0.0 && gpa <= 4.0) {  
                    break;  
                } else {  
                    System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0.");  
                }  
            } catch (NumberFormatException e) {  
                System.out.println("Invalid input. Please enter a valid GPA.");  
            }  
        }  

        // Membuat objek StudentDummyData  
        StudentDummyData student = new StudentDummyData(name, age, gpa);  

        // Menu utama untuk interaksi pengguna  
        while (true) {  
            System.out.println("\nMenu:");  
            System.out.println("1. View Data");  
            System.out.println("2. Update Data");  
            System.out.println("3. Exit");  
            System.out.print("Choose an option (1-3): ");  
            try {  
                int choice = Integer.parseInt(scanner.nextLine());  

                switch (choice) {  
                    case 1:  
                        // Menampilkan data siswa  
                        student.displayData();  
                        break;  
                    case 2:  
                        // Memperbarui GPA  
                        student.displayData();  
                        double newGPA;  
                        while (true) {  
                            System.out.print("Enter new GPA (0.0 - 4.0): ");  
                            try {  
                                newGPA = Double.parseDouble(scanner.nextLine());  
                                if (newGPA >= 0.0 && newGPA <= 4.0) {  
                                    student.updateGPA(newGPA);  
                                    break;  
                                } else {  
                                    System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0.");  
                                }  
                            } catch (NumberFormatException e) {  
                                System.out.println("Invalid input. Please enter a valid GPA.");  
                            }  
                        }  
                        break;  
                    case 3:  
                        // Keluar dari program  
                        System.out.println("Exiting the program. Goodbye!");  
                        scanner.close();  
                        return;  
                    default:  
                        System.out.println("Invalid choice. Please choose a valid menu option.");  
                }  
            } catch (NumberFormatException e) {  
                System.out.println("Invalid input. Please enter a number between 1 and 3.");  
            }  
        }  
    }  
} 