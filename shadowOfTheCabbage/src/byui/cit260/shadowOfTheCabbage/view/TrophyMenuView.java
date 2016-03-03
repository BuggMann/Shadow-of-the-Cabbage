/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import java.util.Scanner;

/**
 *
 * @author heapc_000
 */
public class TrophyMenuView extends View{

    public TrophyMenuView() {
    super("\n"
              + "\n------------------------"
              + "\n| Trophy Menu            |"
              + "\n------------------------"
              + "\n1 - First boss"
              + "\n2 - Second boss"
              + "\n3 - Third boss"
              + "\n4 - Fourth boss"
              + "\n5 - Fifth boss"
              + "\nB - Back (Help Menu)");
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "1":
                this.displayFirstTrophy();
                break;
            case "2":
                this.displaySecondTrophy();
                break;
            case "3":
                this.displayThirdTrophy();
                break;
            case "4":
                this.displayFourthTrophy();
                break;
            case "5":
                this.displayFifthTrophy();
                break;    
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void displayFirstTrophy() {
        System.out.println("|@@@@|     |####|\n" +
"|@@@@|     |####|\n" +
"|@@@@|     |####|\n" +
"\\@@@@|     |####/\n" +
" \\@@@|     |###/\n" +
"  `@@|_____|##'\n" +
"       (O)\n" +
"    .-'''''-.\n" +
"  .'  * * *  `.\n" +
" :  *       *  :\n" +
": ~  B O S S  ~ :\n" +
": ~ A W A R D ~ :\n" +
" :  *       *  :\n" +
"  `.  * * *  .'\n" +
"    `-.....-'");
    }

    private void displaySecondTrophy() {
        System.out.println("  {}\n" +
"                 /__\\\n" +
"               /|    |\\\n" +
"              (_|    |_)\n" +
"                 \\  /\n" +
"                  )(\n" +
"                _|__|_\n" +
"              _|______|_");
    }

    private void displayThirdTrophy() {
        System.out.println("              .-=========-.\n" +
"              \\'-=======-'/\n" +
"              _|   .=.   |_\n" +
"             ((|  {{3}}  |))\n" +
"              \\|   /|\\   |/\n" +
"               \\__ '`' __/\n" +
"                 _`) (`_\n" +
"               _/_______\\_\n" +
"              /___________\\");
    }

    private void displayFourthTrophy() {
        System.out.println("              ___________\n" +
"            '._==_==_=_.'\n" +
"            .-\\:      /-.\n" +
"           | (|:.     |) |\n" +
"            '-|:.     |-'\n" +
"              \\::.    /\n" +
"               '::. .'\n" +
"                 ) (\n" +
"               _.' '._");
    }

    private void displayFifthTrophy() {
        System.out.println("  i.\n" +
"                            .7.\n" +
"                           .. :v\n" +
"                          c:  .X\n" +
"                           i.::\n" +
"                             :\n" +
"                            ..i..\n" +
"                           #MMMMM\n" +
"                           QM  AM\n" +
"                           9M  zM\n" +
"                           6M  AM\n" +
"                           2M  2MX#MM@1.\n" +
"                           OM  tMMMMMMMMMM;\n" +
"                      .X#MMMM  ;MMMMMMMMMMMMv\n" +
"                  cEMMMMMMMMMU7@MMMMMMMMMMMMM@\n" +
"            .n@MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
"           MMMMMMMM@@#$BWWB#@@#$WWWQQQWWWWB#@MM.\n" +
"           MM                                ;M.\n" +
"           $M                                EM\n" +
"           WMO$@@@@@@@@@@@@@@@@@@@@@@@@@@@@#OMM\n" +
"           #M                                cM\n" +
"           QM                                tM\n" +
"           MM                                CMO\n" +
"        .MMMM                                oMMMt\n" +
"       1MO 6MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM iMM\n" +
"      .M1  BM                                vM  ,Mt\n" +
"      1M   @M............................... WM   M6\n" +
"       MM  .A8OQWWWWWWWWWWWWWWWWWWWWWWWWWWWOAz2  #M\n" +
"        MM                                      MM.\n" +
"         @MMY                                vMME\n" +
"           UMMMbi                        i8MMMt\n" +
"              C@MMMMMbt;;i.......i;XQMMMMMMt\n" +
"                   ;ZMMMMMMMMMMMMMMM@A;.");
    }
       
}


