package dio.ApiREST_FinalProject.service;

import dio.ApiREST_FinalProject.domain.User;

public interface UserService {
    User findById(long id);

    User creatUser(User user);
    
}
