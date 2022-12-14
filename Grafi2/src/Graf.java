
import java.util.Vector;
import java.util.HashMap;

    public class Graf {
        private HashMap vozli = new HashMap();
        private Vector povezave = new Vector();

        public boolean dodajVozel(String i){
            if(vozli.get(i) == null){
                vozli.put(i, new Vozel(i));
                return(true);
            }
            else
                return(false);
        }

        public boolean dodajPovezavo(String u, String v){
            Vozel tmp1, tmp2;
            tmp1 = (Vozel)vozli.get(u);
            tmp2 = (Vozel)vozli.get(v);
            if((tmp1 != null) && (tmp2 != null)){
                povezave.addElement(new Povezava(tmp1, tmp2));
                return(true);
            }
            else
                return(false);
        }
        public void izpisi(){
            Vozel tmp1, tmp2;
            Povezava pTmp;
            for(int i = 0; i < povezave.size(); i++ ){
                pTmp = (Povezava)povezave.elementAt(i);
                tmp1 = pTmp.zacetek();
                tmp2 = pTmp.konec();
                System.out.println(tmp1.ime + "--" + tmp2.ime);
            }
        }
    }
