package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
public class FaculdadeAluno implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "bit(1) default 1", nullable = false)
	private boolean concluida;

	@NotBlank
	private String curso;

	private LocalDate dataConclusao;

	@ManyToOne
	private Aluno aluno;

	@ManyToOne
	private Faculdade faculdade;

}
