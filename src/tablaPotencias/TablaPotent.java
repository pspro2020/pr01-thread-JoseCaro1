package tablaPotencias;

public class TablaPotent extends Thread {

    private int num;

    TablaPotent(int num){
        this.num=num;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Thread %d - %d elevado a %d es igual %.0f",num, num, i, Math.pow(num,i)));
        }
    }
}
