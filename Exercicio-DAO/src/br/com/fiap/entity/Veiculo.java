package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(name="veiculo", sequenceName="SQ_T_VEICULO", allocationSize=1)
public class Veiculo {
	
	@Id
	@Column(name="cd_codigo")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "veiculo")
	private int codigo;
	
	@Column(name="ds_placa", length=9, nullable=false)
	private String 	ds_placa;
	
	@Column(name="ds_cor", length=20, nullable=false)
	private String ds_cor;
	
	@Column(name="nr_ano")
	private int nr_ano;
	
	

	public Veiculo() {
		super();
	}

	public Veiculo(String ds_placa, String ds_cor, int nr_ano) {
		super();
		this.ds_placa = ds_placa;
		this.ds_cor = ds_cor;
		this.nr_ano = nr_ano;
	}

	public Veiculo(int codigo, String ds_placa, String ds_cor, int nr_ano) {
		super();
		this.codigo = codigo;
		this.ds_placa = ds_placa;
		this.ds_cor = ds_cor;
		this.nr_ano = nr_ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDs_placa() {
		return ds_placa;
	}

	public void setDs_placa(String ds_placa) {
		this.ds_placa = ds_placa;
	}

	public String getDs_cor() {
		return ds_cor;
	}

	public void setDs_cor(String ds_cor) {
		this.ds_cor = ds_cor;
	}

	public int getNr_ano() {
		return nr_ano;
	}

	public void setNr_ano(int nr_ano) {
		this.nr_ano = nr_ano;
	}
	
	

}
