package entidade;

import enums.TipoPrioridade;

public abstract class CompromissoGeral {
	private Calendario dataHoraInicio;
	private Calendario alarme;
	private String assunto;
	private boolean alarmeAtivo;
	TipoPrioridade prioridade;
	int id;




	public String getDataHoraInicio() {
		return dataHoraInicio.getDataHora();
	}
	public void setDataHoraInicio(Calendario dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public Calendario getAlarme() {
		return alarme;
	}
	public void setAlarme(Calendario alarme) {
		this.alarme = alarme;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public Boolean getAlarmeAtivo() {
		return alarmeAtivo;
	}
	public void setAlarmeAtivo(Boolean alarmeAtivo) {
		this.alarmeAtivo = alarmeAtivo;
	}
	public TipoPrioridade getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(TipoPrioridade prioridade) {
		this.prioridade = prioridade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public CompromissoGeral(Calendario dataHoraInicio, Calendario alarme, String assunto, Boolean alarmeAtivo, TipoPrioridade prioridade, int id) {
		setDataHoraInicio(dataHoraInicio);
		setAlarme(alarme);
		setAssunto(assunto);
		setAlarmeAtivo(alarmeAtivo);
		setPrioridade(prioridade);
		setId(id);
	}

	public CompromissoGeral() {
		this.dataHoraInicio = new Calendario();
		this.alarme = null;
		this.assunto = "";
		this.alarmeAtivo = false;
		this.prioridade = TipoPrioridade.MEDIA;
		this.id = 0;
	}
}
