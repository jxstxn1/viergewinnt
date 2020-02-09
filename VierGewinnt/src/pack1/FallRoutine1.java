package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class FallRoutine1 {
    Timer time;
    public FallRoutine1(){
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Gui.player ==1){
                    if (Gui.state[7] ==1){
                        if (Gui.state[0] == 0){
                            Gui.state[7]=0;
                            Gui.state[0]=1;
                        }
                    }
                    if (Gui.state[14] ==1){
                        if (Gui.state[7] == 0){
                            Gui.state[14]=0;
                            Gui.state[7]=1;
                        }
                    }
                    if (Gui.state[21] ==1){
                        if (Gui.state[14] == 0){
                            Gui.state[21]=0;
                            Gui.state[14]=1;
                        }
                    }
                    if (Gui.state[28] ==1){
                        if (Gui.state[21] == 0){
                            Gui.state[28]=0;
                            Gui.state[21]=1;
                        }
                    }
                    if (Gui.state[35] ==1){
                        if (Gui.state[28] == 0){
                            Gui.state[35]=0;
                            Gui.state[28]=1;
                        }
                    }
                    if (Gui.state[8] ==1){
                        if (Gui.state[1] == 0){
                            Gui.state[8]=0;
                            Gui.state[1]=1;
                        }
                    }
                    if (Gui.state[15] ==1){
                        if (Gui.state[8] == 0){
                            Gui.state[15]=0;
                            Gui.state[8]=1;
                        }
                    }
                    if (Gui.state[22] ==1){
                        if (Gui.state[15] == 0){
                            Gui.state[22]=0;
                            Gui.state[15]=1;
                        }
                    }if (Gui.state[29] ==1){
                        if (Gui.state[22] == 0){
                            Gui.state[29]=0;
                            Gui.state[22]=1;
                        }
                    }
                    if (Gui.state[36] ==1){
                        if (Gui.state[29] == 0){
                            Gui.state[36]=0;
                            Gui.state[29]=1;
                        }
                    }
                    if (Gui.state[9] ==1){
                        if (Gui.state[2] == 0){
                            Gui.state[9]=0;
                            Gui.state[2]=1;
                        }
                    }
                    if (Gui.state[16] ==1){
                        if (Gui.state[9] == 0){
                            Gui.state[16]=0;
                            Gui.state[9]=1;
                        }
                    }
                    if (Gui.state[23] ==1){
                        if (Gui.state[16] == 0){
                            Gui.state[23]=0;
                            Gui.state[9]=1;
                        }
                    }
                    if (Gui.state[30] ==1){
                        if (Gui.state[23] == 0){
                            Gui.state[30]=0;
                            Gui.state[23]=1;
                        }
                    }
                    if (Gui.state[37] ==1){
                        if (Gui.state[30] == 0){
                            Gui.state[37]=0;
                            Gui.state[30]=1;
                        }
                    }
                    if (Gui.state[10] ==1){
                        if (Gui.state[3] == 0){
                            Gui.state[10]=0;
                            Gui.state[3]=1;
                        }
                    }
                    if (Gui.state[11] ==1){
                        if (Gui.state[4] == 0){
                            Gui.state[11]=0;
                            Gui.state[4]=1;
                        }
                    }
                    if (Gui.state[12] ==1){
                        if (Gui.state[5] == 0){
                            Gui.state[12]=0;
                            Gui.state[5]=1;
                        }
                    }
                    if (Gui.state[13] ==1){
                        if (Gui.state[6] == 0){
                            Gui.state[13]=0;
                            Gui.state[6]=1;
                        }
                    }
                    if (Gui.state[17] ==1){
                        if (Gui.state[10] == 0){
                            Gui.state[17]=0;
                            Gui.state[10]=1;
                        }
                    }
                    if (Gui.state[18] ==1){
                        if (Gui.state[11] == 0){
                            Gui.state[18]=0;
                            Gui.state[11]=1;
                        }
                    }
                    if (Gui.state[19] ==1){
                        if (Gui.state[12] == 0){
                            Gui.state[19]=0;
                            Gui.state[12]=1;
                        }
                    }
                    if (Gui.state[24] ==1){
                        if (Gui.state[17] == 0){
                            Gui.state[24]=0;
                            Gui.state[17]=1;
                        }
                    }
                    if (Gui.state[25] ==1){
                        if (Gui.state[18] == 0){
                            Gui.state[25]=0;
                            Gui.state[18]=1;
                        }
                    }
                    if (Gui.state[26] ==1){
                        if (Gui.state[19] == 0){
                            Gui.state[26]=0;
                            Gui.state[19]=1;
                        }
                    }
                    if (Gui.state[27] ==1){
                        if (Gui.state[20] == 0){
                            Gui.state[27]=0;
                            Gui.state[20]=1;
                        }
                    }
                    if (Gui.state[31] ==1){
                        if (Gui.state[24] == 0){
                            Gui.state[31]=0;
                            Gui.state[24]=1;
                        }
                    }
                    if (Gui.state[32] ==1){
                        if (Gui.state[25] == 0){
                            Gui.state[32]=0;
                            Gui.state[25]=1;
                        }
                    }
                    if (Gui.state[33] ==1){
                        if (Gui.state[26] == 0){
                            Gui.state[33]=0;
                            Gui.state[26]=1;
                        }
                    }
                    if (Gui.state[34] ==1){
                        if (Gui.state[27] == 0){
                            Gui.state[34]=0;
                            Gui.state[27]=1;
                        }
                    }
                    if (Gui.state[38] ==1){
                        if (Gui.state[31] == 0){
                            Gui.state[38]=0;
                            Gui.state[31]=1;
                        }
                    }
                    if (Gui.state[39] ==1){
                        if (Gui.state[32] == 0){
                            Gui.state[39]=0;
                            Gui.state[32]=1;
                        }
                    }
                    if (Gui.state[40] ==1){
                        if (Gui.state[33] == 0){
                            Gui.state[40]=0;
                            Gui.state[33]=1;
                        }
                    }
                    if (Gui.state[41] ==1){
                        if (Gui.state[34] == 0){
                            Gui.state[41]=0;
                            Gui.state[34]=1;
                        }
                    }
                    if (Gui.state[20] ==1){
                        if (Gui.state[13] == 0){
                            Gui.state[20]=0;
                            Gui.state[13]=1;
                        }
                    }
                }

            }
        },0 ,10);

    }
}
