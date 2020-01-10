package ch.hslu.edu.enapp.webshop.converter;

import ch.hslu.edu.enapp.webshop.dto.ProductDto;
import ch.hslu.edu.enapp.webshop.ItemService.Item;

public class ProductConverter {
    public ProductDto getDtoFromItem(Item item ) {
        ProductDto newDto = new ProductDto();
        newDto.setNo(item.getNo());
        newDto.setOwner(item.getOwner());
        newDto.setDescription(item.getDescription());
        newDto.setKind(item.getKind());
        newDto.setUnitPrice(item.getUnitPrice());
        newDto.setMediafileName(item.getMediafileName());

        return newDto;
    }
}
