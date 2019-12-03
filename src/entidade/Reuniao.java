package entidade;

import java.util.List;

public class Reuniao extends CompromissoGeral {
	private Calendario dataHoraFim;
	private Endereco local;
	List<Contato> participantes;
	private Contato coordenador;
	
	public Calendario getDataHoraFim() {
		return dataHoraFim;
	}
	
	public void setDataHoraFim(Calendario dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	
	public Endereco getLocal() {
		return local;
	}
	
	public void setLocal(Endereco local) {
		this.local = local;
	}
	
	public Contato[] getParticipantes() {
		return (Contato[])participantes.toArray();
	}
	
	public void setParticipantes(Contato participantes) {
		this.participantes.add(participantes);
	}
	
	public Contato getCoordenador() {
		return coordenador;
	}
	
	public void setCoordenador(Contato coordenador) {
		this.coordenador = coordenador;
	}
	
	
}
