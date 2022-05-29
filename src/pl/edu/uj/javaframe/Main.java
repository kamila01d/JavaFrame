package pl.edu.uj.javaframe;

import java.io.IOException;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        ImaginaryInt imInt = new ImaginaryInt();
        ImaginaryInt imIntNew = (ImaginaryInt) imInt.create("12i4").add(new Int().create("10"));
        System.out.println(imIntNew.toString());

        Int _int = new Int();
        Int _int2 = (Int) _int.create("10").add(new ImaginaryInt().create("12i4"));
        System.out.println(_int2.toString());

        ImaginaryInt imInt2 = new ImaginaryInt();
        ImaginaryInt imInt2New = (ImaginaryInt) imInt2.create("12i4").add(new ImaginaryInt().create("10i10"));
        System.out.println(imInt2New.toString());

        DataFrame df = new DataFrame(new Class[] {MyDouble.class, MyDouble.class}, new String[] {"kol1","kol2"});

        df.addRow(new String[]{"12.45867","23.495794"});
        df.addRow(new String[]{"1244000.45867","23.45867"});
        df.addRow(new String[]{"1244000.45867","2553.45867"});
        df.addRow(new String[]{"12.45867","2300.45867"});
        df.print();

//      INSTRUKCJE DO ĆWICZEŃ I

//      Dopisz metodę print w klasie DataFrame wypisującą zawartość dataframe
//      df.print();

//      Dodaj klasę ImaginaryDouble oraz ImaginaryInt, które dziedziczą po odpowiednio klasach Int i Double . Powinne one być tworzone ze Stringów postaci "<CzęśćRzeczywissta>i<CzęśćUrojona>", np "12i3".

//      Nadpisz metody create i add w klasach ImaginaryDoubgle oraz ImaginaryInt. Pamiętaj, że do liczb urojonych możemy też dodawać inne typy (np. Int, Double).
//      Przetestuj wyniki operacji:
            //        ImaginaryInt.create("12i4").add(Int.create("10"))
            //        Int.create("10").add(ImaginaryInt.create("12i4")))
            //        ImaginaryInt.create("12i4").add(ImaginaryInt.create("10i10"))

//      Nadpisz metodę public String toString() w kasach ImaginaryDouble i ImaginaryInt, tak aby poprawnie wyświetlała liczby urojone do postaci Stringa



    }
}
