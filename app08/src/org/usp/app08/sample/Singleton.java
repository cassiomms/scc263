package org.usp.app08.sample;

import java.util.*;
import org.usp.app08.db.*;

public class Singleton {
	
	private static Singleton singleton = null;
	private Vector<Database> connections;

	private Singleton() throws Exception {
		this.connections = new Vector<Database>();
		for (int i = 0; i < 5; i++) {
			Database db = new Database();
			db.connect();
			this.connections.add(db);
		}
	}

	// tratamento de uma regiao critica
	public synchronized static Singleton getInstance() 
		throws Exception {
		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;
	}

	public synchronized Database getDatabase() {
		//throws DatabaseException {
		try {
			Database db = connections.lastElement();
			this.connections.removeElementAt(
					connections.size()-1
					);
			return db;
		} catch (Exception e) {
			//throw new DatabaseException("No connections available.");
			System.out.println("Sem conexoes");
		}
		return null;
	}

	public synchronized void closeDatabase(Database db) {
		this.connections.add(db);
	}
}
