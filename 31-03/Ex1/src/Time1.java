public class Time1 {
    private int hora; //0 - 23
    private int minutos; //0 - 59
    private int segundos; //0 - 59

    public void setTime(int h, int m, int s){
        hora = ((h >= 0 && h < 24) ? h : 0);
        minutos = ((m>= 0 && m < 60) ? m : 0);
        segundos = ((s >= 0 && s < 60) ? s : 0);
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",
        ((hora == 0 || hora == 12) ? 12 : hora % 12),
         minutos, segundos, (hora < 12 ? "AM":"PM"));
    }
}
