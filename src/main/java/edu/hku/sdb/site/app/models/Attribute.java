package models;

import java.util.LinkedList;
import java.util.List;

import play.*;
import play.mvc.*;

public class Attribute {

	private String name;
	private int type;
	private boolean sensitive;

	public Attribute(String name, boolean sensitive) {
		super();
		this.name = name;
		this.sensitive = sensitive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setSensitive(boolean sensitive) {
		this.sensitive = sensitive;
	}

	public boolean getSensitive() {
		return sensitive;
	}

	public static List<Attribute> getDefaultAttributesEmployee() {
		List<Attribute> defaultAttributes = new LinkedList<Attribute>();
		defaultAttributes.add(new Attribute("a", true));
		defaultAttributes.add(new Attribute("b", true));
		defaultAttributes.add(new Attribute("c", false));
		defaultAttributes.add(new Attribute("d", false));
		return defaultAttributes;
	}

	public static List<Attribute> getDefaultAttributesProduct() {
		List<Attribute> defaultAttributes = new LinkedList<Attribute>();
		defaultAttributes.add(new Attribute("l_orderkey", false));
		defaultAttributes.add(new Attribute("l_partkey", false));
		defaultAttributes.add(new Attribute("l_suppkey", false));
		defaultAttributes.add(new Attribute("L_LINENUMBER".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_QUANTITY".toLowerCase(), true));
		defaultAttributes.add(new Attribute("L_EXTENDEDPRICE".toLowerCase(), true));
		defaultAttributes.add(new Attribute("L_DISCOUNT".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_RETURNFLAG".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_LINESTATUS".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_SHIPDATE".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_COMMITDATE".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_RECEIPTDATE".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_SHIPINSTRUCT".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_SHIPMODE".toLowerCase(), false));
		defaultAttributes.add(new Attribute("L_COMMENT".toLowerCase(), false));
		return defaultAttributes;
	}


}
