
package proyectofinalgrupo01;

import javax.swing.JFrame;


public class VentanaDelJuego {
    
    private JFrame jframe;
    
    public VentanaDelJuego(PanelDelJuego panelDelJuego){
        jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(panelDelJuego);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
