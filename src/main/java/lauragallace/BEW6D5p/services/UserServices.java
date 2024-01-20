package lauragallace.BEW6D5p.services;

import lauragallace.BEW6D5p.entities.User;
import lauragallace.BEW6D5p.payloads.UserPostDTO;
import lauragallace.BEW6D5p.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServices {
    @Autowired
    private UserRepositories userRepositories;

    public Page<User> getUsers(int page, int size, String orderBy) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(orderBy).descending());

        return userRepositories.findAll(pageable);
    }

    public User save(UserPostDTO userPostDTO) {
        User newUser = new User();
        newUser.setName(userPostDTO.name());
        newUser.setSurname(userPostDTO.surname());
        newUser.setUsername(userPostDTO.username());
        newUser.setEmail(userPostDTO.email());

        return userRepositories.save(newUser);
    }

    public User findById(UUID id) {
        return userRepositories.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException(id));
    }

    public void findByIdAndDelete(UUID id) {
        User found = this.findById(id);
       userRepositories.delete(found);
    }

    public User findByIdAndUpdate(UUID id, User user) {
        User found = this.findById(id);
        found.setEmail(user.getEmail());
        found.setUsername(user.getUsername());
        found.setName(user.getName());
        found.setUsername(user.getUsername());
        return userRepositories.save(found);
    }
}