import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Test {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean expected = true;
        assertEquals("Пользователь младше 18 лет", expected, isAdult);
    }
}
