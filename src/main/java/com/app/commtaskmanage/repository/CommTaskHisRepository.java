package com.app.commtaskmanage.repository;

import com.core.data.model.DataModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dechun.yuan
 * @version 1.0
 */
@Repository
@Mapper
public interface CommTaskHisRepository {

    void saveCommTaskHis(DataModel saveModel);

    List<DataModel> queryCommTaskHis(DataModel queryModel);

}
