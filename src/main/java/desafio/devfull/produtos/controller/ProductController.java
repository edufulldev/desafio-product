package desafio.devfull.produtos.controller;

import desafio.devfull.produtos.dto.ProductDTO;
import desafio.devfull.produtos.pagination.PageResponse;
import desafio.devfull.produtos.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService service;

    @GetMapping
    public PageResponse<ProductDTO> list(Pageable pageable) {

        return service.list(pageable);
    }
}
