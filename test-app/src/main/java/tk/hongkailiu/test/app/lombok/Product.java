package tk.hongkailiu.test.app.lombok;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data public class Product {
    @SerializedName("PRODUCT_NUMBER")
    private String productNumber;
    @SerializedName("R_STATE")
    private String rState;

    public Product(String productNumber, String rState) {
        this.productNumber = productNumber;
        this.rState = rState;
    }
}
