package br.com.designpaterns.orcamento.situacao;

public class DomainException extends RuntimeException{
    public DomainException(String msg) {
        super(msg);
    }
}
