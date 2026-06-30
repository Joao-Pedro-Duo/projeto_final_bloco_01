package petshop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import petshop.model.Produto;
import petshop.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
		
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;


	@Override
	public void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nProduto Cadastrado com sucesso!");
	}
	
	@Override
	public void listarTodosProdutos() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void procurarPorId(int id) {
		
		Optional<Produto> produto = buscarNaCollection(id);
		
		if(produto.isPresent()) {
			produto.get().visualizar();
		}else {
			System.out.printf("\nO Produto id: %d não foi encontrado!%n", id);
		}
		
	}
	
	@Override
	public void atualizarProduto(Produto produto) {
		
		Optional<Produto> buscaProduto = buscarNaCollection(produto.getId());
		
		if (buscaProduto.isPresent()) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto.get()), produto);
			System.out.printf("\nO produto número %d foi atualizado com sucesso!", produto.getId());
		}else
			System.out.printf("\nO produto número %d não foi encontrado!", produto.getId());
		
	}

	@Override
	public void deletarProduto(int id) {
		
		Optional<Produto> produto = buscarNaCollection(id);
		
		if (produto.isPresent()) {
			if (listaProdutos.remove(produto.get()))
				System.out.printf("\nO produto número %d foi excluído com sucesso!", id);
		}else
			System.out.printf("\nO produto número %d não foi encontrado!", id);
		
	}
	
	@Override
	public void listarPorNomeDoProduto(String nome) {
		
		List<Produto> listaNomes = listaProdutos.stream()
				.filter(produto -> produto.getNome().toUpperCase().contains(nome.toUpperCase()))
				.collect(Collectors.toList());
		
		if (listaNomes.isEmpty())
			System.out.printf("\nNenhum produto com o nome %s foi encontrado.", nome);
		else
			listaNomes.forEach(produto -> produto.visualizar());
		
	}

	
	// Métodos Auxiliares
	
	public int gerarId() {
		return ++ id;
	}
	
	public Optional<Produto> buscarNaCollection(int id) {
		for(var produto : listaProdutos) {
			if(produto.getId() == id) {
				return Optional.of(produto);
			}
		}
		
		return Optional.empty();
	}
}
