package com.imc.crm.model;

import java.text.DecimalFormat;

public class imc {
	
	private float altura;
	private float peso;
	private float imccalc;
	private String retorno;
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getImccalc() {
		return imccalc;
	}
	public void setImccalc(float imccalc) {
		this.imccalc = imccalc;
	}
	public String getRetorno() {
		return retorno;
	}
	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}
	
	public imc (float peso, float altura) {
		setPeso(peso);
		setAltura(altura);
	}
	public void imccalc() {
		this.imccalc = this.getPeso()/(this.getAltura()*this.getAltura());
 	}
	
	public String retornar() {
		imccalc();
		DecimalFormat df = new DecimalFormat("#.##");
		if(imccalc <= 17 & imccalc <=18.4){
			setRetorno("imc: "+df.format(imccalc)+" classificação: abaixo do peso "+"risco: elevado");
		}
		else if(imccalc <= 18.5 & imccalc <=24.9){
			setRetorno("imc: "+df.format(imccalc)+" classificação: peso ideal "+"risco: inexistente");
		}
		else if(imccalc <= 25 & imccalc <=29.9){
			setRetorno("imc: "+df.format(imccalc)+" classificação: acima do peso "+"risco: elevado");
		}
		else if(imccalc <= 30 & imccalc <=34.9){
			setRetorno("imc: "+df.format(imccalc)+" classificação: obesidade 1 "+"risco: muito elevado");
		}
		else if(imccalc <= 35 & imccalc <=40){
			setRetorno("imc: "+df.format(imccalc)+" classificação: obesidade 2 "+"risco: muitissimo elevado");
		}
		else {
			setRetorno("imc: "+df.format(imccalc)+" classificação: obesidade 3 "+"risco: obesidade morbida");
		}
		return retorno;
	}
	
}
