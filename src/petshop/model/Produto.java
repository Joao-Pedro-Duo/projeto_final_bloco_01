package petshop.model;

public abstract class Produto {
	
	private int id;
	private String nome;
	private float preco;
	private int estoque;
	private String marca;
	private int tipo;
	

	public Produto(int id, String nome, float preco, int estoque, String marca, int tipo) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.marca = marca;
		this.tipo = tipo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public void visualizar() {
		
		String tipo = " ";
		
		switch(this.tipo) {
			case 1 -> tipo = "Brinquedo";
			case 2 -> tipo = "Ração";
			case 3 -> tipo = "PetCare";
			default -> tipo = "Inválido";
		}
		
		System.out.println("**********************************************");
		System.out.println("              DADOS DO PRODUTO                ");
		System.out.println("**********************************************");
		System.out.printf("Id do produto: %d%n", this.id);
		System.out.printf("Nome do produto: %s%n", this.nome);
		System.out.printf("Preço do produto: R$ %.2f%n", this.preco);
		System.out.printf("Quantidade em Estoque: %d%n", this.estoque);
		System.out.printf("Marca do produto: %s%n", this.marca);
		System.out.printf("Tipo do produto: %s%n", tipo);
	}
		
		
}
	
	
	
