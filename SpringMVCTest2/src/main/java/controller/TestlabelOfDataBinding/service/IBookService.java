package controller.TestlabelOfDataBinding.service;

import java.util.List;

import controller.TestlabelOfDataBinding.bean.Book;
import controller.TestlabelOfDataBinding.bean.Category;

public interface IBookService {
    List<Category> getAllCategories();  //获取所有类别
    Category getCategory(int id);       //获取某个类别
    List<Book> getAllBooks();           //获取所有书
    Book save(Book book);               //保存某本书
    Book update(Book book);             //更新某本书
    Book get(long id);                  //获取某本书
    long getNextId();                   //添加书时获取id(获取到最后一本书的id+1)
}
