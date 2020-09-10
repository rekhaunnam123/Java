package com.entry;
public class Room {
	private int roomNo;
	private String roomType;
	private double roomArea;
	private String ACmachine;
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(double roomArea) {
		this.roomArea = roomArea;
	}
	public String getACmachine() {
		return ACmachine;
	}
	public void setACmachine(String aCmachine) {
		ACmachine = aCmachine;
	}
	public static void main(String[] args)
	{
		
		Room room=new Room();
		System.out.println("Enter details");
		
		room.setRoomNo(20);
		room.setRoomType("Rectangle");
		room.setRoomArea(30);
		room.setACmachine("samsung");
		System.out.println("roomNo= "+room.getRoomNo());
		System.out.println("roomType= "+room.getRoomType());
		System.out.println("roomNo= "+room.getRoomArea());
		System.out.println("roomNo= "+room.getACmachine());
		}

}
