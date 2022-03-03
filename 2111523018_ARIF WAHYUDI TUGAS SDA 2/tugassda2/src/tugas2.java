import java.util.LinkedList;
public class tugas2 {
    
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
        
        //karakter nama "ARIF WAHYUDI"
        saya.add("A");
        saya.add("R");
        saya.add("I");
        saya.add("F");
        saya.add("");
        saya.add("W");
        saya.add("A");
        saya.add("H");
        saya.add("Y");
        saya.add("U");
        saya.add("D");
        saya.add("I");

        System.out.println("list sebelum ditambhakan karakter: "  + saya);
        //fungsi menambahkan karakter
        saya.set(1,"F");
        saya.set(9,"R");
        saya.set(5,"E");
        saya.set(0,"A");
        saya.set(10,"k");

        System.out.println("list setelah ditambahkan karakter: "  + saya);
        //fungsi remove
        saya.remove(5);
        saya.remove(2);
        saya.remove(8);
        saya.remove(4);
        saya.remove(9);
        saya.remove(3);
        saya.remove(1);
        saya.remove(6);

        System.out.println("list setelah di remove: " + saya);
        //fungsi push 
        saya.push("GANTENG");
        saya.push("RAJIN");
        saya.push("MENABUNG");

        System.out.println("setalah elemen ditambahkan" + saya);
        //Fungsi POP
        System.out.println(saya.pop());
        System.out.println(saya.pop());
  

    }
}
