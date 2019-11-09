package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Vaga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime dataCriacao;

	@NotBlank
	private String titulo;

	@NotBlank
	private String descricao;

	@OneToMany
	private Set<Competencia> competenciasExigidas;

	private String nivelExperiencia;

	private String setor;

	private String tipoEmprego;

	private String funcoesTrabalho;

	@Column(columnDefinition = "bit(1) default 1", nullable = false)
	private boolean ativo = true;

	@ManyToOne
	private Empresa empresa;

	@ManyToMany
	private List<Aluno> candidatos;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "vaga", orphanRemoval = true)
	private List<Teste> testeAplicados;

}
