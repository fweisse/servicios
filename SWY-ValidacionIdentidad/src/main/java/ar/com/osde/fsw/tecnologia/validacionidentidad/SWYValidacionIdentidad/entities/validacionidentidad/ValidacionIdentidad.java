package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;


public interface ValidacionIdentidad {

    public ValidarResponse validar(
        ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.Validar parameters) throws ServiceException_Exception;
}
