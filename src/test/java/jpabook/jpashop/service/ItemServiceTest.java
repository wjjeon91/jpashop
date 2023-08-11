package jpabook.jpashop.service;

import jpabook.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)    //Junit실행할때 스프링이랑 엮어서 실행 하기 위함
@SpringBootTest                 //스프링 부트를 띄운 상태에서 test 돌리기 위함
@Transactional                  //테스트케이스 롤백
public class ItemServiceTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void saveItem() {
    }

    @Test
    public void findItems() {
    }

    @Test
    public void findOne() {
    }
}