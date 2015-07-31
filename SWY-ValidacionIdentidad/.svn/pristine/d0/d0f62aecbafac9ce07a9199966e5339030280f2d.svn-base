package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.util;

import java.util.ArrayList;
import java.util.List;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.Sujeto;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.TipoDeSujeto;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.TipoSujeto;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ValidacionDeIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ValidacionFilter;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.response.OrchestratedObject;

public class ValidacionDeIdentidadUtil {
	
	
	public static ValidacionDeIdentidad map(OrchestratedObject orchestedObject) {
			
			ValidacionDeIdentidad vdi = new ValidacionDeIdentidad();
			
			vdi.setServicio(orchestedObject.getServiceName().name());
			
			vdi.setNroInterlocutorSujetoActividad(orchestedObject.getSujetoActividad().getNroInterlocutor());
			vdi.setNroInterlocutorSujetoContacto(orchestedObject.getSujetoContacto().getNroInterlocutor());
			
			vdi.setTipoSujetoActividad(getTipoSujeto(orchestedObject.getSujetoActividad().getSubjectType()));
			vdi.setTipoSujetoContacto(getTipoSujeto(orchestedObject.getSujetoContacto().getSubjectType()));		
			
			vdi.setSujetoActividad(orchestedObject.getNoSocioOsdeBinarioSA().get(0).getNombreCompleto());//agregado para xml
			vdi.setSujetoContacto(orchestedObject.getNoSocioOsdeBinarioSC().get(0).getNombreCompleto());//agregado para xml		
			
			//vdi.setNombreSujetoActividad(orchestedObject.getNoSocioOsdeBinarioSA().get(0).getNombre());
			
			
			
						
			
			vdi.setSujetoValidacionIdentidadActividad(MapperSujetoUtil.cargarSujetoValidacionIdentidadActividad(orchestedObject));

			vdi.setSujetoValidacionIdentidadContacto(MapperSujetoUtil.cargarSujetoValidacionIdentidadContacto(orchestedObject));
			
//			vdi.setNombreYTipoSujetoContacto();
//			vdi.setNombreSujetoActividad();
			return vdi;		
	}
	
	private static TipoSujeto getTipoSujeto(TipoDeSujeto subjectType) {
		TipoSujeto tipoSujeto = new TipoSujeto();
		tipoSujeto.setDescription(subjectType.getDescripcion());
		return tipoSujeto;
	}
	
	
	public static List<Sujeto> getSubjets(ValidacionFilter filter) {
		List<Sujeto> sujetos = new ArrayList<Sujeto>();
		sujetos.add(createSujeto(filter.getSujetoContacto()));
		if (!filter.getSujetoContacto().equals(filter.getSujetoActividad())) {
			sujetos.add(createSujeto(filter.getSujetoActividad()));
		} else {
		}
		return sujetos;
	}
	
	public static Sujeto createSujeto(Sujeto sujeto) {
		Sujeto result = new Sujeto();
		result.setNroContrato(sujeto.getNroContrato());
		result.setNroInterlocutor(sujeto.getNroInterlocutor());
		result.setNroOrden(sujeto.getNroOrden());
		result.setCodigoPrestador(sujeto.getCodigoPrestador());
		result.setNumeroDocumento(sujeto.getNumeroDocumento());
		result.setSubjectType(sujeto.getSubjectType());
		return result;
	}


}
