package br.com.fatecjobs.fatecjobsbackend.model;

import java.time.LocalDateTime;

public class Notificacao {

	private Usuario usuarioAtor;

	private Usuario usuarioNotificado;

	private LocalDateTime dataNotificacao;

	private String descricao;

	private Notificavel notificavel;

}
