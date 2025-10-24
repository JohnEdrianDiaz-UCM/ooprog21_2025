import javax.swing.JOptionPane;


public class UsingJOptionPaneDialogs {
   public static void main (String[] args){
      
      int confirmation;
      String name;
   
     do {
     
        name = JOptionPane.showInputDialog(null, "Please put your Name in the blank:");
                  
        if (name == null){
         System.exit(0);
        }
       
        confirmation = JOptionPane.showConfirmDialog(null, 
         "Do you want to display your name?",
         "Confirmation Dialog",
         JOptionPane.YES_NO_OPTION);      
      
      }while (confirmation == JOptionPane.NO_OPTION);
     
     JOptionPane.showMessageDialog(null, "Hello~! " + name);
     
   }
}