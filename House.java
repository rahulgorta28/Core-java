class House{

    int houseId; 
	int noOfRooms;
	int noOfFloors;
	String areaInSqrt;
	int noOfMembers;
	String houseName;
	
	public House(int houseId,int noOfRooms,int noOfFloors,String areaInSqrt,int noOfMembers,String houseName){
		
		this.houseId = houseId;
		this.noOfRooms = noOfRooms;
		this.noOfFloors = noOfFloors;
		this.areaInSqrt = areaInSqrt;
		this.noOfMembers = noOfMembers;
		this.houseName = houseName;
	}
	
	public void displayDetails(){
		System.out.println("Display method started");
		System.out.println("The House Id is:" + houseId);
		System.out.println("The No. of rooms in a House is:" + noOfRooms);
		System.out.println("The No. of Floors in a House is:" + noOfFloors);
		System.out.println("The No. of Members in a House is:" + noOfMembers);
		System.out.println("The House Name is:" + houseName);
		System.out.println("The House area in sqrt is:" + areaInSqrt);
		
		
	}
	

}