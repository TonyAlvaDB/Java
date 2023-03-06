/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entradas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import proyectofinalgrupo01.PanelDelJuego;

/**
 *
 * @author Tony
 */
public class EntradasPorTeclado implements KeyListener {

    private PanelDelJuego panelJuego;
    
    public EntradasPorTeclado(PanelDelJuego panelDelJuego){
        this.panelJuego = panelDelJuego;
    }

            
            
    public void keyTyped(KeyEvent e) {

    }

    
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                panelJuego.CambiarxDelta(-5);
                break;
            case KeyEvent.VK_W:
                panelJuego.CambiaryDelta(-5);
                break;
            case KeyEvent.VK_S:
                panelJuego.CambiaryDelta(5);
                break;
            case KeyEvent.VK_D:
                panelJuego.CambiarxDelta(5);
                break;
            
        }
    }

    
    public void keyReleased(KeyEvent e) {
        
    }
    
}
