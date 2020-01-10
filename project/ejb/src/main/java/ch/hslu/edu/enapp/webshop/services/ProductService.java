package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.ItemService.*;
import ch.hslu.edu.enapp.webshop.converter.ProductConverter;
import ch.hslu.edu.enapp.webshop.dto.ProductDto;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Stateless(name = "ProductServicesEJB")
public class ProductService implements IProductService {
    @Inject
    private ProductConverter productConverter;

    public ProductService() {
        final String DOMAIN = "ICOMPANY";
        final String USER = "XXXXXXXXXXXX";
        final String PASSWORD = "XXXXXXXXXXXX";

        Authenticator.setDefault(new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(DOMAIN + "\\" + USER, PASSWORD.toCharArray());
            }
        });
    }

    @Override
    public List<ProductDto> getAllProducts() {
        final ItemPort itemPort = getNewItemPort();
        final List<ItemFilter> filterList = getFilterForMP3s();
        final List<Item> allItems = itemPort.readMultiple(filterList, null, 0).getItem();

        return allItems.stream()
                .map(item -> this.productConverter.getDtoFromItem(item))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto getProduct(final String productNo) {
        final ItemPort itemPort = getNewItemPort();
        final Item item = itemPort.read(productNo);
        ProductDto newDto = this.productConverter.getDtoFromItem(item);

        return newDto;
    }

    private ItemPort getNewItemPort() {
        final ItemService itemService = new ItemService();
        final ItemPort newItemPort = itemService.getItemPort();

        return newItemPort;
    }

    private List<ItemFilter> getFilterForMP3s() {
        final List<ItemFilter> filterList = new ArrayList<>();
        final ItemFilter filter = new ItemFilter();
        filter.setField(ItemFields.PRODUCT_GROUP_CODE);
        filter.setCriteria("MP3");
        filterList.add(filter);

        return filterList;
    }
}
