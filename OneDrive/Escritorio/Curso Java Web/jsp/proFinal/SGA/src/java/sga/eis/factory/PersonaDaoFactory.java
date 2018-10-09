/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package sga.eis.factory;

import java.sql.Connection;
import sga.eis.dao.*;
import sga.eis.jdbc.*;

public class PersonaDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PersonaDao
	 */
	public static PersonaDao create()
	{
		return new PersonaDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PersonaDao
	 */
	public static PersonaDao create(Connection conn)
	{
		return new PersonaDaoImpl( conn );
	}

}
