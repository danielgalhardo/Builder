package padraoBuilder;
import java.util.Date;

public class ReservaBuilder
{
    private Reserva reserva;
    public ReservaBuilder()
    {
        reserva = new Reserva();
    }

    public Reserva build()
    {
        if (reserva.getNumeroReserva() == 0)
        {
            throw new IllegalArgumentException("Este número de reserva é inválido.");
        }
        if (reserva.getNome().equals(""))
        {
            throw new IllegalArgumentException("Nome inválido");
        }
        if(reserva.getNumeroReserva() == 0 )
        {
            throw new IllegalArgumentException("Número da reserva inválido.");
        }
        return reserva;
    }

    public ReservaBuilder setNumeroReserva(int numeroReserva)
    {
        reserva.setNumeroReserva(numeroReserva);
        return this;
    }

    public ReservaBuilder setMetodoPagamento(String formaDePagamento)
    {
        reserva.setMetodoPagamento(formaDePagamento);
        return this;
    }

    public ReservaBuilder setNome(String nome)
    {
        reserva.setNome(nome);
        return this;
    }

    public ReservaBuilder setDataNascimento(Date dataNascimento)
    {
        reserva.setDataNascimento(dataNascimento);
        return this;
    }


    public ReservaBuilder setCpf(String cpf)
    {
        reserva.setCpf(cpf);
        return this;
    }

    public ReservaBuilder setIdentidade(String rg)
    {
        reserva.setIdentidade(rg);
        return this;
    }

    public ReservaBuilder setRua(String endereçoRua)
    {
        reserva.setRua(endereçoRua);
        return this;
    }

    public ReservaBuilder setNumero(int numeroCasa)
    {
        reserva.setNumero(numeroCasa);
        return this;
    }

    public ReservaBuilder setBairro(String nomeBairro)
    {
        reserva.setBairro(nomeBairro);
        return this;
    }

    public ReservaBuilder setCidade(String nomeCidade)
    {
        reserva.setCidade(nomeCidade);
        return this;
    }

    public ReservaBuilder setEstado(String nomeEstado)
    {
        reserva.setEstado(nomeEstado);
        return this;
    }

    public ReservaBuilder setCep(String cep)
    {
        reserva.setCep(cep);
        return this;
    }

    public ReservaBuilder setEmail(String email)
    {
        reserva.setEmail(email);
        return this;
    }

    public ReservaBuilder setCelular(String celular)
    {
        reserva.setCelular(celular);
        return this;
    }

    public ReservaBuilder setQuartoHotel(String identificadorQuarto)
    {
        reserva.setQuartoHotel(identificadorQuarto);
        return this;
    }

}
