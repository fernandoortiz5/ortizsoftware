/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortizsoft;

import br.com.ortizsoft.view.Menu;
import javax.swing.UIManager;

/**
 *
 * @author Fernandoi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });

    }
}
