package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Notificacao implements Notificavel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Usuario usuarioAtor;

	@ManyToOne
	private Usuario usuarioNotificado;

	private LocalDateTime dataNotificacao;

	@NotBlank
	private String descricao;

}
