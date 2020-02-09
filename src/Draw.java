import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    private static final long serialVersionUID =1L;

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draw

        g.setColor(Color.BLACK);

        //Horizontal


        g.drawLine(150,50,150,650);
        g.drawLine(250,50,250,650);
        g.drawLine(350,50,350,650);
        g.drawLine(450,50,450,650);
        g.drawLine(550,50,550,650);
        g.drawLine(650,50,650,650);
        g.drawLine(750,50,750,650);
        g.drawLine(850,50,850,650);

        //Vertikal

        g.drawLine(150,50,850,50);
        g.drawLine(150,150,850,150);
        g.drawLine(150,250,850,250);
        g.drawLine(150,350,850,350);
        g.drawLine(150,450,850,450);
        g.drawLine(150,550,850,550);
        g.drawLine(150,650,850,650);


        //Draw Player

        g.setColor(Color.BLACK);
        if(Gui.player == 0) {
            g.drawString("Spieler: X",25,50);
        }else if (Gui.player == 1){
            g.drawString("Spieler O",25,50);
        }

        //Draw Gewinner

        if(Gui.gewinner == 1){
            g.drawString("Gewninner X", 25,100);
        }else if (Gui.gewinner == 2){
            g.drawString("Gewninner O", 25,100);
        }




        if (Gui.state[0] == 1){
            g.drawImage(ImageLoader.imgX,175,575,50,50,null);
        }else if (Gui.state[0] == 2){
            g.drawImage(ImageLoader.imgO,175,575,50,50,null);
        }
        if (Gui.state[1] == 1){
            g.drawImage(ImageLoader.imgX,275,575,50,50,null);
        }else if (Gui.state[1] == 2){
            g.drawImage(ImageLoader.imgO,275,575,50,50,null);
        }
        if (Gui.state[2] == 1){
            g.drawImage(ImageLoader.imgX,375,575,50,50,null);
        }else if (Gui.state[2] == 2){
            g.drawImage(ImageLoader.imgO,375,575,50,50,null);
        }
        if (Gui.state[3] == 1){
            g.drawImage(ImageLoader.imgX,475,575,50,50,null);
        }else if (Gui.state[3] == 2){
            g.drawImage(ImageLoader.imgO,475,575,50,50,null);
        }
        if (Gui.state[4] == 1){
            g.drawImage(ImageLoader.imgX,575,575,50,50,null);
        }else if (Gui.state[4] == 2){
            g.drawImage(ImageLoader.imgO,575,575,50,50,null);
        }
        if (Gui.state[5] == 1){
            g.drawImage(ImageLoader.imgX,675,575,50,50,null);
        }else if (Gui.state[5] == 2){
            g.drawImage(ImageLoader.imgO,675,575,50,50,null);
        }
        if (Gui.state[6] == 1){
            g.drawImage(ImageLoader.imgX,775,575,50,50,null);
        }else if (Gui.state[6] == 2){
            g.drawImage(ImageLoader.imgO,775,575,50,50,null);
        }
        if (Gui.state[7] == 1){
            g.drawImage(ImageLoader.imgX,175,475,50,50,null);
        }else if (Gui.state[7] == 2){
            g.drawImage(ImageLoader.imgO,175,475,50,50,null);
        }
        if (Gui.state[8] == 1){
            g.drawImage(ImageLoader.imgX,275,475,50,50,null);
        }else if (Gui.state[8] == 2){
            g.drawImage(ImageLoader.imgO,275,475,50,50,null);
        }
        if (Gui.state[9] == 1){
            g.drawImage(ImageLoader.imgX,375,475,50,50,null);
        }else if (Gui.state[9] == 2){
            g.drawImage(ImageLoader.imgO,375,475,50,50,null);
        }
        if (Gui.state[10] == 1){
            g.drawImage(ImageLoader.imgX,475,475,50,50,null);
        }else if (Gui.state[10] == 2){
            g.drawImage(ImageLoader.imgO,475,475,50,50,null);
        }
        if (Gui.state[11] == 1){
            g.drawImage(ImageLoader.imgX,575,475,50,50,null);
        }else if (Gui.state[11] == 2){
            g.drawImage(ImageLoader.imgO,575,475,50,50,null);
        }
        if (Gui.state[12] == 1){
            g.drawImage(ImageLoader.imgX,675,475,50,50,null);
        }else if (Gui.state[12] == 2){
            g.drawImage(ImageLoader.imgO,675,475,50,50,null);
        }
        if (Gui.state[13] == 1){
            g.drawImage(ImageLoader.imgX,775,475,50,50,null);
        }else if (Gui.state[13] == 2){
            g.drawImage(ImageLoader.imgO,775,475,50,50,null);
        }
        if (Gui.state[14] == 1){
            g.drawImage(ImageLoader.imgX,175,375,50,50,null);
        }else if (Gui.state[14] == 2){
            g.drawImage(ImageLoader.imgO,175,375,50,50,null);
        }
        if (Gui.state[15] == 1){
            g.drawImage(ImageLoader.imgX,275,375,50,50,null);
        }else if (Gui.state[15] == 2){
            g.drawImage(ImageLoader.imgO,275,375,50,50,null);
        }
        if (Gui.state[16] == 1){
            g.drawImage(ImageLoader.imgX,375,375,50,50,null);
        }else if (Gui.state[16] == 2){
            g.drawImage(ImageLoader.imgO,375,375,50,50,null);
        }
        if (Gui.state[17] == 1){
            g.drawImage(ImageLoader.imgX,475,375,50,50,null);
        }else if (Gui.state[17] == 2){
            g.drawImage(ImageLoader.imgO,475,375,50,50,null);
        }
        if (Gui.state[18] == 1){
            g.drawImage(ImageLoader.imgX,575,375,50,50,null);
        }else if (Gui.state[18] == 2){
            g.drawImage(ImageLoader.imgO,575,375,50,50,null);
        }
        if (Gui.state[19] == 1){
            g.drawImage(ImageLoader.imgX,675,375,50,50,null);
        }else if (Gui.state[19] == 2){
            g.drawImage(ImageLoader.imgO,675,375,50,50,null);
        }
        if (Gui.state[20] == 1){
            g.drawImage(ImageLoader.imgX,775,375,50,50,null);
        }else if (Gui.state[20] == 2){
            g.drawImage(ImageLoader.imgO,775,375,50,50,null);
        }
        if (Gui.state[21] == 1){
            g.drawImage(ImageLoader.imgX,175,275,50,50,null);
        }else if (Gui.state[21] == 2){
            g.drawImage(ImageLoader.imgO,175,275,50,50,null);
        }
        if (Gui.state[22] == 1){
            g.drawImage(ImageLoader.imgX,275,275,50,50,null);
        }else if (Gui.state[22] == 2){
            g.drawImage(ImageLoader.imgO,275,275,50,50,null);
        }
        if (Gui.state[23] == 1){
            g.drawImage(ImageLoader.imgX,375,275,50,50,null);
        }else if (Gui.state[23] == 2){
            g.drawImage(ImageLoader.imgO,375,275,50,50,null);
        }
        if (Gui.state[24] == 1){
            g.drawImage(ImageLoader.imgX,475,275,50,50,null);
        }else if (Gui.state[24] == 2){
            g.drawImage(ImageLoader.imgO,475,275,50,50,null);
        }
        if (Gui.state[25] == 1){
            g.drawImage(ImageLoader.imgX,575,275,50,50,null);
        }else if (Gui.state[25] == 2){
            g.drawImage(ImageLoader.imgO,575,275,50,50,null);
        }
        if (Gui.state[26] == 1){
            g.drawImage(ImageLoader.imgX,675,275,50,50,null);
        }else if (Gui.state[26] == 2){
            g.drawImage(ImageLoader.imgO,675,275,50,50,null);
        }
        if (Gui.state[27] == 1){
            g.drawImage(ImageLoader.imgX,775,275,50,50,null);
        }else if (Gui.state[27] == 2){
            g.drawImage(ImageLoader.imgO,775,275,50,50,null);
        }
        if (Gui.state[28] == 1){
            g.drawImage(ImageLoader.imgX,175,175,50,50,null);
        }else if (Gui.state[28] == 2){
            g.drawImage(ImageLoader.imgO,175,175,50,50,null);
        }
        if (Gui.state[29] == 1){
            g.drawImage(ImageLoader.imgX,275,175,50,50,null);
        }else if (Gui.state[29] == 2){
            g.drawImage(ImageLoader.imgO,275,175,50,50,null);
        }
        if (Gui.state[30] == 1){
            g.drawImage(ImageLoader.imgX,375,175,50,50,null);
        }else if (Gui.state[30] == 2){
            g.drawImage(ImageLoader.imgO,375,175,50,50,null);
        }
        if (Gui.state[31] == 1){
            g.drawImage(ImageLoader.imgX,475,175,50,50,null);
        }else if (Gui.state[31] == 2){
            g.drawImage(ImageLoader.imgO,475,175,50,50,null);
        }
        if (Gui.state[32] == 1){
            g.drawImage(ImageLoader.imgX,575,175,50,50,null);
        }else if (Gui.state[32] == 2){
            g.drawImage(ImageLoader.imgO,575,175,50,50,null);
        }
        if (Gui.state[33] == 1){
            g.drawImage(ImageLoader.imgX,675,175,50,50,null);
        }else if (Gui.state[33] == 2){
            g.drawImage(ImageLoader.imgO,675,175,50,50,null);
        }

        if (Gui.state[34] == 1){
            g.drawImage(ImageLoader.imgX,775,175,50,50,null);
        }else if (Gui.state[34] == 2){
            g.drawImage(ImageLoader.imgO,775,175,50,50,null);
        }
        if (Gui.state[35] == 1){
            g.drawImage(ImageLoader.imgX,175,75,50,50,null);
        }else if (Gui.state[35] == 2){
            g.drawImage(ImageLoader.imgO,175,75,50,50,null);
        }
        if (Gui.state[36] == 1){
            g.drawImage(ImageLoader.imgX,275,75,50,50,null);
        }else if (Gui.state[36] == 2){
            g.drawImage(ImageLoader.imgO,275,75,50,50,null);
        }
        if (Gui.state[37] == 1){
            g.drawImage(ImageLoader.imgX,375,75,50,50,null);
        }else if (Gui.state[37] == 2){
            g.drawImage(ImageLoader.imgO,375,75,50,50,null);
        }
        if (Gui.state[38] == 1){
            g.drawImage(ImageLoader.imgX,475,75,50,50,null);
        }else if (Gui.state[38] == 2){
            g.drawImage(ImageLoader.imgO,475,75,50,50,null);
        }
        if (Gui.state[39] == 1){
            g.drawImage(ImageLoader.imgX,575,75,50,50,null);
        }else if (Gui.state[39] == 2){
            g.drawImage(ImageLoader.imgO,575,75,50,50,null);
        }
        if (Gui.state[40] == 1){
            g.drawImage(ImageLoader.imgX,675,75,50,50,null);
        }else if (Gui.state[40] == 2){
            g.drawImage(ImageLoader.imgO,675,75,50,50,null);
        }
        if (Gui.state[41] == 1){
            g.drawImage(ImageLoader.imgX,775,75,50,50,null);
        }else if (Gui.state[41] == 2){
            g.drawImage(ImageLoader.imgO,775,75,50,50,null);
        }

        ((Graphics2D) g).setBackground(Color.ORANGE);


        repaint();

    }

}
