package com.company;

/**
 * Created by diku on 11/26/15.
 */
public final class QuestionData {
    public static String[] ASRIitem = {
            "Mul on raske märgata kui mul küllalt saab (magusat, toitu, seksi)",
            "Kui ma olen kurb, siis võtan midagi ette, et tuju paremaks teha.",
            "Kui miski ei lähe plaanipäraselt siis muudan midagi, et eesmärki saavutada.",
            "Leian viise kuidas ennast õppima panna isegi kui sõbrad tahavad välja minna",
            "Kaotan ajataju kui teen midagi huvitavat.",

            "Kui on igav siis olen ma püsitu ja rahutu.",
            "Suuri ja eelplaneerimist vajavaid projekte on raske alustada.",
            "Ma võin tavaliselt käituda normaalselt kõigiga kui ma olen endast väljas.",
            "Mul õnnestub jälgida ja arvestada paljude asjadega isegi kui tunnen stressi.",
            "Kui päev on raske siis hoian tagasi vingumist vanemate ees.",

            "Ma võin alustada uue asjaga isegi kui olen väsinud.",
            "Kaotan alati ensesvalitsuse kui ei saa oma tahtmist.",
            "Pisimured hoiavad mind pikema plaani täitmisest.",
            "Ma unustan kõik mida ma tegema pidin kui mul on käsil midagi tõesti huvitavat.",
            "Kui mul midagi vaja on siis pean seda kohe saama.",

            "Igava tunni ajal on mul raske ennast sundida tähele panema.",
            "Kui mind miski segab või häirib siis on mul kerge jätkata sealt kus pooleli jäi.",
            "Kui minu ümber on teisi asju toimumas siis on mul raske teha seda mida ma teen.",
            "Ma ei tea kunagi kui palju mul tööd ees on.",
            "Kui mul on tõsiseid lahkhelisid kellegagi siis saan sellest rahulikult rääkida ilma juhtimise kaotamist.",

            "On raske plaane alustada, et alustada suure projekti või probleemiga eriti kui tunnen end stressis.",
            "Olen võimelin ennast maha rahustama kui olen erutunud või pinges.",
            "Ma võin keskendumust hoida töö asjus isegi kui see on igav",
            "Ma tavaliselt tean millal ma nutma hakkan.",
            "Ma suudan ennast pidada asjuloopimast kui olen vihane",

            "Ma töötan hoolikalt kui ma tean et asi on keerukas",
            "Ma olen teadlik oma tunnetest enne kui ma neid välja näitan.",
            "Tunnis töötan keskendunult isegi kui mu sõbrad räägivad.",
            "Kui ma olen põnevil eesmärgi saavutamise osas on kerge plaanipoole liikuda.",
            "Ma leian viisi plaani täita ja eesmärki saavutada isegi kui see on raske.",

            "Kui mul on suur projekt, siis suudan ma selle kallal töötada.",
            "Ma tean kui kui ma ära väsin või frustratsioon.",
            "Kui erutun siis kaasavad mind emotsioonid.",
            "Mul on raske erutuda millestki mis on tõesti eriline eriti siis kui olen väsinud.",
            "On raske olla keskendunud kui leian midagi ebameeldivat või ärritavat.",

            "Ma ei suuda vastu panna kui ma teen midagi mida ei tuleks teha."
    };//1, 2, 5, 6, 7, 8, 12, 13,14, 15, 16, 18, 19, 21, 34, 35
    public static boolean[] ASRIreversibles = {
            true,true,false,false,true,
            true,true,true,false,false,
            false,true,true,true,true,
            true,false,true,true,false,
            true,false,false,false,false,
            false,false,false,false,false,
            false,false,false,true,true,
            false};

