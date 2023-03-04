package servicesImp;

import com.iset.test.model.product;
import com.iset.test.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class productServiceImp {
    @Autowired

    private productRepo repository;
    public List<product> listAllProducts(){
        return repository.findAll();
    }
}
