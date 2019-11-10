package br.com.fatecjobs.fatecjobsbackend.model;

public interface DataExchangeUsuario<T>  {

    String getNome();
    String getEmail();
    String getSenha();
    String getCidade();
    String getTipoUsuario();
    T convert();
}
