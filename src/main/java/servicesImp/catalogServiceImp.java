package servicesImp;

import com.iset.test.model.catalog;
import com.iset.test.repository.catalogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class catalogServiceImp {
    @Autowired

    private catalogRepo repository;
    public List<catalog> listAllCategories(){
        return repository.findAll();
    }
}
