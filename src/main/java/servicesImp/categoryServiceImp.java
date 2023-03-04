package servicesImp;

import com.iset.test.model.category;
import com.iset.test.repository.categoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class categoryServiceImp  {
    @Autowired

    private categoryRepo repository;
    public List<category> listAllCategories(){
        return repository.findAll();
    }


}
