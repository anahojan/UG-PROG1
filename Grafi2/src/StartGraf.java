
    public class StartGraf {

        /**
         * @param args
         */
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Graf gg = new Graf();
            gg.dodajVozel("Lucija");
            gg.dodajVozel("Piran");
            gg.dodajVozel("Izola");
            gg.dodajVozel("Koper");
            gg.dodajVozel("Dekani");
            gg.dodajPovezavo("Lucija", "Piran");
            gg.dodajPovezavo("Piran", "Izola");
            gg.izpisi();
            gg.dodajPovezavo("Izola", "Koper");
            gg.dodajPovezavo("Koper", "Dekani");
            gg.izpisi();
        }

    }



