package Lab4;

public class Lab4 {

  
    
    public static void main(String[] args) {
        
    String src = "C:\Users\Admin\Documents\text.txt";
        
    String dst = "C:\Users\Admin\Documents\newtext.txt";
        
    FileManager fileManager;
        
    try{
            
        fileManager =new FileManager();
            
        fileManager.copyFile(src,dst);
            
        System.out.println("Копирование прошло успешно");
        
         }
        
    catch (Exception e){
            
        System.out.println(e.getMessage());
    
         }
    

    }

}
