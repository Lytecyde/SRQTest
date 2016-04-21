package com.company;
/**
 * Created by diku on 11/26/15.
 */
public final class QuestionData {

    public static String[] ASRIitemENG = {
            "It’s hard for me to notice when I’ve ―had enough (sweets, food, etc.). ",
            "When I’m sad, I can usually start doing something that will make me feel better.",
            "If something isn’t going according to my plans, I change my actions to try and reach my goal.",
            "I can find ways to make myself study even when my friends want to go out.",
            "I lose track of the time when I’m doing something fun.",

            "When I’m bored I fidget or can’t sit still.",
            "It’s hard for me to get started on big projects that require planning in advance.",
            "I can usually act normal around everybody if I’m upset with someone.",
            "I am good at keeping track of lots of things going on around me, even when I’m feeling stressed.",
            "When I’m having a tough day, I stop myself from whining about it to my family or friends",

            "I can start a new task even if I’m already tired.",
            "I lose control whenever I don’t get my way.",
            "Little problems detract me from my long-term plans",
            "I forget about whatever else I need to do when I’m doing something really fun.",
            "If I really want something, I have to have it right away.",

            "During a dull class, I have trouble forcing myself to start paying attention.",
            "After I’m interrupted or distracted, I can easily continue working where I left off.",
            "If there are other things going on around me, I find it hard to keep my attention focused on whatever I’m doing",
            "I never know how much more work I have to do.",
            "When I have a serious disagreement with someone, I can talk calmly about it without losing control.",

            "It’s hard to start making plans to deal with a big project or problem, especially when I’m feeling stressed.",
            "I can calm myself down when I’m excited or all wound up.",
            "I can stay focused on my work even when it’s dull.",
            "I usually know when I’m going to start crying.",
            "I can stop myself from doing things like throwing objects when I’m mad.",

            "I work carefully when I know something will be tricky.",
            "I am usually aware of my feelings before I let them out.",
            "In class, I can concentrate on my work even if my friends are talking.",
            "When I’m excited about reaching a goal (e.g., getting my driver’s license, going to college), it’s easy " +
                    "to start working toward it.",
            "I can find a way to stick with my plans and goals, even when it’s tough.",

            "When I have a big project, I can keep working on it.",
            "I can usually tell when I’m getting tired or frustrated.",
            "I get carried away emotionally when I get excited about something.",
            "I have trouble getting excited about something that’s really special when I’m tired.",
            "It’s hard for me to keep focused on something I find unpleasant or upsetting.",

            "I can resist doing something when I know I shouldn’t do it."
    };

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
    public static String[] SRQitemENG = {
            "1. I usually keep track of my progress toward my goals.",
            "2. My behavior is not that different from other people's.",
            "3. Others tell me that I keep on with things too long.",
            "4. I doubt I could change even if I wanted to.",
            "5. I have trouble making up my mind about things.",
            "6. I get easily distracted from my plans." ,
            "7. I reward myself for progress toward my goals." ,
            "8. I don't notice the effects of my actions until it's too late.",
            "9. My behavior is similar to that of my friends." ,
            "10. It's hard for me to see anything helpful about changing my ways.",

            "11. I am able to accomplish goals I set for myself. Searching",
            "12. I put off making decisions."  ,
            "13. I have so many plans that it's hard for me to focus on any one of them.",

            "14. I change the way I do things when I see a problem with how things are going.",

            "15. It's hard for me to notice when I've had enough (alcohol, food, sweets).",

            "16. I think a lot about what other people think of me." ,
            "17. I am willing to consider other ways of doing things." ,
            "18. If I wanted to change, I am confident that I could do it. Searching",
            "19. When it comes to deciding about a change, I feel overwhelmed by the choices.",

            "20. I have trouble following through with things once I've made up my mind to do something.",

            "21. I don't seem to learn from my mistakes.",
            "22. I'm usually careful not to overdo it when working, eating, drinking.",
            
            "23. I tend to compare myself with other people.",
            "24. I enjoy a routine, and like things to stay the same.",
            "25. I have sought out advice or information about changing.",
            "26. I can come up with lots of ways to change, but it's hard for me to decide which one to use.",

            "27. I can stick to a plan that's working well. ",
            "28. I usually only have to make a mistake one time in order to learn from it.",

            "29. I don't learn well from punishment.",
            "30. I have personal standards, and try to live up to them.",
            "31. I am set in my ways.",
            "32. As soon as I see a problem or challenge, I start looking for possible solutions.",

            "33. I have a hard time setting goals for myself.",
            "34. I have a lot of willpower." ,
            "35. When I'm trying to change something, I pay a lot of attention to how I'm doing.",

            "36. I usually judge what I'm doing by the consequences of my actions.",

            "37. I don't care if I'm different from most people.",
            "38. As soon as I see things aren't going right I want to do something about it.",

            "39. There is usually more than one way to accomplish something." ,
            "40. I have trouble making plans to help me reach my goals.",
            "41. I am able to resist temptation." ,

            "42. I set goals for myself and keep track of my progress. ",
            "43. Most of the time I don't pay attention to what I'm doing.",
            "44. I try to be like people around me. ",
            "45. I tend to keep doing the same thing, even when it doesn't work.",
            "46. I can usually find several different possibilities when I want to change something.",

            "47. Once I have a goal, I can usually plan how to reach it." ,
            "48. I have rules that I stick by no matter what. ",
            "49. If I make a resolution to change something, I pay a lot of attention to how I'm doing.",
            "50. Often I don't notice what I'm doing until someone calls it to my attention.",

            "51. I think a lot about how I'm doing. ",
            "52. Usually I see the need to change before others do.",
            "53. I'm good at finding different ways to get what I want. ",
            "54. I usually think before I act. ",
            "55. Little problems or distractions throw me off course.",
            "56. I feel bad when I don't meet my goals. ",
            "57. I learn from my mistakes. ",
            "58. I know how I want to be. ",
            "59. It bothers me when things aren't the way I want them.",
            "60. I call in others for help when I need it. ",
            "61. Before making a decision, I consider what is likely to happen if I do one thing or another.",

            "62. I give up quickly.",
            "63. I usually decide to change and hope for the best."
    };
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

