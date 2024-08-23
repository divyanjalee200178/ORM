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

        //------------------------Save,delete and Update Student---------------------------
//        FullName fullName=new FullName("Devi","Perera");
//        Student student=new Student();
//        student.setId(3);
//        student.setName(fullName);
//        student.setAddress("Galle");
//
//        Transaction transaction=session.beginTransaction();
//        session.save(student);
//        session.update(teacher);
//        session.delete(student);
//        transaction.commit();
//        session.close();


        //------------------------Get Student---------------------------
//         Student students=session.get(Student.class,1);
//        System.out.println(student.toString());

//        --------------------save,delete and update Teacher--------------------
        FullName fullName=new FullName("Saman","Perera");
        Teacher teacher=new Teacher();
        teacher.setId(3);
        teacher.setName(fullName);
        teacher.setAddress("Kandy");

        Transaction transaction=session.beginTransaction();
        session.save(teacher);
//      session.update(teacher);
//       session.delete(teacher);
        transaction.commit();
        session.close();


        // --------------------get Teacher--------------------

//        Teacher teachers=session.get(Teacher.class,1);
//        System.out.println(teacher.toString());
    }
}