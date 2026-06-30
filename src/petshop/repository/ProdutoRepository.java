package petshop.repository;

import petshop.model.Produto;

public interface ProdutoRepository {
	
	
	// CRUD
	public void cadastrarProduto(Produto produto);
	public void listarTodosProdutos();
	public void procurarPorId(int id);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id);
	public void listarPorNomeDoProduto(String nome);
	
}
