package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CORRIDA")
@SequenceGenerator(name="corrida", sequenceName="SQ_T_CORRIDA", allocationSize=1)
public class Corrida {

	@Id
	@Column(name="cd_corrida")
	private int codigo;
	
	@Column(name="ds_origem", length=150)
	private String ds_origem;
	
	@Column(name="ds_destino", length=150)
	private String ds_destino;
	
	@Column(name="dt_corrida")
	@Temporal(TemporalType.DATE)
	private Calendar dt_corrida;
	
	@Column(name="vl_corrida", nullable=false)
	private float vl_corrida;
	
	

	public Corrida() {
		super();
	}

	public Corrida(String ds_origem, String ds_destino, Calendar dt_corrida, float vl_corrida) {
		super();
		this.ds_origem = ds_origem;
		this.ds_destino = ds_destino;
		this.dt_corrida = dt_corrida;
		this.vl_corrida = vl_corrida;
	}

	public Corrida(int codigo, String ds_origem, String ds_destino, Calendar dt_corrida, float vl_corrida) {
		super();
		this.codigo = codigo;
		this.ds_origem = ds_origem;
		this.ds_destino = ds_destino;
		this.dt_corrida = dt_corrida;
		this.vl_corrida = vl_corrida;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDs_origem() {
		return ds_origem;
	}

	public void setDs_origem(String ds_origem) {
		this.ds_origem = ds_origem;
	}

	public String getDs_destino() {
		return ds_destino;
	}

	public void setDs_destino(String ds_destino) {
		this.ds_destino = ds_destino;
	}

	public Calendar getDt_corrida() {
		return dt_corrida;
	}

	public void setDt_corrida(Calendar dt_corrida) {
		this.dt_corrida = dt_corrida;
	}

	public float getVl_corrida() {
		return vl_corrida;
	}

	public void setVl_corrida(float vl_corrida) {
		this.vl_corrida = vl_corrida;
	}
	
	
}
