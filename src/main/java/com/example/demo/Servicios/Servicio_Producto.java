package com.example.demo.Servicios;

import java.util.List;

import com.example.demo.Entidades.Productos;

public interface Servicio_Producto {
	public List<Productos> List_Products();
	public Productos Search_Products(long iD);
	public void Create_Products(Productos product);
	public void Delete_Products(long iD);
	public  void Update_Products (long iD, Productos product);

}
