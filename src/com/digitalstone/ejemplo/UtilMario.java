/*
 * (#)UtilMario.java 1.00 13/08/2018
 * 
 * Copyright (c) 2018 SURA Mexico. Derechos reservados. https://www.suramexico.com/afore/
 */
package com.digitalstone.ejemplo;

import java.lang.reflect.Field;

/**
 * 	Mario Alan Ramirez Vazquez.
 *	@author MXI01020253A
 *  @version 1.00, 13/08/2018
 */
public class UtilMario {
	
	/**
	 * 
	 * Metodo imprimeValoresVO.
	 * @param objParam {@code Object}
	 */
	public final void imprimeValoresVO(final Object objParam) {
		System.out.println("*****************************************************"
				+ "*********************************************************************************");
		System.out.println("*****************************************************"
				+ "*********************************************************************************");
		System.out.println("*** IMPRIMIENDO VALORES DEL VO: " + objParam.getClass().getName() + " ***");
		try {
	        Object obj = objParam;
	        for (Field field : obj.getClass().getDeclaredFields()) {
	            field.setAccessible(true);
	            Object value = field.get(obj);
	            System.out.println(field.getName() + "," + value);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("*** FINALIZA IMPRIMIENDO VALORES DEL VO: " + objParam.getClass() + " ***");
	    System.out.println("*****************************************************"
				+ "*********************************************************************************");
	    System.out.println("*****************************************************"
				+ "*********************************************************************************");
	    
	}
	
	/**
	 * Metodo imprimeValoresLinealVO.
	 * @param objParam {@code }
	 */
	public final void imprimeValoresLinealVO(final Object objParam) {
		String vo = "";
		System.out.println("*** IMPRIMIENDO VALORES DEL VO: " + objParam.getClass().getName() + " ***");
		try {
	        Object obj = objParam;
	        for (Field field : obj.getClass().getDeclaredFields()) {
	            field.setAccessible(true);
	            Object value = field.get(obj);
	            vo = vo + " - " + field.getName() + "," + value;
	        }
	        System.out.println(vo);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	}
/*
 actualizarUnificacionMixta
 
 */
}
