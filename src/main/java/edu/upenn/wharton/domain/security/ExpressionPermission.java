package edu.upenn.wharton.domain.security;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ExpressionPermission extends Permission{

	@NotNull
	@Size(min = 3)
	private String entityClassName;

	private String expression;

	public String getEntityClassName(){
		return entityClassName;
	}

	public void setEntityClassName(String entityClassName){
		this.entityClassName = entityClassName;
	}

	public String getExpression(){
		return expression;
	}

	public void setExpression(String expression){
		this.expression = expression;
	}

}
