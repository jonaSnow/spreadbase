package com.flores.h2.spreadbase.model.h2;

import com.flores.h2.spreadbase.model.DataDefinition;
import com.flores.h2.spreadbase.model.IColumn;

/**
 * 
 * @author Jason
 */
public class SmallInt extends DataDefinition {

	private static final int MIN_VALUE = -32768;
	private static final int MAX_VALUE = 32767;

	public SmallInt(IColumn column) {
		super(column);
	}

	@Override
	public String getDefinition() {
		return "smallint";
	}
	
	public static boolean inRange(int value) {
		return (value >= MIN_VALUE && value <= MAX_VALUE);
	}
}