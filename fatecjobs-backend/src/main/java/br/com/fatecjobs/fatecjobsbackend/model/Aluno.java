package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.*;
import org.apache.tomcat.util.buf.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

	public String getTipoUsuario() {
		if (usuario != null && usuario.getTipoUsuario() != null) {
			return usuario.getTipoUsuario().getDescricao();
		}
		return null;
	}

	public String getNome() {
		return usuario != null ? usuario.getNome() : null;
	}

	public String getEmail() {
		return usuario != null ? usuario.getEmail() : null;
	}

	public String getNomeCidade() {
		if (usuario != null && usuario.getCidade() != null) {
			return usuario.getCidade().getNome();
		}
		return null;
	}
}
