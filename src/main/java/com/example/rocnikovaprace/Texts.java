package com.example.rocnikovaprace;

import java.util.HashMap;

public class Texts {
    public void getStory(String name) {
        Mainpart.text.setText(story.get(name));
        System.out.println(story.get(name));


    }

    HashMap<String, String> story;

    public Texts() {
        story = new HashMap<String, String>();

        story.put("Uvod", "Vzbudil jsi se z hlubokého spánku, ale stále se cítíš unaveně a především rozlámaně, protože jsi spal na dřevěné prkenné desce. Ale nejvíce tě bolí hlava zezadu. po chvíli bez výsledného vzpomínání co se stalo a proč jsi tady, se rozhlédneš kolem a zjistíš, že jsi v jakémsi vězení s jedním oknem s rezavými mřížemi a dřevěnými dveřmi. Velmi se podivíš při zjištění, že máš ruce od zaschlé krve." +
                "\n\n Co budeš dělat dál?" +
                "\n\n A)  půjdeš si lehnout  " +
                "\n\n B)  prohlédnout si okno " +
                "\n\n C)  prohlédnout si dveře");
        story.put("RozhovorSeStarostou", "Usnul jsi a za chvíli tě vzbudí bušení na dveře. Během vteřiny se dveře rozletí a  dovnitř vrazí starosta města. Povídá : „ Doktore vy jste se teda zase předvedl !  Vždyť vy jste té stařence uřízl ruku. A uřízl byste jí i druhou kdyby vás nezastavil její syn, který vás přetáhl pánví po hlavě, pane Brown tohle se už nesmí opakovat! “\n" +
                "Začneš si matně vybavovat,co se stalo:  Že jsi byl najat zdejším kuchařem , aby jsi vyléčil jeho matku od té nové nemoci zvané “hnilobná nákaza” . Nikdo neví jak se šíří ani jak se léčí, jediné co je všem moc dobře známo, je to , že když chorobu někdo chytí tak se mu ruce i nohy do týdne jakousi hnilobou rozpustí a za další týden umírá . Dokonce i mrtvé tělo se během týdne od úmrtí rozloží, jako kdyby tam leželo alespoň 6 měsíců. \n" +
                "Proto jsi té stařence chtěl uříznout ruce , doufal jsi ,že když té staré paní odejmeš končetiny , třeba se zabrání postupu hniloby dál do těla. Ale nikdo neví jestli tohle je ta správná cesta jak “léčit” hnilobu. A proto tě její syn zastavil , v jeho očích se to zdálo jako hrozný a nelidský čin." +
                "\n\n Co řekneš?" +
                "\n\n A)  neřekneš radši nic  " +
                "\n\n B)  budeš se hájit, že to bylo  v zájmu vědy a pro její dobro" +
                "\n\n C)  omluvíš se a že už se to opakovat nebude");
        story.put("okno", "Přišel jsi k oknu a zjistil si , že se nacházíš někde v podzemí protože okno je na úrovni jakási cesty. Ale mříže ačkoliv jsou rezavé se zdají být pevné ." +
                "\n\n Pokuíš se okno vytrhnout?" +
                "\n\n A) Ano" +
                "\n\n B) Ne");
        story.put("okno A", "Vší silou jsi se pokusil je vytrhnout, ale ani se nepohnuly.\n" +
                "V tom se dveře rozletí a  dovnitř vrazí starosta města. Povídá : „ Doktore, vy jste se teda zase předvedl !  Vždyť vy jste té stařence uřízl ruku. A uřízl byste jí i druhou kdyby vás nezastavil její syn, který vás přetáhl pánví po hlavě, pane Brown tohle se už nesmí opakovat! “\n" +
                "Začneš si matně vybavovat,co se stalo:  Že jsi byl najat zdejším kuchařem , aby jsi vyléčil jeho matku od té nové nemoci zvané “hnilobná nákaza” . Nikdo neví jak se šíří ani jak se léčí, jediné co je všem moc dobře známo, je to , že když chorobu někdo chytí tak se mu ruce i nohy do týdne jakousi hnilobou rozpustí a za další týden umírá . Dokonce i mrtvé tělo se během týdne od úmrtí rozloží, jako kdyby tam leželo alespoň 6 měsíců. \n" +
                "Proto jsi té stařence chtěl uříznout ruce , doufal jsi ,že když té staré paní odejmeš končetiny , třeba se zabrání postupu hniloby dál do těla. Ale nikdo neví jestli tohle je ta správná cesta jak “léčit” hnilobu. A proto tě její syn zastavil , v jeho očích se to zdálo jako hrozný a nelidský čin." +
                "\n\n Co řekneš?" +
                "\n\n A)  neřekneš radši nic  " +
                "\n\n B)  budeš se hájit, že to bylo  v zájmu vědy a pro její dobro" +
                "\n\n C)  omluvíš se a že už se to opakovat nebude");
        story.put("dvere", "Přišel jsi ke dveřím,  dveře se zdají být pevné a tlusté , ale přeci jen jsou dřevěné. " +
                "\n\n Pokusíš se je vyrazit ?" +
                "\n\n A) Ano" +
                "\n\n B) Ne");
        story.put("dvere A", "Rozběhl si se vší silou proti dveřím, ale ty se ani nepohnuly , akorát se ozvala dunivá rána.\n" +
                "Najednou uslyšíš blížící se kroky za dveřmi a  během vteřiny se dveře rozletí a  dovnitř vrazí starosta města. Povídá : „ Doktore, snad jste nechtěl utéct ? A taky jste se teda zase předvedl !  Vždyť vy jste té stařence uřízl ruku. A uřízl byste jí i druhou kdyby vás nezastavil její syn, který vás přetáhl pánví po hlavě, pane Brown tohle se už nesmí opakovat! “\n" +
                "Začneš si matně vybavovat,co se stalo:  Že jsi byl najat zdejším kuchařem , aby jsi vyléčil jeho matku od té nové nemoci zvané “hnilobná nákaza” . Nikdo neví jak se šíří ani jak se léčí, jediné co je všem moc dobře známo, je to , že když chorobu někdo chytí tak se mu ruce i nohy do týdne jakousi hnilobou rozpustí a za další týden umírá . Dokonce i mrtvé tělo se během týdne od úmrtí rozloží, jako kdyby tam leželo alespoň 6 měsíců. \n" +
                "Proto jsi té stařence chtěl uříznout ruce , doufal jsi ,že když té staré paní odejmeš končetiny , třeba se zabrání postupu hniloby dál do těla. Ale nikdo neví jestli tohle je ta správná cesta jak “léčit” hnilobu. A proto tě její syn zastavil , v jeho očích se to zdálo jako hrozný a nelidský čin\n" +
                "\n\n Co řekneš?" +
                "\n\n A)  neřekneš radši nic  " +
                "\n\n B)  budeš se hájit, že to bylo  v zájmu vědy a pro její dobro" +
                "\n\n C)  omluvíš se a že už se to opakovat nebude");
        story.put("dvere B", "V tom se dveře rozletí a  dovnitř vrazí starosta města. Povídá : „ Doktore, vy jste se teda zase předvedl !  Vždyť vy jste té stařence uřízl ruku. A uřízl byste jí i druhou kdyby vás nezastavil její syn, který vás přetáhl pánví po hlavě, pane Brown tohle se už nesmí opakovat! “\n" +
                "Začneš si matně vybavovat,co se stalo:  Že jsi byl najat zdejším kuchařem , aby jsi vyléčil jeho matku od té nové nemoci zvané “hnilobná nákaza” . Nikdo neví jak se šíří ani jak se léčí, jediné co je všem moc dobře známo, je to , že když chorobu někdo chytí tak se mu ruce i nohy do týdne jakousi hnilobou rozpustí a za další týden umírá . Dokonce i mrtvé tělo se během týdne od úmrtí rozloží, jako kdyby tam leželo alespoň 6 měsíců. \n" +
                "Proto jsi té stařence chtěl uříznout ruce , doufal jsi ,že když té staré paní odejmeš končetiny , třeba se zabrání postupu hniloby dál do těla. Ale nikdo neví jestli tohle je ta správná cesta jak “léčit” hnilobu. A proto tě její syn zastavil , v jeho očích se to zdálo jako hrozný a nelidský čin.\n" +
                "\n\n Co řekneš?" +
                "\n\n A)  neřekneš radši nic  " +
                "\n\n B)  budeš se hájit, že to bylo  v zájmu vědy a pro její dobro" +
                "\n\n C)  omluvíš se a že už se to opakovat nebude");
        story.put("okno B", "V tom se dveře rozletí a  dovnitř vrazí starosta města. Povídá : „ Doktore, vy jste se teda zase předvedl !  Vždyť vy jste té stařence uřízl ruku. A uřízl byste jí i druhou kdyby vás nezastavil její syn, který vás přetáhl pánví po hlavě, pane Brown tohle se už nesmí opakovat! “\n" +
                "Začneš si matně vybavovat,co se stalo:  Že jsi byl najat zdejším kuchařem , aby jsi vyléčil jeho matku od té nové nemoci zvané “hnilobná nákaza” . Nikdo neví jak se šíří ani jak se léčí, jediné co je všem moc dobře známo, je to , že když chorobu někdo chytí tak se mu ruce i nohy do týdne jakousi hnilobou rozpustí a za další týden umírá . Dokonce i mrtvé tělo se během týdne od úmrtí rozloží, jako kdyby tam leželo alespoň 6 měsíců. \n" +
                "Proto jsi té stařence chtěl uříznout ruce , doufal jsi ,že když té staré paní odejmeš končetiny , třeba se zabrání postupu hniloby dál do těla. Ale nikdo neví jestli tohle je ta správná cesta jak “léčit” hnilobu. A proto tě její syn zastavil , v jeho očích se to zdálo jako hrozný a nelidský čin." +
                "\n\n Co řekneš?" +
                "\n\n A)  neřekneš radši nic  " +
                "\n\n B)  budeš se hájit, že to bylo  v zájmu vědy a pro její dobro" +
                "\n\n C)  omluvíš se a že už se to opakovat nebude");
        story.put("rozhovor se Starostou A", "„No dobrá vypadáte vyřízeně a že z toho žádnou velkou radost nemáte, navíc potřebujeme dobré doktory, co se nebojí experimentovat jako ty!” řekl starosta. Avšak rychle dodal: „ Ale řezání ruk si prosím vás do příště odpusťte! “" +
                "\n\n Co odpovíš?" +
                "\n\n A)  omluvíš se, že ti je to líto a řekneš , že už se to nebude opakovat" +
                "\n\n B)  zeptat se jestli ta stará paní přežila");
        story.put("rozhovor se Starostou B","rozhovor se Starostou  B) budeš se hájit, že to bylo  v zájmu vědy a pro její dobro\n" +
                "„Je mi líto , že to takhle dopadlo, ale bylo to pro její dobro. Mohla přežít a ještě jsme mohli mít možnost jako proti hnilobě aspoň trochu bojovat!” „Řezáním rukou ?! Nebuďte blázen, kdo by to dobrovolně chtěl? “ divil se pan starosta. Tiše jsi odsekl : „To nevím.” a hbitě jsi dodal : „ A proč jsem vlastně vězněný? Já jsem doktor ,já mám pomáhat lidem a né někde hnít ve vězení! “ Na to starosta : „ Kdyby jste mě nechal domluvit , tak víte , že vás hodlám pustit , proto jsem taky za vámi přišel.\n" +
                "\n\n Co odpovíš?" +
                "\n\n A) budeš si stát za tím, že ve vězení nemáš co dělat" +
                "\n\n B) omluvíš za svojí hrubost");
        story.put("rozhovor se starostou A_A", "Pan starosta klidným hlasem odpověděl: „No to doufám, ale nebojte teď vás pustíme zas tak něco hrozného se nestalo, mám pro tyhle věci  pochopení.” ");
        story.put("rozhovor se starostou A_B", "„Pane starosto,řekněte mi alespoň zdali ta kuchařova matka přežila?”" +
                "\n\n„Bohužel , hnilobu už měla docela rozšířenou a vy jste jí moc nepomohl!” výhružně pronesl." +
                "\n\n  Co odpovíš?" +
                "\n\n A) omluvíš se, že ti je to líto a řekneš , že už se to nebude opakovat" +
                "\n\n B) ");
        story.put("rozhovor se starostou B_A","„Tak to rád slyším, protože já už tady nebudu ani minutu!” naštvaně vykřikuješ. Pan starosta vědom si své moci  klidným hlasem odpoví: „Pane Brown , jestli se ihned nezačnete chovat slušně a spolupracovat , tak to bude mít pro vás nemilé a možná trvalé následky, mohl byste si totiž prodloužit už tak vám tolik nepříjemný pobyt zde v cele a to vy přece nechcete nebo se mýlím?”" +
                "\n\n Budeš spolupracovat s panem starostou?" +
                "\n\n A) Ano" +
                "\n\n B) Ne ");
        story.put("rozhovor se starostou B_B","„Promiňte pane starosto za mojí hrubost, ale jsem celý hladový a pořád zaskočený z této pro mě velice nepříjemné a neobvyklé situace.Budu opravdu moc rád když mě pustíte zpět na svobodu, slibuji , že už se mnou nebudou podobné problémy, pokusím se najít jiný způsob na léčbu hniloby.”\n" +
                ",,Ale prosím vás,kdybych zavřel všechny doktory co tu máme , tak dopadneme jako v North Portu , to je to severní přístavní městečko kde se hniloba poprvé objevila,\" povídal starosta a trochu  se pousmíval, protože si myslel , že zde se pod jeho vedením nic takového nemůže stát.\n" +
                "‚‚ A co že se jim stalo ?” zeptáš se . \n" +
                "Starosta překvapeně odpoví: ‚‚ To bych čekal , že tak vzdělaný a informovaný muž jako vy to bude všechno znát i pozpátku.” Avšak rychle dodal: ‚‚Omluvte mé dětinské posmívání,” a hned začal vyprávět. ‚‚To zhruba před půl rokem" +
                "");
        story.put("rozhovor se starostou A,B_A", "„To je mi líto , omlouvám se co jsem spáchal.Už se to nebude opakovat,” " +
                "\n\nPan starosta klidným hlasem odpověděl: „No to doufám, ale nebojte teď vás pustíme zas tak něco hrozného se nestalo, mám pro tyhle věci  pochopení.” ");
        story.put("rozhovor se starostou B,A_A","„Promiňte pane starosto za mojí hrubost, ale jsem celý hladový a pořád zaskočený z této pro mě velice nepříjemné a neobvyklé situace.Budu opravdu moc rád když mě pustíte zpět na svobodu, slibuji , že už se mnou nebudou podobné problémy, pokusím se najít jiný způsob na léčbu hniloby.");
        story.put("rozhovor se starostou B,A_B","„Pane starosto, mám takový pocit , že mě vydíráte a zneužíváte své moci a postavení.Jak by se asi lidem líbilo, kdyby zjistili , že jeden z mála doktorů ve městě je zavřen a držen ve vězení? “\n" +
                "„Nu dobrá, takže jste si vybral, špatně mimochodem,” odpověděl starosta a vytahoval velký svazek klíčů." +
                "\n\n Pokusíš se o útěk?" +
                "\n\n A) Ano" +
                "\n\n B) Ne ");
        story.put("rozhovor se starostou B,A,B_A","Vší silou jsi strčil do starosty,ten se svalil jako pytel brambor do rohu cely a otevřenými dveřmi jsi vyběhl do jakési chodby.V tom jse z cely ,ze které jsi bleskovým tempem vyletěl, ozve : „Stráže!” V tu chvíli dostaneš něčím po hlavě a omdlíš.\n" +
                "Když jsi se konečně probral , k tvému zděšení jsi zjistil, že si zpět v té stejné cele, jen už ji teď hlídá stráž, zeptáš se ho na jakou dobu tu budeš a dozvíš se , že na dlouhých 20 let.");
        story.put("rozhovor se starostou B,A,B_B","Starosta odešel z cely, zamkl za sebou a prohlásil : „ Třeba s vámi za 10 let bude větší domluva…”");
    }


}

