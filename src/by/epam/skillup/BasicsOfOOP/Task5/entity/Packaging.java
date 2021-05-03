package by.epam.skillup.BasicsOfOOP.Task5.entity;

public class Packaging {
	private PackagingType packagingType;

	public Packaging(PackagingType packagingType) {
		this.packagingType = packagingType;
	}

	public PackagingType getPackagingType() {
		return packagingType;
	}

	public void setPackagingType(PackagingType packagingType) {
		this.packagingType = packagingType;
	}

	@Override
	public String toString() {
		return packagingType.name();
	}
}
