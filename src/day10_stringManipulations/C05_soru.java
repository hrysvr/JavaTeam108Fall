package day10_stringManipulations;

import java.util.Locale;

public class C05_soru {

    public static void main(String[] args) {

        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String  str = "Evden calisiyorum, gitmeye gerek yok";

        String calisilacakStr = str.toLowerCase();

        if (calisilacakStr.contains("ev")&& calisilacakStr.contains(" is")){
            System.out.println("hem ev lazim hem is");
        } else if (calisilacakStr.contains(" is")) {
            System.out.println("calismak guzeldir");
        } else if (calisilacakStr.contains("ev")) {
            System.out.println("home home sweet home");
        }else {
            System.out.println("cok calisman lazim");
        }

    }
}
