import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> lstNumbersBoris = new ArrayList<>();
        ArrayList<Integer> lstNumbersMaxim = new ArrayList<>();
        ArrayList<Integer> lstNumbersAnna = new ArrayList<>();
        lstNumbersAnna.add(123);
        lstNumbersAnna.add(213);
        lstNumbersMaxim.add(131);
        lstNumbersMaxim.add(121);
        lstNumbersBoris.add(321);
        lstNumbersBoris.add(453);
        lstNumbersBoris.add(789);

        Map<String, ArrayList<Integer>> contacts = new HashMap<>();
        contacts.put("Anna", lstNumbersAnna);
        contacts.put("Maxim", lstNumbersMaxim);
        contacts.put("Boris", lstNumbersBoris);
        System.out.println(contacts);

    }
}