
public class Furniture extends Item{
	private String materialType;
	private String design;
	public Furniture(String name, double price,int quantity, String materialType, String design) {
		super(name, price,quantity);
		setMaterialType(materialType);
		setDesign(design);
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public void printDetails() {
		super.printDetails();
		System.out.println("Material Type = "+materialType+ "\nDesign = "+design);
	}
	
}
