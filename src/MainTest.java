
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MainTest {

    @Test
    public void SomenteMulheres(){
        boolean teste = Pessoas.somenteMulheres(Main.pessoasDoSexoFeminino);
        Assertions.assertTrue(teste);
    }
}
