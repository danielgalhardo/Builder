package padraoBuilder;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ReservaBuilderTest
{
    @Test
    void retornaSucesso()
    {
        ReservaBuilder reservaBuilder = new ReservaBuilder();
        Reserva reserva = reservaBuilder
                .setNumeroReserva(123)
                .setNome("João Silva")
                .setEmail("joaodasilva@aol.com")
                .setQuartoHotel("31A")
                .build();

        assertNotNull(reserva);
    }

    @Test
    void retornaExcecaoSemNumeroReserva()
    {
        try
        {
            ReservaBuilder reservaBuilder = new ReservaBuilder();
            Reserva reserva = reservaBuilder
                    .setNome("Daniel Castro Neto Galhardo")
                    .setCidade("Além Paraíba")
                    .build();
            fail();
        }
        catch (IllegalArgumentException ex)
        {
            assertEquals("Numero de reserva invalido.", ex.getMessage());
        }
    }

    @Test
    void retornaExcecaoReservaSemNome()
    {
        try
        {
            ReservaBuilder reservaBuilder = new ReservaBuilder();
            Reserva reserva = reservaBuilder
                    .setNumeroReserva(2849)
                    .setCep("36660000")
                    .build();
            fail();
        }
        catch (IllegalArgumentException ex)
        {
            assertEquals("É necessário preencher o nome para realizar a reserva.", ex.getMessage());
        }
    }


}
