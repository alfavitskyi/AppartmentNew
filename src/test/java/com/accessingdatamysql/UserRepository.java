package com.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;
import com.accessingdatamysql.User;

public interface UserRepository extends CrudRepository <User, Long>{

}
