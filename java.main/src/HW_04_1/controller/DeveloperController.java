package HW_04_1.controller;

import HW_04_1.dao.DeveloperDAO;
import HW_04_1.dao.impl.JavaIODeveloperDAOImpl;
import HW_04_1.model.Developer;

import java.util.Collection;

public class DeveloperController {
    private DeveloperDAO developerDAO = new JavaIODeveloperDAOImpl();

    public Developer getById (Long id) {
        return  developerDAO.getById(id);
    }

    public void save (Developer developer) {
        developerDAO.save(developer);
    }

    public void update (Developer developer) {
        developerDAO.update(developer);
    }

    public void remove (Developer developer) {
        developerDAO.remove(developer);
    }

    public Collection<Developer> getAll () {
        return  developerDAO.getAll();
    }
}
