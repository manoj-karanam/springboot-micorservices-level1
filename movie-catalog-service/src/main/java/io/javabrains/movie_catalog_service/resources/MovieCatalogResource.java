package io.javabrains.movie_catalog_service.resources;


import io.javabrains.movie_catalog_service.models.CatalogItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(String userId){

        return Collections.singletonList(
                new CatalogItem("shutter Island", "test", 4)

            );
    }

}
