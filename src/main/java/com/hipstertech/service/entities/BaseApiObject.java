package com.hipstertech.service.entities;

public class BaseApiObject {
	
	 public String resourceName;

     /// <summary>
     ///  Usuario para la firma de Usuario en los documentos enviados 
     /// </summary>
     public String userSign;

     /// <summary>
     ///  Acción a ejecutar
     /// </summary>
     public String action;

     /// <summary>
     ///  Actualiza las collecciones existentes
     /// </summary>
     public boolean ReplaceCollectionsOnPatch;

     /// <summary>
     ///  ReStringir el conjunto de objetos de negocio devueltos. 
     /// </summary>
     
     public String filter;

     /// <summary>
     /// Especificar el orden en que se devuelven los objetos de negocio del servicio.
     /// </summary>
     
     public String orderby;

     /// <summary>
     /// ReStringir el servicio únicamente para devolver las propiedades solicitadas por el cliente.
     /// </summary>
     
     public String select;

     /// <summary>
     /// Especifica que el resultado excluye las primeras entidades n.
     /// </summary>
     
     public int skip;

     /// <summary>
     /// Especificar que se deben devolver sólo los primeros n registros.
     /// </summary>
     
     public int top;

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getUserSign() {
		return userSign;
	}

	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public boolean isReplaceCollectionsOnPatch() {
		return ReplaceCollectionsOnPatch;
	}

	public void setReplaceCollectionsOnPatch(boolean replaceCollectionsOnPatch) {
		ReplaceCollectionsOnPatch = replaceCollectionsOnPatch;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public int getSkip() {
		return skip;
	}

	public void setSkip(int skip) {
		this.skip = skip;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
     
     

}
