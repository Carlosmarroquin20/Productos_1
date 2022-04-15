package com.example.demo.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.Entidades.Productos;

@Service
public class Implementaciones_de_Productos implements Servicio_Producto{
	
	private static AtomicLong sequence = new AtomicLong();
	private static List<Productos> lista = new ArrayList<Productos>() {{
		add(new Productos(sequence.incrementAndGet(),"Producto","Asus","Marcapc","3"));
		add(new Productos(sequence.incrementAndGet(),"Producto","Logitech","Mouses","2"));
		add(new Productos(sequence.incrementAndGet(),"Producto","Power","Bebibastomar","1"));
	}};

	public List<Productos> List_Products() {
		return lista;
	}

	@Override
	public Productos Search_Products(long iD) {
		for (Productos e: lista) {
			if (e.getID().equals(iD))
				return e;
		}
		return null;
	}

	@Override
	public void Create_Products(Productos product) {
		product.setID(sequence.incrementAndGet());
		lista.add(product);
	}

	@Override
	public void Delete_Products(long iD) {
		for (Productos e: lista) {
			if (e.getID().equals(iD))
				lista.remove(e);
		}
	}

	@Override
	public void Update_Products(long iD, Productos productos) {
		int id_value = (int) iD-1;	
		productos.setID(iD);
		lista.set(id_value, productos);
	}
}
