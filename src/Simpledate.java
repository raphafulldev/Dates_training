import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Simpledate {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Date y1 = sdf1.parse("25/06/2018");
        System.out.println(y1);
    }
}
