package controller.TestValidateExample.service;

import java.util.ArrayList;

import controller.TestValidateExample.bean.Goods;

public interface GoodsService {
	public boolean save(Goods g);

	public ArrayList<Goods> getGoods();
}