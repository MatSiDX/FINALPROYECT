package pe.org.chaclacayo.pyfinal2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.chaclacayo.pyfinal2.entity.Os;
import pe.org.chaclacayo.pyfinal2.repository.OsRepository;

@Service
public class OsService implements Operaciones<Os> {

    @Autowired
    private OsRepository osRepository;

    @Override
    public Os create(Os  t) {
        return osRepository.save(t);

    }

    @Override
    public Os update(Os t) {
        return osRepository.save(t);
    }

    @Override
    public void delete(int id) {
        osRepository.deleteById(id);
    }

    @Override
    public Os read(int id) {
        return osRepository.findById(id).get();
    }

    @Override
    public List<Os> readAll() {
        return osRepository.findAll();
    }
    
}
