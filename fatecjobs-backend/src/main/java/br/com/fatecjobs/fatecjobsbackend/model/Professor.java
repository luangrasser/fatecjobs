package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "professor", orphanRemoval = true)
	private List<Indicacao> indicacoesRealizadas;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "professor", orphanRemoval = true)
	private List<FaculdadeProfessor> listaFaculdades;

	@ManyToOne
	private Usuario usuario;

}
