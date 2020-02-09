package pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {

    JFrame jf;
    Draw draw;
    JButton btnReset;

    static JButton btn[] = new JButton[42];
    static int state[] = new int[42];
    static int player = 0;
    static int gewinner = 0;

    public Gui() {

        jf = new JFrame();
        jf.setSize(900, 700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setTitle("Vier Gewinnt");

        for(int i = 0; i<btn.length; i++){
            btn[i] = new JButton(""+i);
            btn[i].setVisible(true);
            btn[i].addActionListener(new ActionHandler() );
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            jf.add(btn[i]);

        }

        ButtonPlacement.place();

        btnReset = new JButton("Reset");
        btnReset.setBounds(20,150,100,40);
        btnReset.setVisible(true);
        btnReset.setBackground(new Color(51,102,153));
        btnReset.setForeground(Color.WHITE);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Funktion.reset();

            }
        });

        jf.add(btnReset);

        draw = new Draw();
        draw.setBounds(0, 0, 800, 600);
        draw.setVisible(true);
        jf.add(draw);

        jf.setVisible(true);


    }






}
