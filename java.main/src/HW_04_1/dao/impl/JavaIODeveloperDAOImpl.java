package HW_04_1.dao.impl;

import HW_04_1.dao.DeveloperDAO;
import HW_04_1.model.Developer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class JavaIODeveloperDAOImpl implements DeveloperDAO{
    private String sep = System.getProperty("file.separator");
    private String user = System.getProperty("user.dir");
    private File file = new File(user + sep + "Developers.dat");

    @Override
    public void save(Developer developer) {
        String developerToString = "";

        developerToString += developer.getId() + ",";
        developerToString += developer.getFirstName() + ",";
        developerToString += developer.getLastName() + ",";
        developerToString += developer.getSpecialty() + ",";
        developerToString += developer.getSalary() + "\n";
            try {
                Files.write(Paths.get(String.valueOf(file)), developerToString.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Developer developer) {
        Developer tempDeveloper = getById(developer.getId());
        if (tempDeveloper == null){
            System.out.println("Developer not found...");
        }else {
            remove(developer);
            save(developer);
        }



    }

    @Override
    public Developer getById(Long id) {
        Developer developer = new Developer();

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String buffer;
            while ((buffer = bufferedReader.readLine()) != null){
                if (buffer.isEmpty()) {continue;}
                String[] arrayOfSplitDeveloper = buffer.split(",");
                if ((Integer.parseInt(arrayOfSplitDeveloper[0])) == id){
                    developer.setId(Long.parseLong(arrayOfSplitDeveloper[0]));
                    developer.setFirstName(arrayOfSplitDeveloper[1]);
                    developer.setLastName(arrayOfSplitDeveloper[2]);
                    developer.setSpecialty(arrayOfSplitDeveloper[3]);
                    developer.setSalary(Double.parseDouble(arrayOfSplitDeveloper[4]));
                    return developer;
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public void remove(Developer developer) {
        if (getById(developer.getId()) != null) {
            List<Developer> developers = new ArrayList<>(getAll());
            Iterator<Developer> iterator = developers.iterator();
            String developerToString = "";
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                fileOutputStream.write(developerToString.getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
            while (iterator.hasNext()) {
                Developer iteratorDeveloper = iterator.next();
                if (iteratorDeveloper.getId().equals(developer.getId())) {
                    iterator.remove();
                } else {
                    save(iteratorDeveloper);
                }

            }
        } else {
            System.out.println("There is no developer for deletion.");
        }

    }

    @Override
    public Collection<Developer> getAll() {
        Collection<Developer> developers = new ArrayList<>();

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String buffer;
            while ((buffer = bufferedReader.readLine()) != null){
                if (buffer.isEmpty()) {continue;}
                String[] arrayOfSplitDeveloper = buffer.split(",");

                Developer tempDeveloper = new Developer();
                    tempDeveloper.setId(Long.parseLong(arrayOfSplitDeveloper[0]));
                    tempDeveloper.setFirstName(arrayOfSplitDeveloper[1]);
                    tempDeveloper.setLastName(arrayOfSplitDeveloper[2]);
                    tempDeveloper.setSpecialty(arrayOfSplitDeveloper[3]);
                    tempDeveloper.setSalary(Double.parseDouble(arrayOfSplitDeveloper[4]));
                    developers.add(tempDeveloper);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return developers;
    }
}
