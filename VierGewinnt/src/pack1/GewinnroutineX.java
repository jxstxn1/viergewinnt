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

                    // Reihe 1 für X - Vertikal
                    if (Gui.state[0] == 1 && Gui.state[1] == 1 && Gui.state[2] == 1 && Gui.state[3] ==1) {
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[1] == 1 && Gui.state[2] == 1 && Gui.state[3] == 1 && Gui.state[4] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[2] == 1 && Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[3] == 1 && Gui.state[4] == 1 && Gui.state[5] == 1 && Gui.state[6] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[7] == 1 && Gui.state[8] == 1 && Gui.state[9] == 1 && Gui.state[10] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[8] == 1 && Gui.state[9] == 1 && Gui.state[10] == 1 && Gui.state[11] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[9] == 1 && Gui.state[10] == 1 && Gui.state[11] == 1 && Gui.state[12] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[10] == 1 && Gui.state[11] == 1 && Gui.state[12] == 1 && Gui.state[13] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[14] == 1 && Gui.state[15] == 1 && Gui.state[16] == 1 && Gui.state[17] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[15] == 1 && Gui.state[16] == 1 && Gui.state[17] == 1 && Gui.state[18] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[16] == 1 && Gui.state[17] == 1 && Gui.state[18] == 1 && Gui.state[19] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[17] == 1 && Gui.state[18] == 1 && Gui.state[19] == 1 && Gui.state[20] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[21] == 1 && Gui.state[22] == 1 && Gui.state[23] == 1 && Gui.state[24] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[22] == 1 && Gui.state[23] == 1 && Gui.state[24] == 1 && Gui.state[25] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[23] == 1 && Gui.state[24] == 1 && Gui.state[25] == 1 && Gui.state[26] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[24] == 1 && Gui.state[25] == 1 && Gui.state[26] == 1 && Gui.state[27] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[28] == 1 && Gui.state[29] == 1 && Gui.state[30] == 1 && Gui.state[31] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[29] == 1 && Gui.state[30] == 1 && Gui.state[31] == 1 && Gui.state[32] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[30] == 1 && Gui.state[31] == 1 && Gui.state[32] == 1 && Gui.state[33] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[31] == 1 && Gui.state[32] == 1 && Gui.state[33] == 1 && Gui.state[34] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[35] == 1 && Gui.state[36] == 1 && Gui.state[37] == 1 && Gui.state[38] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[36] == 1 && Gui.state[37] == 1 && Gui.state[38] == 1 && Gui.state[39] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[37] == 1 && Gui.state[38] == 1 && Gui.state[39] == 1 && Gui.state[40] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[38] == 1 && Gui.state[39] == 1 && Gui.state[40] == 1 && Gui.state[41] ==1){
                        Gui.gewinner = 1;
                    }

                    //Vertikal
                    if (Gui.state[0] == 1 && Gui.state[7] == 1 && Gui.state[14] == 1 && Gui.state[21] ==1) {
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[1] == 1 && Gui.state[8] == 1 && Gui.state[15] == 1 && Gui.state[22] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[2] == 1 && Gui.state[9] == 1 && Gui.state[16] == 1 && Gui.state[23] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[3] == 1 && Gui.state[10] == 1 && Gui.state[17] == 1 && Gui.state[24] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[4] == 1 && Gui.state[11] == 1 && Gui.state[18] == 1 && Gui.state[25] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[5] == 1 && Gui.state[12] == 1 && Gui.state[19] == 1 && Gui.state[26] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[6] == 1 && Gui.state[13] == 1 && Gui.state[20] == 1 && Gui.state[27] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[7] == 1 && Gui.state[14] == 1 && Gui.state[21] == 1 && Gui.state[28] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[8] == 1 && Gui.state[15] == 1 && Gui.state[22] == 1 && Gui.state[29] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[9] == 1 && Gui.state[16] == 1 && Gui.state[23] == 1 && Gui.state[30] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[10] == 1 && Gui.state[17] == 1 && Gui.state[24] == 1 && Gui.state[31] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[11] == 1 && Gui.state[18] == 1 && Gui.state[25] == 1 && Gui.state[32] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[12] == 1 && Gui.state[19] == 1 && Gui.state[26] == 1 && Gui.state[33] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[13] == 1 && Gui.state[20] == 1 && Gui.state[27] == 1 && Gui.state[34] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[14] == 1 && Gui.state[21] == 1 && Gui.state[28] == 1 && Gui.state[35] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[15] == 1 && Gui.state[22] == 1 && Gui.state[29] == 1 && Gui.state[36] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[16] == 1 && Gui.state[23] == 1 && Gui.state[30] == 1 && Gui.state[37] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[17] == 1 && Gui.state[24] == 1 && Gui.state[31] == 1 && Gui.state[38] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[18] == 1 && Gui.state[31] == 1 && Gui.state[32] == 1 && Gui.state[33] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[19] == 1 && Gui.state[32] == 1 && Gui.state[33] == 1 && Gui.state[34] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[20] == 1 && Gui.state[27] == 1 && Gui.state[34] == 1 && Gui.state[41] ==1){
                        Gui.gewinner = 1;
                    }

                    //Diagonal
                    if (Gui.state[0] == 1 && Gui.state[8] == 1 && Gui.state[16] == 1 && Gui.state[24] ==1) {
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[1] == 1 && Gui.state[9] == 1 && Gui.state[17] == 1 && Gui.state[25] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[2] == 1 && Gui.state[10] == 1 && Gui.state[18] == 1 && Gui.state[26] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[3] == 1 && Gui.state[11] == 1 && Gui.state[19] == 1 && Gui.state[27] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[7] == 1 && Gui.state[15] == 1 && Gui.state[23] == 1 && Gui.state[31] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[8] == 1 && Gui.state[16] == 1 && Gui.state[24] == 1 && Gui.state[32] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[9] == 1 && Gui.state[17] == 1 && Gui.state[25] == 1 && Gui.state[33] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[10] == 1 && Gui.state[18] == 1 && Gui.state[26] == 1 && Gui.state[34] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[14] == 1 && Gui.state[22] == 1 && Gui.state[30] == 1 && Gui.state[38] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[15] == 1 && Gui.state[23] == 1 && Gui.state[31] == 1 && Gui.state[39] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[16] == 1 && Gui.state[24] == 1 && Gui.state[32] == 1 && Gui.state[40] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[17] == 1 && Gui.state[25] == 1 && Gui.state[33] == 1 && Gui.state[41] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[35] == 1 && Gui.state[29] == 1 && Gui.state[23] == 1 && Gui.state[17] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[36] == 1 && Gui.state[30] == 1 && Gui.state[24] == 1 && Gui.state[18] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[37] == 1 && Gui.state[31] == 1 && Gui.state[25] == 1 && Gui.state[19] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[38] == 1 && Gui.state[32] == 1 && Gui.state[26] == 1 && Gui.state[20] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[28] == 1 && Gui.state[22] == 1 && Gui.state[16] == 1 && Gui.state[10] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[29] == 1 && Gui.state[23] == 1 && Gui.state[17] == 1 && Gui.state[11] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[30] == 1 && Gui.state[24] == 1 && Gui.state[18] == 1 && Gui.state[12] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[31] == 1 && Gui.state[25] == 1 && Gui.state[19] == 1 && Gui.state[13] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[21] == 1 && Gui.state[15] == 1 && Gui.state[9] == 1 && Gui.state[3] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[22] == 1 && Gui.state[16] == 1 && Gui.state[10] == 1 && Gui.state[4] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[23] == 1 && Gui.state[17] == 1 && Gui.state[11] == 1 && Gui.state[5] ==1){
                        Gui.gewinner = 1;
                    }
                    else if (Gui.state[24] == 1 && Gui.state[18] == 1 && Gui.state[12] == 1 && Gui.state[6] ==1){
                        Gui.gewinner = 1;
                    }




                }



            }
        }, 0, 150);
    }

}
