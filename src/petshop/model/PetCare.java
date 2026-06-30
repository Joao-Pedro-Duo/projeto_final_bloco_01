package petshop.model;

public class PetCare extends Produto {
	
	private String categoria;
	private String fragrancia;
	private int volume; 
	private String tipoPelagem;
	
	public PetCare(int id, String nome, float preco, int estoque, String marca, int tipo, 
			String categoria, String fragrancia, int volume, String tipoPelagem) {
		super(id, nome, preco, estoque, marca, tipo);
		
		this.categoria = categoria;
		this.fragrancia = fragrancia;
		this.volume = volume;
		this.tipoPelagem = tipoPelagem;
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getTipoPelagem() {
		return tipoPelagem;
	}

	public void setTipoPelagem(String tipoPelagem) {
		this.tipoPelagem = tipoPelagem;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Categoria: %s%n", this.categoria);
		System.out.printf("Fragrância: %s%n", this.fragrancia);
		System.out.printf("Volume (ml): %d%n", this.volume);
		System.out.printf("Tipo de pelagem: %s%n", this.tipoPelagem);
	}
	
	
}
