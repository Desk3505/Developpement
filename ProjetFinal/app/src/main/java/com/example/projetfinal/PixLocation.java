package com.example.projetfinal;

/*
Color location on the screen
 */

public class PixLocation {

    private final int[] greenPix = new int[58];
    private final int[] yellowPix = new int[58];
    private final int[] redPix = new int[58];
    private final int[] bluePix = new int[58];

    /**
     *
     * @param pt
     * @return
     */
    public int getGreenPix(int pt) {
        return greenPix[pt];
    }

    /**
     *sets green on screen
     */
    public void setGreenPix(){
        this.greenPix[1] = 663080;
        this.greenPix[2] = 629120;
        this.greenPix[3] = 648175;
        this.greenPix[4] = 648225;
        this.greenPix[5] = 630280;
        this.greenPix[6] = 670325;
        this.greenPix[7] = 726303;
        this.greenPix[8] = 776303;
        this.greenPix[9] = 832322;
        this.greenPix[10] = 850378;
        this.greenPix[11] = 850426;
        this.greenPix[12] = 850475;
        this.greenPix[13] = 850523;
        this.greenPix[14] = 850572;
        this.greenPix[15] = 834628;
        this.greenPix[16] = 776651;
        this.greenPix[17] = 726651;
        this.greenPix[18] = 670629;
        this.greenPix[19] = 629672;
        this.greenPix[20] = 648725;
        this.greenPix[21] = 648775;
        this.greenPix[22] = 629830;
        this.greenPix[23] = 572850;
        this.greenPix[24] = 523850;
        this.greenPix[25] = 476850;
        this.greenPix[26] = 426850;
        this.greenPix[27] = 378850;
        this.greenPix[28] = 325830;
        this.greenPix[29] = 303775;
        this.greenPix[30] = 303726;
        this.greenPix[31] = 323673;
        this.greenPix[32] = 280626;
        this.greenPix[33] = 224651;
        this.greenPix[34] = 174651;
        this.greenPix[35] = 120629;
        this.greenPix[36] = 100573;
        this.greenPix[37] = 100525;
        this.greenPix[38] = 100476;
        this.greenPix[39] = 100428;
        this.greenPix[40] = 100379;
        this.greenPix[41] = 118323;
        this.greenPix[42] = 177304;
        this.greenPix[43] = 227304;
        this.greenPix[44] = 280325;
        this.greenPix[45] = 325280;
        this.greenPix[46] = 302227;
        this.greenPix[47] = 302175;
        this.greenPix[48] = 325120;
        this.greenPix[49] = 378100;
        this.greenPix[50] = 428100;
        this.greenPix[51] = 476100;
        this.greenPix[52] = 476173;
        this.greenPix[53] = 476218;
        this.greenPix[54] = 476262;
        this.greenPix[55] = 476305;
        this.greenPix[56] = 476350;
        this.greenPix[57] = 476394;
    }

    /**
     *
     * @param pt
     * @return
     */
    public int getYellowPix(int pt){
        return yellowPix[pt];
    }

    /**
     * set yellow on screen
     */
    public void setYellowPix() {
        this.yellowPix[1] = 79287;
        this.yellowPix[2] = 118323;
        this.yellowPix[3] = 177304;
        this.yellowPix[4] = 227304;
        this.yellowPix[5] = 280325;
        this.yellowPix[6] = 325280;
        this.yellowPix[7] = 302227;
        this.yellowPix[8] = 302175;
        this.yellowPix[9] = 325120;
        this.yellowPix[10] = 378100;
        this.yellowPix[11] = 428100;
        this.yellowPix[12] = 476100;
        this.yellowPix[13] = 524100;
        this.yellowPix[14] = 574100;
        this.yellowPix[15] = 629120;
        this.yellowPix[16] = 648175;
        this.yellowPix[17] = 648225;
        this.yellowPix[18] = 630280;
        this.yellowPix[19] = 670325;
        this.yellowPix[20] = 726303;
        this.yellowPix[21] = 776303;
        this.yellowPix[22] = 832322;
        this.yellowPix[23] = 850378;
        this.yellowPix[24] = 850426;
        this.yellowPix[25] = 850475;
        this.yellowPix[26] = 850523;
        this.yellowPix[27] = 850572;
        this.yellowPix[28] = 834628;
        this.yellowPix[29] = 776651;
        this.yellowPix[30] = 726651;
        this.yellowPix[31] = 670629;
        this.yellowPix[32] = 629672;
        this.yellowPix[33] = 648725;
        this.yellowPix[34] = 648775;
        this.yellowPix[35] = 629830;
        this.yellowPix[36] = 572850;
        this.yellowPix[37] = 523850;
        this.yellowPix[38] = 476850;
        this.yellowPix[39] = 426850;
        this.yellowPix[40] = 378850;
        this.yellowPix[41] = 325830;
        this.yellowPix[42] = 303775;
        this.yellowPix[43] = 303726;
        this.yellowPix[44] = 323673;
        this.yellowPix[45] = 280626;
        this.yellowPix[46] = 224651;
        this.yellowPix[47] = 174651;
        this.yellowPix[48] = 120629;
        this.yellowPix[49] = 100573;
        this.yellowPix[50] = 100525;
        this.yellowPix[51] = 100476;
        this.yellowPix[52] = 172476;
        this.yellowPix[53] = 218476;
        this.yellowPix[54] = 262476;
        this.yellowPix[55] = 307476;
        this.yellowPix[56] = 353476;
        this.yellowPix[57] = 398476;
    }

