package bean;

public class GoodsModel {
	private String goodsname;
	private double goodsprice;
	private int goodsnumber;

	public GoodsModel() {
		super();
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public double getGoodsprice() {
		return goodsprice;
	}

	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
	}

	public int getGoodsnumber() {
		return goodsnumber;
	}

	public void setGoodsnumber(int goodsnumber) {
		this.goodsnumber = goodsnumber;
	}

	@Override
	public String toString() {
		return "GoodsModel [goodsname=" + goodsname + ", goodsprice=" + goodsprice + ", goodsnumber=" + goodsnumber
				+ "]";
	}

}