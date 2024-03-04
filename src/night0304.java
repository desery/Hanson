private String teacherID;
private String teacherName;
public Student(String teacherID,String teacherName){
    this.teacherID = teacherID;
    this.teacherName = teacherName;
}

public String getTeacherID(){
return teacherID
}
public void searchByID(String id){
for(Students student:Student values()){
    if(student.getID().equals(id)){
        System.out.println("The student was found");
        System.out.println("name"+student.getName());
        System.out
    }

}

}