package project.bridgetek.com.applib.main.bean.workbench;

import java.util.List;

/**
 * Created by czz on 19-5-8.
 */

public class Trend {
    /**
     * devCode : 20190201
     * F_SignalTypeId : 2
     * TrendDatas : [{"F_Value":"0.0212051","F_GetDate":"2019/4/1 0:00:00"},{"F_Value":"0.02349695","F_GetDate":"2019/4/1 0:05:00"},{"F_Value":"0.02409425","F_GetDate":"2019/4/1 0:10:00"},{"F_Value":"0.0263781","F_GetDate":"2019/4/1 0:15:00"},{"F_Value":"0.02068438","F_GetDate":"2019/4/1 0:20:00"},{"F_Value":"0.01993457","F_GetDate":"2019/4/1 0:25:00"},{"F_Value":"0.02018616","F_GetDate":"2019/4/1 0:30:00"},{"F_Value":"0.02675912","F_GetDate":"2019/4/1 0:35:00"},{"F_Value":"0.02072081","F_GetDate":"2019/4/1 0:40:00"},{"F_Value":"0.02339427","F_GetDate":"2019/4/1 0:45:00"},{"F_Value":"0.02254824","F_GetDate":"2019/4/1 0:50:00"},{"F_Value":"0.02379016","F_GetDate":"2019/4/1 0:55:00"},{"F_Value":"0.02712304","F_GetDate":"2019/4/1 1:00:00"},{"F_Value":"0.02118047","F_GetDate":"2019/4/1 1:05:00"},{"F_Value":"0.02722764","F_GetDate":"2019/4/1 1:10:00"},{"F_Value":"0.02414116","F_GetDate":"2019/4/1 1:15:00"},{"F_Value":"0.02310106","F_GetDate":"2019/4/1 1:20:00"},{"F_Value":"0.02245931","F_GetDate":"2019/4/1 1:25:00"},{"F_Value":"0.01960148","F_GetDate":"2019/4/1 1:30:00"},{"F_Value":"0.02327992","F_GetDate":"2019/4/1 1:35:00"},{"F_Value":"0.02227776","F_GetDate":"2019/4/1 1:40:00"},{"F_Value":"0.02106512","F_GetDate":"2019/4/1 1:45:00"},{"F_Value":"0.02280026","F_GetDate":"2019/4/1 1:50:00"},{"F_Value":"0.0235204","F_GetDate":"2019/4/1 1:55:00"},{"F_Value":"0.02368262","F_GetDate":"2019/4/1 2:00:00"},{"F_Value":"0.02574368","F_GetDate":"2019/4/1 2:05:00"},{"F_Value":"0.02360534","F_GetDate":"2019/4/1 2:10:00"},{"F_Value":"0.02155109","F_GetDate":"2019/4/1 2:15:00"},{"F_Value":"0.02154706","F_GetDate":"2019/4/1 2:20:00"},{"F_Value":"0.02441951","F_GetDate":"2019/4/1 2:25:00"},{"F_Value":"0.02043608","F_GetDate":"2019/4/1 2:30:00"},{"F_Value":"0.02408221","F_GetDate":"2019/4/1 2:35:00"},{"F_Value":"0.02091587","F_GetDate":"2019/4/1 2:40:00"},{"F_Value":"0.02056625","F_GetDate":"2019/4/1 2:45:00"},{"F_Value":"0.02188366","F_GetDate":"2019/4/1 2:50:00"},{"F_Value":"0.02076695","F_GetDate":"2019/4/1 2:55:00"},{"F_Value":"0.02163572","F_GetDate":"2019/4/1 3:00:00"},{"F_Value":"0.02058457","F_GetDate":"2019/4/1 3:05:00"},{"F_Value":"0.02125566","F_GetDate":"2019/4/1 3:10:00"},{"F_Value":"0.02166787","F_GetDate":"2019/4/1 3:15:00"},{"F_Value":"0.02284982","F_GetDate":"2019/4/1 3:20:00"},{"F_Value":"0.02268036","F_GetDate":"2019/4/1 3:25:00"},{"F_Value":"0.02553097","F_GetDate":"2019/4/1 3:30:00"},{"F_Value":"0.02226213","F_GetDate":"2019/4/1 3:35:00"},{"F_Value":"0.02240759","F_GetDate":"2019/4/1 3:40:00"},{"F_Value":"0.02405449","F_GetDate":"2019/4/1 3:45:00"},{"F_Value":"0.0230885","F_GetDate":"2019/4/1 3:50:00"},{"F_Value":"0.02892907","F_GetDate":"2019/4/1 3:55:00"},{"F_Value":"0.02074319","F_GetDate":"2019/4/1 4:00:00"},{"F_Value":"0.02530044","F_GetDate":"2019/4/1 4:05:00"},{"F_Value":"0.02291194","F_GetDate":"2019/4/1 4:10:00"},{"F_Value":"0.02346113","F_GetDate":"2019/4/1 4:15:00"},{"F_Value":"0.02064929","F_GetDate":"2019/4/1 4:20:00"},{"F_Value":"0.02557184","F_GetDate":"2019/4/1 4:25:00"},{"F_Value":"0.02478852","F_GetDate":"2019/4/1 4:30:00"},{"F_Value":"0.02166386","F_GetDate":"2019/4/1 4:35:00"},{"F_Value":"0.0265873","F_GetDate":"2019/4/1 4:40:00"},{"F_Value":"0.02521085","F_GetDate":"2019/4/1 4:45:00"},{"F_Value":"0.0201876","F_GetDate":"2019/4/1 4:50:00"},{"F_Value":"0.02753695","F_GetDate":"2019/4/1 4:55:00"},{"F_Value":"0.02487029","F_GetDate":"2019/4/1 5:00:00"},{"F_Value":"0.02138083","F_GetDate":"2019/4/1 5:05:00"},{"F_Value":"0.02005353","F_GetDate":"2019/4/1 5:10:00"},{"F_Value":"0.0245699","F_GetDate":"2019/4/1 5:15:00"},{"F_Value":"0.02187969","F_GetDate":"2019/4/1 5:20:00"},{"F_Value":"0.02585499","F_GetDate":"2019/4/1 5:25:00"},{"F_Value":"0.02409064","F_GetDate":"2019/4/1 5:30:00"},{"F_Value":"0.02378041","F_GetDate":"2019/4/1 5:35:00"},{"F_Value":"0.02233368","F_GetDate":"2019/4/1 5:40:00"},{"F_Value":"0.0218266","F_GetDate":"2019/4/1 5:45:00"},{"F_Value":"0.02331727","F_GetDate":"2019/4/1 5:50:00"},{"F_Value":"0.02286378","F_GetDate":"2019/4/1 5:55:00"},{"F_Value":"0.02854043","F_GetDate":"2019/4/1 6:00:00"},{"F_Value":"0.02017035","F_GetDate":"2019/4/1 6:05:00"},{"F_Value":"0.02170132","F_GetDate":"2019/4/1 6:10:00"},{"F_Value":"0.02497271","F_GetDate":"2019/4/1 6:15:00"},{"F_Value":"0.02239075","F_GetDate":"2019/4/1 6:20:00"},{"F_Value":"0.02365199","F_GetDate":"2019/4/1 6:25:00"},{"F_Value":"0.02487029","F_GetDate":"2019/4/1 6:30:00"},{"F_Value":"0.02452382","F_GetDate":"2019/4/1 6:35:00"},{"F_Value":"0.02322878","F_GetDate":"2019/4/1 6:40:00"},{"F_Value":"0.02189692","F_GetDate":"2019/4/1 6:45:00"},{"F_Value":"0.02418317","F_GetDate":"2019/4/1 6:50:00"},{"F_Value":"0.02458053","F_GetDate":"2019/4/1 6:55:00"},{"F_Value":"0.02452027","F_GetDate":"2019/4/1 7:00:00"},{"F_Value":"0.02446461","F_GetDate":"2019/4/1 7:05:00"},{"F_Value":"0.02408583","F_GetDate":"2019/4/1 7:10:00"},{"F_Value":"0.0255037","F_GetDate":"2019/4/1 7:15:00"},{"F_Value":"0.0275222","F_GetDate":"2019/4/1 7:20:00"},{"F_Value":"0.02332224","F_GetDate":"2019/4/1 7:25:00"},{"F_Value":"0.02416638","F_GetDate":"2019/4/1 7:30:00"},{"F_Value":"0.02226995","F_GetDate":"2019/4/1 7:35:00"},{"F_Value":"0.0291538","F_GetDate":"2019/4/1 7:40:00"},{"F_Value":"0.02251864","F_GetDate":"2019/4/1 7:45:00"},{"F_Value":"0.03274521","F_GetDate":"2019/4/1 7:50:00"},{"F_Value":"0.0221249","F_GetDate":"2019/4/1 7:55:00"},{"F_Value":"0.02254696","F_GetDate":"2019/4/1 8:00:00"},{"F_Value":"0.02482476","F_GetDate":"2019/4/1 8:05:00"},{"F_Value":"0.02604612","F_GetDate":"2019/4/1 8:10:00"},{"F_Value":"0.03000499","F_GetDate":"2019/4/1 8:15:00"},{"F_Value":"0.03230645","F_GetDate":"2019/4/1 8:20:00"},{"F_Value":"0.03407868","F_GetDate":"2019/4/1 8:25:00"},{"F_Value":"0.02838962","F_GetDate":"2019/4/1 8:30:00"},{"F_Value":"0.02795616","F_GetDate":"2019/4/1 8:35:00"},{"F_Value":"0.03969707","F_GetDate":"2019/4/1 8:40:00"},{"F_Value":"0.02793437","F_GetDate":"2019/4/1 8:45:00"},{"F_Value":"0.03242474","F_GetDate":"2019/4/1 8:50:00"},{"F_Value":"0.02645825","F_GetDate":"2019/4/1 8:55:00"},{"F_Value":"0.03027637","F_GetDate":"2019/4/1 9:00:00"},{"F_Value":"0.02727128","F_GetDate":"2019/4/1 9:05:00"},{"F_Value":"0.1165099","F_GetDate":"2019/4/1 9:10:00"},{"F_Value":"0.02850891","F_GetDate":"2019/4/1 9:15:00"},{"F_Value":"0.03537584","F_GetDate":"2019/4/1 9:20:00"},{"F_Value":"0.03024953","F_GetDate":"2019/4/1 9:25:00"},{"F_Value":"0.05750613","F_GetDate":"2019/4/1 9:30:00"},{"F_Value":"0.02872481","F_GetDate":"2019/4/1 9:35:00"},{"F_Value":"0.1626375","F_GetDate":"2019/4/1 9:40:00"},{"F_Value":"0.029913","F_GetDate":"2019/4/1 9:45:00"},{"F_Value":"0.02807523","F_GetDate":"2019/4/1 9:50:00"},{"F_Value":"0.02556049","F_GetDate":"2019/4/1 9:55:00"},{"F_Value":"0.02377187","F_GetDate":"2019/4/1 10:00:00"},{"F_Value":"0.03706244","F_GetDate":"2019/4/1 10:05:00"},{"F_Value":"0.02748318","F_GetDate":"2019/4/1 10:10:00"},{"F_Value":"0.02525453","F_GetDate":"2019/4/1 10:15:00"},{"F_Value":"0.02419876","F_GetDate":"2019/4/1 10:20:00"},{"F_Value":"0.0318853","F_GetDate":"2019/4/1 10:25:00"},{"F_Value":"0.07324309","F_GetDate":"2019/4/1 10:30:00"},{"F_Value":"0.0963436","F_GetDate":"2019/4/1 10:35:00"},{"F_Value":"0.04218459","F_GetDate":"2019/4/1 10:40:00"},{"F_Value":"0.03787376","F_GetDate":"2019/4/1 10:45:00"},{"F_Value":"0.1668414","F_GetDate":"2019/4/1 10:50:00"},{"F_Value":"0.02756223","F_GetDate":"2019/4/1 10:55:00"},{"F_Value":"0.03114438","F_GetDate":"2019/4/1 11:00:00"},{"F_Value":"0.02481541","F_GetDate":"2019/4/1 11:05:00"},{"F_Value":"0.03397553","F_GetDate":"2019/4/1 11:10:00"},{"F_Value":"0.02572565","F_GetDate":"2019/4/1 11:15:00"},{"F_Value":"0.02583815","F_GetDate":"2019/4/1 11:20:00"},{"F_Value":"0.02475221","F_GetDate":"2019/4/1 11:25:00"},{"F_Value":"0.04186432","F_GetDate":"2019/4/1 11:30:00"},{"F_Value":"0.03074978","F_GetDate":"2019/4/1 11:35:00"},{"F_Value":"0.02363849","F_GetDate":"2019/4/1 11:40:00"},{"F_Value":"0.0285912","F_GetDate":"2019/4/1 11:45:00"},{"F_Value":"0.02590654","F_GetDate":"2019/4/1 11:50:00"},{"F_Value":"0.02723509","F_GetDate":"2019/4/1 11:55:00"},{"F_Value":"0.03583368","F_GetDate":"2019/4/1 12:00:00"},{"F_Value":"0.03314755","F_GetDate":"2019/4/1 12:05:00"},{"F_Value":"0.02368752","F_GetDate":"2019/4/1 12:10:00"},{"F_Value":"0.02191678","F_GetDate":"2019/4/1 12:15:00"},{"F_Value":"0.02866315","F_GetDate":"2019/4/1 12:20:00"},{"F_Value":"0.02244897","F_GetDate":"2019/4/1 12:25:00"},{"F_Value":"0.03283544","F_GetDate":"2019/4/1 12:30:00"},{"F_Value":"0.02686946","F_GetDate":"2019/4/1 12:35:00"},{"F_Value":"0.02739862","F_GetDate":"2019/4/1 12:40:00"},{"F_Value":"0.03178508","F_GetDate":"2019/4/1 12:45:00"},{"F_Value":"0.03890066","F_GetDate":"2019/4/1 12:50:00"},{"F_Value":"0.02984991","F_GetDate":"2019/4/1 12:55:00"},{"F_Value":"0.02544106","F_GetDate":"2019/4/1 13:00:00"},{"F_Value":"0.0262657","F_GetDate":"2019/4/1 13:05:00"},{"F_Value":"0.02928979","F_GetDate":"2019/4/1 13:10:00"},{"F_Value":"0.1994055","F_GetDate":"2019/4/1 13:15:00"},{"F_Value":"0.02437671","F_GetDate":"2019/4/1 13:20:00"},{"F_Value":"0.02574819","F_GetDate":"2019/4/1 13:25:00"},{"F_Value":"0.0893636","F_GetDate":"2019/4/1 13:30:00"},{"F_Value":"0.02508397","F_GetDate":"2019/4/1 13:35:00"},{"F_Value":"0.0743515","F_GetDate":"2019/4/1 13:40:00"},{"F_Value":"0.03098658","F_GetDate":"2019/4/1 13:45:00"},{"F_Value":"0.02355244","F_GetDate":"2019/4/1 13:50:00"},{"F_Value":"0.03330992","F_GetDate":"2019/4/1 13:55:00"},{"F_Value":"0.03135601","F_GetDate":"2019/4/1 14:00:00"},{"F_Value":"0.03597748","F_GetDate":"2019/4/1 14:05:00"},{"F_Value":"0.2551635","F_GetDate":"2019/4/1 14:10:00"},{"F_Value":"0.02747157","F_GetDate":"2019/4/1 14:15:00"},{"F_Value":"0.02802042","F_GetDate":"2019/4/1 14:20:00"},{"F_Value":"0.03036629","F_GetDate":"2019/4/1 14:25:00"},{"F_Value":"0.0352197","F_GetDate":"2019/4/1 14:30:00"},{"F_Value":"0.02045311","F_GetDate":"2019/4/1 14:35:00"},{"F_Value":"0.02753695","F_GetDate":"2019/4/1 14:40:00"},{"F_Value":"0.07331315","F_GetDate":"2019/4/1 14:45:00"},{"F_Value":"0.02857294","F_GetDate":"2019/4/1 14:50:00"},{"F_Value":"0.02625355","F_GetDate":"2019/4/1 14:55:00"},{"F_Value":"0.07695714","F_GetDate":"2019/4/1 15:00:00"},{"F_Value":"0.03651685","F_GetDate":"2019/4/1 15:05:00"},{"F_Value":"0.03079973","F_GetDate":"2019/4/1 15:10:00"},{"F_Value":"0.05851616","F_GetDate":"2019/4/1 15:15:00"},{"F_Value":"0.03099407","F_GetDate":"2019/4/1 15:20:00"},{"F_Value":"0.06634628","F_GetDate":"2019/4/1 15:25:00"},{"F_Value":"0.02873995","F_GetDate":"2019/4/1 15:30:00"},{"F_Value":"0.03151103","F_GetDate":"2019/4/1 15:35:00"},{"F_Value":"0.0349759","F_GetDate":"2019/4/1 15:40:00"},{"F_Value":"0.1739749","F_GetDate":"2019/4/1 15:45:00"},{"F_Value":"0.1645744","F_GetDate":"2019/4/1 15:50:00"},{"F_Value":"0.03162039","F_GetDate":"2019/4/1 15:55:00"},{"F_Value":"0.02966861","F_GetDate":"2019/4/1 16:00:00"},{"F_Value":"0.02513942","F_GetDate":"2019/4/1 16:05:00"},{"F_Value":"0.03414585","F_GetDate":"2019/4/1 16:10:00"},{"F_Value":"0.03321487","F_GetDate":"2019/4/1 16:15:00"},{"F_Value":"0.2238105","F_GetDate":"2019/4/1 16:20:00"},{"F_Value":"0.02364708","F_GetDate":"2019/4/1 16:25:00"},{"F_Value":"0.08203761","F_GetDate":"2019/4/1 16:30:00"},{"F_Value":"0.02776982","F_GetDate":"2019/4/1 16:35:00"},{"F_Value":"0.02889095","F_GetDate":"2019/4/1 16:40:00"},{"F_Value":"0.03256935","F_GetDate":"2019/4/1 16:45:00"},{"F_Value":"0.03828662","F_GetDate":"2019/4/1 16:50:00"},{"F_Value":"0.1505158","F_GetDate":"2019/4/1 16:55:00"},{"F_Value":"0.04894344","F_GetDate":"2019/4/1 17:00:00"},{"F_Value":"0.03434321","F_GetDate":"2019/4/1 17:05:00"},{"F_Value":"0.03752058","F_GetDate":"2019/4/1 17:10:00"},{"F_Value":"0.03176408","F_GetDate":"2019/4/1 17:15:00"},{"F_Value":"0.04087784","F_GetDate":"2019/4/1 17:20:00"},{"F_Value":"0.07546017","F_GetDate":"2019/4/1 17:25:00"},{"F_Value":"0.09265188","F_GetDate":"2019/4/1 17:30:00"},{"F_Value":"0.03859599","F_GetDate":"2019/4/1 17:35:00"},{"F_Value":"0.032523","F_GetDate":"2019/4/1 17:40:00"},{"F_Value":"0.02939556","F_GetDate":"2019/4/1 17:45:00"},{"F_Value":"0.02607284","F_GetDate":"2019/4/1 17:50:00"},{"F_Value":"0.02661565","F_GetDate":"2019/4/1 17:55:00"},{"F_Value":"0.05350415","F_GetDate":"2019/4/1 18:00:00"},{"F_Value":"0.02996048","F_GetDate":"2019/4/1 18:05:00"},{"F_Value":"0.02960304","F_GetDate":"2019/4/1 18:10:00"},{"F_Value":"0.0305216","F_GetDate":"2019/4/1 18:15:00"},{"F_Value":"0.02209998","F_GetDate":"2019/4/1 18:20:00"},{"F_Value":"0.03042355","F_GetDate":"2019/4/1 18:25:00"},{"F_Value":"0.02417358","F_GetDate":"2019/4/1 18:30:00"},{"F_Value":"0.02775833","F_GetDate":"2019/4/1 18:35:00"},{"F_Value":"0.02542395","F_GetDate":"2019/4/1 18:40:00"},{"F_Value":"0.02873591","F_GetDate":"2019/4/1 18:45:00"},{"F_Value":"0.01887013","F_GetDate":"2019/4/1 18:50:00"},{"F_Value":"0.02250962","F_GetDate":"2019/4/1 18:55:00"},{"F_Value":"0.02290181","F_GetDate":"2019/4/1 19:00:00"},{"F_Value":"0.0222491","F_GetDate":"2019/4/1 19:05:00"},{"F_Value":"0.02035644","F_GetDate":"2019/4/1 19:10:00"},{"F_Value":"0.02762005","F_GetDate":"2019/4/1 19:15:00"},{"F_Value":"0.02268419","F_GetDate":"2019/4/1 19:20:00"},{"F_Value":"0.01727476","F_GetDate":"2019/4/1 19:25:00"},{"F_Value":"0.02005931","F_GetDate":"2019/4/1 19:30:00"},{"F_Value":"0.02420835","F_GetDate":"2019/4/1 19:35:00"},{"F_Value":"0.02112287","F_GetDate":"2019/4/1 19:40:00"},{"F_Value":"0.02610175","F_GetDate":"2019/4/1 19:45:00"},{"F_Value":"0.03050829","F_GetDate":"2019/4/1 19:50:00"},{"F_Value":"0.02282823","F_GetDate":"2019/4/1 19:55:00"},{"F_Value":"0.02512326","F_GetDate":"2019/4/1 20:00:00"},{"F_Value":"0.020704","F_GetDate":"2019/4/1 20:05:00"},{"F_Value":"0.02277098","F_GetDate":"2019/4/1 20:10:00"},{"F_Value":"0.02495064","F_GetDate":"2019/4/1 20:15:00"},{"F_Value":"0.01912663","F_GetDate":"2019/4/1 20:20:00"},{"F_Value":"0.0196827","F_GetDate":"2019/4/1 20:25:00"},{"F_Value":"0.02751272","F_GetDate":"2019/4/1 20:30:00"},{"F_Value":"0.02117499","F_GetDate":"2019/4/1 20:35:00"},{"F_Value":"0.02031936","F_GetDate":"2019/4/1 20:40:00"},{"F_Value":"0.02303819","F_GetDate":"2019/4/1 20:45:00"},{"F_Value":"0.02425504","F_GetDate":"2019/4/1 20:50:00"},{"F_Value":"0.02360534","F_GetDate":"2019/4/1 20:55:00"},{"F_Value":"0.02336822","F_GetDate":"2019/4/1 21:00:00"},{"F_Value":"0.02258167","F_GetDate":"2019/4/1 21:05:00"},{"F_Value":"0.02151337","F_GetDate":"2019/4/1 21:10:00"},{"F_Value":"0.02001009","F_GetDate":"2019/4/1 21:15:00"},{"F_Value":"0.0236299","F_GetDate":"2019/4/1 21:20:00"},{"F_Value":"0.02310482","F_GetDate":"2019/4/1 21:25:00"},{"F_Value":"0.02475573","F_GetDate":"2019/4/1 21:30:00"},{"F_Value":"0.02378041","F_GetDate":"2019/4/1 21:35:00"},{"F_Value":"0.0260695","F_GetDate":"2019/4/1 21:40:00"},{"F_Value":"0.02362499","F_GetDate":"2019/4/1 21:45:00"},{"F_Value":"0.0232712","F_GetDate":"2019/4/1 21:50:00"},{"F_Value":"0.02286632","F_GetDate":"2019/4/1 21:55:00"},{"F_Value":"0.02223867","F_GetDate":"2019/4/1 22:00:00"},{"F_Value":"0.02393239","F_GetDate":"2019/4/1 22:05:00"},{"F_Value":"0.02590094","F_GetDate":"2019/4/1 22:10:00"},{"F_Value":"0.02896615","F_GetDate":"2019/4/1 22:15:00"},{"F_Value":"0.02768403","F_GetDate":"2019/4/1 22:20:00"},{"F_Value":"0.02342277","F_GetDate":"2019/4/1 22:25:00"},{"F_Value":"0.02259964","F_GetDate":"2019/4/1 22:30:00"},{"F_Value":"0.02426341","F_GetDate":"2019/4/1 22:35:00"},{"F_Value":"0.02518553","F_GetDate":"2019/4/1 22:40:00"},{"F_Value":"0.02010265","F_GetDate":"2019/4/1 22:45:00"},{"F_Value":"0.02203557","F_GetDate":"2019/4/1 22:50:00"},{"F_Value":"0.02325249","F_GetDate":"2019/4/1 22:55:00"},{"F_Value":"0.02188764","F_GetDate":"2019/4/1 23:00:00"},{"F_Value":"0.02279644","F_GetDate":"2019/4/1 23:05:00"},{"F_Value":"0.02300543","F_GetDate":"2019/4/1 23:10:00"},{"F_Value":"0.02343267","F_GetDate":"2019/4/1 23:15:00"},{"F_Value":"0.02045169","F_GetDate":"2019/4/1 23:20:00"},{"F_Value":"0.02196305","F_GetDate":"2019/4/1 23:25:00"},{"F_Value":"0.02303441","F_GetDate":"2019/4/1 23:30:00"},{"F_Value":"0.02398687","F_GetDate":"2019/4/1 23:35:00"},{"F_Value":"0.02371323","F_GetDate":"2019/4/1 23:40:00"},{"F_Value":"0.02535198","F_GetDate":"2019/4/1 23:45:00"},{"F_Value":"0.02205268","F_GetDate":"2019/4/1 23:50:00"},{"F_Value":"0.02696967","F_GetDate":"2019/4/1 23:55:00"}]
     */

