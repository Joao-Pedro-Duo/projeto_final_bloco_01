package petshop.model;

public class Racao extends Produto {
	
	private String sabor;
	private float peso;
	private String faixaEtaria;
	private String porte;

	public Racao(int id, String nome, float preco, int estoque, String marca, int tipo, 
			String sabor, float peso, String faixaEtaria, String porte) {
		super(id, nome, preco, estoque, marca, tipo);
		
		this.sabor = sabor;
		this.peso = peso;
		this.faixaEtaria = faixaEtaria;
		this.porte = porte;
		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Sabor: %s%n", this.sabor);
		System.out.printf("Peso: %.2f%n", this.peso);
		System.out.printf("Faixa Etária: %s%n", this.faixaEtaria);
		System.out.printf("Porte: %s%n", this.porte);
		
	}

}
