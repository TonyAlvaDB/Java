
package proyectofinalgrupo01;


public class Juego implements Runnable{
    
    
    private VentanaDelJuego ventanaDelJuego;
    private PanelDelJuego panelDelJuego;
    private Thread gameThread;
    private final int FPS_SET = 120;
    
    public Juego(){
        panelDelJuego = new PanelDelJuego();
        ventanaDelJuego = new VentanaDelJuego(panelDelJuego);
        panelDelJuego.requestFocus();
        startGameLoop();
    }

    
    private void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    //GameLoop
    public void run() {
        
        double tiempoPorCuadro = 1000000000.0/FPS_SET;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        int frames = 0;
        long lastCheck = System.currentTimeMillis();
        
        while(true){
            now = System.nanoTime();
            if(now - lastFrame >= tiempoPorCuadro){
                
                panelDelJuego.repaint();
                lastFrame = now;
                frames++;
            }
            
            
            if (System.currentTimeMillis() - lastCheck >= 1000){
            lastCheck = System.currentTimeMillis();
            System.out.println(frames);
            frames = 0;
            }
        
        }
    }
}
