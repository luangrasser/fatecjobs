package br.com.fatecjobs.fatecjobsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class TipoUsuario implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	private String descricao;

	@Override
	public String getAuthority() {
		return descricao;
	}
}
