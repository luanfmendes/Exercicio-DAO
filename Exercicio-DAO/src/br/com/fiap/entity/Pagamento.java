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
@Table(name="T_PAGAMENTO")
@SequenceGenerator(name="pagamento", sequenceName="SQ_T_PAGAMENTO", allocationSize=1)
public class Pagamento {
	
	@Id
	@Column(name="cd_pagamento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pagamento")
	private int codigo;
	
	@Column(name="dt_pagamento", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dt_pagamento;
	
	@Column(name="vl_pagamento", nullable=false)
	private float vl_pagamento;
	
	@Column(name="ds_forma_pagamento", nullable=false)
	private FormaPagamento ds_forma_pagamento;

	
	
	public Pagamento() {
		super();
	}

	public Pagamento(Calendar dt_pagamento, float vl_pagamento, FormaPagamento ds_forma_pagamento) {
		super();
		this.dt_pagamento = dt_pagamento;
		this.vl_pagamento = vl_pagamento;
		this.ds_forma_pagamento = ds_forma_pagamento;
	}

	public Pagamento(int codigo, Calendar dt_pagamento, float vl_pagamento, FormaPagamento ds_forma_pagamento) {
		super();
		this.codigo = codigo;
		this.dt_pagamento = dt_pagamento;
		this.vl_pagamento = vl_pagamento;
		this.ds_forma_pagamento = ds_forma_pagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDt_pagamento() {
		return dt_pagamento;
	}

	public void setDt_pagamento(Calendar dt_pagamento) {
		this.dt_pagamento = dt_pagamento;
	}

	public float getVl_pagamento() {
		return vl_pagamento;
	}

	public void setVl_pagamento(float vl_pagamento) {
		this.vl_pagamento = vl_pagamento;
	}

	public FormaPagamento getDs_forma_pagamento() {
		return ds_forma_pagamento;
	}

	public void setDs_forma_pagamento(FormaPagamento ds_forma_pagamento) {
		this.ds_forma_pagamento = ds_forma_pagamento;
	}
	
	
	
}
