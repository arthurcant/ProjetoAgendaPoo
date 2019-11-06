package agenda;

public abstract class CompromissoGeral {

	Calendario dataHoraInicio;
	String assunto;
	Calendario alame;
	private boolean alameAtivo;
	
	public abstract String prioridade();
	
}
