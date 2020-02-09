package pack1;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class GewinnroutineX {
    Timer time;

    public GewinnroutineX() {
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Gui.gewinner == 0) {

                    // Reihe 1 für X - horizontal
                    if (Gui.state[0] == 1 && Gui.state[1] == 1 && Gui.state[2] == 1 && Gui.state[3] == 1) {
                        Gui.gewinner = 1;
                    }else if (Gui.state[1] == 1 && Gui.state[2] == 1 && Gui.state[3] == 1 && Gui.state[4] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[2] == 1 && Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1 && Gui.state[6] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[7] == 1 && Gui.state[8] == 1 && Gui.state[9] == 1 && Gui.state[10] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[8] == 1 && Gui.state[9] == 1 && Gui.state[10] == 1 && Gui.state[11] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[9] == 1 && Gui.state[10] == 1 && Gui.state[11] == 1 && Gui.state[12] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[10] == 1 && Gui.state[11] == 1 && Gui.state[12] == 1 && Gui.state[13] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[14] == 1 && Gui.state[15] == 1 && Gui.state[16] == 1 && Gui.state[17] == 1){
                        Gui.gewinner = 1;
                    }else if (Gui.state[15] == 1 && Gui.state[16] == 1 && Gui.state[17] == 1 && Gui.state[18] == 1){
                        Gui.gewinner = 1;
                    }


                }

            }

        }, 0, 150);

    }
}