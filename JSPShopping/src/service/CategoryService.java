package service;

import dao.CategoryDao;
import domain.CategoryClass;
import utils.MySpring;

import java.util.ArrayList;

public class CategoryService {

    private CategoryDao dao = MySpring.getBean("dao.CategoryDao");

    public ArrayList<CategoryClass> showSelectCategory() {

        // 查出所有的种类数据
        ArrayList<CategoryClass> cargoryArr = dao.selectAll();

        return cargoryArr;
    }

}
