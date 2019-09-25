package logic;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    List<StudentEntity> list;

    @PostConstruct
    private void init(){
        list = new ArrayList<>();
        list.add( new StudentEntity(1, "Anton", "Moscow"));
        list.add( new StudentEntity(2, "Semen", "Samara"));
        list.add( new StudentEntity(3, "Eduard", "St.Peterburg"));
        list.add( new StudentEntity(4, "Vasily", "Ryazan"));
        list.add( new StudentEntity(5, "Sergey", "Novgorod"));
        list.add( new StudentEntity(6, "Igor", "Balashiha"));
        list.add( new StudentEntity(7, "Artem", "Tomsk"));
        list.add( new StudentEntity(8, "Andrey", "Saratov"));
        list.add( new StudentEntity(9, "Youry", "Chelyabinsk"));
        list.add( new StudentEntity(10, "Max", "Torzhok"));
    }



    public Optional<StudentEntity> getById(Integer id) {

        return Optional.ofNullable(list.get(id));
    }

    public List<StudentEntity> getAllStudents() {

        return list;
    }
}
