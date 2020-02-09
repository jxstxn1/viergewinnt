package pack1;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class GewinnroutineO {
    Timer time;

    public GewinnroutineO() {
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {


                if (Gui.gewinner == 0) {
                    //X - horizontal
                    if (Gui.state[0] == 2 && Gui.state[1] == 2 && Gui.state[2] == 2 && Gui.state[3] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[1] == 2 && Gui.state[2] == 2 && Gui.state[3] == 2 && Gui.state[4] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[2] == 2 && Gui.state[3] == 2 && Gui.state[4] == 2 && Gui.state[5] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[3] == 2 && Gui.state[4] == 2 && Gui.state[5] == 2 && Gui.state[6] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[7] == 2 && Gui.state[8] == 2 && Gui.state[9] == 2 && Gui.state[10] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[8] == 2 && Gui.state[9] == 2 && Gui.state[10] == 2 && Gui.state[11] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[9] == 2 && Gui.state[10] == 2 && Gui.state[11] == 2 && Gui.state[12] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[10] == 2 && Gui.state[11] == 2 && Gui.state[12] == 2 && Gui.state[13] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[14] == 2 && Gui.state[15] == 2 && Gui.state[16] == 2 && Gui.state[17] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[15] == 2 && Gui.state[16] == 2 && Gui.state[17] == 2 && Gui.state[18] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[16] == 2 && Gui.state[17] == 2 && Gui.state[18] == 2 && Gui.state[19] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[17] == 2 && Gui.state[18] == 2 && Gui.state[19] == 2 && Gui.state[20] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[21] == 2 && Gui.state[22] == 2 && Gui.state[23] == 2 && Gui.state[24] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[22] == 2 && Gui.state[23] == 2 && Gui.state[24] == 2 && Gui.state[25] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[23] == 2 && Gui.state[24] == 2 && Gui.state[25] == 2 && Gui.state[26] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[24] == 2 && Gui.state[25] == 2 && Gui.state[26] == 2 && Gui.state[27] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[28] == 2 && Gui.state[29] == 2 && Gui.state[30] == 2 && Gui.state[31] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[29] == 2 && Gui.state[30] == 2 && Gui.state[31] == 2 && Gui.state[32] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[30] == 2 && Gui.state[31] == 2 && Gui.state[32] == 2 && Gui.state[33] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[31] == 2 && Gui.state[32] == 2 && Gui.state[33] == 2 && Gui.state[34] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[35] == 2 && Gui.state[36] == 2 && Gui.state[37] == 2 && Gui.state[38] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[36] == 2 && Gui.state[37] == 2 && Gui.state[38] == 2 && Gui.state[39] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[37] == 2 && Gui.state[38] == 2 && Gui.state[39] == 2 && Gui.state[40] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[38] == 2 && Gui.state[39] == 2 && Gui.state[40] == 2 && Gui.state[41] == 2) {
                        Gui.gewinner = 2;
                    }
                    //x vertikal
                    else if (Gui.state[0] == 2 && Gui.state[7] == 2 && Gui.state[14] == 2 && Gui.state[21] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[7] == 2 && Gui.state[14] == 2 && Gui.state[21] == 2 && Gui.state[28] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[14] == 2 && Gui.state[21] == 2 && Gui.state[28] == 2 && Gui.state[35] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[1] == 2 && Gui.state[8] == 2 && Gui.state[15] == 2 && Gui.state[22] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[8] == 2 && Gui.state[15] == 2 && Gui.state[22] == 2 && Gui.state[29] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[15] == 2 && Gui.state[22] == 2 && Gui.state[29] == 2 && Gui.state[36] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[2] == 2 && Gui.state[9] == 2 && Gui.state[16] == 2 && Gui.state[23] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[9] == 2 && Gui.state[16] == 2 && Gui.state[23] == 2 && Gui.state[30] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[16] == 2 && Gui.state[23] == 2 && Gui.state[30] == 2 && Gui.state[37] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[3] == 2 && Gui.state[10] == 2 && Gui.state[17] == 2 && Gui.state[24] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[10] == 2 && Gui.state[17] == 2 && Gui.state[24] == 2 && Gui.state[31] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[17] == 2 && Gui.state[24] == 2 && Gui.state[31] == 2 && Gui.state[38] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[4] == 2 && Gui.state[11] == 2 && Gui.state[18] == 2 && Gui.state[25] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[11] == 2 && Gui.state[18] == 2 && Gui.state[25] == 2 && Gui.state[32] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[18] == 2 && Gui.state[25] == 2 && Gui.state[32] == 2 && Gui.state[39] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[5] == 2 && Gui.state[12] == 2 && Gui.state[19] == 2 && Gui.state[26] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[12] == 2 && Gui.state[19] == 2 && Gui.state[26] == 2 && Gui.state[33] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[19] == 2 && Gui.state[26] == 2 && Gui.state[33] == 2 && Gui.state[40] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[6] == 2 && Gui.state[13] == 2 && Gui.state[20] == 2 && Gui.state[27] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[13] == 2 && Gui.state[20] == 2 && Gui.state[27] == 2 && Gui.state[34] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[20] == 2 && Gui.state[27] == 2 && Gui.state[34] == 2 && Gui.state[41] == 2) {
                        Gui.gewinner = 2;
                    }
                    //für x- diagonal
                    else if (Gui.state[35] == 2 && Gui.state[29] == 2 && Gui.state[23] == 2 && Gui.state[17] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[36] == 2 && Gui.state[30] == 2 && Gui.state[24] == 2 && Gui.state[18] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[37] == 2 && Gui.state[31] == 2 && Gui.state[25] == 2 && Gui.state[19] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[38] == 2 && Gui.state[30] == 2 && Gui.state[22] == 2 && Gui.state[14] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[38] == 2 && Gui.state[32] == 2 && Gui.state[26] == 2 && Gui.state[20] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[39] == 2 && Gui.state[31] == 2 && Gui.state[23] == 2 && Gui.state[15] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[40] == 2 && Gui.state[32] == 2 && Gui.state[24] == 2 && Gui.state[16] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[41] == 2 && Gui.state[33] == 2 && Gui.state[25] == 2 && Gui.state[17] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[28] == 2 && Gui.state[22] == 2 && Gui.state[16] == 2 && Gui.state[10] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[29] == 2 && Gui.state[23] == 2 && Gui.state[17] == 2 && Gui.state[11] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[30] == 2 && Gui.state[24] == 2 && Gui.state[18] == 2 && Gui.state[12] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[31] == 2 && Gui.state[25] == 2 && Gui.state[19] == 2 && Gui.state[13] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[31] == 2 && Gui.state[23] == 2 && Gui.state[15] == 2 && Gui.state[7] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[32] == 2 && Gui.state[24] == 2 && Gui.state[16] == 2 && Gui.state[8] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[33] == 2 && Gui.state[25] == 2 && Gui.state[17] == 2 && Gui.state[9] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[34] == 2 && Gui.state[26] == 2 && Gui.state[18] == 2 && Gui.state[10] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[21] == 2 && Gui.state[15] == 2 && Gui.state[9] == 2 && Gui.state[3] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[22] == 2 && Gui.state[16] == 2 && Gui.state[10] == 2 && Gui.state[4] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[23] == 2 && Gui.state[17] == 2 && Gui.state[11] == 2 && Gui.state[5] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[24] == 2 && Gui.state[18] == 2 && Gui.state[12] == 2 && Gui.state[6] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[24] == 2 && Gui.state[16] == 2 && Gui.state[8] == 2 && Gui.state[0] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[25] == 2 && Gui.state[17] == 2 && Gui.state[9] == 2 && Gui.state[1] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[26] == 2 && Gui.state[18] == 2 && Gui.state[10] == 2 && Gui.state[2] == 2) {
                        Gui.gewinner = 2;
                    } else if (Gui.state[27] == 2 && Gui.state[19] == 2 && Gui.state[11] == 2 && Gui.state[3] == 2) {
                        Gui.gewinner = 2;
                    }


                }
            }

        }, 0, 150);

    }
}