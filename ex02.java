import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex02 {

    // Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать
    // программу, которая найдет и
    // выведет повторяющиеся имена с количеством повторений. Отсортировать по
    // убыванию популярности.

    public static void main(String[] args) {
        List<String> lstPerson = new ArrayList<>();
        lstPerson.add("Иван");
        lstPerson.add("Петр");
        lstPerson.add("Антон");
        lstPerson.add("Петр");
        lstPerson.add("Иван");
        lstPerson.add("Петр");
        lstPerson.add("Иван");
        lstPerson.add("Петр");
        lstPerson.add("Егор");
        lstPerson.add("");
        System.out.println(lstPerson);
        Collections.sort(lstPerson, Collections.reverseOrder());
    System.out.println(lstPerson);
    cutnameluze(lstPerson);
             
    }
    private static void cutnameluze(List<String> name){
        int count = 1;
        for(int i = 0; i < name.size()-1; i++){
            if(name.get(i).equals(name.get(i + 1)))count++;
            else{
                System.out.println(name.get(i) + " повторяется:" + count);
                count = 1;
            }
        }

    }
}
