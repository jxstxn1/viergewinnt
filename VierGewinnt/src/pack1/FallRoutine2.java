package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class FallRoutine2 {
    Timer time;
    public FallRoutine2(){
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Gui.player ==0){
                    if (Gui.state[7] ==2){
                        if (Gui.state[0] == 0){
                            Gui.state[7]=0;
                            Gui.state[0]=2;
                        }
                    }
                    if (Gui.state[14] ==2){
                        if (Gui.state[7] == 0){
                            Gui.state[14]=0;
                            Gui.state[7]=2;
                        }
                    }
                    if (Gui.state[21] ==2){
                        if (Gui.state[14] == 0){
                            Gui.state[21]=0;
                            Gui.state[14]=2;
                        }
                    }
                    if (Gui.state[28] ==2){
                        if (Gui.state[21] == 0){
                            Gui.state[28]=0;
                            Gui.state[21]=2;
                        }
                    }
                    if (Gui.state[35] ==2){
                        if (Gui.state[28] == 0){
                            Gui.state[35]=0;
                            Gui.state[28]=2;
                        }
                    }
                    if (Gui.state[8] ==2){
                        if (Gui.state[1] == 0){
                            Gui.state[8]=0;
                            Gui.state[1]=2;
                        }
                    }
                    if (Gui.state[15] ==2){
                        if (Gui.state[8] == 0){
                            Gui.state[15]=0;
                            Gui.state[8]=2;
                        }
                    }
                    if (Gui.state[22] ==2){
                        if (Gui.state[15] == 0){
                            Gui.state[22]=0;
                            Gui.state[15]=2;
                        }
                    }if (Gui.state[29] ==2){
                        if (Gui.state[22] == 0){
                            Gui.state[29]=0;
                            Gui.state[22]=2;
                        }
                    }
                    if (Gui.state[36] ==2){
                        if (Gui.state[29] == 0){
                            Gui.state[36]=0;
                            Gui.state[29]=2;
                        }
                    }
                    if (Gui.state[9] ==2){
                        if (Gui.state[2] == 0){
                            Gui.state[9]=0;
                            Gui.state[2]=2;
                        }
                    }
                    if (Gui.state[16] ==2){
                        if (Gui.state[9] == 0){
                            Gui.state[16]=0;
                            Gui.state[9]=2;
                        }
                    }
                    if (Gui.state[23] ==2){
                        if (Gui.state[16] == 0){
                            Gui.state[23]=0;
                            Gui.state[9]=2;
                        }
                    }
                    if (Gui.state[30] ==2){
                        if (Gui.state[23] == 0){
                            Gui.state[30]=0;
                            Gui.state[23]=2;
                        }
                    }
                    if (Gui.state[37] ==2){
                        if (Gui.state[30] == 0){
                            Gui.state[37]=0;
                            Gui.state[30]=2;
                        }
                    }
                    if (Gui.state[10] ==2){
                        if (Gui.state[3] == 0){
                            Gui.state[10]=0;
                            Gui.state[3]=2;
                        }
                    }
                    if (Gui.state[11] ==2){
                        if (Gui.state[4] == 0){
                            Gui.state[11]=0;
                            Gui.state[4]=2;
                        }
                    }
                    if (Gui.state[12] ==2){
                        if (Gui.state[5] == 0){
                            Gui.state[12]=0;
                            Gui.state[5]=2;
                        }
                    }
                    if (Gui.state[13] ==2){
                        if (Gui.state[6] == 0){
                            Gui.state[13]=0;
                            Gui.state[6]=2;
                        }
                    }
                    if (Gui.state[17] ==2){
                        if (Gui.state[10] == 0){
                            Gui.state[17]=0;
                            Gui.state[10]=2;
                        }
                    }
                    if (Gui.state[18] ==2){
                        if (Gui.state[11] == 0){
                            Gui.state[18]=0;
                            Gui.state[11]=2;
                        }
                    }
                    if (Gui.state[19] ==2){
                        if (Gui.state[12] == 0){
                            Gui.state[19]=0;
                            Gui.state[12]=2;
                        }
                    }
                    if (Gui.state[24] ==2){
                        if (Gui.state[17] == 0){
                            Gui.state[24]=0;
                            Gui.state[17]=2;
                        }
                    }
                    if (Gui.state[25] ==2){
                        if (Gui.state[18] == 0){
                            Gui.state[25]=0;
                            Gui.state[18]=2;
                        }
                    }
                    if (Gui.state[26] ==2){
                        if (Gui.state[19] == 0){
                            Gui.state[26]=0;
                            Gui.state[19]=2;
                        }
                    }
                    if (Gui.state[27] ==2){
                        if (Gui.state[20] == 0){
                            Gui.state[27]=0;
                            Gui.state[20]=2;
                        }
                    }
                    if (Gui.state[31] ==2){
                        if (Gui.state[24] == 0){
                            Gui.state[31]=0;
                            Gui.state[24]=2;
                        }
                    }
                    if (Gui.state[32] ==2){
                        if (Gui.state[25] == 0){
                            Gui.state[32]=0;
                            Gui.state[25]=2;
                        }
                    }
                    if (Gui.state[33] ==2){
                        if (Gui.state[26] == 0){
                            Gui.state[33]=0;
                            Gui.state[26]=2;
                        }
                    }
                    if (Gui.state[34] ==2){
                        if (Gui.state[27] == 0){
                            Gui.state[34]=0;
                            Gui.state[27]=2;
                        }
                    }
                    if (Gui.state[38] ==2){
                        if (Gui.state[31] == 0){
                            Gui.state[38]=0;
                            Gui.state[31]=2;
                        }
                    }
                    if (Gui.state[39] ==2){
                        if (Gui.state[32] == 0){
                            Gui.state[39]=0;
                            Gui.state[32]=2;
                        }
                    }
                    if (Gui.state[40] ==2){
                        if (Gui.state[33] == 0){
                            Gui.state[40]=0;
                            Gui.state[33]=2;
                        }
                    }
                    if (Gui.state[41] ==2){
                        if (Gui.state[34] == 0){
                            Gui.state[41]=0;
                            Gui.state[34]=2;
                        }
                    }
                    if (Gui.state[20] ==2){
                        if (Gui.state[13] == 0){
                            Gui.state[20]=0;
                            Gui.state[13]=2;
                        }
                    }
                }

            }
        },0 ,10);

    }
}
