package br.com.fiap.pessoa.model;

public class EmpVo {

//	CREATE TABLE EMP(
//		    atrIdEmpresa integer not null,
//			atrCodigoEmpresa integer not null,			
//		    atrNomeFantasia varchar2(100),
//		    atrRazaoSocial varchar2(150),
//		    atrCNPJ varchar2(16)
//		);
//
//		Alter Table EMP
//		    Add Constraint Emp_PK
//		    Primary Key(atrIdEmpresa, atrCodigoEmpresa);
	private Integer atrIdEmpresa;
	private Integer atrCodigoEmpresa;
	private String atrNomeFantasia;
	private String atrRazaoSocial;
	private String atrCnpj;

	public EmpVo() {}
	
	public EmpVo(Integer atrIdEmpresa, Integer atrCodigoEmpresa, String atrNomeFantasia, String atrRazaoSocial,
			String atrCnpj) {
		super();
		this.atrIdEmpresa = atrIdEmpresa;
		this.atrCodigoEmpresa = atrCodigoEmpresa;
		this.atrNomeFantasia = atrNomeFantasia;
		this.atrRazaoSocial = atrRazaoSocial;
		this.atrCnpj = atrCnpj;
	}

	public Integer getAtrIdEmpresa() {
		return atrIdEmpresa;
	}

	public void setAtrIdEmpresa(Integer atrIdEmpresa) {
		this.atrIdEmpresa = atrIdEmpresa;
	}

	public String getAtrNomeFantasia() {
		return atrNomeFantasia;
	}

	public void setAtrNomeFantasia(String atrNomeFantasia) {
		this.atrNomeFantasia = atrNomeFantasia;
	}

	public String getAtrRazaoSocial() {
		return atrRazaoSocial;
	}

	public void setAtrRazaoSocial(String atrRazaoSocial) {
		this.atrRazaoSocial = atrRazaoSocial;
	}

	public String getAtrCnpj() {
		return atrCnpj;
	}

	public void setAtrCnpj(String atrCnpj) {
		this.atrCnpj = atrCnpj;
	}

	
	@Override
	public String toString() {
		return 	"\n * atrIdEmpresa: " 		+ atrIdEmpresa 		+ 
				"\n * atrCodigoEmpresa: " 	+ atrCodigoEmpresa 	+ 
				"\n * atrNomeFantasia: " 	+ atrNomeFantasia 	+
				"\n * atrRazaoSocial: " 	+ atrRazaoSocial 	+
				"\n * atrCnpj: "			+ atrCnpj 			+ 
				"\n";
	}

	public Integer getAtrCodigoEmpresa() {
		return atrCodigoEmpresa;
	}

	public void setAtrCodigoEmpresa(Integer atrCodigoEmpresa) {
		this.atrCodigoEmpresa = atrCodigoEmpresa;
	}

}