    /**
     *
     * @param pt
     * @return
     */
    public int getRedPix(int pt){
        return redPix[pt];
    }

    /**
     *set reds on screen
     */
    public void setRedPix(){
        this.redPix[1] = 869666;
        this.redPix[2] = 834628;
        this.redPix[3] = 776651;
        this.redPix[4] = 726651;
        this.redPix[5] = 670629;
        this.redPix[6] = 629672;
        this.redPix[7] = 648725;
        this.redPix[8] = 648775;
        this.redPix[9] = 629830;
        this.redPix[10] = 572850;
        this.redPix[11] = 523850;
        this.redPix[12] = 476850;
        this.redPix[13] = 426850;
        this.redPix[14] = 378850;
        this.redPix[15] = 325830;
        this.redPix[16] = 303775;
        this.redPix[17] = 303726;
        this.redPix[18] = 323673;
        this.redPix[19] = 280626;
        this.redPix[20] = 224651;
        this.redPix[21] = 174651;
        this.redPix[22] = 120629;
        this.redPix[23] = 100573;
        this.redPix[24] = 100525;
        this.redPix[25] = 100476;
        this.redPix[26] = 100428;
        this.redPix[27] = 100379;
        this.redPix[28] = 118323;
        this.redPix[29] = 177304;
        this.redPix[30] = 227304;
        this.redPix[31] = 280325;
        this.redPix[32] = 325280;
        this.redPix[33] = 302227;
        this.redPix[34] = 302175;
        this.redPix[35] = 325120;
        this.redPix[36] = 378100;
        this.redPix[37] = 428100;
        this.redPix[38] = 476100;
        this.redPix[39] = 524100;
        this.redPix[40] = 574100;
        this.redPix[41] = 629120;
        this.redPix[42] = 648175;
        this.redPix[43] = 648225;
        this.redPix[44] = 630280;
        this.redPix[45] = 670325;
        this.redPix[46] = 726303;
        this.redPix[47] = 776303;
        this.redPix[48] = 832322;
        this.redPix[49] = 850378;
        this.redPix[50] = 850426;
        this.redPix[51] = 850475;
        this.redPix[52] = 779475;
        this.redPix[53] = 735475;
        this.redPix[54] = 689475;
        this.redPix[55] = 644475;
        this.redPix[56] = 600475;
        this.redPix[57] = 555475;
    }

    /**
     *
     * @param pt
     * @return
     */
    public int getBluePix(int pt){
        return bluePix[pt];
    }

    /**
     *sets blue on screen
     */
    public void setBluePix(){
        this.bluePix[1] = 285868;
        this.bluePix[2] = 325830;
        this.bluePix[3] = 303775;
        this.bluePix[4] = 303726;
        this.bluePix[5] = 323673;
        this.bluePix[6] = 280626;
        this.bluePix[7] = 224651;
        this.bluePix[8] = 174651;
        this.bluePix[9] = 120629;
        this.bluePix[10] = 100573;
        this.bluePix[11] = 100525;
        this.bluePix[12] = 100476;
        this.bluePix[13] = 100428;
        this.bluePix[14] = 100379;
        this.bluePix[15] = 118323;
        this.bluePix[16] = 177304;
        this.bluePix[17] = 227304;
        this.bluePix[18] = 280325;
        this.bluePix[19] = 325280;
        this.bluePix[20] = 302227;
        this.bluePix[21] = 302175;
        this.bluePix[22] = 325120;
        this.bluePix[23] = 378100;
        this.bluePix[24] = 428100;
        this.bluePix[25] = 476100;
        this.bluePix[26] = 524100;
        this.bluePix[27] = 574100;
        this.bluePix[28] = 629120;
        this.bluePix[29] = 648175;
        this.bluePix[30] = 648225;
        this.bluePix[31] = 630280;
        this.bluePix[32] = 670325;
        this.bluePix[33] = 726303;
        this.bluePix[34] = 776303;
        this.bluePix[35] = 832322;
        this.bluePix[36] = 850378;
        this.bluePix[37] = 850426;
        this.bluePix[38] = 850475;
        this.bluePix[39] = 850523;
        this.bluePix[40] = 850572;
        this.bluePix[41] = 834628;
        this.bluePix[42] = 776651;
        this.bluePix[43] = 726651;
        this.bluePix[44] = 670629;
        this.bluePix[45] = 629672;
        this.bluePix[46] = 648725;
        this.bluePix[47] = 648775;
        this.bluePix[48] = 629830;
        this.bluePix[49] = 572850;
        this.bluePix[50] = 523850;
        this.bluePix[51] = 476850;
        this.bluePix[52] = 476779;
        this.bluePix[53] = 476734;
        this.bluePix[54] = 476690;
        this.bluePix[55] = 476645;
        this.bluePix[56] = 476600;
        this.bluePix[57] = 476555;
    }
}
