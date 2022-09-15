public class Povezava {

        private Vozel u, v;
        public Povezava(Vozel uu, Vozel vv){
            u = uu;
            v = vv;
        }
        public Vozel zacetek(){
            return(u);
        }
        public Vozel konec(){
            return(v);
        }


}
