package tk.hongkailiu.test.app.mybatis.mapper;

import tk.hongkailiu.test.app.mybatis.entity.Person;

import java.util.List;

public interface PersonMapper {
    public List<Person> list();

    public void insert(Person person);

    public void deleteById(int id);
}
