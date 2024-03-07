package ui;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {

    public Main() {

        setSize(300, 300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
               beenden();
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    beenden();
                }
            }
        });
    }

    private void beenden() {
        System.out.println("Daten speichern etc.");
        dispose();
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}