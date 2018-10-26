//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.26 a las 07:03:45 PM CLST 
//


package com.uv.types.rnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uv.com/types/rnc}Paciente"/&gt;
 *         &lt;element ref="{http://uv.com/types/rnc}CreadorDocumento"/&gt;
 *         &lt;element name="PaisEmisor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paciente",
    "creadorDocumento",
    "paisEmisor",
    "tipoDocumento"
})
@XmlRootElement(name = "HeaderDoc")
public class HeaderDoc {

    @XmlElement(name = "Paciente", required = true)
    protected Paciente paciente;
    @XmlElement(name = "CreadorDocumento", required = true)
    protected CreadorDocumento creadorDocumento;
    @XmlElement(name = "PaisEmisor")
    protected int paisEmisor;
    @XmlElement(name = "TipoDocumento")
    protected int tipoDocumento;

    /**
     * Obtiene el valor de la propiedad paciente.
     * 
     * @return
     *     possible object is
     *     {@link Paciente }
     *     
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Define el valor de la propiedad paciente.
     * 
     * @param value
     *     allowed object is
     *     {@link Paciente }
     *     
     */
    public void setPaciente(Paciente value) {
        this.paciente = value;
    }

    /**
     * Obtiene el valor de la propiedad creadorDocumento.
     * 
     * @return
     *     possible object is
     *     {@link CreadorDocumento }
     *     
     */
    public CreadorDocumento getCreadorDocumento() {
        return creadorDocumento;
    }

    /**
     * Define el valor de la propiedad creadorDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link CreadorDocumento }
     *     
     */
    public void setCreadorDocumento(CreadorDocumento value) {
        this.creadorDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad paisEmisor.
     * 
     */
    public int getPaisEmisor() {
        return paisEmisor;
    }

    /**
     * Define el valor de la propiedad paisEmisor.
     * 
     */
    public void setPaisEmisor(int value) {
        this.paisEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     */
    public void setTipoDocumento(int value) {
        this.tipoDocumento = value;
    }

}
