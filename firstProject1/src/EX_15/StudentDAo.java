package EX_15;

import java.util.ArrayList;
import java.util.List;

public class StudentDAo {
public List<Student> getStudentList() {
	List<Student> list = new ArrayList<>();
	list.add(new Student(Student.getName()+"-"+Student.getEns()+"-"+Student.getMas()));
	return list;
}
}
