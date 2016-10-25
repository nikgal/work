package by.galov.work;

public class Material {
	public Material(String materialName){
		this.materialName=materialName;
	}
	private String materialName;

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
}
