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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FooType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FooType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="foobar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FooType", propOrder = {
    "bar",
    "foobar"
})
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
@Deprecated
public class FooType {

    @XmlElement(required = true)
    protected String bar;
    @XmlElement(required = true)
    @Deprecated
    protected String foobar;

    /**
     * Obtiene el valor de la propiedad bar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBar() {
        return bar;
    }

    /**
     * Define el valor de la propiedad bar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBar(String value) {
        this.bar = value;
    }

    /**
     * Obtiene el valor de la propiedad foobar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @SuppressWarnings({
        "unchecked",
        "rawtypes"
    })
    @Deprecated
    public String getFoobar() {
        return foobar;
    }

    /**
     * Define el valor de la propiedad foobar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Deprecated
    public void setFoobar(
        @Deprecated
        String value) {
        this.foobar = value;
    }

}
