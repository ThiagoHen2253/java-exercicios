public class Time2 {
    private int hora;
    private int minutos;
    private int segundos;


    public void setHora(int h){
        this.hora = ((h >= 0 && h < 24) ? h : 0);
    }
    public void setMinutos(int m){
        this.minutos =  ((m>= 0 && m < 60) ? m : 0);
    }
    public void setSegundos(int s){
        this.segundos = ((s >= 0 && s < 60) ? s : 0);
    }
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }

}

