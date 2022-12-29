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

        String[] plantNames = {"azuolas", "berzas", "liepa", "drebule", "ramune", "dobilas", "roze", "tulpe", "egle", "pusis"};

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
            if ( i % 10 ==0){
                continue;}
                if ( i % 2 == 0){
                    System.out.println(i);
                }
            }













    }
}