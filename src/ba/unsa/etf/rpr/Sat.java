package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) {
        postavi(sati,minute,sekunde);
    }
    public void postavi(int sati, int minute, int sekunde) {
        this.sati=sati;
        this.minute=minute;
        this.sekunde=sekunde;
    }
    public void sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde = 0; minute = minute + 1; }
        if (minute==60) { minute = 0; sati = sati + 1; }
    }
    public void prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute = minute -1; }
        if (minute==-1) { minute = 59; sati = sati -1; }
    }
    public void pomjeriZa(int pomak) {
        if (pomak>0) {
            for (int i = 0; i<pomak; i=i+1) {
                this.sljedeci();
            }
        } else if (pomak<0) {
            pomak = pomak * (-1);
            for (int i = 0; i<pomak; i=i+1) {
                this.prethodni();
            }
        }
    }

    public int getSati() {
        return sati;
    }

    public int getMinute() {
        return minute;
    }

    public int getSekunde() {
        return sekunde;
    }
    public void ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }
}
