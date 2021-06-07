package com.globallogic.app;

public class MyExceptions extends Exception  {

	 String mensaje;
	    
	    public MyExceptions(String mensaje) {
	        this.mensaje = mensaje;
	    }
	    
	    public String getMensaje() {
	          return "Class MiExcepcion" + mensaje;
	    }


}
