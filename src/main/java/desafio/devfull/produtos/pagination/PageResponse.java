package desafio.devfull.produtos.pagination;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.domain.Page;

import java.util.List;

public record PageResponse<T>(
        @JsonProperty("items") List<T> content,
        int page,
        int size,
        long totalElement,
        boolean hasNext
        ) {

        public static<T> PageResponse<T> of (Page<T> page) {
                return new PageResponse<>(
                        page.getContent(),
                        page.getNumber(),
                        page.getSize(),
                        page.getTotalPages(),
                        page.hasNext()
                );
        }
}
