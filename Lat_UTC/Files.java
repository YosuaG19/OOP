package Lat_UTC;
import java.util.ArrayList;

public class Files {
    ArrayList<Document> document_files = new ArrayList<Document>();
    Integer size_files = 1024;
    
    void add_doc(Document doc){
        document_files.add(doc);
        size_files -= doc.getDoc_size();
    }

    void approve_doc(Integer index){
        if(document_files.get(index-1).doc_type.contains("Draft")){
            document_files.get(index-1).doc_type = document_files.get(index-1).doc_type.replace("Draft", "Approved");
        }else{
            System.out.println("The Document is Already Approved!");
        }
    }

    Integer decrease_size(Integer size){
        return size_files - size;
    }

    public Integer getSize_files() {
        return size_files;
    }

    void print_file(){
        int i = 1;

        for(Document docs : document_files){
            System.err.printf("%02d. ", i);
            docs.print_doc_info();
            i++;
        }
    }
}
