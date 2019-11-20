package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Conexao implements Notificavel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Usuario solicitadaPor;

    @ManyToOne
    private Usuario aceitadaPor;

    private LocalDateTime dataCriacao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conexao conexao = (Conexao) o;
        return  (Objects.equals(solicitadaPor, conexao.solicitadaPor) &&
                    Objects.equals(aceitadaPor, conexao.aceitadaPor) ) ||
                (Objects.equals(aceitadaPor, conexao.solicitadaPor) &&
                    Objects.equals(solicitadaPor, conexao.aceitadaPor));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, solicitadaPor, aceitadaPor, dataCriacao);
    }
}
