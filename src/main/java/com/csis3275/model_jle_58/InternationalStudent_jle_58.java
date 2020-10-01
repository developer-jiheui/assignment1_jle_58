package com.csis3275.model_jle_58;

public class InternationalStudent_jle_58 extends Students_jle_58 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InternationalStudent_jle_58() {
		super();
	}
	
	public int rate = 1800;
	
	public int calWorkhr() {
		if (semester.equals("Winter")) {
			return 40;
		}
		else
			return 20;
	}
	
	
	public int calFee() {
		return numOfCourses*rate;
	}
	public String toString() {
		String txt="<td><label>Total fee:</label></td>"+
				"<td>"+calFee()+"</td>"
					+ "</tr>"
					+ "<tr>"
					+ "	<td><label>Workable hour for next semester:</label></td>"
					+ "	<td>"+calWorkhr()+" hours /week"+"</td>"
				;
		
		return txt;
	}
}
