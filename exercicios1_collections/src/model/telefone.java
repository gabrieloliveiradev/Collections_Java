package model;

public class telefone {
	private int tipoTelefone;
	private String numeroTelefone;
	public telefone (String numeroTelefone,int tipoTelefone ) {
		this.numeroTelefone = numeroTelefone;
		this.tipoTelefone = tipoTelefone;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public int getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(int tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
}
