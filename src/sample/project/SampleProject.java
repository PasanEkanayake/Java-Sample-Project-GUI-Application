package sample.project;

public class SampleProject {
    
    public static void main(String[] args) {
        try{
            
            Login login = new Login();
            login.setVisible(true);
        }
        catch (Exception ex){
            
        }
    }
    
}
//Create method in the main file to connect the database and call them in other files