package org.devquality.hexagonaltemplate.infrastructure.adapter.in.controllers;

import org.devquality.hexagonaltemplate.application.port.in.CreateProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.GetProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.UpdateProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.request.CreateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.request.GetProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.request.UpdateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.response.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final CreateProductUseCase createProductUseCase;
    private final GetProductUseCase getProductUseCase;
    private final UpdateProductUseCase updateProductUseCase;

    public ProductController(CreateProductUseCase createProductUseCase,
                             GetProductUseCase getProductUseCase,
                             UpdateProductUseCase updateProductUseCase) {
        this.createProductUseCase = createProductUseCase;
        this.getProductUseCase = getProductUseCase;
        this.updateProductUseCase = updateProductUseCase;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody CreateProductRequest request) {
        try {
            ProductResponse response = createProductUseCase.create(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable Long id) {
        try {
            GetProductRequest request = new GetProductRequest();
            request.setId(id);
            ProductResponse response = getProductUseCase.get(request);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable Long id,
                                                         @RequestBody UpdateProductRequest request) {
        try {
            // Ensure the ID in the path matches the request
            UpdateProductRequest updateRequest = new UpdateProductRequest(id, request.getName(), request.getPrice());
            ProductResponse response = updateProductUseCase.update(updateRequest);
            return ResponseEntity.ok(response);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}