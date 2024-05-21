package es.etg.daw.prog.mercadaw.model.entities.empleados;

import java.sql.Date;
import java.sql.SQLException;

import es.etg.daw.prog.mercadaw.model.exception.MercaDAWException;

/**
 * La clase Reponedor representa un reponedor de MercaDAW.
 * \author Diego Madroñero Chamorro.
 */
public class Reponedor extends Empleado{
    private double sueldo;

    /**
     * Constructor que inicializa reponedores, generando el ID de estas automaticamente.
     * \param Id del empleado
     * \param Nombre del empleado
     * \param Apellidos del empleado
     * \param Fecha de contratación del empleado
     * @throws MercaDAWException 
     * @throws SQLException 
     */
    public Reponedor(Integer id, String nombre, String apellidos, Date fechaInicio) throws SQLException, MercaDAWException {
        super(id, nombre, apellidos, fechaInicio);
        this.sueldo = SUELDO_REPON;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return TipoEmpleado.REPONEDOR.toString();
    }
}
