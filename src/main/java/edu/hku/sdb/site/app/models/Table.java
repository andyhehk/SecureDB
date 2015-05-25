package models;

import java.util.LinkedList;
import java.util.List;

public class Table {

	private List<Attribute> attributes;
	private String tableName;
	private boolean isSecure;

	public Table(List<Attribute> attributes, String tableName, boolean isSecure) {
		super();
		this.attributes = attributes;
		this.tableName = tableName;
		this.isSecure = isSecure;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public boolean isSecure() {
		return isSecure;
	}

	public void setSecure(boolean isSecure) {
		this.isSecure = isSecure;
	}

	public static List<Table> getDefaultTablesEmployee() {

		List<Table> defaultTables = new LinkedList<Table>();
		defaultTables.add(new Table(Attribute.getDefaultAttributesEmployee(),
				"demo", true));
		defaultTables.add(new Table(Attribute.getDefaultAttributesProduct(),
				"lineitems_200k_1", false));
		return defaultTables;
	}

}
