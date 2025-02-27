package Lat_UTC;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Files document_files = new Files();
        Integer choice, ttl_file = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            Menu start = new Menu();
            do{
                System.out.printf(">> "); choice = scanner.nextInt(); scanner.nextLine();
            }while(!(1<=choice && choice <= 4));

            switch (choice) {
                case 1:
                    int max = document_files.getSize_files();
                    String nama;
                    Integer size;
                    if (max >= 1){
                        do{
                            System.out.printf("Input the Document Name [1-50]: ");
                            nama = scanner.nextLine();
                        }while (nama.length() > 50);
    
                        do{
                            System.out.printf("Input the Document size [1 - %d]: ", max);
                            size = scanner.nextInt();
                        }while (size > max);
                        document_files.add_doc(new Document(nama, size));
                        ttl_file++;
                    }else System.out.println("There is Not Enough Storage Space");
                    
                    start.Press_Enter();
                    break;
                case 2:
                    System.out.println("View All Document");
                    System.out.println("=========================================================================");
                    document_files.print_file();
                    
                    start.Press_Enter();
                    break;
                case 3:
                    System.out.println("Approve Document");
                    System.out.println("=========================================================================");
                    if(ttl_file>=1){
                        document_files.print_file();
                        do{
                            System.out.printf("Input Document number to Approve: "); choice = scanner.nextInt(); scanner.nextLine();
                        }while(!(1<=choice && choice <= ttl_file));
                        document_files.approve_doc(choice);
                    }else System.out.println("There is No Document availabel");
                    
                    start.Press_Enter();
                    break;
                case 4:
                    return;
            }

        }while(true);
    }
}
