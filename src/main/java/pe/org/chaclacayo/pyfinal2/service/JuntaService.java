package pe.org.chaclacayo.pyfinal2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.chaclacayo.pyfinal2.entity.Junta;
import pe.org.chaclacayo.pyfinal2.repository.JuntaRepository;

@Service
public class JuntaService implements Operaciones<Junta> {

    @Autowired
    private JuntaRepository juntaRepository;

    @Override
    public Junta create(Junta t) {
        return juntaRepository.save(t);
    }

    @Override
    public Junta update(Junta t) {
        return juntaRepository.save(t);
    }

    @Override
    public void delete(int id) {
        juntaRepository.deleteById(id);
    }

    @Override
    public Junta read(int id) {
        return juntaRepository.findById(id).get();
    }

    @Override
    public List<Junta> readAll() {
        return juntaRepository.findAll();
    }

}
