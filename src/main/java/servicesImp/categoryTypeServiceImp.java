package servicesImp;

import com.iset.test.model.category;
import com.iset.test.model.categoryType;
import com.iset.test.repository.categoryTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class categoryTypeServiceImp {
    @Autowired

    private categoryTypeRepo repository;
    public List<categoryType> listAllCategoryTypes(){
        return repository.findAll();
    }
}
