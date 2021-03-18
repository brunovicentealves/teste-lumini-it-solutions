package com.bruno.Teste_lumini_it_solutions;

import com.bruno.Teste_lumini_it_solutions.model.Empresa;
import com.bruno.Teste_lumini_it_solutions.model.Endereco;
import com.bruno.Teste_lumini_it_solutions.repository.EmpresaRepository;
import com.bruno.Teste_lumini_it_solutions.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TesteLuminiItSolutionsApplication {



	@Bean
	public CommandLineRunner init (
			@Autowired EmpresaService empresaService,
			@Autowired EmpresaRepository empresaRepository
			){
		return args->{
			Endereco endereco = new Endereco(null,"Av dos estados","Anchieta",2405,"RS","90200-00");
			Endereco endereco2 = new Endereco(null,"Rua Maria odette oliveira charao","Jardim Algarve",279,"RS","94859-060");
			Endereco endereco3 = new Endereco(null,"Rua Maria odette oliveira charao","Jardim Algarve",289,"RS","94859-060");
			Empresa empresa = new Empresa(null,"Toniolo Busnello","66469881000100",endereco);
			Empresa empresa2 = new Empresa(null,"Paqueta","80772580000174",endereco2);
			Empresa empresa3 = new Empresa(null,"Sobra Tema","11811821000124",endereco3);

			empresaService.salvar(empresa);
			empresaService.salvar(empresa2);
			empresaService.salvar(empresa3);



		};
	}

	public static void main(String[] args) {
		SpringApplication.run(TesteLuminiItSolutionsApplication.class, args);
	}

}
