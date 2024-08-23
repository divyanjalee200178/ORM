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
//        FullName fullName=new FullName("Devi","Perera");
//        Student student=new Student();
//        student.setId(3);
//        student.setName(fullName);
//        student.setAddress("Galle");
//
//        Transaction transaction=session.beginTransaction();
//        session.save(student);
//        // session.update(teacher);
//        transaction.commit();
//        session.close();


        //------------------------Delete Student---------------------------

//        session.delete(student);


        //------------------------Get Student---------------------------
//         Student=session.get(Student.class,1);
//        System.out.println(student.toString());

//        --------------------save and update Teacher--------------------
        FullName fullName=new FullName("Devid","Perera");
        Teacher teacher=new Teacher();
        teacher.setId(2);
        teacher.setName(fullName);
        teacher.setAddress("Galle");

        Transaction transaction=session.beginTransaction();
        session.save(teacher);
//      session.update(teacher);
        transaction.commit();
        session.close();

       // --------------------Delete Teacher--------------------

//        session.delete(teacher);


        // --------------------get Teacher--------------------

//        Teacher teacher=session.get(Teacher.class,1);
//        System.out.println(teacher.toString());
    }
}