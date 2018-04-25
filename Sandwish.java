class Sandwich{
	private String tipoPan;
	private String tipoCarne;
	private String ing1;
	private String ing2;
	private String ing3;
	private String ade1;
	private String ade2;
	
	
	public Sandwich(){
		tipoPan="";
		tipoCarne="";
		ing1="";
		ing2="";
		ing3="";
		ade1="";
		ade2="";		
	}
	
	public String getTipoPan(){
		return tipoPan;
	}
	public void setTipoPan(String tp){
		tipoPan=tp;
	}
	public String getTipoCarne(){
		return tipoCarne;
	}
	public void setTipoCarne(String tc){
		tipoCarne=tc;
	}
	public String getIng1(){
		return ing1;
	}
	public void setIng1(String ing){
		Ing1=ing;
	}
	public String getIng2(){
		return ing2;
	}
	public void setIng2(String ing){
		Ing2=ing;
	}
	public String getIng3(){
		return ing3;
	}
	public void setIng3(String ing){
		Ing3=ing;
	}
	
	
}