package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Indicacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String descricao;

	@Length(min = 0, max = 5)
	private Integer nivel = 3;

	@ManyToOne
	private Usuario aluno;

	@ManyToOne
	private Professor professor;

}
