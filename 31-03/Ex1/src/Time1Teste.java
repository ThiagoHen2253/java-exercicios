public class Time1Teste {
     public static void main(String[] args) throws Exception {
       Time1 time = new Time1();
       System.out.print("Valor Universal inicial de time: ");
       System.out.println(time.toUniversalString());
       System.out.print("Valor default inicial de time: ");
       System.out.println(time.toString() + "\n");

       time.setTime(13, 27, 6);
       System.out.print("Valor universal depois do setTime: ");
       System.out.println(time.toUniversalString());
       System.out.print("Valor default depois de setTime: ");
       System.out.println(time.toString() + "\n");
    }
}
    
