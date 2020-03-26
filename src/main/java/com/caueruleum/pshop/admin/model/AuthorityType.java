package com.caueruleum.pshop.admin.model;

/**
 * All the authorities in the db as a model
 * @author caueruleum
 *
 */
public enum AuthorityType 
{
	USER("ROLE_USER"),
	ADMIN("ROLE_ADMIN");
	
	private final String type;
	
	private AuthorityType(String type) 
	{
		this.type = type;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public static AuthorityType fromString(String text) 
	{
        for (AuthorityType auth : AuthorityType.values()) 
        {
            if (auth.type.equalsIgnoreCase(text)) 
            {
                return auth;
            }
        }
        return null;
    }

}
