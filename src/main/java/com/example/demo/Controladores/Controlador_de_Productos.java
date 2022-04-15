package com.example.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entidades.Productos;
import com.example.demo.Servicios.Implementaciones_de_Productos;

@RestController
@RequestMapping("/productos")
public class Controlador_de_Productos {
	
	@Autowired
	Implementaciones_de_Productos Productos;
	
	@GetMapping()
	public List<Productos> Listar_Productos(){
		List<Productos> lista = Productos.List_Products();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Productos Buscar_Producto(@PathVariable Long id) {
		Productos estudiante = Productos.Search_Products(id);
		return estudiante;
	}
	
	@PostMapping
	public void Create_Products(@RequestBody Productos products) {
		Productos.Create_Products(products);
	}
	
	@DeleteMapping("/{id}")
	public void Eliminar_Producto(@PathVariable Long id) {
		Productos.Delete_Products(id);
	}
	
	@PutMapping("/{id}")
	public void Actualizar_Productos(@PathVariable Long id,@RequestBody   Productos product) {
		Productos.Update_Products(id, product);
	}
	
}
