import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Random rand = new Random();
    Department cs = new Department();


    for(int i=0; i<40;i++){
        int courseCredit = rand.nextInt(6)+1;
        cs.getCourses().add(new GraduateCourse(i+100,"Course"+ Integer.toString(i),courseCredit));
    }
        for(int i=0; i<40;i++){
            int courseCredit = rand.nextInt(6)+1;
            cs.getCourses().add(new UnderGraduateCourse(i+100,"Course"+ Integer.toString(i),courseCredit));
        }
        System.out.print("[ ");
        for(int i=0; i<cs.getCourses().size();i++){
        System.out.print(cs.getCourses().get(i).getCourseName()+" - "+cs.getCourses().get(i).getCourseCode()+"-"+cs.getCourses().get(i).getCourseCredit()+" , ");
        }
        System.out.println(" ]");


        Lecturer headofDepartment = new HeadofDepartment(310824038,"Emre","Akdoğan", cs.getCourses().get(1));
        Lecturer headofDepartment2 = new HeadofDepartment(3108248,"Emrea","Akdoğand", cs.getCourses().get(2));
        Lecturer lecturer2 = new Lecturer(310824038,"Muhammet","Özer", cs.getCourses().get(2));
        Lecturer lecturer3 = new Lecturer(310824038,"Furkan","Kaya", cs.getCourses().get(3));
        Lecturer lecturer4 = new Lecturer(310824038,"Şeyma","Su", cs.getCourses().get(4));
        Lecturer lecturer5 = new Lecturer(310824038,"Ali","Akdoğan", cs.getCourses().get(5));
        Lecturer lecturer6 = new Lecturer(310824038,"Fırat","Yılmaz", cs.getCourses().get(6));


        Student student = new Student(855,"Cenk","Altun",2015,"undergraduate");
        Student student1 = new Student(855,"Gözde","",2015,"undergraduate");
        Student student2 = new Student(855,"Ceyda","Ken",2015,"graduate");
        Student student3 = new Student(855,"Ece","Ken",2015,"graduate");

        cs.getLecturers().add(headofDepartment);
        cs.getLecturers().add(lecturer2);
        cs.getLecturers().add(lecturer3);
        cs.getLecturers().add(lecturer4);
        cs.getLecturers().add(lecturer5);
        cs.getLecturers().add(lecturer6);


        System.out.print("[ ");
        for(int i=0; i<cs.getLecturers().size();i++){
            System.out.print(cs.getLecturers().get(i).getName()+" , ");
        }
        System.out.println(" ]");

        SecretaryStaff secretaryStaff = new SecretaryStaff(66666,"Ayşe","Durak","Management","09.00-18.00");
        DepartmentManager departmentManager = new DepartmentManager(cs);

        Area lessonClass = new Class(1,2,false,"CS",216);
        Area canteen = new Canteen(0,2,false,false,"Food");





        System.out.println("Sekreter Öğretmenlere Ders Ekliyor");
        for(int i=0;i<10;i++){
            secretaryStaff.assignCourseLecturer(cs.getCourses().get(i),lecturer2);
        }
        for(int i=10;i<20;i++){
            secretaryStaff.assignCourseLecturer(cs.getCourses().get(i),lecturer3);
        }
        for(int i=20;i<30;i++){
            secretaryStaff.assignCourseLecturer(cs.getCourses().get(i),lecturer4);
        }
        for(int i=30;i<40;i++){
            secretaryStaff.assignCourseLecturer(cs.getCourses().get(i),headofDepartment);
        }

        System.out.println("Öğretmen maks 10 ders verebilir!");
        secretaryStaff.assignCourseLecturer(cs.getCourses().get(40),headofDepartment);
        secretaryStaff.assignCourseLecturer(cs.getCourses().get(39),headofDepartment);




        System.out.println("Sekreter Öğretmenlere Ders değiştirme");
        System.out.println(cs.getCourses().get(2).getCourseLecturer());
        secretaryStaff.changeCourseLecturer(cs.getCourses().get(2),lecturer5);
        System.out.println(cs.getCourses().get(2).getCourseLecturer());


        // öğrenci ekleme
        cs.getStudents().add(student);
        cs.getStudents().add(student1);
        cs.getStudents().add(student2);
        cs.getStudents().add(student3);
        departmentManager.registerStudent(123456,"Emir","Doğan",2018,"graduate");
        departmentManager.registerStudent(123456,"Ömür","Ağbal",2019,"undergraduate");

        System.out.print("[ ");
        for(int i=0; i<cs.getStudents().size();i++){
            System.out.print(cs.getStudents().get(i).getName()+" , ");
        }
        System.out.println(" ]");
        // öğrenci ders atama
        for(int i =0;i<40;i++){
            departmentManager.assignCourse(cs.getStudents().get(2),cs.getCourses().get(i),cs.getCourses());
        }
        System.out.print("[ ");
        for(int i =0;i<40;i++){
            System.out.println(cs.getStudents().get(2).getStudentcourses().keySet().stream().toList().get(i).getCourseName()+" ");
        }
        System.out.println(" ]");

        // olmayan dersi alıyor
        Course course1= new Course(1111,"Physics",6);
        departmentManager.assignCourse(cs.getStudents().get(1),course1,cs.getCourses());



        // öğretmen öğrenci not ver
        System.out.println(student2.getStudentcourses().get(cs.getCourses().get(40).getClass()));
        departmentManager.gradeCourse(student2,headofDepartment,cs.getCourses().get(40),"AA");
        // öğretmenin verdiği notu görüntüle
        System.out.println(student2.getStudentcourses().get(cs.getCourses().get(40)));
        // öğrencinin dderslerini görüntüle
        departmentManager.getInfo(cs.getStudents().get(2));
        // mezuniyet belgesi



        //for(int i=0;i<40;i++){

         ///   departmentManager.gradeCourse(cs.getStudents().get(2),lecturer2,cs.getCourses().get(i),"AA");
          ///  System.out.println(cs.getStudents().get(2).getStudentcourses().values());
       /// }





    }





}