package kovteba.myarraylist;


import java.util.Iterator;

public class App {
   public static void main(String[] args) {

      Array array = new ArrayImpl();

      Iterator<Object> it = array.iterator();

      array.add("A");
      array.add("B");
      array.add("C");

      for (Object el : array){
         System.out.println(el);
      }
      System.out.println("----------------------------");

      System.out.println(it.next());
      it.remove();
      it.remove();
      System.out.println(it.next());
      it.remove();
      System.out.println(it.next());
      it.remove();
      System.out.println(array);

   }
}
