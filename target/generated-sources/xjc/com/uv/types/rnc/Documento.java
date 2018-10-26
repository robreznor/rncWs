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
 *         &lt;element ref="{http://uv.com/types/rnc}HeaderDoc"/&gt;
 *         &lt;element name="BodyDoc"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://uv.com/types/rnc}ResolucionTratamientoDoc"/&gt;
 *                   &lt;element ref="{http://uv.com/types/rnc}DiagnosticoDoc"/&gt;
 *                 &lt;/choice&gt;
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
    "headerDoc",
    "bodyDoc"
})
@XmlRootElement(name = "Documento")
public class Documento {

    @XmlElement(name = "HeaderDoc", required = true)
    protected HeaderDoc headerDoc;
    @XmlElement(name = "BodyDoc", required = true)
    protected Documento.BodyDoc bodyDoc;

    /**
     * Obtiene el valor de la propiedad headerDoc.
     * 
     * @return
     *     possible object is
     *     {@link HeaderDoc }
     *     
     */
    public HeaderDoc getHeaderDoc() {
        return headerDoc;
    }

    /**
     * Define el valor de la propiedad headerDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderDoc }
     *     
     */
    public void setHeaderDoc(HeaderDoc value) {
        this.headerDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad bodyDoc.
     * 
     * @return
     *     possible object is
     *     {@link Documento.BodyDoc }
     *     
     */
    public Documento.BodyDoc getBodyDoc() {
        return bodyDoc;
    }

    /**
     * Define el valor de la propiedad bodyDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento.BodyDoc }
     *     
     */
    public void setBodyDoc(Documento.BodyDoc value) {
        this.bodyDoc = value;
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://uv.com/types/rnc}ResolucionTratamientoDoc"/&gt;
     *         &lt;element ref="{http://uv.com/types/rnc}DiagnosticoDoc"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resolucionTratamientoDoc",
        "diagnosticoDoc"
    })
    public static class BodyDoc {

        @XmlElement(name = "ResolucionTratamientoDoc")
        protected ResolucionTratamientoDoc resolucionTratamientoDoc;
        @XmlElement(name = "DiagnosticoDoc")
        protected DiagnosticoDoc diagnosticoDoc;

        /**
         * Obtiene el valor de la propiedad resolucionTratamientoDoc.
         * 
         * @return
         *     possible object is
         *     {@link ResolucionTratamientoDoc }
         *     
         */
        public ResolucionTratamientoDoc getResolucionTratamientoDoc() {
            return resolucionTratamientoDoc;
        }

        /**
         * Define el valor de la propiedad resolucionTratamientoDoc.
         * 
         * @param value
         *     allowed object is
         *     {@link ResolucionTratamientoDoc }
         *     
         */
        public void setResolucionTratamientoDoc(ResolucionTratamientoDoc value) {
            this.resolucionTratamientoDoc = value;
        }

        /**
         * Obtiene el valor de la propiedad diagnosticoDoc.
         * 
         * @return
         *     possible object is
         *     {@link DiagnosticoDoc }
         *     
         */
        public DiagnosticoDoc getDiagnosticoDoc() {
            return diagnosticoDoc;
        }

        /**
         * Define el valor de la propiedad diagnosticoDoc.
         * 
         * @param value
         *     allowed object is
         *     {@link DiagnosticoDoc }
         *     
         */
        public void setDiagnosticoDoc(DiagnosticoDoc value) {
            this.diagnosticoDoc = value;
        }

    }

}
