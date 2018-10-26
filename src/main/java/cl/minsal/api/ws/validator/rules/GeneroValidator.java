package cl.minsal.api.ws.validator.rules;

import cl.minsal.api.types.Documento;
import cl.minsal.api.ws.endpoint.ErrorCodes;
import cl.minsal.api.ws.validator.DocumentoValidator;
import cl.minsal.api.ws.validator.ValidationException;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public class GeneroValidator implements DocumentoValidator {
    String elemento = "Genero";
    @Override
    public void validate(Documento documento) {
        BigInteger genero = documento.getHeaderDoc().getPaciente().getGenero();
        if (genero == null){
            throw new ValidationException(ErrorCodes.ELEMENTO_VACIO_STR + " " + elemento, ErrorCodes.ELEMENTO_VACIO_COD);
        }
    }
}