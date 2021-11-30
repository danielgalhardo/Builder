package padraoBuilder;

import java.util.Date;

public class Reserva {
    private int numeroReserva;
    private String metodoPagamento;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String identidade;
    private int numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String email;
    private String celular;
    private String quartoHotel;

    public Reserva() {
        this.numeroReserva = 0;
        this.nome = "";
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getRua() {return rua; }

    public void setRua(String nomeRua) {this.rua = nomeRua; }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numeroCasa) {
        this.numero = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado(){ return estado; }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getQuartoHotel() { return quartoHotel; }

    public void setQuartoHotel(String quartoHotel) {this.quartoHotel = quartoHotel;}

}