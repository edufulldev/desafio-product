package desafio.devfull.produtos.service;

import desafio.devfull.produtos.dto.ProductDTO;
import desafio.devfull.produtos.pagination.PageResponse;
import desafio.devfull.produtos.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public PageResponse<ProductDTO> list(Pageable pageable) {

       Pageable safe = PageRequest.of(
               pageable.getPageNumber(),
               Math.min(pageable.getPageSize(), 100)
       );

       return PageResponse.of(repository.findAll(safe).map(ProductDTO::from));
    }


}
