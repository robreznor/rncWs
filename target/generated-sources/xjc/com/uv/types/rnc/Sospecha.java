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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="MedicoDerivador"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CentroDerivador"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://uv.com/types/rnc}Establecimiento"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaPrimeraConsulta" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="BreveHistoria"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MotivoDerivacion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "medicoDerivador",
    "centroDerivador",
    "fechaPrimeraConsulta",
    "breveHistoria",
    "motivoDerivacion"
})
@XmlRootElement(name = "Sospecha")
public class Sospecha {

    @XmlElement(name = "MedicoDerivador", required = true)
    protected String medicoDerivador;
    @XmlElement(name = "CentroDerivador", required = true)
    protected Sospecha.CentroDerivador centroDerivador;
    @XmlElement(name = "FechaPrimeraConsulta", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaPrimeraConsulta;
    @XmlElement(name = "BreveHistoria", required = true)
    protected String breveHistoria;
    @XmlElement(name = "MotivoDerivacion")
    protected int motivoDerivacion;

    /**
     * Obtiene el valor de la propiedad medicoDerivador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicoDerivador() {
        return medicoDerivador;
    }

    /**
     * Define el valor de la propiedad medicoDerivador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicoDerivador(String value) {
        this.medicoDerivador = value;
    }

    /**
     * Obtiene el valor de la propiedad centroDerivador.
     * 
     * @return
     *     possible object is
     *     {@link Sospecha.CentroDerivador }
     *     
     */
    public Sospecha.CentroDerivador getCentroDerivador() {
        return centroDerivador;
    }

    /**
     * Define el valor de la propiedad centroDerivador.
     * 
     * @param value
     *     allowed object is
     *     {@link Sospecha.CentroDerivador }
     *     
     */
    public void setCentroDerivador(Sospecha.CentroDerivador value) {
        this.centroDerivador = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPrimeraConsulta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPrimeraConsulta() {
        return fechaPrimeraConsulta;
    }

    /**
     * Define el valor de la propiedad fechaPrimeraConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPrimeraConsulta(XMLGregorianCalendar value) {
        this.fechaPrimeraConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad breveHistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreveHistoria() {
        return breveHistoria;
    }

    /**
     * Define el valor de la propiedad breveHistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreveHistoria(String value) {
        this.breveHistoria = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDerivacion.
     * 
     */
    public int getMotivoDerivacion() {
        return motivoDerivacion;
    }

    /**
     * Define el valor de la propiedad motivoDerivacion.
     * 
     */
    public void setMotivoDerivacion(int value) {
        this.motivoDerivacion = value;
    }


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
     *         &lt;element ref="{http://uv.com/types/rnc}Establecimiento"/&gt;
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
        "establecimiento"
    })
    public static class CentroDerivador {

        @XmlElement(name = "Establecimiento", required = true)
        protected Establecimiento establecimiento;

        /**
         * Obtiene el valor de la propiedad establecimiento.
         * 
         * @return
         *     possible object is
         *     {@link Establecimiento }
         *     
         */
        public Establecimiento getEstablecimiento() {
            return establecimiento;
        }

        /**
         * Define el valor de la propiedad establecimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link Establecimiento }
         *     
         */
        public void setEstablecimiento(Establecimiento value) {
            this.establecimiento = value;
        }

    }

}
