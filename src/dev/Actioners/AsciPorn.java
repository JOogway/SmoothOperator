package dev.Actioners;

import dev.InputReader;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;

/**
 * Created by joogway on 31.01.17.
 */
public class AsciPorn {
    public String[] porns = new String[10];

    public AsciPorn(){
        porns[0]="BMBBBBMMMMMMMMMMBWXYii;:,,,,,,,,,,,,,::;+++++iiiittIIIYYYVVVVMXVtti+;:::,,,,,,,\n" +
                "MMMMBBMBMMMMMMMBRXYIi;::,,,,,,,,,,,,,::;;;++iiiiittIIYYYVVVVVRBVYYtt+;;:,,,,,,,\n" +
                "MMBBBMMMMMMMMBBBWYYi;:::,,,,........,,,::;++++iiitttIIYYVVVVVXBYYt;;;i+;:,,,,,,\n" +
                "BBRBMMMMMMMBMBBWVIt;:,,,,,,,....,..,...,::;;++iiiittIIIYYVVVVXBXIt+;;+:+;,,,,,,\n" +
                "BBBMMMMMMMMMBBBXIi;::,,,,.,.,..........,,::;+++iiiittIIYYVVVVXBWYtiti;;:;;:,,,,\n" +
                "BMMMMMMMMMBBBWYIt;::,,,,,...............,,::;++iiiittIIYYYVVVXXVYYItt+;;;;;:,,,\n" +
                "MMMMMMMMMBRWXYt++;:::,,,,,.,,...........,,::++++iiittIIYYVVVXXXIY;+++iii+;;;:,,\n" +
                "MMMMMMMMBRRXVI+;;:::,,...................,,:;;++iiiittIYYVVXWWBW+Vii,,,,,;++;::\n" +
                "MMMMMMMMBBWVIi;;;:::,,.......... ..  ....,,:;;;+iiiitIIYYVVWBMMMVt;i::,,,,,.,+;\n" +
                "MBMMMMMBBWVIi+;;;:::,,................,,,,::;;++++iittIYVWRMMMMBIY+i:,...::::+;\n" +
                "MMMMMMBRWYIi;;;;;::,,......,,,,,,:;;;:;;;;:;;++++++ittIVWBMMMBBWXt+i::,,.:.,i+;\n" +
                "MMMMMBRXVIi;;;;:::::,....:ttIttIYVXXVVVVIItii++;;;+itIYWMMMMMMRRVtti::::;;,ti++\n" +
                "BBBBBRXVIi;;;:::::::::;+tIIIYVYYYVVYYIIItii+;:::,:+itYWMMMRRBMMBWt+,,::;+,iti++\n" +
                "BBRBRWVIi;;;:::::;;+ttItt+;;;+iYVXWWXVYti++:,,,,,,;iIYMBMMYYWMRRY+;,,,,+,;tiii+\n" +
                "BBRBRWYi+;::::::;iIIi+:,,,,+tIYVWWWXXXXXYi+:,,,..,:iIVMMMWIVWBRVi;,,,,:::tii+++\n" +
                "BMBBRWIi;;;:::::;;;:::,::iIIIWRMMMW,:+tXVY;::,,...,;tVMMWWWRRBR++:,,,,:.ii+++++\n" +
                "BMRRRXIi+;;::,,,,::::::+ItIYRRWWIMR,,;+tYI;::,,,..,:iYRMBRRRWBWIi;:,,:,+i++++++\n" +
                "MMBBRXIi+;;::,,,..,,,::+YWY.:XRYWX:  ,VXVi::::,,,,,:+tYBBBRRXWXYtti;:,+Iii+++++\n" +
                "MBMBWXIi+;:,,,.......,,:++it;:,:,.:+iIYYi+::::,,,,,:;+IVBRRWXYttIItti+Ittii++++\n" +
                "RRMBWXIt+;:,,,..    ...,,,:,,:+:i+i+ittii;::::,:,,,,:;iIXBRRXY:::iIItIIIttii+++\n" +
                "RVMRRXIi+;::,,...  ......,,,,,,,,:+;i+++;::,,,,,,....:+tYWRWWV,,,,:iIYIItttiii+\n" +
                "RIWRXVYt+;::,,...      ......,,,:::;;;;::,,,.....   .,:+IVRWWV,,,,,:+tIIttttiii\n" +
                "WItYVVVIi;::,,,..      .   ...,,::::::::,.............,;tIWRXY.,,,,,::+tIttttii\n" +
                "VitIYYYIt+;:,,,....         ...,,:::::,,..........,,,,,:+tVWWt,,,,,,,,,:+ttttii\n" +
                "Yt+;IYYIIt+::,,,....          ..,,,,.............,,,,,::;+IVX,,:;++++++++ittttt\n" +
                "V+++YVYYIti;::,,,..               .........  ..,,,,,::::;;iIVi;:,,,:::;;;;+tttt\n" +
                "RRRWVXYIIt+;;:,,,......              ...... .,::::::::::;;iIYY,,,:::::;;;;;+itt\n" +
                "RMMBWXXYYI++;;:,,,......              ......,:::::::,,,,:;itIY,:::::::;;;++++tt\n" +
                "RBMBRWXVYIi+;;::,,,,,,....            ......,,,,,,,,,::::;+tI;,::::::;;;+++++it\n" +
                "RBMBRWXXYIi;;::::,,,,,,,....          ......,,,,,:::::;;::ii:::::::::;;+++++iit\n" +
                "BBMMRWXXYIt+;::,,::,,,,,,,,....      ........,,,,,,:;+ttIYXi;;;;::;;;;++++iiiii\n" +
                "RRMMMBWXVYIt;:,,,,,,,:,,,,,,,.......  .....,,,,,:::;iIYYVXXi;;+;;;;;+++++iiiiit\n" +
                "RWMMMMMBRXYIi:,,,,,,,,,::::,,,,...........,,,,:::;;itIYVVWY;++++;;;+;++++iitttt\n" +
                "BWBMMMMMMBBXYi:,,,..,,,,,,,,,,...........,,,,::;;;;itIYVWBXt++++++;+++iiiiitttt\n" +
                "RRRMMMMMMMBBRWt::,,....,,,,,,.........,,,,,::::;;iIYVWRBBRRWXIi+++++++iiiitIIII\n" +
                "RRRBBMMBMMBBBBRV+,,,......,,........,,,,,:::;itYVVXWWWWRRRRWWWVI++++iiiitIIIIII\n" +
                "BRRMBRBMBMMMBBBRVt:,,..............,,,,::;iIYIIIIYVVVXXWXWWXWWWXVIiiiiittIIIYYY\n" +
                "BRRMMMMBMMMMRRRXXYI+,,..............,,;IXIIttttIIIYYYYYVVXVXXXXWXXXYtittIIIYYYI\n" +
                "MRBBMMMMMMMMBRWXWYYtt+:,............,,:ttYtItttttttttIIYYYYVVXXXXXXWXVYIIIYYYYI\n" +
                "MBBMBMMMMMMMRWXXWYVWXWWI:...........,,,:i+itti+++iiiiittIIYYVXVXXXWWXXWXVYYYVYI\n" +
                "BBBMMMMMMMMBBBXXVVXWWWWWWY;.........,,,,:++;it+++;;;;;+itIYYYVVVXXXXWWWWWXXVVYI\n" +
                "MMMMMMMMMBWXRRWVVXXWRWRWWWWXi,......,,,,::++;+i;;;;;;;++ittIIYYVVVXXXXXXWWWWXII\n" +
                "MMMMMMMMMMWWWXVXVVWWWRRRWWWXXVI;,..,,,,,,::;+ttti+;;;;;;+iitIIYYVVVXXXWWWWWWWWX\n" +
                "MMMMMMMMMMBRXVVXVWWWWRRRRRXXXXXVVt;:,,,,:::;+tYYt+;;;;;;;++iitIYVVVVXXXWWWWWWRR\n" +
                "BRBBMMMMMMMMBRRXWWWWRRRBBXXXXXVVVYYYItii++tIYYYYYti++;;+++++iitYYYYVVXXWWWWWWWW";
            porns[1]="BBBBMMBBMMMMMMMMBBBBBMBBMMMMBBBRXYi:,,,:iVXXVXXWRRRBBRBBBRMBRBBBRRBMMMMMMMMM\n" +
                    "BBMMMMBBBMMMMMMMBBBMMMBBMMMMBBRXt:,..:,:tYIIYIVXVYVXVXBRWYWRBRBMMBMMMMMMMMMM\n" +
                    "MMMMBMMMMBBBBMMMBBBBBBBMMMMBRXVi:,,.,.,;itiiItIY+iiIIIVXXVXYXRRBMMMMMMMMMMMM\n" +
                    "MMMMMMMMBBBMMMMBBBBBBBBBMMBWIt+:,,..,.::++itt+t++i++iItIYXWXXWWBMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMBRBBRBBBRBBMMBWi+,,.....,:,;+iI;ti+++:+IYItVWRBBBBBMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMBBBBBBRRBBBMBBMMRWX;......,,..+iII++ti;.,tVXVIXRBBBMMMMMMMMMMMMMMM\n" +
                    "BMMMMMMMMMBBBBBMBRBRWXWWBMRIYX;......,..+tVIi;I;, ,VVXVYWRBMMMMMMMMMMMMMMMMM\n" +
                    "BMMMBMMMBMMBBBBMMBXVXXWBWXI+;IY;,.....,.:iVYtiI:...VVVXIWWBMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMBBBMMMMBMMWYItiiIIII+:,:iY:.....,,,+tXtit:...IVVVIVRBMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMBBMMMMBBBWYii+;+iIXY+:::;t+..  ..,,;:IVti+..,;VVVIYRBBMMMMMMMMMMMMMMMM\n" +
                    "BBMMMBBBBMBBBBBVt++;+i;iYWXXYIIi;.  ..,,:;i+IYIt,.,:iVVYtWBBMMMMMMMMMMMMMMMM\n" +
                    "MMBMMMMMMBRBBBRYi+;;t;;::;++i+ti,.  .,:;;itYVWWYI,..:tYVVXRBMMMMMMMMMMMMMMMM\n" +
                    "BBBMMBMMBBRBBBRVt+;t+;::::,:+ii,   .,;ii+;;;;+IXWWti::ttVXWRBMMMMMMMMMMMMMMM\n" +
                    "BRMMMBRMMBRRRBBWIi+I;,:::;;it+.  ..,::::i+:,,,,,;tYYIIItIYXXWBMMMMMMMMMMMMMM\n" +
                    "BBMMMBRMMMMBRBBBXItY:,,,:+tt:. ....,,,,it;,...,,,,:;++tYti;;+tRMMMMMMMMMMMMM\n" +
                    "MMBBBBBMMMMRRBBMRVYV;:::;i+,  .......,,iY+,,,,,,,,:::;ii;:,,,:VBMMMMMMMMMMMM\n" +
                    "BMBBRRBBBBBBBBMMMWXWi::;;,.  .........,:tYVt+::;;;::,::,,,,,:;tBMMMMMMMMMMMM\n" +
                    "BBBBBRBBBRBBMBMMMBRRt;;+,.  ..,,,... ...,,;IIIt;,,,,.....,,:+iIXBMMMMMMMMMMM\n" +
                    "RRBMMBRRRBRBBBBMMMMBI+;I:....,:,,...  .......,.    ....,,:;+tIIVWBBMMMMMMMMM\n" +
                    "RRBBBMMMBRBBBRRMMMMMXi;iY++i;:,,:,..   ....        ...,:;+tIVVYtIVWRBMMMMMMM\n" +
                    "MBBBRMMBBBBBRWRBMMMMWi;:,+i+i+;;;,...             ..,:;+itYVYi:+,.;tXMMMMMMM\n" +
                    "MBBBRMBBRRRRBRRRBMMMRY+,....,,,,,....        .....,,:+itIYXt::++:,.+BMMMMMMM\n" +
                    "BBRBMMBBRRBRRRRBMMMMBRWt:,.............    .....,,:;+itYVX+:;,.,::IMMMMMMMMM\n" +
                    "BBBMMMMBBBRRRRRBMMMMXVXVVY+,..................,,::;+iIVXRXYt;:i:YWMMBMMMMMMM\n" +
                    "MBMBRRRBBMMBBBMMMBWXYt+;;tYY;,,,,,,,,,,,,,,,,,:;;+iIVVXWIitVWWRBBBRRBBMMMMMM\n" +
                    "MMMBBRBBBMMBRBBBWVtii++;:,,;II+;;::::;:::::;;;+itIYYYXXt++iiiYXXRRWVXWRBMMMM\n" +
                    "MMMMBRRRBBBRRRWVttii++;;;;:;+tWYi+;++;;;;+++ittIIIIVWY+;;++itYWWBRVtIYWWBBMM\n" +
                    "BBMMBBMMBRRRXYYIiii++ii+++++tVXVi+++++++iiittttIYXWRI+;;;;;tIWWXRXItIIIYXBMM\n" +
                    "MBRBMMMBRVVYYttti++;i+itt+itYYt+;+++++++iiittIVWWBXtii++++iIWRWXWYIItYVRMMMB\n" +
                    "RRRBMBBWYYYIti++++++iitIIYIVVI+;;;;++++++iitYWBMBXYYItiittIVRWYitXRBBMMMMBBW\n" +
                    "RBMBBXYtIYIi++;::,:itttIIVWXti+iiii+++++iIXRMMMMBRWXVVVVVVXWWVYItii+iYYIi+;;\n" +
                    "BBMXYIttii+++;;:,:+itIYYWWtiiiiii+iitIVWBMMMMMMMMMMMBBBRRWXXXYYIttii+;:,..,,\n" +
                    "MBItttti+i+;::;:;ittIYXRMRXXVVVVXWRBMMMMMMMMMMMMMMMMMMBBBRRWXVYYIIttti+:,,..\n" +
                    "RVittti;;;::::,:itIYVWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMBWWWWWWXVYYIIIIIti;:,.\n" +
                    "WVYtt+i;;:::::;itIVXRMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMBWXXXVVVYYIItttIIt+;,\n" +
                    "WWXVIi+i;;:;;itIVXRBMMMMBRRBMMMMMMMMMMMMMMMMMMMMMMMMMMMMMRXXVVVVYYIItiiiii+;\n" +
                    "RRWXYtii;;;itYXXRMMMMWYYWVi+IWBBBMMMMMMMMMMMMMMMMMMMMMMMMMBWXXVYVVYIti++++++\n" +
                    "RRWXVVIYtitYXWRBMMMBY+;YYtittVRRBMMMMMMMMMMMMBBMMMMMMMMMMMMRWXXVVVVYtti++++;\n" +
                    "BRWXXXVVtYVWBBBRWRRYttIVIiiYVVVWMMMMMMMMMMMMMMMMMMMBRBMMMMMBRWWXXXXYIttii++;\n" +
                    "RBRRWWWWWWRBBBBRRWRWYiiiYitVI+;;YMMMMMMMBBBBRRRWBBBRRRBMMMMMBRWWWWXVYIIttii+\n" +
                    "XWRBBBBBBBBBBBBBRRWWItiiIVXY++;;+VMMRWWRRRBRWWWRMMBRWWWBMMMMMRRWWWWXVYYIttii\n" +
                    "XWRRBBBBBBBMBBBBBRX+iIYVWWWXI+;++tXMBRRRRMMMMBRWRBMMMBRRBMMMMMBRWWWXXXVYItii\n" +
                    "XWWWWRBBMBMMBBBRBRXYYYIYYYYVYtitIIVRMBBBMMMMMMRRRRBMMMMBRBMMMMMBRWWWXXWVItti\n" +
                    "XXVVXWBMMBMMMBBBBBBBRWXVYYItYVVXXWXWBBRRBMMMMBBBBBBRRBMBRBMMMMMMMRRWWWWXYItt\n" +
                    "VVVVWWWBBMMMMBMBBBBMMMMBXVYYYYYYIYXRBBBWRRBBRBBBBBRRRRRBRRBMMMMMMMBRRRRWXVYI\n" +
                    "IIVYXWWRBMMMMMBBRBMMMMMMMMBVVVYItttWBBRWVVWRBMMMMRRBRRBBBBBBBBMMMBRRRBBRWWXY\n" +
                    "IiIYXWXRRBBMBBWVYIIVIIIIYWXi++iittVRBBRWXYYVXBMRRBBBBBBBBRRRWWWRBBBRRRBBRRWX\n" +
                    "iitYVVXXRBBMBBXVYYVVItIIIIIIYItitYWRBBBRXVYXXWMRXXWWRWRRRWWWWWWWBBBBBBBBBRRR\n" +
                    "itttIXXXRRBBBMBBBRBRWXXVYYIIIYYttIXRBBBRXXXWXRMBXWWWWWXXWWWWWXXXRRBBBBBBBBBR";
            porns[2]="    ?.$$$$$\"     `L         ;;;;;;;,          .`.`.`.`$;??h,_        `h\n" +
                    "     ?$$$$$       \"\"'       `;;;;;;;;,         `.`.`.`.hJ\"  `\"??cc,    $\n" +
                    " ?\"???\"??\"          j'       :;;;;;;;;;;,       .`.`.`.`$               $\n" +
                    " ;;,                 $        :;;;;;;;;;;;,      `.`.`.`.$c,,__          $\n" +
                    " i;;,                 h         `':;;;;;;;;;,      `.`.`.`h    `\"         ?c\n" +
                    " `$;;;;,              $r           `:;;;;;;;;,      .`.`.`.$\n" +
                    "   J$i;;h             $;             `:;;;;;;;,      `.`.`.`$\"\"=,\n" +
                    " .$$$$h;,            ,C;       .j???c, `;t;;;;,        `.`.`.?c\n" +
                    " $$$$$$h;,           $;,       J;;;;i;L. :?);;,           .`.`.?h,_\n" +
                    " $$$$$$$;           j';        $;;;$h9;L `:?);;,                ,C?h.\n" +
                    " ?$$$$$$;           $;,        `$;?ii$;;h `;L;;,                (C;;?h\n" +
                    "  3$$$$?;          J?;,         `h;;;;;;P  :;L;,                `$;;$?L\n" +
                    " .$$$$;;'         ,C;;,           `?CjjF   `;3;,                 $;;?h$\n" +
                    " $$$$;;:          $;;;,                    `;3;                  `h;;;F\n" +
                    " $$$?;;        `.JF;;;,                     ;3;                   `hiF    J\"\n" +
                    " $$?;'     .`.`.c$h;;;;,                   ;;f;,                 ,;iF   z\" z\n" +
                    " C;;       .`.`JCCC$;;;;;                 ;;$;;;; `;i;,         ;;J\"   J' J'\n" +
                    " ;;      .`.` JF;;??$hi;;;;.            .;;$;;;;;, ;?$;;;,    ,;;i$   J'.P\n" +
                    " '      `.`. ,C;;;;,  `\"h;;;;;;;;;;;;;;;i$?;;;;;;;, :;?h;;;;;;;;9\"?. j','\n" +
                    "       .`.` .$;;;;'       \"??iijjjjii?\"\"`.`;;;;;;;,  `;;?h;;;;iP   $,'.P\n" +
                    "      `.`. ,C;;;,                             `;;;;,  `;;;J\"\"'     `h $\n" +
                    "     .`.  ,C;;;;'                               ;;,    ;;;9         $$\n" +
                    "    `.`  ,C;;;;f                                `;;,   `;;J  r      `L\n" +
                    "   .`   z$;;;;,                                 `;,     ;;9  $       h\n" +
                    "       j\"`h;;;'                                 `;,     ;;$  `r      3\n" +
                    "      j' ,c;;,                                   ;,     ;;$   $      `h\n" +
                    "     .P <$;;,                                   `;,    .;;$.  ?.      $";
            porns[3]="..................  .                      . ..........,;+tWMMMMMMMMMMMMRYtiittt\n" +
                    "..................   ..                    .........,+tVWVRMMMMMMMMMMMMMWVYYYVVY\n" +
                    "............  . ..                         .......:IXXRVYYVWRBBBMBBMMMMMMRVIIItt\n" +
                    "..............                            ......,+XXVt+;itVWRWRBWVXWRMMMMMRIi+;;\n" +
                    "...........   .  .               .,:+iIYVXWWWWXVVVWt. ,;tYVVVWXXVYVXWRMMMMMV+:..\n" +
                    "...........                  .,;iYVRBBMBMMMBBRVVtt+   .+IYVVIYttVVYWRRMMMMMW+,..\n" +
                    ".. .........               ,;iYXRBMMMMMMRRRXVtt+,:    :tYtYXWXYVVXWRBBMMMMMMi;,,\n" +
                    "......... .             .:+tVBBMMMMRRRXXXVXY++:;,    .ittYttVVXXXVXRWWMMMMBMY+;;\n" +
                    "......... ..           :+;YRBMMRRWXRVWXWYXWXtIt+     :+tRBMX+tVXVVVVRWBMMMBMVYYY\n" +
                    ".. . ......  .       .::+XBBMRWWXXWVXYXRVIXXYWI.    .,,+WBMMMYWXVYVVYVBMMMMWYYYY\n" +
                    "..... ..  . .       ,:,iWBBBWWWVYXRIXRBXYIVXXV:,.   .;tYXVXBRRXVYYVVVVMMMMBVYYYY\n" +
                    ".. .... ..  .      :+;iXBBRWWVYXVXRXYWBXXXXVW;,+;;,,;tIIIVXWXVYYYVVVVMMMMRVYYYYY\n" +
                    "..     .  .       :i++XWBRWWVWVtIYVXXXWMBBXVY ,YYttIYIttIYYYYYYVVVXXBMMMBVVYYYYY\n" +
                    ".      . .       ,iitVWRBXXWWWWWRXRRMMMMMMBW, ;YXWXXXVYIYYYVYVVVXXRMMMMBVYYYYYYY\n" +
                    "..               ;i;;iIVVXXVXRRWMWRMMMMMMRW:  ;YVVWRWWWXXXVXXXXXXRBMMMBXViiitttt\n" +
                    "                .   .;tYVVVXWRWMMMMMMMBMRV,:: +YYIYVWRRRWWXXWWWWXWRBBBRWY:......\n" +
                    "                    ,+ittIIIttitYVVXVVXVt:;t: tYYYVVYYXWRRXXXBRYYXWWWRRWYi      \n" +
                    "                   ,;iIYVVi,  +VIYXXVYVVXVYItiYYYYYYYVVXXXRMMMMRMBBVWXRWXI      \n" +
                    "                  .:iIVXV;  ,tVVttIIIIYYXWWWWXVYIYYYIYYVXWWWWRRRBWWWXXRWWY.     \n" +
                    "                  :;tYVV,  .;ttttt+ititIYVXtVRWYIIYYtiiiiitIIItiittIVVXVWY.     \n" +
                    "                 .;iIVX;.,:++++++;;;+iittYVIWWWVIIYIi:+tittItttttttIYVVVVY      \n" +
                    "                 ,;tYVV,;+tttii;:,,:;++itIVXXWWXVIIYtttitIItttttttttttYVVI      \n" +
                    "                .:+IYXY+tIYItii+;;:::;+itIYVXXWWXXYYtYIttttttiiiii+itttIYI.     \n" +
                    "                ,;tYXVVIVVYIIttiiii++iittIYVXXXXXXVYYIYYIItiii+++iiiittttt;     \n" +
                    "               ,;tYVXXRVXXVYYIItttIIIItIVXXWXXXXXXXXYYVVYYItii+;++++iitttti     \n" +
                    "              ,;tYVXXXRBWXVVYYYYYYYYYXXWXXXXXXXXXXXXVIYVVVYIItiii;+iiittttt     \n" +
                    "..........    ;tYVXVXXRMRWXXXVVVVXXWWWWWXXXXXXXXttVVVYIYYVVYYIItiiiitttttt+     \n" +
                    ",,,:::,,,.   .;tYXXXVXBMBRWWWXXWWWRRRWWWXXXXXXXXi;VVVYIYYVXXXVYitIIIIIIItt,     \n" +
                    ":;;++++;,,     ,;tVVVWMMMRRWWWRRRRRWWWXXXVXXXXXVY;YVVYIYYVVVVXV;YYYYIIIIIi      \n" +
                    "+iiiiii+;,.      :+tVRBMMBRRRRVVVVYIttIYYYVVVVVXVitVVYIYYYYVVVVtVVVVVYYYY+      \n" +
                    "+iiiiii+:.        :+tYWBBBBRRRtiii+;;;+iittIIYYVVt+YVVVVVVVXXVYVVVVVXVYYV;      \n" +
                    "iiiiiii:,,....     .;itVRBBBRRY;;:::,::;;;+itIIYYY;tVVVVVVXWXXVXXVVVVYYVI;      \n" +
                    "iiiiii++++;+;,,,.   .:;tIXRBBRt.....,,,,:;;ittIYYYttYVVXXXXWXXXVXXXVYYVVt:      \n" +
                    "iiiiiiiVVYIttt+;;:.  .,:+tYWBRt,,......,,;+ittIIYYYtIYYVVXWWWXXXXXXXVVVVt,      \n" +
                    "iiiiiiiYWRWXVYItti+;,. .,:+tIXY:,..   ..,:;+ittIIIYIiIIIYVWWXXXXXXXXVVVXt,      \n" +
                    "iiiiiiiittXRWXXVYItti;,,. .,;it;.     .,,;;+ittIIYIi+itIIYXXXXXWWXXXVVVXI,      \n" +
                    "iiiiiiiittttVWWWXVYIIt+:,,..,,:;+;  ..,,:;;+iittIIIt;;tIIVVVYVVVVWXXVYVXt,      \n" +
                    "iiiiiiittttttIXRRWXVYYti;:,....,;++;, ...,,:;+iitttItittIVVYYt;;;tIYVYXXt.      \n" +
                    "iiiiiiiittttttttWBRRXVYti+;,,,,..:iitt;....,,,:;;+iii;+iiIti+++iittiitYVt       \n" +
                    "i++iiiiittttttttRBBBBRXVYt++;::;;;itIIIt:,,,,:::;:;+ittiiiii+++;;;++itIYY       \n" +
                    "+;+++iiittttttttRBBMMMBRWXY+;iitttIttIIYYti+;;::::;ttttVYI+;+++iiiitIYVVVt      \n" +
                    "::;;++iittttttttBBMMMMMMBRRXIIIIIIItttIIYIIItiii+;ittIiYVVI;;+;+iiiIYVVVVVY,    \n" +
                    ":::;;+iittttttttMMMMMMMBMMMMBXYYYIIIttttItittIIIIIItIYttYVVt:;:;;itIYVVVVXVY,   \n" +
                    ",,,:;+iittttttttMBMMMRVYYIVWBMRVVIYYIiti+iIIIIIIIIYtII;tYVVY,,::;iIIYYVVVVVVY.  \n" +
                    ":,::;+iiiitiiiitYYYYI;;;:.,+VWBXVYIYIt;;tttttIIIIYXII+iIIYVV+,:;itIIYYYYVVVVVi  \n" +
                    ":,::;++iiiii+++++++;:,,,,.,;tYXVYYIYYttIItitIIIIIYYY++tIYYYVV::;iIIIYYYYYVVVVV; \n" +
                    ";::;;++iiii+++++++;:,....,;tIYYXIYtIYVYIIItiIttIIItitttIIYYVVt+itIIIIIIIYYYVVVV;\n" +
                    ";;:;;++iiii++++++;,. ,,;;itIIIYYVYIIYYVYItiIIIttt+;tIYIIIIYVVYiiIIIIIIIIIYYYVXXV\n" +
                    "+;;++++++++++++:,.,:;+ittIIIIIIIYVYIYIIYI;iIIItttittittttIYVVY+tIIIttttIIIIYYYVV\n" +
                    "i++++++++++++,..,;+ittIIYYYYYYIIIVVYYIYIIitttttttIXVti;tYIYVVYitIIttttttIIIIIItt\n" +
                    "ti++++++++:,..:;ittIIYYVVVVVVYYIItXYIIIYYYIIIItiiitYYYtttttIVYitItttiiitIIYItiii\n" +
                    "tti+++++,..,;+itIIYYVVVVVVVVVVYYYIIWiiitXXYYIIXVti+itIVYt++tYIitttiiiiitIYYIiiii\n" +
                    "ttti+:...:;itIIYYVVVXVVVVVVVVVYYYYIWItitVBRYIttIXYtttIIYYtittIittiiiiitIIYYIiiii\n" +
                    "tt+,...:;itIYYVVVVVVVVVVVVVVVVVYYYIYXIttIYRBVYYYYVXYttitYVIiiYYItiiittIYYYYtiiii\n" +
                    ";. .,:+itIYYVVVVVXXVVVVVVVVVVVVVYYIIXYiiYYYXRWVYYYIVYtiitYVVtYXWItttIYYYYYItiiii\n" +
                    "..,:+itIYYVVVVVVVVVVVVVVVVVVVVVYYYIIIVIitIVXVWXVYYIIIYItttVVYYYWVIIIIIYVVYIiiiii\n" +
                    ",;ittIYYVVVVVVVVVVVVVVVVVVVVVYYYYIIIIVVtiYYXVXXYRWVIIIYYIVVXVVVVYIIIYYYYYYYIiiii\n" +
                    "ittIYYVVVVVVVVVVVVVYVVVYYYYYYYYYIIIIIYXVtIYVXXXVXRWYYIYVYXXWXXVVYYYYIYYYYYYYIiit\n" +
                    "IYYVVVVVVVVYYYVYVYYYYYYYYYIIIIIIIIIIIYXRYYYVXVYVYYVVVYVVVXWWXVYVVVYYYYYYIIYIIItt\n" +
                    "YVVVVVVVVVVYYYYYYYYYYIYIIIIIIIIItIIIIYVRWVYVYYYYIIYYVVVVVVXXWVYVVXXVYYYYIIIIYIIt\n" +
                    "VVVVVVYYYYYYYYYYYYYYYIIIIIIIIIIIttIIYYVYYVXVYYIIIIYYVVYYYYVWXYYVVXXVVYYYIIIIIIIt\n" +
                    "VVVVVVVYYYYYYYYYYYYIIIIIIIIIIIIttIIYYYYYYVWVYYYYYYVVXXVVXXXWVYYVVVXXVVYYIIIIIItt\n" +
                    "VVVVVVYYYYYYYYYYYYIIIIIIIIItIIIIIIIYYYYYVXRWVYVVVVXXWXXXXXWXYYVVVXXVVVVYYIIIIttI\n" +
                    "VVVVYYYYYYYYYIYIIIIIIIIIItIttItIIIYIYYYVWRWWRWXXXXWRWXXWWWWVVXXXVVXVVVYYYYIIIIII\n" +
                    "VVYYYYYYYYYYYIIIIIIIIIIttIItIIIIIIIIYYVWWWWWWRBBBBBBRRRBBWXWWXRWWXXVVVYYYYYYIIII\n" +
                    "VVYYYYYYYYYIIIIIIIIIIItttIIIIIIIYYYYYVWWXWWWWWWRBBMMBRRWWXXXWXWBBRWXVVYYYYYYIIII\n" +
                    "VVYYYYYYYYIIIIIIIIIIItItIIIIIIYYYYYVXRRRRRRRRBBBRWXRRWWWWWWWWWXRMMBRWXVVVVYYYYII\n" +
                    "VVVYYYYYYIYIIIIIIIIIIItIIIYYYYYYVVXXWRYYVIIt+t;::,.,iYWBBBRRRRRWMMMMBRWXVVVVVYYY\n" +
                    "VVYYYYYYYIYIIIIIIIIIIIIIIYYYVVVVXVYYYYY+:::+:++;;;;,,,,,++tItYVIYXMMMBBRWXXXVVYV\n" +
                    "VYYYYYYYYIYIIIIIIIIYIIYYVVVVXXXY+:;;tYYYRRRRRRRRRRRRRRRXXRRVXX,  iVVVXWBBBRWWXXV\n" +
                    "VYYYYYYYYYYIIIYYIYYYYYVVVXXWVi:....+YYYYRMMMMMMMMMMMMMMMMMMMMW, .  ;tVXWRWRBBRRW\n" +
                    "VYYYYYYYYYYYYYYYYYVVVVXXWY+,.......:IWWYWMMMMMMMMMMMMMMMMMMMBW;;  .;tVXXWWWXWRBB\n" +
                    "YYYYYYYYYYYYYYVVVVVXXXVi, .........;IBRWVIIIIIIIIIIIIIIIIIIIYWtYtiiiIVXXWXWXXXWW\n" +
                    "YYYYYYYYYYYYVVVXXXXRY;....:;;;;;;;;tRBRViiiiiiiiiiiiiiiiiiiiiYtVWWXXXXXXXXXXXXXW\n" +
                    "YYYYYYYYYYVVXXWWWWI;;;;;;+iiiii;;+tXRBWiiiiiiiiiiiiiiiiiiiiiiiYYVVWWWWXItittIIVV";

    }
    public String returnPorn(){
        Random r = new Random();
        return porns[r.nextInt(4)];
    }
    public void askForMore() throws IOException {
        System.out.println("Wants more?(y/n)");
        String response = InputReader.readResponse();
        if (Objects.equals(response, "y") || Objects.equals(response, "yes") || Objects.equals(response, "yeah") || Objects.equals(response, "ye")){
            System.out.println(returnPorn());
            askForMore();
        }
    }

}