    public static String[] ASRIitemRU = {
            "!!Это трудно для меня, чтобы заметить, когда у меня было достаточно(конфети, игры ). !!",
            "Когда у меня плохое настроение я обычно начинаю заниматься чем-нибудь, что поможет мне его поднять",
            "Если что-то идёт не по плану, я стараюсь скорректировать свои поступки, чтобы всё-таки достичь поставленной цели",
            "Я смогу стимулировать себя на учёбу, даже если друзья приглашают развлечься с ними",
            "Я могу потерять счёт времени, когда занят чем-то увлекательным ",
            "Когда мне скучно, я проявляю непоседливость и не могу долго оставаться на одном месте. ",
            "Мне нелегко даются масштабные дела, которые нужно планировать заранее",
            "Даже когда я недоволен кем-то, я могу вести себя приветливо с окружающими. ",
            "Я не теряю контроль над своими делами и поступками даже когда я в напряженном состоянии",
            "Даже когда у меня выдаётся нелегкий день, я стараюсь не докучать своими проблемами друзьям и семье",
            "Даже будучи уставшим я вполне могу приступить к выполнению какой-то новой задачи",
            "Я теряю самообладание, когда выходит не по-моему",
            "Мелкие неприятности могут отвлечь меня от больших планов ",
            "Когда я веселюсь, я могу забыть об остальных делах ",
            "Если уж я что-то решил, то добьюсь, чтобы вышло по-моему. ",
            "На скучном уроке мне трудно сохранять сосредоточенность",
            "Мне нетрудно снова включиться в работу после того, как меня кто-то отвлёк от неё",
            "Если вокруг меня что-то происходит, мне трудно сосредоточиться на том, что я делаю",
            "Я никогда не представляю себе объём оставшейся работы",
            "Даже когда я сильно расхожусь во мнениях с кем-то, то могу говорить об этом спокойно, не выходя из себя.",
            "Трудно начать планировать серьёзное дело или решать проблему, особенно если я чувствую себя напряжённым ",
            "Я знаю как успокоить себя, когда я взвинчен или возбуждён чем-то",
            "Я могу концентрироваться на работе, даже когда она скучная",
            "Обычно я знаю заранее, что не смогу сдержать слёз",
            "Я могу заставить себя не делать безрассудных поступков, например, не швырять вещи, даже когда я очень рассержен",
            "Я работаю внимательно если знаю, что задача непростая",
            "Как правило я отдаю себе отчёт в своём состоянии, прежде чем дать волю чувствам.",
            "В классе я могу сосредоточиться на работе даже когда мои друзья болтают между собой",
            "Когда конечная цель для меня важна (получение водительских прав, поступление в институт), мне легко засесть за работу",
            "Я могу сконцентрироваться на достижении своих целей даже когда это нелегко",
            "Я знаю как браться за серьёзные дела и доводить их до конца",
            "Обычно я отдаю себе отчёт в том, что начинаю уставать или раздражаться",
            "Я эмоционально увлекаюсь, когда занят чем-то интересным",
            "Мне трудно увлечься каким-то особенным делом, когда я устал",
            "Мне трудно сфокусироваться на чём-то, что меня расстраивает или мне неприятно",
            "Я могу заставить себя не делать что-то, если мне точно не стоит это делать",

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
