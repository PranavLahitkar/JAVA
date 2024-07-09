package com.example;

import com.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            // Create a new student object
            Student tempStudent = new Student("John", "Doe", "john.doe@example.com");

            // Start a transaction
            session.beginTransaction();

            // Save the student object
            session.save(tempStudent);

            // Commit the transaction
            session.getTransaction().commit();

            System.out.println("Student saved successfully!");

        } finally {
            factory.close();
        }
    }
}
