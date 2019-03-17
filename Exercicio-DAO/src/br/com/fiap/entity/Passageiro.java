package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PASSAGEIRO")
@SequenceGenerator(name="passageiro", sequenceName="SQ_T_PASSAGEIRO", allocationSize=1)
public class Passageiro {
	
	@Id
	@Column(name="cd_passageiro")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passageiro")
	private int codigo;
	
	@Column(name="nm_passageiro", nullable=false, length = 100)
	private String nm_passageiro;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;
	
	@Column(name="ds_genero")
	private Genero genero;

	
	
	public Passageiro() {
		super();
	}

	public Passageiro(String nm_passageiro, Calendar dt_nascimento, Genero genero) {
		super();
		this.nm_passageiro = nm_passageiro;
		this.dt_nascimento = dt_nascimento;
		this.genero = genero;
	}

	public Passageiro(int codigo, String nm_passageiro, Calendar dt_nascimento, Genero genero) {
		super();
		this.codigo = codigo;
		this.nm_passageiro = nm_passageiro;
		this.dt_nascimento = dt_nascimento;
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNm_passageiro() {
		return nm_passageiro;
	}

	public void setNm_passageiro(String nm_passageiro) {
		this.nm_passageiro = nm_passageiro;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	

}
