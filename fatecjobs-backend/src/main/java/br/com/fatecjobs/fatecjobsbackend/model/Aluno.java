package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno", orphanRemoval = true)
	private List<Competencia> competencias;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno", orphanRemoval = true)
	private List<Indicacao> indicacao;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aluno", orphanRemoval = true)
	private List<FaculdadeAluno> listaFaculdades;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aluno", orphanRemoval = true)
	private List<AlunoVaga> vagas;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aluno", orphanRemoval = true)
	private List<Teste> testesRealizados;

	@ManyToOne
	private Usuario usuario;

}
