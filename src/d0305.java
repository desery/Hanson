import java.util.Scanner;

public static void main(String args[]){
    //用户给出名字
    System.out.println("你叫什么名字？")；
    
    
    
    //打出书架
    for (BookDetails book : BookDetails.values()) {  
        book.displayBookDetails();  
    }  
    System.out.println("要什么书")；


    System.out.println("是借还是买")；



    //打印出书的订单




}