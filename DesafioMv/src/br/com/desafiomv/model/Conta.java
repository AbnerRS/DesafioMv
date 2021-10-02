package br.com.desafiomv.model;

public class Conta {

	private String data;
	private int movimentacaoCredito;
	private int movimentacaoDebito;
	private int totalMovimentacoes;
	private double valorMovimentacoes;
	private double saldoInicial;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getMovimentacaoCredito() {
		return movimentacaoCredito;
	}
	public void setMovimentacaoCredito(int movimentacaoCredito) {
		this.movimentacaoCredito = movimentacaoCredito;
	}
	public int getMovimentacaoDebito() {
		return movimentacaoDebito;
	}
	public void setMovimentacaoDebito(int movimentacaoDebito) {
		this.movimentacaoDebito = movimentacaoDebito;
	}
	public int getTotalMovimentacoes() {
		return totalMovimentacoes;
	}
	public void setTotalMovimentacoes(int totalMovimentacoes) {
		this.totalMovimentacoes = totalMovimentacoes;
	}
	public double getValorMovimentacoes() {
		return valorMovimentacoes;
	}
	public void setValorMovimentacoes(double valorMovimentacoes) {
		this.valorMovimentacoes = valorMovimentacoes;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public double getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	private double saldoAtual;
	
}
