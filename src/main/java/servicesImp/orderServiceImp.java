package servicesImp;

import com.iset.test.model.order;
import com.iset.test.repository.orderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class orderServiceImp {
    @Autowired

    private orderRepo repository;
    public List<order> listAllOrders(){
        return repository.findAll();
    }
}
