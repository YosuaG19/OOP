package Lat_UTC;

public class Document {
    String doc_name, doc_type;
    Integer doc_size;

    Document(String name, Integer size){
        this.doc_name = name;
        this.doc_size = size;
        this.doc_type = "Draft";
    }

    public String getDoc_name() {
        return doc_name;
    }

    public Integer getDoc_size() {
        return doc_size;
    }

    public String getDoc_type() {
        return doc_type;
    }

    void print_doc_info(){
        System.out.printf("%-30s (%4d mb) - %s\n", doc_name, doc_size, doc_type);
    }
}