    public static String[] SRQitem = {
            "1. Tavaliselt märgin kirja oma edusammud eesmärgi poole.", //
            "2. Minu käitumine ei erine eriti teiste omast. ",          //r
            "3. Teised ütlevad, et hoian liiga kaua kinni oma asjadest. ",//r
            "4. Kahtlen kas suudan muutuda isegi kui seda tahaksin",        //r
    "5. Mul on raske otsustada",                                        //r
    "6. Mind segavad häirivad asjaolud plaani saavutamast",             //r
    "7. Ma määran omale auhindu edu eest eesmärkide poole.",            //
            "8. Ma ei märka oma tegevuste toimet kuni on juba liiga hilja.",//r
    "9. Ma käitun sarnaselt oma sõpradele. ",                           //
    "10. On raske näha, et oma eluviisi muutmine oleks mulle kuidagi abiks.",//r
    "11. MA suudan saavutada eesmärke mida endale sean.",                   //
    "12. Lükkan otsustamise edasi",                                         //r
    "13. Mul on niipalju plaane, et ühe kindla peale keskendumine on mul raske.",//r
    "14. Ma muudan seda kuidas ma asju teen kui näen probleemi asjade kulgemises.",//
    "15. Mul on raske märgata kui mul mõõdukas piir saavutatud on (alkohol, toit, magus).",//r
            "16. Ma mõtlen palju sellest mida teised minust mõtlevad.",                     //
    "17. Olen valmis kaaluma teisi meetodeid.",                                             //
            "18. Kui tahan muutuda siis olen ma kindel, et suudan seda teha.",              //
    "19. KUi otsustada tuleb siis olen ma valikute poolest ülekoormatud.",                  //r
    "20. Mul on raskusi asju plaanipäraselt järgida kui olen kord juba otsustanud midagi teha.",//r
    "21. Tundub, et ma ei suuda oma vigadest õppida.",                                          //r
            "22. Ma olen tavaliselt ettevaatlik, et ma ei teeks endale töö, söömise ja joomisega liiga.",//
    "23. Kaldun võrdlema ennast teistega. ",                                                             //
            "24. Naudin rutiini ja mulle meeldib kui asjad jäävad samaks.",                             //r
            "25. Olen otsinud soovitusi ja teavet selle kohta kuidas muutuda.",                         //
    "26. Ma mõtlen välja palju viise kuidas muutuda , kuid mul on raske otsustada mida kasutusse võtta.",//r
            "27. Ma võin järgida plaani mis toimib.",                                                   //
            "28. Tavaliselt pean tegema vaid ühe vea, et sellest õppida.",                              //
            "29. Karistustest ei õpi ma hästi.",                                                        //r
            "30. Mul on isiklikud standardid ja ma püüan nende järgi elada.",                           //
    "31. Ma olen oma eluviisides kinni.",                                                               //r
            "32. Nii pea kui ma problememi või väljakutset näen proovin ma leida võimalikke lahendusi.",//
            "33. Mul on raske seada isiklikke plaane.",                                                 //r
    "34. Mul on rohkelt tahtejõudu (juhin oma impulse hästi).",                                         //
            "35. Kui ma midagi muuta püüan siis panen ma hoolikalt tähele kuidas ma seda teen.",        //
            "36. Tavaliselt hindan seda mida teen oma tegude tulemuste järgi.",                         //
            "37. Ma ei hooli kui olen teistest erinev.",                                                //r
    "38. Niipea kui näen et asjad pole korras siis tahan midagi ette võtta.",                           //
            "39. Tavaliselt on rohkem kui üks viis midagi saavutada.",                                  //
            "40. Mul on raske teha plaane mis oleks abiks mu eesmärkide saavutamisel.",//r
    "41. Suudan hoiduda kiusatustest.",//
            "42. Sean eesmärke endale ja kirjutan üles oma edusamme.",//
    "43. Enamalt ei pane ma tähele mida ma teen.",//r
            "44. Püüan olla nagu teised.",//
            "45. Kaldun tegema sama asja isegi kui see ei toimi.",//r
            "46. Tavaliselt leidan ma mitmeid erinevaid lahendusi, kui soovin midagi muuta.",//
            "47. Kui mul eesmärk olemas on siis suudan tavaliselt teha plaani kuidas seda saavutada.",//
            "48. Mul on reegleid millest ma kinni pean olenemata kõigest muust.",//
            "49. Kui teen lubaduse muutuda siis hoian palju tähelepanu sellel kuidas mul läheb.",//
            "50. Tihti ei pane ma tähele kuidas mul läheb, kui just keegi selelle mu tähelepanu ei pööra.",//r

    "51. Ma mõtlen palju sellest kuidas mul läheb.",//
            "52. Tavaliselt näen ma enne teisi seda, et muuutust on vaja.",//
            "53. Mul on hea võime leida erinevaid viise kuidas saada seda mida ma tahan.",//
            "54. Ma tavaliselt mõtlen enne kui ma tegutsen.",//
            "55. Pisimured ja häirivad asjaolud viivad mind teelt.",//r
    "56. Tunnen ennast halvasti kui am ei suuda oma eesmärke saavutada.",//
            "57. Õpin oma vigadest.",//
    "58. Tean seda kelleks ma saada tahan.",//
    "59. Mind segab kui ma asjad pole nii nagu ma neid tahan.",//
            "60. Ma küsin abi teistelt kui mul seda vaja on.",//
    "61. Enne kui otsustan, kaalun läbi mis saab ühel või teisel jubul.",//
            "62. Annan kergelt alla.",//r
            "63. Tavaliselt ma otsustan muuta midagi kuid jään lootma õnne peale."//r
};

    public static boolean[] SRQreversibles = {
            //RETSPIA
            false, true,true,true,true,true,false,//7
            true,false,true,false,true,true,false,//14
            true,false,false,false,true,true,true,//21
            false,false,true,false,true,false,false,//28
            true,false,true,false,true,false,false,//35
            false,true,false,false,true,false,false,//42
            true,false,true,false,false,false,false,//49
            true,false,false,false,false,true,false,//56
            false,false,false,false,false,true,true,//63

    };
}
