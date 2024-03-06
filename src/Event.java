import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Event {
    private String eventID;
    private String eventName;
    private String address;
    private LocalDate eventDate;    
    private List<String> eventAttendees;

    public Event(String eventID, String eventName, String address, List<String> eventAttendees) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.address = address;
        this.eventDate = LocalDate.now();
        this.eventAttendees = eventAttendees;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input eventID:");
        String eventID = sc.nextLine();
        System.out.println("Input eventName:");
        String eventName = sc.nextLine();
        System.out.println("Input address:");
        String address = sc.nextLine();
        System.out.println("Input Person Num:");
        int num = sc.nextInt();
        sc.nextLine();
        List<String> eventAttendees = new ArrayList<>();
        for(int i=0;i<num;i++){
            eventAttendees.add(sc.nextLine());
        }
         Event event = new Event(eventID,eventName,address,eventAttendees);
        
            System.out.println(event.toString());
            System.out.println("Input 1 To Add:");
            System.out.println("Input 2 To Delete:");
            System.out.println("Input 3 To Update:");
            System.out.println("Input 4 To Find:");
            int type = sc.nextInt();
            sc.nextLine();
            event.organizeEvent(type,sc);
        
    }

    public void organizeEvent(int type,Scanner sc){
        if(type==1){
            System.out.println("Input Name:");
            String name =  sc.nextLine();
            eventAttendees.add(name);
        }
        else if(type==2){
            System.out.println("Input Name:");
            String name =  sc.nextLine();
            for(int i=0; i<eventAttendees.size(); i++){
                if(eventAttendees.get(i).equals(name)){
                    eventAttendees.remove(i);
                    i--;
                }
            }
        }
        else if(type==3){
            System.out.println("Input Index Of List:");
            int pos =  sc.nextInt();
            sc.nextLine();
            System.out.println("Input Name:");
            String name =  sc.nextLine();
            eventAttendees.set(pos,name);
        }
        else if(type==4){
            System.out.println("Input Index Of List:");
            int pos =  sc.nextInt();
            sc.nextLine();
            System.out.println(eventAttendees.get(pos));
        }
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public List<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(List<String> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", address='" + address + '\'' +
                ", eventDate=" + eventDate +
                ", eventAttendees=" + eventAttendees +
                '}';
    }
}