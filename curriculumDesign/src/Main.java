import db.DAO.classDAOImpl.DAOFactory;
import db.publicClass_.Student;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //add student
        Student s1 =new Student("0325","sb","06","05","水硕");
        //获得一个DAO工厂实例，再实例化一个学生类，再调用其方法
        DAOFactory.getInstance().getStudentDAO().addStudent(s1);




    }

}


