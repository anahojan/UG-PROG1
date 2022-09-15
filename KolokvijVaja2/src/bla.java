public class bla {
    public static void main(String[] args) {
        int polje[] = {3, 6, 98};

        int min = polje[0];

        for (int i = 0; i < polje.length ; i++) {
            if (polje[i] < min ){
                min = min + polje[i];
            }
        }
        System.out.println(min);

    }
}