    private String devCode;
    private String F_SignalTypeId;
    private List<TrendDatasBean> TrendDatas;

    public Trend() {
    }

    public Trend(String devCode, String f_SignalTypeId, List<TrendDatasBean> trendDatas) {
        this.devCode = devCode;
        F_SignalTypeId = f_SignalTypeId;
        TrendDatas = trendDatas;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getF_SignalTypeId() {
        return F_SignalTypeId;
    }

    public void setF_SignalTypeId(String F_SignalTypeId) {
        this.F_SignalTypeId = F_SignalTypeId;
    }

    public List<TrendDatasBean> getTrendDatas() {
        return TrendDatas;
    }

    public void setTrendDatas(List<TrendDatasBean> TrendDatas) {
        this.TrendDatas = TrendDatas;
    }

    public static class TrendDatasBean {
        /**
         * F_Value : 0.0212051
         * F_GetDate : 2019/4/1 0:00:00
         */

        private String F_Value;
        private String F_GetDate;

        public TrendDatasBean() {
        }

        public TrendDatasBean(String f_Value, String f_GetDate) {
            F_Value = f_Value;
            F_GetDate = f_GetDate;
        }

        public String getF_Value() {
            return F_Value;
        }

        public void setF_Value(String F_Value) {
            this.F_Value = F_Value;
        }

        public String getF_GetDate() {
            return F_GetDate;
        }

        public void setF_GetDate(String F_GetDate) {
            this.F_GetDate = F_GetDate;
        }
    }
}