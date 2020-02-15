import java.time.LocalDate;
import java.time.Period;

public class U2
{
    public static void main(String[] args) {
        LocalDate joshuaTree = LocalDate.of(1987, 3, 9);
        LocalDate rattle = LocalDate.of(1988, 10, 10);
        LocalDate now = LocalDate.now();
        Period d1 = Period.between(now, joshuaTree);
        Period d2 = Period.between(rattle, joshuaTree);

        System.out.println(d1);
        System.out.println(d2);
    }
}
