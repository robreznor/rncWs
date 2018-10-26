//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.26 a las 07:03:45 PM CLST 
//


package com.uv.types.rnc;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://uv.com/types/rnc}DatosDemograficos"/&gt;
 *         &lt;element ref="{http://uv.com/types/rnc}Sospecha"/&gt;
 *         &lt;element ref="{http://uv.com/types/rnc}Diagnostico"/&gt;
 *         &lt;element name="OtrosDocumentos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://uv.com/types/rnc}Archivo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "datosDemograficos",
    "sospecha",
    "diagnostico",
    "otrosDocumentos"
})
@XmlRootElement(name = "DiagnosticoDoc")
public class DiagnosticoDoc {

    @XmlElement(name = "DatosDemograficos", required = true)
    protected DatosDemograficos datosDemograficos;
    @XmlElement(name = "Sospecha", required = true)
    protected Sospecha sospecha;
    @XmlElement(name = "Diagnostico", required = true)
    protected Diagnostico diagnostico;
    @XmlElement(name = "OtrosDocumentos", required = true)
    protected DiagnosticoDoc.OtrosDocumentos otrosDocumentos;

    /**
     * Obtiene el valor de la propiedad datosDemograficos.
     * 
     * @return
     *     possible object is
     *     {@link DatosDemograficos }
     *     
     */
    public DatosDemograficos getDatosDemograficos() {
        return datosDemograficos;
    }

    /**
     * Define el valor de la propiedad datosDemograficos.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosDemograficos }
     *     
     */
    public void setDatosDemograficos(DatosDemograficos value) {
        this.datosDemograficos = value;
    }

    /**
     * Obtiene el valor de la propiedad sospecha.
     * 
     * @return
     *     possible object is
     *     {@link Sospecha }
     *     
     */
    public Sospecha getSospecha() {
        return sospecha;
    }

    /**
     * Define el valor de la propiedad sospecha.
     * 
     * @param value
     *     allowed object is
     *     {@link Sospecha }
     *     
     */
    public void setSospecha(Sospecha value) {
        this.sospecha = value;
    }

    /**
     * Obtiene el valor de la propiedad diagnostico.
     * 
     * @return
     *     possible object is
     *     {@link Diagnostico }
     *     
     */
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    /**
     * Define el valor de la propiedad diagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagnostico }
     *     
     */
    public void setDiagnostico(Diagnostico value) {
        this.diagnostico = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosDocumentos.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticoDoc.OtrosDocumentos }
     *     
     */
    public DiagnosticoDoc.OtrosDocumentos getOtrosDocumentos() {
        return otrosDocumentos;
    }

    /**
     * Define el valor de la propiedad otrosDocumentos.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticoDoc.OtrosDocumentos }
     *     
     */
    public void setOtrosDocumentos(DiagnosticoDoc.OtrosDocumentos value) {
        this.otrosDocumentos = value;
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
     *         &lt;element ref="{http://uv.com/types/rnc}Archivo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "archivo"
    })
    public static class OtrosDocumentos {

        @XmlElement(name = "Archivo")
        protected List<Archivo> archivo;

        /**
         * Gets the value of the archivo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the archivo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArchivo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Archivo }
         * 
         * 
         */
        public List<Archivo> getArchivo() {
            if (archivo == null) {
                archivo = new ArrayList<Archivo>();
            }
            return this.archivo;
        }

    }

}
