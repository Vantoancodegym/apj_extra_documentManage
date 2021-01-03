import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static DocumentManage documentManage=new DocumentManage();
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new document");
            System.out.println("2. searching and display document by id");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewDocument();
                    break;
                case 2:
                    System.out.println("Enter searching id");
                    int searchingId=Integer.parseInt(scanner.nextLine());
                    documentManage.displaySearchingResult(searchingId);
                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice!=0);
    }
    public static void addNewDocument(){
        int choice;
        System.out.println("1. Add new book");
        System.out.println("2. Add new journal");
        System.out.println("3. Add new Newapaper");
        choice=Integer.parseInt(scanner.nextLine());
        boolean goodChoice=choice==1||choice==2||choice==3;
        if (goodChoice) {
            System.out.println("Enter document id");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter publishing Name");
            String publishingName = scanner.nextLine();
            System.out.println("Enter issue amount");
            int issueAmount = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter author");
                    String author = scanner.nextLine();
                    System.out.println("Enter page amount");
                    int pageAmount = Integer.parseInt(scanner.nextLine());
                    Document book=new Book(id,publishingName,issueAmount,author,pageAmount);
                    documentManage.addNewDocument(book);
                    break;
                case 2:
                    System.out.println("Enter issue number");
                    int issueNumber = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter issue month");
                    int issueMonth = Integer.parseInt(scanner.nextLine());
                    Document journal=new Journal(id,publishingName,issueAmount,issueNumber,issueMonth);
                    documentManage.addNewDocument(journal);
                    break;
                case 3:
                    System.out.println("Enter issue day");
                    int issueDay = Integer.parseInt(scanner.nextLine());
                    Document newspaper=new Newspaper(id,publishingName,issueAmount,issueDay);
                    documentManage.addNewDocument(newspaper);
                    break;
            }
        }else System.out.println(" wrong choice");
    }

}
