package com.csis3275.model_jle_58;

public class DomesticStudent_jle_58 extends Students_jle_58 {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DomesticStudent_jle_58() {
		super();	
	}
	public int feeRate = 450;

	
	public int calFee() {
		return numOfCourses*feeRate;
	}
	
	public String loanPossible() {
		if(totalGrade>=2.5||semester.equals("Summer"))
			return "Possible";
		else
			return "Impossible";
	}
	
	public String toString() {
		
			String txt="<td><label>Total fee:</label></td>"+	 
					"<td>"+calFee()+"</td>"
					+ "</tr>"
					+ "<tr>"
					+ "	<td><label>Loan for next semester:</label></td>"
					+ "	<td>"+loanPossible()+"</td>"
				;
		
			return txt;
	}
	
		
}
