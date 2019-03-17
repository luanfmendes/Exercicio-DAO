package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MOTORISTA")

public class Motorista {
	
	@Id
	@Column(name="nr_carteira")
	private int nr_carteira;
	
	@Column(name="nm_motorista", nullable=false, length=150)
	private String nm_motorista;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;
	
	
	@Lob
	@Column(name="fl_carteira")
	private byte[] fl_carteira;
	
	@Column(name="ds_genero")
	private Genero ds_genero;

	
	public Motorista() {
		super();
	}

	public Motorista(String nm_motorista, Calendar dt_nascimento, byte[] fl_carteira, Genero ds_genero) {
		super();
		this.nm_motorista = nm_motorista;
		this.dt_nascimento = dt_nascimento;
		this.fl_carteira = fl_carteira;
		this.ds_genero = ds_genero;
	}

	public Motorista(int nr_carteira, String nm_motorista, Calendar dt_nascimento, byte[] fl_carteira,
			Genero ds_genero) {
		super();
		this.nr_carteira = nr_carteira;
		this.nm_motorista = nm_motorista;
		this.dt_nascimento = dt_nascimento;
		this.fl_carteira = fl_carteira;
		this.ds_genero = ds_genero;
	}

	public int getNr_carteira() {
		return nr_carteira;
	}

	public void setNr_carteira(int nr_carteira) {
		this.nr_carteira = nr_carteira;
	}

	public String getNm_motorista() {
		return nm_motorista;
	}

	public void setNm_motorista(String nm_motorista) {
		this.nm_motorista = nm_motorista;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public byte[] getFl_carteira() {
		return fl_carteira;
	}

	public void setFl_carteira(byte[] fl_carteira) {
		this.fl_carteira = fl_carteira;
	}

	public Genero getDs_genero() {
		return ds_genero;
	}

	public void setDs_genero(Genero ds_genero) {
		this.ds_genero = ds_genero;
	}
	
	
	

}
