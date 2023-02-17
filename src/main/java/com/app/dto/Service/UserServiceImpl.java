package com.app.dto.Service;

import com.app.dto.Model.User;
import com.app.dto.Repository.UserRepository;
import com.app.dto.dto.UserDto;
import com.app.dto.dto.UserGetDto;
import com.app.dto.dto.UserUpdateDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserGetDto getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return modelMapper.map(user, UserGetDto.class);
    }

    @Override
    public List<UserDto> allUsers() {
        List<User> users = userRepository.findAll();
        List<UserDto> dto = users.stream().map(user -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
        // her datayı dto ya dönüştürüp dto listesine aktarım sağlandı
        //map metodu stream içindeki elemanları UserDto sınıfındaki objelere göre mapleme işlemi sağladı, bunun için modelMapper nesnesindeki
        //mapleme metodunu kullandık. Stream api içerisindeki Collectors final sınıfdaki toList metodunu kullanarak UserDto türündeki
        //verileri listeleyip UserDto tipindeki list nesnesine atadık.
        return dto;
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return modelMapper.map(userRepository.save(user),UserDto.class);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(UserUpdateDto userUpdateDto) {
        User user = modelMapper.map(userUpdateDto, User.class);
        modelMapper.map(userRepository.save(user),UserDto.class);
    }
    // parametre olarak id de alabilir ancak o şekilde performans kaybı(?) olabileceğinden controller sınıfında path üzerinden update tercih edildi

   /* @Override
    public UserDto updateUserDto(Long id, UserDto userDto) {
        Optional<User> resultUser = userRepository.findById(id);
        return modelMapper.map(userRepository.save(resultUser.get()), UserDto.class);
    }*/

}
