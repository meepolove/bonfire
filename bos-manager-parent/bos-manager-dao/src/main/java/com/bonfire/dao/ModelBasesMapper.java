package com.bonfire.dao;
import java.util.List;
import com.bonfire.pojo.ModelBases;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/9/27.
 */
@Repository
public interface ModelBasesMapper {
    List<ModelBases> selectAll();
}
