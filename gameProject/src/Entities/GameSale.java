package Entities;

public class GameSale {
	private int gameSaleId;
	private String gameSaleName;
	private double gameSalePrice;
	
	public GameSale() {
		super();
	}

	public GameSale(int gameSaleId, String gameSaleName, double gameSalePrice) {
		super();
		this.gameSaleId = gameSaleId;
		this.gameSaleName = gameSaleName;
		this.gameSalePrice = gameSalePrice;
	}

	public int getGameSaleId() {
		return gameSaleId;
	}

	public void setGameSaleId(int gameSaleId) {
		this.gameSaleId = gameSaleId;
	}

	public String getGameSaleName() {
		return gameSaleName;
	}

	public void setGameSaleName(String gameSaleName) {
		this.gameSaleName = gameSaleName;
	}

	public double getGameSalePrice() {
		return gameSalePrice;
	}

	public void setGameSalePrice(double gameSalePrice) {
		this.gameSalePrice = gameSalePrice;
	}
}
