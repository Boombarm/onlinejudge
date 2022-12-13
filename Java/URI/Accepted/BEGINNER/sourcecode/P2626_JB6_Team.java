package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/11/2018.
 * Answer : Accepted
 * Runtime : 0.024s
 * Submission : 1/11/18, 10:54:21 AM
 */

import java.io.*;

public class P2626_JB6_Team {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while ((in = br.readLine()) != null) {
            String[] st = in.split(" ");
            String Dodo = st[0];
            String Leo = st[1];
            String Pepper = st[2];
            int DodoCode = getCode(Dodo);
            int LeoCode = getCode(Leo);
            int PepperCode = getCode(Pepper);
            if(DodoCode != LeoCode && DodoCode != PepperCode && PepperCode != LeoCode){
                bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
            }
            else if (DodoCode == LeoCode) {
                int lastWinerCode = DodoCode;
                if (lastWinerCode == PepperCode) {
                    bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                } else if (lastWinerCode == 1) {
                    if (PepperCode == 2) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    } else if (PepperCode == 3) {
                        bw.append("Urano perdeu algo muito precioso...\n");//Pepper
                    }
                } else if (lastWinerCode == 2) {
                    if (PepperCode == 1) {
                        bw.append("Urano perdeu algo muito precioso...\n");//Pepper
                    } else if (PepperCode == 3) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    }
                } else if (lastWinerCode == 3) {
                    if (PepperCode == 1) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    } else if (PepperCode == 2) {
                        bw.append("Urano perdeu algo muito precioso...\n");//Pepper
                    }
                }
            } else if (LeoCode == PepperCode) {
                int lastWinerCode = LeoCode;
                if (lastWinerCode == DodoCode) {
                    bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                } else if (lastWinerCode == 1) {
                    if (DodoCode == 2) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    } else if (DodoCode == 3) {
                        bw.append("Os atributos dos monstros vao ser inteligencia, sabedoria...\n");//Dodo
                    }
                } else if (lastWinerCode == 2) {
                    if (DodoCode == 1) {
                        bw.append("Os atributos dos monstros vao ser inteligencia, sabedoria...\n");//Dodo
                    } else if (DodoCode == 3) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    }
                } else if (lastWinerCode == 3) {
                    if (DodoCode == 1) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    } else if (DodoCode == 2) {
                        bw.append("Os atributos dos monstros vao ser inteligencia, sabedoria...\n");//Dodo
                    }
                }
            } else if (DodoCode == PepperCode) {
                int lastWinerCode = PepperCode;
                if (lastWinerCode == LeoCode) {
                    bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                } else if (lastWinerCode == 1) {
                    if (LeoCode == 2) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    } else if (LeoCode == 3) {
                        bw.append("Iron Maiden's gonna get you, no matter how far!\n");//Leo
                    }
                } else if (lastWinerCode == 2) {
                    if (LeoCode == 1) {
                        bw.append("Iron Maiden's gonna get you, no matter how far!\n");//Leo
                    } else if (LeoCode == 3) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    }
                } else if (lastWinerCode == 3) {
                    if (LeoCode == 1) {
                        bw.append("Putz vei, o Leo ta demorando muito pra jogar...\n");
                    } else if (LeoCode == 2) {
                        bw.append("Iron Maiden's gonna get you, no matter how far!\n");//Leo
                    }
                }
            }
        }
        bw.flush();
    }

    static int getCode(String weapon) {
        if (weapon.equals("papel")) {
            return 1;
        } else if (weapon.equals("pedra")) {
            return 2;
        } else {//tesoura
            return 3;
        }
    }
}

