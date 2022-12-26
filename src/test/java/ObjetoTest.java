import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjetoTest {

    Objeto objeto;

    @BeforeEach
    void setUp(){
        objeto = new Objeto();
    }

    @Test
    void deveArmazenarEstados(){
        objeto.setEstado(ObjetoEstadoAguardandoPostagem.getInstance());
        objeto.setEstado(ObjetoEstadoPostado.getInstance());
        objeto.setEstado(ObjetoEstadoEmTransito.getInstance());

        assertEquals(3, objeto.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial(){
        objeto.setEstado(ObjetoEstadoAguardandoPostagem.getInstance());
        objeto.setEstado(ObjetoEstadoPostado.getInstance());
        objeto.setEstado(ObjetoEstadoEmTransito.getInstance());

        objeto.restauraEstado(0);
        assertEquals(1, objeto.getEstados().size());
        assertEquals(ObjetoEstadoAguardandoPostagem.getInstance(), objeto.getEstado());
    }

    @Test
    void deveRestaurarEstadoAnterior(){
        objeto.setEstado(ObjetoEstadoAguardandoPostagem.getInstance());
        objeto.setEstado(ObjetoEstadoPostado.getInstance());
        objeto.setEstado(ObjetoEstadoEmTransito.getInstance());
        objeto.setEstado(ObjetoEstadoEmRotaDeEntrega.getInstance());

        objeto.restauraEstado(2);
        assertEquals(3, objeto.getEstados().size());
        assertEquals(ObjetoEstadoEmTransito.getInstance(), objeto.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido(){
        try{
            objeto.restauraEstado(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}