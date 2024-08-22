package org.example;

import org.example.confi.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        //------------------------Save and Update Student---------------------------
        FullName fullName=new FullName("Devi","Perera");
        Student student=new Student();
        student.setId(3);
        student.setName(fullName);
        student.setAddress("Galle");

        Transaction transaction=session.beginTransaction();
        session.save(student);
        // session.update(teacher);
        transaction.commit();
        session.close();


        //------------------------Delete Student---------------------------
//        FullName fullName=new FullName("Indumini","Silva");
//        Student student = new Student();
//        student.setId(3);

//        Transaction transaction= session.beginTransaction();
//        session.delete(student);
//        //delete,get,another table,note
//        transaction.commit();
//        session.close();

        //------------------------Get Student---------------------------
//        FullName fullName=new FullName("Indumini","Silva");
//        Student student = new Student();
//        student.setId(3);
//        student.setName(fullName);
//        student.setAddress("Kalutara");
//
//        Transaction transaction= session.beginTransaction();
//        session.get(fullName);
//        transaction.commit();
//        session.close();

//        --------------------save and update Teacher--------------------
//        FullName fullName=new FullName("Devi","Perera");
//        Teacher teacher=new Teacher();
//        teacher.setId(1);
//        teacher.setName(fullName);
//        teacher.setAddress("Galle");
//
//        Transaction transaction=session.beginTransaction();
//        session.save(teacher);
//       // session.update(teacher);
//        transaction.commit();
//        session.close();

       // --------------------Delete Teacher--------------------
//        FullName fullName=new FullName("Devi","Perera");
//        Teacher teacher=new Teacher();
//        teacher.setId(1);
//
//        Transaction transaction=session.beginTransaction();
//        session.delete(teacher);
//        transaction.commit();
//        session.close();


    }
}