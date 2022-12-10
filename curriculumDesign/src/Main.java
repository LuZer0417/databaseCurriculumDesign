import db.DAO.DAOFactory.DAOFactory;
import db.publicClass_.Course;
import db.publicClass_.Student;
import db.publicClass_.Teacher;

public class Main {
    public static void main(String[] args) {
        //add student
        Student s1 =new Student("0326","zpw","06","05","火硕");
        //获得一个DAO工厂实例，再实例化一个学生类，再调用其方法
        // DAOFactory.getInstance().getStudentDAO().addStudent(s1);


        // 测试教师
        Teacher t =new Teacher("0417","lzzz","06",false,false,false);
        // DAOFactory.getInstance().getTeacherDAO().addTeacher(t);

        // 其他功能待测试

        // 测试course
        Course c = new Course("1234","lzz",false,1,1,"Messi","2053-01-01",1,1,true,"123","456");
        DAOFactory.getInstance().getCourseDAO().addCourse(c);
        // 这里有个报错就是nvarchar到smalldatetime类型上的报错，其实就是格式的问题 要注意


    }

}


