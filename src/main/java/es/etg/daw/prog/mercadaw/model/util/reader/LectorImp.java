package es.etg.daw.prog.mercadaw.model.util.reader;

import java.util.List;

import es.etg.daw.prog.mercadaw.model.entities.compras.Cliente;
import es.etg.daw.prog.mercadaw.model.entities.compras.Compra;
import es.etg.daw.prog.mercadaw.model.entities.empleados.Empleado;
import es.etg.daw.prog.mercadaw.model.entities.productos.Producto;
import es.etg.daw.prog.mercadaw.model.exception.MercaDAWException;

/**
 * La clase abstracta LectorImp utiliza Lector, pero sin implementarla, esta clase sirve para poder
 * tener hijas para que cad auan las implemente como deba.
 * \author Iván Rafael Redondo.
 */
public abstract class LectorImp implements Lector{

    @Override
    public abstract List<Producto> leerProducto(String codigo) throws MercaDAWException;

    @Override
    public abstract List<Empleado> leerEmpleado(String codigo) throws MercaDAWException;

    @Override
    public abstract List<Cliente> leerCliente(String codigo) throws MercaDAWException;

    @Override
    public abstract List<Compra> leerCompra(String codigo) throws MercaDAWException;
    
}
