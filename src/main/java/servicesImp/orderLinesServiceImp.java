package servicesImp;

import com.iset.test.model.orderLines;
import com.iset.test.repository.orderLinesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class orderLinesServiceImp {
    @Autowired

    private orderLinesRepo repository;
    public List<orderLines> listAllOrderLines(){
        return repository.findAll();
    }
}
