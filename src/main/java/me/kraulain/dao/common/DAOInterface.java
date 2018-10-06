package me.kraulain.dao.common;

import me.kraulain.entities.Person;

import java.util.List;

public interface DAOInterface {

    public String createOne(Person person);

    public List<String> createMultiple(List<Person> persons);

    public List<Person> readAll(int count, List<String> queryParams);

    public Person readOne(String queryParam);

    public String update(Person person);

    public Person delete(Person person);
}
