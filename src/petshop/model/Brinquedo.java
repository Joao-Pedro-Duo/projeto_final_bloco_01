package petshop.model;

public class Brinquedo extends Produto {
	
	private String material;
	private String tipoAnimal;
	private String faixaEtaria;
	private String interativo;

	
	public Brinquedo(int id, String nome, float preco, int estoque, String marca, int tipo, String material,
			String tipoAnimal, String faixaEtaria, String interativo) {
		super(id, nome, preco, estoque, marca, tipo);
		
		this.material = material;
		this.tipoAnimal = tipoAnimal;
		this.faixaEtaria = faixaEtaria;
		this.interativo = interativo;
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getInterativo() {
		return interativo;
	}

	public void setInterativo(String interativo) {
		this.interativo = interativo;
	}

	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Material: %s%n", this.material);
		System.out.printf("Tipo Animal: %s%n", this.tipoAnimal);
		System.out.printf("Faixa Etária: %s%n", this.faixaEtaria);
		System.out.printf("Interativo: %s%n", this.interativo);
		
	}

}
