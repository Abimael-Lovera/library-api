package com.abimael.libraryapi.api.resource;

import com.abimael.libraryapi.api.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO dto) {
//        BookDTO this.dto = new BookDTO();
//        dto.setAuthor("Artur");
//        dto.setTitle("As aventuras");
//        dto.setIsbn("001");
//        dto.setId(11L);
        return dto;
    }
}
