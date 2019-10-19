import java.util.ArrayList;
import java.util.List;

public class StudentDataSource {

    String name;
    String password;
    int id;

    public static StudentDataSource instance=null;

    private List<StudentDataSource> students=new ArrayList<>();

    private StudentDataSource(){
        StudentDataSource st=new StudentDataSource();
        st.name="sahil";
        st.id=1;
        st.password="rangra";
        this.students.add(st);
    }

    public static StudentDataSource getInstance(){
        if(instance==null)
        {
            instance=new StudentDataSource();
        }
        return instance;
    }

    public void addStudent(StudentDataSource st){
        this.students.add(st);
    }



}
