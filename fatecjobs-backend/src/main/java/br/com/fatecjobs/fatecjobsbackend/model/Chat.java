package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Chat implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Usuario iniciadoPor;

	@ManyToOne
	private Usuario aceitoPor;

	private LocalDateTime dataCriacao;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "chat", orphanRemoval = true)
	private List<Mensagem> mensagens;

}
