/**
 * @license Highcharts JS v2.3.3 (2012-11-02)
 *
 * (c) 2012-2013
 * 
 * Author: Gert Vaartjes
 *
 * License: www.highcharts.com/license
 */
package com.highcharts.export.converter;

public class SVGConverterException extends Exception {

	private static final long serialVersionUID = -5110552374074051446L;
	private String mistake;

	public SVGConverterException() {
		super();
		mistake = "unknown to men";
	}

	public SVGConverterException(String err) {
		super(err);
		mistake = err;
	}

	public String getError() {
		return mistake;
	}

}
