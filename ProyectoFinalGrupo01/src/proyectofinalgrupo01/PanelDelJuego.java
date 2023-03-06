/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalgrupo01;

import Entradas.EntradasPorMouse;
import Entradas.EntradasPorTeclado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class PanelDelJuego extends JPanel {
    private float xDelta = 100, yDelta = 100;
    private int frames = 0;
    private long lastCkeck = 0;
    private BufferedImage imagen;
    private BufferedImage[] animacion;
    
    
    public PanelDelJuego(){
        addKeyListener(new EntradasPorTeclado(this));
        setPanelSize();
        ImportImg();
        cargarAnimaciones();
    }
    
    public void CambiarxDelta(int Valor){
        this.xDelta += Valor;
        
    }
    public void CambiaryDelta(int Valor){
        this.yDelta += Valor;
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        
        g.drawImage(animacion[2].getSubimage(0, 0, 120, 80),(int) xDelta,(int) yDelta ,128, 80,  null);
    }

    private void setPanelSize() {
        Dimension size = new Dimension(800, 600);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    private void ImportImg() {
        InputStream is = getClass().getResourceAsStream("/BloodLichIdleSide.png");
        try {
            imagen = ImageIO.read(is);
        } catch (IOException ex) {
            Logger.getLogger(PanelDelJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarAnimaciones() {
        animacion = new BufferedImage[10];
        
        for (int i = 0; i < animacion.length; i++) {
            animacion[i] = imagen.getSubimage(i*16, 0, 16, 16);
        }
    }
    

    
}




