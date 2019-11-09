package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
public class FaculdadeProfessor  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "bit(1) default 1", nullable = false)
	private boolean trabalhando;

	@ManyToOne
	private Faculdade faculdade;

	@ManyToOne
	private Professor professor;

}
