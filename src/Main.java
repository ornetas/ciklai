public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        ////////////////// uzduotis nr 1 ////////////
        String name = "labas";
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }

        ////////////////// uzduotis nr 2 ////////////


        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }


        ////////////////// uzduotis nr 3 ////////////

        String[] plantNames = {"azuolas", "berzas", "liepa", "drebules", "ramune", "dobilas", "roze", "tulpe", "egle", "pusis"};

        ///////////////// uzduotis nr 4 /////////////

        for (int i = 0; i < plantNames.length; i++) {
            System.out.println(plantNames[i]);
        }

        ///////////////// uzduotis nr 5 /////////////

        System.out.println(plantNames.length);

        for (int i = plantNames.length - 1; i >= 0; i--) {
            System.out.println(plantNames[i]);

        }
        ///////////////// uzduotis nr 6 /////////////


        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }
        ///////////////// uzduotis nr 7 /////////////

        for (int i = 10; i <= 50; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        ///////////////// uzduotis nr 8 /////////////
        int lyginiai = 0;
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                lyginiai++;
            }
        }
        System.out.println(lyginiai);
        ///////////////// uzduotis nr 9 /////////////

        int count5 = 0;
        int count7 = 0;

        for (int i = 0; i < plantNames.length; i++) {
            if (plantNames[i].length() < 5) {
                count5++;
            }
            if (plantNames[i].length() > 7) {
                count7++;
            }
        }
        System.out.println("trumpesni nei 5 simbol -" + " " + count5 + " " + "ilgesni nei 7 simbol -" + " " + count7);

        ///////////////// uzduotis nr 10 /////////////

        int count6 = 0;

        for (int i = 0; i < plantNames.length; i++) {
            if ((plantNames[i].length() > 5) && (plantNames[i].length() < 10)) {
                count6++;
            }


        }
        System.out.println("tarp 5 ir 10 simboliu yra" + " " + count6 + " " + "zodziai");

        ///////////////// uzduotis nr 1 sunkesni/////////////

        int num1 = 0;
        for (int i = 0; i < 300; i++) {
            int num = (int) Math.round(Math.random() * 300);
            if (num > 150) {
                num1++;
            }

            if (num > 275) {
                System.out.print("[" + num + "] ");
            } else {
                System.out.print(num + " ");
            }

        }
        System.out.println("yra" + " " + num1 + "skaiciai didesni uz 150");

        ///////////////// uzduotis nr 2 sunkesni/////////////

        for (int i = 1; i <3000; i++) {
            if ( i % 77 == 0) {
                System.out.print(i + " " + ",");
            }
        }


//        String res = "";
//        for (int i = 77; i <= 3000 ; i+=77) {
//           res += i + ",";
//        }
//
//        System.out.println(res.substring(0,10));
//
//
//   String text = "labas ";
//        text += "rytas.";
//        System.out.println(text);

        ///////////////// uzduotis nr 3 sunkesni/////////////
        System.out.println();
        for (int i = 0; i < 10; i++) {

            for (int a = 0; a < 10; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        ///////////////// uzduotis nr 4 sunkesni/////////////

        ///////////////// uzduotis nr 5 sunkesni/////////////

        int skaicius = 0;
        int rez = (int)Math.round(Math.random());
       // System.out.println(rez);
        if (rez == skaicius){
            System.out.println("S");

        } else {

            System.out.println("H");

        }


    }
}