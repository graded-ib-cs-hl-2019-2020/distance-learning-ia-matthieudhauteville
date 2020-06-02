package App;

/**
 *
 * @author novac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static GUI gui;
    public static GUI1 gui1;
    private static String inputU = "Arcacrear";
    private static String inputP = "Crear12321";
    private static String outputU = "Arcaacessar";
    private static String outputP = "Acessar12321";
    public static int attemptsLeft = 3;
    

    public static void main(String[] args) {
        /* Create and display the GUI */
        gui = new GUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui.setVisible(true);
            }
        });
    }

    public static void btnLoginPressed() {
        
        String username = gui.getUsername(); 
        String password = gui.getPassword(); 
        
        if (attemptsLeft > 0) {
            if (username.equals(inputU)) {
                if (password.equals(inputP)) {
                    attemptsLeft = 3;
                    gui.setBlank();
                    gui.setVisible(false);
                    gui1 = new GUI1();
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            gui1.setVisible(true);
                        }
                    });                    
                } else {
                    attemptsLeft--;
                    gui.setMessageText("Wrong login! Attempts left: " + attemptsLeft);
                    //Change message to incorrect login info, remaining attempts = x
                }
            } else if (username.equals(outputU)) {
                if (password.equals(outputP)) {
                    attemptsLeft = 3;
                    gui.setMessageText("Entering output page! Attempts left: " + attemptsLeft);
                    //Show output interface and make attempt count = 0
                } else {
                    attemptsLeft--;
                    gui.setMessageText("Wrong login! Attempts left: " + attemptsLeft);
                    //Change message to incorrect login info, remaining attempts = x
                }
            } else {
                attemptsLeft--;
                gui.setMessageText("Wrong login! Attempts left: " + attemptsLeft);
                //Change message to incorrect login info, remaining attempts = x
            }
        } else {
            gui.setMessageText("No attempts left.");
        }
    }
    
    public static void quitInput() {
        gui1.setVisible(false); 
        gui.setVisible(true);
    }
    
}

