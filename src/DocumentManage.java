import java.util.TreeMap;

public class DocumentManage {
    TreeMap<Integer,Document> documentList=new TreeMap<>();
    public void addNewDocument(Document document){
        int key=document.getId();
        documentList.put(key,document);
    }
    public Document searchingDocumentById(int searchingId){
        return documentList.get(searchingId);
    }
    public void displaySearchingResult(int searchingId){
        Document result=searchingDocumentById(searchingId);
        if (result==null) System.out.println("NOT FOUND");
        else System.out.println(result);
    }
}
