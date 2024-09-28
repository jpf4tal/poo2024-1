package org.example;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class organizadorGUI extends JFrame {
    public organizadorGUI() {
        setTitle("Agenda de organizadora de rotina");
        setSize(600, 600);
        setLocation(0, 0);
        //localização da janela na tela
        setResizable(false);
        //janela não redimensionável
        getContentPane().setBackground(Color.lightGray);
    }
}
