package dao;

import domain.CardId;
import domain.Person;
import org.apache.ibatis.annotations.*;

import javax.smartcardio.Card;
import java.util.List;

public interface PersonCardDao {

    @Select("select * from person where pid = #{pid}")
    @Results(
            id = "selectByPerson",
            value = {
                    @Result(property = "pid", column = "pid", id = true),
                    @Result(property = "pname", column = "pname"),
                    @Result(property = "cardId", column = "cardid", javaType = CardId.class, one = @One(select = "selectByCard"))
            }
    )
    public Person selectByPerson(Integer pid);

    // 辅助函数
    @Select("select * from id_card where cardid = #{cardid}")
    public CardId selectByCard(String cardid);


    // 查询多条
    @Select("select * from person")
    @ResultMap("selectByPerson")
    public List<Person> selectAll();

}
