
public class Electronic extends Item{
	private String processorType;
	private float memorySize;
	public Electronic(String name, double price,int quantity, String processorType, float memorySize) {
		super(name, price,quantity);
		setProcessorType(processorType);
		setMemorySize(memorySize);
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	public float getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(float memorySize) {
		this.memorySize = memorySize;
	}
	public void printDetails() {
		super.printDetails();
		System.out.println("processor Type = "+processorType+ "\nMemory Size = "+memorySize);
	}

}
