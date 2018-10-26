package cl.minsal.api.ws.endpoint.utils;

import cl.minsal.api.ws.Services.DocumentoService;
import cl.minsal.api.ws.validator.DocumentoValidator;
import cl.minsal.api.ws.validator.rules.*;

import java.util.Arrays;

public class DocumentoServiceUtility {
    public static DocumentoService docSrv;

    public static synchronized DocumentoService getDocSrv(){
        if(docSrv == null){
            docSrv = new DocumentoService(Arrays.<DocumentoValidator>asList(
                    new RutValidator(),
                    new NombreValidator(),
                    new PrimerApellidoValidator(),
                    new SegundoApellidoValidator(),
                    new FechaDeNacimientoValidator(),
                    new GeneroValidator(),
                    new CreadorNombreEstablecimientoValidator(),
                    new CreadorCodigoEstablecimientoValidator(),
                    new CreadorServicioSaludValidator(),
                    new MedicoTratanteValidator(),
                    new ResolucionComiteValidator()
            ));
        }
        return docSrv;
    }
}
