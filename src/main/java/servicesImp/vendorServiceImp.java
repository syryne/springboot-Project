package servicesImp;

import com.iset.test.model.vendor;
import com.iset.test.repository.vendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class vendorServiceImp {
    @Autowired

    private vendorRepo repository;
    public List<vendor> listAllVendors(){
        return repository.findAll();
    }
}
