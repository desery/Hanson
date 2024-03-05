import java.util.Scanner;

public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, String[] extraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = extraActivities;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public int addExtraActivity(String activity, int entries) {    
        this.extraActivities[this.extraActivities.length - 1] = activity;
        return this.extraActivities.length;
    }

    @Override
    public String toString() {
        String acts = "";
        for(int i=0; i<extraActivities.length; i++){
            acts = acts + extraActivities[i];
            
            if(i<extraActivities.length-1)
                acts = acts + ",";
        }
        return "ID:" + getStudentID() + "\n" + "Name:" + getStudentName() + "\n" + "activities:" + acts + "\n";
    }


    public static void main(String[] args) {    
        Scanner reader = new Scanner(System.in);
        System.out.println("How many activities do you want to add?");
        int entries = reader.nextInt();
        Student[] stus = new Student[entries];

        for (int i = 0; i < entries; i++) {
            System.out.println("Enter Student ID #" + (i + 1) + ":");
            String id = reader.nextLine();
            System.out.println("Enter Student Name #" + (i + 1) + ":");
            String name = reader.nextLine();
            System.out.println("Enter activity #" + (i + 1) + ":");
            String activity = reader.nextLine();
            String[] activities = new String[100];
            activities[0] = activity;

            stus[i] = new Student(id,name,activities);
        }

        for (int i = 0; i < entries; i++) {
            System.out.println("Following are the details of Student #:" + (i + 1));
            System.out.println(stus[i].toString()+"\n");
        }
    }
}