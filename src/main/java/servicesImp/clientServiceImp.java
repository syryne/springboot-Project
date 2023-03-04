package servicesImp;

import com.iset.test.model.client;
import com.iset.test.repository.clientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class clientServiceImp {
    @Autowired

    private clientRepo repository;
    public List<client> listAllClients() {
        return repository.findAll();
    }
}
