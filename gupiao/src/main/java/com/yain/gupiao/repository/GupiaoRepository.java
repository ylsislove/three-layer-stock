package com.yain.gupiao.repository;

import com.yain.gupiao.domain.Gupiao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * TODO
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/13 13:13
 */
public interface GupiaoRepository extends CrudRepository<Gupiao, Long> {

    /**
     * 查询行数
     * @return 数据总数
     */
    @Query(value = "select count(*) from demo", nativeQuery = true)
    Long findDataCount();

    /**
     * 查询分页数据
     * @param page 当前页数
     * @param limit 每页的条数
     * @return 数据列表
     */
    @Query(value="select * from demo limit ?1, ?2", nativeQuery=true)
    List<Gupiao> findDataPage(int page, int limit);

    /**
     * 查询所有数据
     * @return 返回所有数据
     */
    @Query(value="select * from demo", nativeQuery=true)
    List<Gupiao> findAllData();

    /**
     * 返回开盘价平均值
     * @return 开盘价平均值
     */
    @Query(value="select avg(o_price) from demo", nativeQuery=true)
    Double calcFun1();

    /**
     * 返回交易量最大值
     * @return 交易量最大值
     */
    @Query(value="select max(trade_num) from demo", nativeQuery=true)
    Long calcFun2();

    /**
     * 返回交易额最小值
     * @return 交易额最小值
     */
    @Query(value="select min(trade_money) from demo", nativeQuery=true)
    Long calcFun3();
}
