public class bubbleSort {
    //array = {38,65,3,17,2}
    public void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                System.out.println("i value is"+i+" and j value is"+j);
                if(array[j]>array[j+1]){
                int temp=array[j];

                array[j]=array[j+1];
                array[j+1]=temp;
            }


            }


        }
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]+",");
        }
    }
}



public void addStudents(int entries, int i){
    System.out.println("\n" + "Please enter the details for Student #:" + (i+1) + "\n");
     
    System.out.println("\n" + "Please enter the ID for Student #:" + "\n");
     String id = reader.nextLine();
     setStudentID(id);
         
     System.out.println("Please enter the name for Student #:"  + "\n");
     String name = reader.nextLine();
     setStudentName(name);
     
     System.out.println("Please enter the gender for Student #:" + "\n");
     char gender = reader.nextLine().charAt(0);
     setStudentGender(gender);
     
     System.out.println("Please enter the address for Student #:" + "\n");
     String address = reader.nextLine();
     setStudentAddress(address);
     
     System.out.println("Please enter the status for Student #:" + "\n");
     String status = reader.nextLine();
     setStudentStatus(status);
     } 